package gov.irs.directfile.stateapi.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

import com.diffblue.cover.annotations.MethodsUnderTest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;
import reactor.test.StepVerifier.FirstStep;

import gov.irs.directfile.stateapi.authorization.AuthorizationTokenService;
import gov.irs.directfile.stateapi.configuration.CertificationOverrideProperties;
import gov.irs.directfile.stateapi.dto.StateProfileDTO;
import gov.irs.directfile.stateapi.exception.StateApiException;
import gov.irs.directfile.stateapi.model.AuthCodeRequest;
import gov.irs.directfile.stateapi.model.EncryptData;
import gov.irs.directfile.stateapi.model.StateAndAuthCode;
import gov.irs.directfile.stateapi.model.StateProfile;
import gov.irs.directfile.stateapi.model.TaxReturnStatus;
import gov.irs.directfile.stateapi.model.TaxReturnToExport;
import gov.irs.directfile.stateapi.model.TaxReturnToExport.TaxReturnToExportBuilder;
import gov.irs.directfile.stateapi.model.TaxReturnXml;
import gov.irs.directfile.stateapi.repository.AuthorizationCodeRepository;
import gov.irs.directfile.stateapi.repository.DirectFileClient;
import gov.irs.directfile.stateapi.repository.StateApiS3Client;
import gov.irs.directfile.stateapi.repository.facts.ExportedFactsClient;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ContextConfiguration(classes = {StateApiServiceImpl.class, CertificationOverrideProperties.class, String.class})
@DisabledInAotMode
@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
class StateApiServiceImplDiffblueTest {
    @MockBean
    private AuthorizationCodeRepository authorizationCodeRepository;

    @MockBean
    private AuthorizationTokenService authorizationTokenService;

    @MockBean
    private CachedDataService cachedDataService;

    @Autowired
    private CertificationOverrideProperties certificationOverrideProperties;

    @MockBean
    private DirectFileClient directFileClient;

    @MockBean
    private ExportedFactsClient exportedFactsClient;

    @MockBean
    private ObjectMapper objectMapper;

    @MockBean
    private StateApiS3Client stateApiS3Client;

    @Autowired
    private StateApiServiceImpl stateApiServiceImpl;

    /**
     * Test {@link StateApiServiceImpl#createAuthorizationCode(AuthCodeRequest)}.
     * <p>
     * Method under test: {@link StateApiServiceImpl#createAuthorizationCode(AuthCodeRequest)}
     */
    @Test
    @DisplayName("Test createAuthorizationCode(AuthCodeRequest)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.createAuthorizationCode(AuthCodeRequest)"})
    void testCreateAuthorizationCode() throws AssertionError {
        // Arrange
        ArrayList<String> redirectUrls = new ArrayList<>();
        Mono<StateProfileDTO> justResult = Mono.just(new StateProfileDTO(
                "MD",
                "Tax System Name",
                "https://example.org/example",
                "https://example.org/example",
                "https://example.org/example",
                "https://example.org/example",
                "https://example.org/example",
                "https://example.org/example",
                redirectUrls,
                new HashMap<>(),
                true,
                "Custom Filing Deadline",
                true));
        when(cachedDataService.getStateProfileByStateCode(Mockito.<String>any()))
                .thenReturn(justResult);
        Mono<TaxReturnStatus> justResult2 = Mono.just(new TaxReturnStatus("Status", true));
        when(directFileClient.getStatus(anyInt(), Mockito.<UUID>any(), Mockito.<String>any()))
                .thenReturn(justResult2);

        // Act and Assert
        FirstStep<UUID> createResult =
                StepVerifier.create(stateApiServiceImpl.createAuthorizationCode(new AuthCodeRequest()));
        createResult.expectError().verify();
        verify(directFileClient).getStatus(eq(0), isNull(), isNull());
        verify(cachedDataService).getStateProfileByStateCode(isNull());
    }

    /**
     * Test {@link StateApiServiceImpl#createAuthorizationCode(AuthCodeRequest)}.
     * <ul>
     *   <li>Given {@link Mono} {@link Mono#doOnError(Consumer)} return just {@code Data}.</li>
     *   <li>Then calls {@link Mono#doOnError(Consumer)}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiServiceImpl#createAuthorizationCode(AuthCodeRequest)}
     */
    @Test
    @DisplayName(
            "Test createAuthorizationCode(AuthCodeRequest); given Mono doOnError(Consumer) return just 'Data'; then calls doOnError(Consumer)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.createAuthorizationCode(AuthCodeRequest)"})
    void testCreateAuthorizationCode_givenMonoDoOnErrorReturnJustData_thenCallsDoOnError() throws AssertionError {
        // Arrange
        Mono<Object> mono = mock(Mono.class);
        Mono<Object> justResult = Mono.just("Data");
        when(mono.doOnError(Mockito.<Consumer<Throwable>>any())).thenReturn(justResult);
        Mono<Object> mono2 = mock(Mono.class);
        when(mono2.doOnSuccess(Mockito.<Consumer<Object>>any())).thenReturn(mono);
        Mono<StateProfileDTO> mono3 = mock(Mono.class);
        when(mono3.map(Mockito.<Function<StateProfileDTO, Object>>any())).thenReturn(mono2);
        when(cachedDataService.getStateProfileByStateCode(Mockito.<String>any()))
                .thenReturn(mono3);
        Mono<TaxReturnStatus> justResult2 = Mono.just(new TaxReturnStatus("Status", true));
        when(directFileClient.getStatus(anyInt(), Mockito.<UUID>any(), Mockito.<String>any()))
                .thenReturn(justResult2);

        // Act and Assert
        FirstStep<UUID> createResult =
                StepVerifier.create(stateApiServiceImpl.createAuthorizationCode(new AuthCodeRequest()));
        createResult.expectError().verify();
        verify(directFileClient).getStatus(eq(0), isNull(), isNull());
        verify(cachedDataService).getStateProfileByStateCode(isNull());
        verify(mono).doOnError(isA(Consumer.class));
        verify(mono2).doOnSuccess(isA(Consumer.class));
        verify(mono3).map(isA(Function.class));
    }

    /**
     * Test {@link StateApiServiceImpl#createAuthorizationCode(AuthCodeRequest)}.
     * <ul>
     *   <li>Given {@link Mono} {@link Mono#doOnSuccess(Consumer)} return just {@code Data}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiServiceImpl#createAuthorizationCode(AuthCodeRequest)}
     */
    @Test
    @DisplayName("Test createAuthorizationCode(AuthCodeRequest); given Mono doOnSuccess(Consumer) return just 'Data'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.createAuthorizationCode(AuthCodeRequest)"})
    void testCreateAuthorizationCode_givenMonoDoOnSuccessReturnJustData() throws AssertionError {
        // Arrange
        Mono<Object> mono = mock(Mono.class);
        Mono<Object> justResult = Mono.just("Data");
        when(mono.doOnSuccess(Mockito.<Consumer<Object>>any())).thenReturn(justResult);
        Mono<StateProfileDTO> mono2 = mock(Mono.class);
        when(mono2.map(Mockito.<Function<StateProfileDTO, Object>>any())).thenReturn(mono);
        when(cachedDataService.getStateProfileByStateCode(Mockito.<String>any()))
                .thenReturn(mono2);
        Mono<TaxReturnStatus> justResult2 = Mono.just(new TaxReturnStatus("Status", true));
        when(directFileClient.getStatus(anyInt(), Mockito.<UUID>any(), Mockito.<String>any()))
                .thenReturn(justResult2);

        // Act and Assert
        FirstStep<UUID> createResult =
                StepVerifier.create(stateApiServiceImpl.createAuthorizationCode(new AuthCodeRequest()));
        createResult.expectError().verify();
        verify(directFileClient).getStatus(eq(0), isNull(), isNull());
        verify(cachedDataService).getStateProfileByStateCode(isNull());
        verify(mono).doOnSuccess(isA(Consumer.class));
        verify(mono2).map(isA(Function.class));
    }

    /**
     * Test {@link StateApiServiceImpl#createAuthorizationCode(AuthCodeRequest)}.
     * <ul>
     *   <li>Given {@link Mono} {@link Mono#flatMap(Function)} return just {@code Data}.</li>
     *   <li>Then calls {@link Mono#flatMap(Function)}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiServiceImpl#createAuthorizationCode(AuthCodeRequest)}
     */
    @Test
    @DisplayName(
            "Test createAuthorizationCode(AuthCodeRequest); given Mono flatMap(Function) return just 'Data'; then calls flatMap(Function)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.createAuthorizationCode(AuthCodeRequest)"})
    void testCreateAuthorizationCode_givenMonoFlatMapReturnJustData_thenCallsFlatMap() throws AssertionError {
        // Arrange
        Mono<Object> mono = mock(Mono.class);
        Mono<Object> justResult = Mono.just("Data");
        when(mono.flatMap(Mockito.<Function<Object, Mono<Object>>>any())).thenReturn(justResult);
        Mono<Object> mono2 = mock(Mono.class);
        when(mono2.doOnError(Mockito.<Consumer<Throwable>>any())).thenReturn(mono);
        Mono<Object> mono3 = mock(Mono.class);
        when(mono3.doOnSuccess(Mockito.<Consumer<Object>>any())).thenReturn(mono2);
        Mono<StateProfileDTO> mono4 = mock(Mono.class);
        when(mono4.map(Mockito.<Function<StateProfileDTO, Object>>any())).thenReturn(mono3);
        when(cachedDataService.getStateProfileByStateCode(Mockito.<String>any()))
                .thenReturn(mono4);
        Mono<TaxReturnStatus> justResult2 = Mono.just(new TaxReturnStatus("Status", true));
        when(directFileClient.getStatus(anyInt(), Mockito.<UUID>any(), Mockito.<String>any()))
                .thenReturn(justResult2);

        // Act and Assert
        FirstStep<UUID> createResult =
                StepVerifier.create(stateApiServiceImpl.createAuthorizationCode(new AuthCodeRequest()));
        createResult.expectError().verify();
        verify(directFileClient).getStatus(eq(0), isNull(), isNull());
        verify(cachedDataService).getStateProfileByStateCode(isNull());
        verify(mono2).doOnError(isA(Consumer.class));
        verify(mono3).doOnSuccess(isA(Consumer.class));
        verify(mono).flatMap(isA(Function.class));
        verify(mono4).map(isA(Function.class));
    }

    /**
     * Test {@link StateApiServiceImpl#createAuthorizationCode(AuthCodeRequest)}.
     * <ul>
     *   <li>Given {@link Mono} {@link Mono#map(Function)} return just {@code Data}.</li>
     *   <li>Then calls {@link Mono#map(Function)}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiServiceImpl#createAuthorizationCode(AuthCodeRequest)}
     */
    @Test
    @DisplayName(
            "Test createAuthorizationCode(AuthCodeRequest); given Mono map(Function) return just 'Data'; then calls map(Function)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.createAuthorizationCode(AuthCodeRequest)"})
    void testCreateAuthorizationCode_givenMonoMapReturnJustData_thenCallsMap() throws AssertionError {
        // Arrange
        Mono<StateProfileDTO> mono = mock(Mono.class);
        Mono<Object> justResult = Mono.just("Data");
        when(mono.map(Mockito.<Function<StateProfileDTO, Object>>any())).thenReturn(justResult);
        when(cachedDataService.getStateProfileByStateCode(Mockito.<String>any()))
                .thenReturn(mono);
        Mono<TaxReturnStatus> justResult2 = Mono.just(new TaxReturnStatus("Status", true));
        when(directFileClient.getStatus(anyInt(), Mockito.<UUID>any(), Mockito.<String>any()))
                .thenReturn(justResult2);

        // Act and Assert
        FirstStep<UUID> createResult =
                StepVerifier.create(stateApiServiceImpl.createAuthorizationCode(new AuthCodeRequest()));
        createResult.expectError().verify();
        verify(directFileClient).getStatus(eq(0), isNull(), isNull());
        verify(cachedDataService).getStateProfileByStateCode(isNull());
        verify(mono).map(isA(Function.class));
    }

    /**
     * Test {@link StateApiServiceImpl#createAuthorizationCode(AuthCodeRequest)}.
     * <ul>
     *   <li>Given {@link Mono} {@link Mono#zipWith(Mono, BiFunction)} return just {@code Data}.</li>
     *   <li>Then calls {@link Mono#zipWith(Mono, BiFunction)}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiServiceImpl#createAuthorizationCode(AuthCodeRequest)}
     */
    @Test
    @DisplayName(
            "Test createAuthorizationCode(AuthCodeRequest); given Mono zipWith(Mono, BiFunction) return just 'Data'; then calls zipWith(Mono, BiFunction)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.createAuthorizationCode(AuthCodeRequest)"})
    void testCreateAuthorizationCode_givenMonoZipWithReturnJustData_thenCallsZipWith() throws AssertionError {
        // Arrange
        Mono<Object> mono = mock(Mono.class);
        Mono<Object> justResult = Mono.just("Data");
        when(mono.zipWith(Mockito.<Mono<?>>any(), Mockito.<BiFunction<Object, Object, Object>>any()))
                .thenReturn(justResult);
        Mono<Object> mono2 = mock(Mono.class);
        when(mono2.flatMap(Mockito.<Function<Object, Mono<Object>>>any())).thenReturn(mono);
        Mono<Object> mono3 = mock(Mono.class);
        when(mono3.doOnError(Mockito.<Consumer<Throwable>>any())).thenReturn(mono2);
        Mono<Object> mono4 = mock(Mono.class);
        when(mono4.doOnSuccess(Mockito.<Consumer<Object>>any())).thenReturn(mono3);
        Mono<StateProfileDTO> mono5 = mock(Mono.class);
        when(mono5.map(Mockito.<Function<StateProfileDTO, Object>>any())).thenReturn(mono4);
        when(cachedDataService.getStateProfileByStateCode(Mockito.<String>any()))
                .thenReturn(mono5);
        Mono<TaxReturnStatus> justResult2 = Mono.just(new TaxReturnStatus("Status", true));
        when(directFileClient.getStatus(anyInt(), Mockito.<UUID>any(), Mockito.<String>any()))
                .thenReturn(justResult2);

        // Act and Assert
        FirstStep<UUID> createResult =
                StepVerifier.create(stateApiServiceImpl.createAuthorizationCode(new AuthCodeRequest()));
        createResult.expectError().verify();
        verify(directFileClient).getStatus(eq(0), isNull(), isNull());
        verify(cachedDataService).getStateProfileByStateCode(isNull());
        verify(mono3).doOnError(isA(Consumer.class));
        verify(mono4).doOnSuccess(isA(Consumer.class));
        verify(mono2).flatMap(isA(Function.class));
        verify(mono5).map(isA(Function.class));
        verify(mono).zipWith(isA(Mono.class), isA(BiFunction.class));
    }

    /**
     * Test {@link StateApiServiceImpl#createAuthorizationCode(AuthCodeRequest)}.
     * <ul>
     *   <li>Then throw {@link IllegalArgumentException}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiServiceImpl#createAuthorizationCode(AuthCodeRequest)}
     */
    @Test
    @DisplayName("Test createAuthorizationCode(AuthCodeRequest); then throw IllegalArgumentException")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.createAuthorizationCode(AuthCodeRequest)"})
    void testCreateAuthorizationCode_thenThrowIllegalArgumentException() {
        // Arrange
        ArrayList<String> redirectUrls = new ArrayList<>();
        Mono<StateProfileDTO> justResult = Mono.just(new StateProfileDTO(
                "MD",
                "Tax System Name",
                "https://example.org/example",
                "https://example.org/example",
                "https://example.org/example",
                "https://example.org/example",
                "https://example.org/example",
                "https://example.org/example",
                redirectUrls,
                new HashMap<>(),
                true,
                "Custom Filing Deadline",
                true));
        when(cachedDataService.getStateProfileByStateCode(Mockito.<String>any()))
                .thenReturn(justResult);
        when(directFileClient.getStatus(anyInt(), Mockito.<UUID>any(), Mockito.<String>any()))
                .thenThrow(new IllegalArgumentException("enter createAuthorizationCode()..."));

        // Act and Assert
        assertThrows(
                IllegalArgumentException.class,
                () -> stateApiServiceImpl.createAuthorizationCode(new AuthCodeRequest()));
        verify(directFileClient).getStatus(eq(0), isNull(), isNull());
        verify(cachedDataService).getStateProfileByStateCode(isNull());
    }

    /**
     * Test {@link StateApiServiceImpl#generateAuthorizationToken(AuthCodeRequest)}.
     * <p>
     * Method under test: {@link StateApiServiceImpl#generateAuthorizationToken(AuthCodeRequest)}
     */
    @Test
    @DisplayName("Test generateAuthorizationToken(AuthCodeRequest)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.generateAuthorizationToken(AuthCodeRequest)"})
    void testGenerateAuthorizationToken() throws AssertionError {
        // Arrange
        ArrayList<String> redirectUrls = new ArrayList<>();
        Mono<StateProfileDTO> justResult = Mono.just(new StateProfileDTO(
                "MD",
                "Tax System Name",
                "https://example.org/example",
                "https://example.org/example",
                "https://example.org/example",
                "https://example.org/example",
                "https://example.org/example",
                "https://example.org/example",
                redirectUrls,
                new HashMap<>(),
                true,
                "Custom Filing Deadline",
                true));
        when(cachedDataService.getStateProfileByStateCode(Mockito.<String>any()))
                .thenReturn(justResult);
        Mono<TaxReturnStatus> justResult2 = Mono.just(new TaxReturnStatus("Status", true));
        when(directFileClient.getStatus(anyInt(), Mockito.<UUID>any(), Mockito.<String>any()))
                .thenReturn(justResult2);

        // Act and Assert
        FirstStep<String> createResult =
                StepVerifier.create(stateApiServiceImpl.generateAuthorizationToken(new AuthCodeRequest()));
        createResult.expectError().verify();
        verify(directFileClient).getStatus(eq(0), isNull(), isNull());
        verify(cachedDataService).getStateProfileByStateCode(isNull());
    }

    /**
     * Test {@link StateApiServiceImpl#generateAuthorizationToken(AuthCodeRequest)}.
     * <ul>
     *   <li>Given {@link Mono} {@link Mono#doOnError(Consumer)} return just {@code Data}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiServiceImpl#generateAuthorizationToken(AuthCodeRequest)}
     */
    @Test
    @DisplayName("Test generateAuthorizationToken(AuthCodeRequest); given Mono doOnError(Consumer) return just 'Data'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.generateAuthorizationToken(AuthCodeRequest)"})
    void testGenerateAuthorizationToken_givenMonoDoOnErrorReturnJustData() throws AssertionError {
        // Arrange
        Mono<Object> mono = mock(Mono.class);
        Mono<Object> justResult = Mono.just("Data");
        when(mono.doOnError(Mockito.<Consumer<Throwable>>any())).thenReturn(justResult);
        Mono<Object> mono2 = mock(Mono.class);
        when(mono2.doOnSuccess(Mockito.<Consumer<Object>>any())).thenReturn(mono);
        Mono<StateProfileDTO> mono3 = mock(Mono.class);
        when(mono3.map(Mockito.<Function<StateProfileDTO, Object>>any())).thenReturn(mono2);
        when(cachedDataService.getStateProfileByStateCode(Mockito.<String>any()))
                .thenReturn(mono3);
        Mono<TaxReturnStatus> justResult2 = Mono.just(new TaxReturnStatus("Status", true));
        when(directFileClient.getStatus(anyInt(), Mockito.<UUID>any(), Mockito.<String>any()))
                .thenReturn(justResult2);

        // Act and Assert
        FirstStep<String> createResult =
                StepVerifier.create(stateApiServiceImpl.generateAuthorizationToken(new AuthCodeRequest()));
        createResult.expectError().verify();
        verify(directFileClient).getStatus(eq(0), isNull(), isNull());
        verify(cachedDataService).getStateProfileByStateCode(isNull());
        verify(mono).doOnError(isA(Consumer.class));
        verify(mono2).doOnSuccess(isA(Consumer.class));
        verify(mono3).map(isA(Function.class));
    }

    /**
     * Test {@link StateApiServiceImpl#generateAuthorizationToken(AuthCodeRequest)}.
     * <ul>
     *   <li>Given {@link Mono} {@link Mono#doOnSuccess(Consumer)} return just {@code Data}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiServiceImpl#generateAuthorizationToken(AuthCodeRequest)}
     */
    @Test
    @DisplayName(
            "Test generateAuthorizationToken(AuthCodeRequest); given Mono doOnSuccess(Consumer) return just 'Data'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.generateAuthorizationToken(AuthCodeRequest)"})
    void testGenerateAuthorizationToken_givenMonoDoOnSuccessReturnJustData() throws AssertionError {
        // Arrange
        Mono<Object> mono = mock(Mono.class);
        Mono<Object> justResult = Mono.just("Data");
        when(mono.doOnSuccess(Mockito.<Consumer<Object>>any())).thenReturn(justResult);
        Mono<StateProfileDTO> mono2 = mock(Mono.class);
        when(mono2.map(Mockito.<Function<StateProfileDTO, Object>>any())).thenReturn(mono);
        when(cachedDataService.getStateProfileByStateCode(Mockito.<String>any()))
                .thenReturn(mono2);
        Mono<TaxReturnStatus> justResult2 = Mono.just(new TaxReturnStatus("Status", true));
        when(directFileClient.getStatus(anyInt(), Mockito.<UUID>any(), Mockito.<String>any()))
                .thenReturn(justResult2);

        // Act and Assert
        FirstStep<String> createResult =
                StepVerifier.create(stateApiServiceImpl.generateAuthorizationToken(new AuthCodeRequest()));
        createResult.expectError().verify();
        verify(directFileClient).getStatus(eq(0), isNull(), isNull());
        verify(cachedDataService).getStateProfileByStateCode(isNull());
        verify(mono).doOnSuccess(isA(Consumer.class));
        verify(mono2).map(isA(Function.class));
    }

    /**
     * Test {@link StateApiServiceImpl#generateAuthorizationToken(AuthCodeRequest)}.
     * <ul>
     *   <li>Given {@link Mono} {@link Mono#flatMap(Function)} return just {@code Data}.</li>
     *   <li>Then calls {@link Mono#flatMap(Function)}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiServiceImpl#generateAuthorizationToken(AuthCodeRequest)}
     */
    @Test
    @DisplayName(
            "Test generateAuthorizationToken(AuthCodeRequest); given Mono flatMap(Function) return just 'Data'; then calls flatMap(Function)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.generateAuthorizationToken(AuthCodeRequest)"})
    void testGenerateAuthorizationToken_givenMonoFlatMapReturnJustData_thenCallsFlatMap() throws AssertionError {
        // Arrange
        Mono<Object> mono = mock(Mono.class);
        Mono<Object> justResult = Mono.just("Data");
        when(mono.flatMap(Mockito.<Function<Object, Mono<Object>>>any())).thenReturn(justResult);
        Mono<Object> mono2 = mock(Mono.class);
        when(mono2.doOnError(Mockito.<Consumer<Throwable>>any())).thenReturn(mono);
        Mono<Object> mono3 = mock(Mono.class);
        when(mono3.doOnSuccess(Mockito.<Consumer<Object>>any())).thenReturn(mono2);
        Mono<StateProfileDTO> mono4 = mock(Mono.class);
        when(mono4.map(Mockito.<Function<StateProfileDTO, Object>>any())).thenReturn(mono3);
        when(cachedDataService.getStateProfileByStateCode(Mockito.<String>any()))
                .thenReturn(mono4);
        Mono<TaxReturnStatus> justResult2 = Mono.just(new TaxReturnStatus("Status", true));
        when(directFileClient.getStatus(anyInt(), Mockito.<UUID>any(), Mockito.<String>any()))
                .thenReturn(justResult2);

        // Act and Assert
        FirstStep<String> createResult =
                StepVerifier.create(stateApiServiceImpl.generateAuthorizationToken(new AuthCodeRequest()));
        createResult.expectError().verify();
        verify(directFileClient).getStatus(eq(0), isNull(), isNull());
        verify(cachedDataService).getStateProfileByStateCode(isNull());
        verify(mono2).doOnError(isA(Consumer.class));
        verify(mono3).doOnSuccess(isA(Consumer.class));
        verify(mono).flatMap(isA(Function.class));
        verify(mono4).map(isA(Function.class));
    }

    /**
     * Test {@link StateApiServiceImpl#generateAuthorizationToken(AuthCodeRequest)}.
     * <ul>
     *   <li>Given {@link Mono} {@link Mono#map(Function)} return just {@code Data}.</li>
     *   <li>Then calls {@link Mono#map(Function)}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiServiceImpl#generateAuthorizationToken(AuthCodeRequest)}
     */
    @Test
    @DisplayName(
            "Test generateAuthorizationToken(AuthCodeRequest); given Mono map(Function) return just 'Data'; then calls map(Function)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.generateAuthorizationToken(AuthCodeRequest)"})
    void testGenerateAuthorizationToken_givenMonoMapReturnJustData_thenCallsMap() throws AssertionError {
        // Arrange
        Mono<StateProfileDTO> mono = mock(Mono.class);
        Mono<Object> justResult = Mono.just("Data");
        when(mono.map(Mockito.<Function<StateProfileDTO, Object>>any())).thenReturn(justResult);
        when(cachedDataService.getStateProfileByStateCode(Mockito.<String>any()))
                .thenReturn(mono);
        Mono<TaxReturnStatus> justResult2 = Mono.just(new TaxReturnStatus("Status", true));
        when(directFileClient.getStatus(anyInt(), Mockito.<UUID>any(), Mockito.<String>any()))
                .thenReturn(justResult2);

        // Act and Assert
        FirstStep<String> createResult =
                StepVerifier.create(stateApiServiceImpl.generateAuthorizationToken(new AuthCodeRequest()));
        createResult.expectError().verify();
        verify(directFileClient).getStatus(eq(0), isNull(), isNull());
        verify(cachedDataService).getStateProfileByStateCode(isNull());
        verify(mono).map(isA(Function.class));
    }

    /**
     * Test {@link StateApiServiceImpl#generateAuthorizationToken(AuthCodeRequest)}.
     * <ul>
     *   <li>Given {@link Mono} {@link Mono#zipWith(Mono, BiFunction)} return just {@code Data}.</li>
     *   <li>Then calls {@link Mono#zipWith(Mono, BiFunction)}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiServiceImpl#generateAuthorizationToken(AuthCodeRequest)}
     */
    @Test
    @DisplayName(
            "Test generateAuthorizationToken(AuthCodeRequest); given Mono zipWith(Mono, BiFunction) return just 'Data'; then calls zipWith(Mono, BiFunction)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.generateAuthorizationToken(AuthCodeRequest)"})
    void testGenerateAuthorizationToken_givenMonoZipWithReturnJustData_thenCallsZipWith() throws AssertionError {
        // Arrange
        Mono<Object> mono = mock(Mono.class);
        Mono<Object> justResult = Mono.just("Data");
        when(mono.zipWith(Mockito.<Mono<?>>any(), Mockito.<BiFunction<Object, Object, Object>>any()))
                .thenReturn(justResult);
        Mono<Object> mono2 = mock(Mono.class);
        when(mono2.flatMap(Mockito.<Function<Object, Mono<Object>>>any())).thenReturn(mono);
        Mono<Object> mono3 = mock(Mono.class);
        when(mono3.doOnError(Mockito.<Consumer<Throwable>>any())).thenReturn(mono2);
        Mono<Object> mono4 = mock(Mono.class);
        when(mono4.doOnSuccess(Mockito.<Consumer<Object>>any())).thenReturn(mono3);
        Mono<StateProfileDTO> mono5 = mock(Mono.class);
        when(mono5.map(Mockito.<Function<StateProfileDTO, Object>>any())).thenReturn(mono4);
        when(cachedDataService.getStateProfileByStateCode(Mockito.<String>any()))
                .thenReturn(mono5);
        Mono<TaxReturnStatus> justResult2 = Mono.just(new TaxReturnStatus("Status", true));
        when(directFileClient.getStatus(anyInt(), Mockito.<UUID>any(), Mockito.<String>any()))
                .thenReturn(justResult2);

        // Act and Assert
        FirstStep<String> createResult =
                StepVerifier.create(stateApiServiceImpl.generateAuthorizationToken(new AuthCodeRequest()));
        createResult.expectError().verify();
        verify(directFileClient).getStatus(eq(0), isNull(), isNull());
        verify(cachedDataService).getStateProfileByStateCode(isNull());
        verify(mono3).doOnError(isA(Consumer.class));
        verify(mono4).doOnSuccess(isA(Consumer.class));
        verify(mono2).flatMap(isA(Function.class));
        verify(mono5).map(isA(Function.class));
        verify(mono).zipWith(isA(Mono.class), isA(BiFunction.class));
    }

    /**
     * Test {@link StateApiServiceImpl#generateAuthorizationToken(AuthCodeRequest)}.
     * <ul>
     *   <li>Given {@link Mono} {@link Mono#zipWith(Mono, BiFunction)} return {@link Mono}.</li>
     *   <li>Then return just {@code Data}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiServiceImpl#generateAuthorizationToken(AuthCodeRequest)}
     */
    @Test
    @DisplayName(
            "Test generateAuthorizationToken(AuthCodeRequest); given Mono zipWith(Mono, BiFunction) return Mono; then return just 'Data'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.generateAuthorizationToken(AuthCodeRequest)"})
    void testGenerateAuthorizationToken_givenMonoZipWithReturnMono_thenReturnJustData() throws AssertionError {
        // Arrange
        Mono<Object> mono = mock(Mono.class);
        Mono<Object> justResult = Mono.just("Data");
        when(mono.flatMap(Mockito.<Function<Object, Mono<Object>>>any())).thenReturn(justResult);
        Mono<Object> mono2 = mock(Mono.class);
        when(mono2.zipWith(Mockito.<Mono<?>>any(), Mockito.<BiFunction<Object, Object, Object>>any()))
                .thenReturn(mono);
        Mono<Object> mono3 = mock(Mono.class);
        when(mono3.flatMap(Mockito.<Function<Object, Mono<Object>>>any())).thenReturn(mono2);
        Mono<Object> mono4 = mock(Mono.class);
        when(mono4.doOnError(Mockito.<Consumer<Throwable>>any())).thenReturn(mono3);
        Mono<Object> mono5 = mock(Mono.class);
        when(mono5.doOnSuccess(Mockito.<Consumer<Object>>any())).thenReturn(mono4);
        Mono<StateProfileDTO> mono6 = mock(Mono.class);
        when(mono6.map(Mockito.<Function<StateProfileDTO, Object>>any())).thenReturn(mono5);
        when(cachedDataService.getStateProfileByStateCode(Mockito.<String>any()))
                .thenReturn(mono6);
        Mono<TaxReturnStatus> justResult2 = Mono.just(new TaxReturnStatus("Status", true));
        when(directFileClient.getStatus(anyInt(), Mockito.<UUID>any(), Mockito.<String>any()))
                .thenReturn(justResult2);

        // Act
        Mono<String> actualPublisher = stateApiServiceImpl.generateAuthorizationToken(new AuthCodeRequest());

        // Assert
        FirstStep<String> createResult = StepVerifier.create(actualPublisher);
        createResult
                .assertNext(s -> {
                    assertEquals("Data", s);
                    return;
                })
                .expectComplete()
                .verify();
        verify(directFileClient).getStatus(eq(0), isNull(), isNull());
        verify(cachedDataService).getStateProfileByStateCode(isNull());
        verify(mono4).doOnError(isA(Consumer.class));
        verify(mono5).doOnSuccess(isA(Consumer.class));
        verify(mono3).flatMap(isA(Function.class));
        verify(mono).flatMap(isA(Function.class));
        verify(mono6).map(isA(Function.class));
        verify(mono2).zipWith(isA(Mono.class), isA(BiFunction.class));
        assertSame(justResult, actualPublisher);
    }

    /**
     * Test {@link StateApiServiceImpl#generateAuthorizationToken(AuthCodeRequest)}.
     * <ul>
     *   <li>Then throw {@link IllegalArgumentException}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiServiceImpl#generateAuthorizationToken(AuthCodeRequest)}
     */
    @Test
    @DisplayName("Test generateAuthorizationToken(AuthCodeRequest); then throw IllegalArgumentException")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.generateAuthorizationToken(AuthCodeRequest)"})
    void testGenerateAuthorizationToken_thenThrowIllegalArgumentException() {
        // Arrange
        ArrayList<String> redirectUrls = new ArrayList<>();
        Mono<StateProfileDTO> justResult = Mono.just(new StateProfileDTO(
                "MD",
                "Tax System Name",
                "https://example.org/example",
                "https://example.org/example",
                "https://example.org/example",
                "https://example.org/example",
                "https://example.org/example",
                "https://example.org/example",
                redirectUrls,
                new HashMap<>(),
                true,
                "Custom Filing Deadline",
                true));
        when(cachedDataService.getStateProfileByStateCode(Mockito.<String>any()))
                .thenReturn(justResult);
        when(directFileClient.getStatus(anyInt(), Mockito.<UUID>any(), Mockito.<String>any()))
                .thenThrow(new IllegalArgumentException("Generating authorization token"));

        // Act and Assert
        assertThrows(
                IllegalArgumentException.class,
                () -> stateApiServiceImpl.generateAuthorizationToken(new AuthCodeRequest()));
        verify(directFileClient).getStatus(eq(0), isNull(), isNull());
        verify(cachedDataService).getStateProfileByStateCode(isNull());
    }

    /**
     * Test {@link StateApiServiceImpl#verifyJwtSignature(String, String)}.
     * <p>
     * Method under test: {@link StateApiServiceImpl#verifyJwtSignature(String, String)}
     */
    @Test
    @DisplayName("Test verifyJwtSignature(String, String)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.verifyJwtSignature(String, String)"})
    void testVerifyJwtSignature() throws AssertionError {
        // Arrange
        Mono<StateProfile> justResult = Mono.just(new StateProfile());
        when(cachedDataService.getStateProfile(Mockito.<String>any())).thenReturn(justResult);

        // Act and Assert
        FirstStep<StateAndAuthCode> createResult =
                StepVerifier.create(stateApiServiceImpl.verifyJwtSignature("ABC123", "42"));
        createResult.expectError().verify();
        verify(cachedDataService).getStateProfile(eq("42"));
    }

    /**
     * Test {@link StateApiServiceImpl#verifyJwtSignature(String, String)}.
     * <ul>
     *   <li>Given {@link Mono} {@link Mono#map(Function)} return just {@code Data}.</li>
     *   <li>Then calls {@link Mono#map(Function)}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiServiceImpl#verifyJwtSignature(String, String)}
     */
    @Test
    @DisplayName(
            "Test verifyJwtSignature(String, String); given Mono map(Function) return just 'Data'; then calls map(Function)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.verifyJwtSignature(String, String)"})
    void testVerifyJwtSignature_givenMonoMapReturnJustData_thenCallsMap() throws AssertionError {
        // Arrange
        Mono<StateProfile> mono = mock(Mono.class);
        Mono<Object> justResult = Mono.just("Data");
        when(mono.map(Mockito.<Function<StateProfile, Object>>any())).thenReturn(justResult);
        when(cachedDataService.getStateProfile(Mockito.<String>any())).thenReturn(mono);

        // Act and Assert
        FirstStep<StateAndAuthCode> createResult =
                StepVerifier.create(stateApiServiceImpl.verifyJwtSignature("ABC123", "42"));
        createResult.expectError().verify();
        verify(cachedDataService).getStateProfile(eq("42"));
        verify(mono).map(isA(Function.class));
    }

    /**
     * Test {@link StateApiServiceImpl#authorize(StateAndAuthCode)}.
     * <ul>
     *   <li>Given {@link IllegalArgumentException#IllegalArgumentException(String)} with {@code foo}.</li>
     *   <li>Then calls {@link StateAndAuthCode#getAuthorizationCode()}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiServiceImpl#authorize(StateAndAuthCode)}
     */
    @Test
    @DisplayName(
            "Test authorize(StateAndAuthCode); given IllegalArgumentException(String) with 'foo'; then calls getAuthorizationCode()")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.authorize(StateAndAuthCode)"})
    void testAuthorize_givenIllegalArgumentExceptionWithFoo_thenCallsGetAuthorizationCode() {
        // Arrange
        StateAndAuthCode saCode = mock(StateAndAuthCode.class);
        when(saCode.getAuthorizationCode()).thenThrow(new IllegalArgumentException("foo"));

        // Act and Assert
        assertThrows(StateApiException.class, () -> stateApiServiceImpl.authorize(saCode));
        verify(saCode).getAuthorizationCode();
    }

    /**
     * Test {@link StateApiServiceImpl#authorize(StateAndAuthCode)}.
     * <ul>
     *   <li>When {@link StateAndAuthCode#StateAndAuthCode(String, String)} with authorizationCode is {@code JaneDoe} and stateCode is {@code MD}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiServiceImpl#authorize(StateAndAuthCode)}
     */
    @Test
    @DisplayName(
            "Test authorize(StateAndAuthCode); when StateAndAuthCode(String, String) with authorizationCode is 'JaneDoe' and stateCode is 'MD'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.authorize(StateAndAuthCode)"})
    void testAuthorize_whenStateAndAuthCodeWithAuthorizationCodeIsJaneDoeAndStateCodeIsMd() {
        // Arrange, Act and Assert
        assertThrows(
                StateApiException.class, () -> stateApiServiceImpl.authorize(new StateAndAuthCode("JaneDoe", "MD")));
    }

    /**
     * Test {@link StateApiServiceImpl#retrieveTaxReturnXml(int, UUID, String)}.
     * <p>
     * Method under test: {@link StateApiServiceImpl#retrieveTaxReturnXml(int, UUID, String)}
     */
    @Test
    @DisplayName("Test retrieveTaxReturnXml(int, UUID, String)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.retrieveTaxReturnXml(int, UUID, String)"})
    void testRetrieveTaxReturnXml() throws AssertionError {
        // Arrange
        Mono<TaxReturnStatus> justResult = Mono.just(new TaxReturnStatus("Status", true));
        when(directFileClient.getStatus(anyInt(), Mockito.<UUID>any(), Mockito.<String>any()))
                .thenReturn(justResult);

        // Act and Assert
        FirstStep<TaxReturnXml> createResult =
                StepVerifier.create(stateApiServiceImpl.retrieveTaxReturnXml(1, UUID.randomUUID(), "42"));
        createResult.expectError().verify();
        verify(directFileClient).getStatus(eq(1), isA(UUID.class), eq("42"));
    }

    /**
     * Test {@link StateApiServiceImpl#retrieveTaxReturnXml(int, UUID, String)}.
     * <ul>
     *   <li>Then throw {@link IllegalArgumentException}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiServiceImpl#retrieveTaxReturnXml(int, UUID, String)}
     */
    @Test
    @DisplayName("Test retrieveTaxReturnXml(int, UUID, String); then throw IllegalArgumentException")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.retrieveTaxReturnXml(int, UUID, String)"})
    void testRetrieveTaxReturnXml_thenThrowIllegalArgumentException() {
        // Arrange
        when(directFileClient.getStatus(anyInt(), Mockito.<UUID>any(), Mockito.<String>any()))
                .thenThrow(new IllegalArgumentException("enter retrieveTaxReturnXml()...taxReturnUuid={}"));

        // Act and Assert
        assertThrows(
                IllegalArgumentException.class,
                () -> stateApiServiceImpl.retrieveTaxReturnXml(1, UUID.randomUUID(), "42"));
        verify(directFileClient).getStatus(eq(1), isA(UUID.class), eq("42"));
    }

    /**
     * Test {@link StateApiServiceImpl#retrieveExportedFacts(String, String, String)}.
     * <p>
     * Method under test: {@link StateApiServiceImpl#retrieveExportedFacts(String, String, String)}
     */
    @Test
    @DisplayName("Test retrieveExportedFacts(String, String, String)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.retrieveExportedFacts(String, String, String)"})
    void testRetrieveExportedFacts() throws AssertionError {
        // Arrange, Act and Assert
        FirstStep<Map<String, Object>> createResult =
                StepVerifier.create(stateApiServiceImpl.retrieveExportedFacts("42", "MD", "42"));
        createResult
                .assertNext(m -> {
                    assertTrue(m.isEmpty());
                    return;
                })
                .expectComplete()
                .verify();
    }

    /**
     * Test {@link StateApiServiceImpl#encryptTaxReturn(TaxReturnToExport, String)}.
     * <ul>
     *   <li>Given {@link CachedDataService} {@link CachedDataService#getStateProfile(String)} return just {@link StateProfile} (default constructor).</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiServiceImpl#encryptTaxReturn(TaxReturnToExport, String)}
     */
    @Test
    @DisplayName(
            "Test encryptTaxReturn(TaxReturnToExport, String); given CachedDataService getStateProfile(String) return just StateProfile (default constructor)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.encryptTaxReturn(TaxReturnToExport, String)"})
    void testEncryptTaxReturn_givenCachedDataServiceGetStateProfileReturnJustStateProfile() throws AssertionError {
        // Arrange
        Mono<StateProfile> justResult = Mono.just(new StateProfile());
        when(cachedDataService.getStateProfile(Mockito.<String>any())).thenReturn(justResult);

        // Act and Assert
        FirstStep<EncryptData> createResult =
                StepVerifier.create(stateApiServiceImpl.encryptTaxReturn(new TaxReturnToExport(), "42"));
        createResult.expectError().verify();
        verify(cachedDataService).getStateProfile(eq("42"));
    }

    /**
     * Test {@link StateApiServiceImpl#encryptTaxReturn(TaxReturnToExport, String)}.
     * <ul>
     *   <li>Given {@link Mono} {@link Mono#flatMap(Function)} return just {@code Data}.</li>
     *   <li>Then calls {@link Mono#flatMap(Function)}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiServiceImpl#encryptTaxReturn(TaxReturnToExport, String)}
     */
    @Test
    @DisplayName(
            "Test encryptTaxReturn(TaxReturnToExport, String); given Mono flatMap(Function) return just 'Data'; then calls flatMap(Function)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.encryptTaxReturn(TaxReturnToExport, String)"})
    void testEncryptTaxReturn_givenMonoFlatMapReturnJustData_thenCallsFlatMap() throws AssertionError {
        // Arrange
        Mono<Object> mono = mock(Mono.class);
        Mono<Object> justResult = Mono.just("Data");
        when(mono.flatMap(Mockito.<Function<Object, Mono<Object>>>any())).thenReturn(justResult);
        Mono<StateProfile> mono2 = mock(Mono.class);
        when(mono2.map(Mockito.<Function<StateProfile, Object>>any())).thenReturn(mono);
        when(cachedDataService.getStateProfile(Mockito.<String>any())).thenReturn(mono2);

        // Act and Assert
        FirstStep<EncryptData> createResult =
                StepVerifier.create(stateApiServiceImpl.encryptTaxReturn(new TaxReturnToExport(), "42"));
        createResult.expectError().verify();
        verify(cachedDataService).getStateProfile(eq("42"));
        verify(mono).flatMap(isA(Function.class));
        verify(mono2).map(isA(Function.class));
    }

    /**
     * Test {@link StateApiServiceImpl#encryptTaxReturn(TaxReturnToExport, String)}.
     * <ul>
     *   <li>Given {@link Mono} {@link Mono#map(Function)} return just {@code Data}.</li>
     *   <li>Then calls {@link Mono#map(Function)}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiServiceImpl#encryptTaxReturn(TaxReturnToExport, String)}
     */
    @Test
    @DisplayName(
            "Test encryptTaxReturn(TaxReturnToExport, String); given Mono map(Function) return just 'Data'; then calls map(Function)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.encryptTaxReturn(TaxReturnToExport, String)"})
    void testEncryptTaxReturn_givenMonoMapReturnJustData_thenCallsMap() throws AssertionError {
        // Arrange
        Mono<StateProfile> mono = mock(Mono.class);
        Mono<Object> justResult = Mono.just("Data");
        when(mono.map(Mockito.<Function<StateProfile, Object>>any())).thenReturn(justResult);
        when(cachedDataService.getStateProfile(Mockito.<String>any())).thenReturn(mono);

        // Act and Assert
        FirstStep<EncryptData> createResult =
                StepVerifier.create(stateApiServiceImpl.encryptTaxReturn(new TaxReturnToExport(), "42"));
        createResult.expectError().verify();
        verify(cachedDataService).getStateProfile(eq("42"));
        verify(mono).map(isA(Function.class));
    }

    /**
     * Test {@link StateApiServiceImpl#encryptTaxReturn(TaxReturnToExport, String)}.
     * <ul>
     *   <li>Then throw {@link IllegalArgumentException}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiServiceImpl#encryptTaxReturn(TaxReturnToExport, String)}
     */
    @Test
    @DisplayName("Test encryptTaxReturn(TaxReturnToExport, String); then throw IllegalArgumentException")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.encryptTaxReturn(TaxReturnToExport, String)"})
    void testEncryptTaxReturn_thenThrowIllegalArgumentException() {
        // Arrange
        when(cachedDataService.getStateProfile(Mockito.<String>any()))
                .thenThrow(new IllegalArgumentException("enter encryptTaxReturn()...accountId={}"));
        TaxReturnToExportBuilder builderResult = TaxReturnToExport.builder();
        TaxReturnToExport taxReturn = builderResult
                .directFileData(new HashMap<>())
                .status("Status")
                .submissionId("42")
                .xml("Xml")
                .build();

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> stateApiServiceImpl.encryptTaxReturn(taxReturn, "42"));
        verify(cachedDataService).getStateProfile(eq("42"));
    }

    /**
     * Test {@link StateApiServiceImpl#lookupStateProfile(String)}.
     * <p>
     * Method under test: {@link StateApiServiceImpl#lookupStateProfile(String)}
     */
    @Test
    @DisplayName("Test lookupStateProfile(String)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.lookupStateProfile(String)"})
    void testLookupStateProfile() throws AssertionError {
        // Arrange
        ArrayList<String> redirectUrls = new ArrayList<>();
        Mono<StateProfileDTO> justResult = Mono.just(new StateProfileDTO(
                "MD",
                "Tax System Name",
                "https://example.org/example",
                "https://example.org/example",
                "https://example.org/example",
                "https://example.org/example",
                "https://example.org/example",
                "https://example.org/example",
                redirectUrls,
                new HashMap<>(),
                true,
                "Custom Filing Deadline",
                true));
        when(cachedDataService.getStateProfileByStateCode(Mockito.<String>any()))
                .thenReturn(justResult);

        // Act and Assert
        FirstStep<StateProfileDTO> createResult = StepVerifier.create(stateApiServiceImpl.lookupStateProfile("MD"));
        createResult.expectError().verify();
        verify(cachedDataService).getStateProfileByStateCode(eq("MD"));
    }

    /**
     * Test {@link StateApiServiceImpl#lookupStateProfile(String)}.
     * <ul>
     *   <li>Then throw {@link IllegalArgumentException}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiServiceImpl#lookupStateProfile(String)}
     */
    @Test
    @DisplayName("Test lookupStateProfile(String); then throw IllegalArgumentException")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.lookupStateProfile(String)"})
    void testLookupStateProfile_thenThrowIllegalArgumentException() {
        // Arrange
        when(cachedDataService.getStateProfileByStateCode(Mockito.<String>any()))
                .thenThrow(new IllegalArgumentException("foo"));

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> stateApiServiceImpl.lookupStateProfile("MD"));
        verify(cachedDataService).getStateProfileByStateCode(eq("MD"));
    }

    /**
     * Test {@link StateApiServiceImpl#getStateProfile(String)}.
     * <ul>
     *   <li>Given {@link CachedDataService} {@link CachedDataService#getStateProfile(String)} return just {@link StateProfile} (default constructor).</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiServiceImpl#getStateProfile(String)}
     */
    @Test
    @DisplayName(
            "Test getStateProfile(String); given CachedDataService getStateProfile(String) return just StateProfile (default constructor)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.getStateProfile(String)"})
    void testGetStateProfile_givenCachedDataServiceGetStateProfileReturnJustStateProfile() throws AssertionError {
        // Arrange
        Mono<StateProfile> justResult = Mono.just(new StateProfile());
        when(cachedDataService.getStateProfile(Mockito.<String>any())).thenReturn(justResult);

        // Act and Assert
        FirstStep<StateProfile> createResult = StepVerifier.create(stateApiServiceImpl.getStateProfile("42"));
        createResult.expectError().verify();
        verify(cachedDataService).getStateProfile(eq("42"));
    }

    /**
     * Test {@link StateApiServiceImpl#getStateProfile(String)}.
     * <ul>
     *   <li>Then throw {@link IllegalArgumentException}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiServiceImpl#getStateProfile(String)}
     */
    @Test
    @DisplayName("Test getStateProfile(String); then throw IllegalArgumentException")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiServiceImpl.getStateProfile(String)"})
    void testGetStateProfile_thenThrowIllegalArgumentException() {
        // Arrange
        when(cachedDataService.getStateProfile(Mockito.<String>any())).thenThrow(new IllegalArgumentException("foo"));

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> stateApiServiceImpl.getStateProfile("42"));
        verify(cachedDataService).getStateProfile(eq("42"));
    }
}
