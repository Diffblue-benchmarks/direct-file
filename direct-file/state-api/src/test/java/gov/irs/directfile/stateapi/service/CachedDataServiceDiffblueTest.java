package gov.irs.directfile.stateapi.service;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.PublicKey;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.function.Function;
import java.util.function.Predicate;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;
import reactor.test.StepVerifier.FirstStep;

import gov.irs.directfile.stateapi.dto.StateProfileDTO;
import gov.irs.directfile.stateapi.model.StateProfile;
import gov.irs.directfile.stateapi.repository.StateApiS3Client;
import gov.irs.directfile.stateapi.repository.StateLanguageRepository;
import gov.irs.directfile.stateapi.repository.StateProfileRepository;
import gov.irs.directfile.stateapi.repository.StateRedirectRepository;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ContextConfiguration(classes = {CachedDataService.class})
@DisabledInAotMode
@ExtendWith(SpringExtension.class)
class CachedDataServiceDiffblueTest {
    @Autowired
    private CachedDataService cachedDataService;

    @MockBean
    private StateApiS3Client stateApiS3Client;

    @MockBean
    private StateLanguageRepository stateLanguageRepository;

    @MockBean
    private StateProfileRepository stateProfileRepository;

    @MockBean
    private StateRedirectRepository stateRedirectRepository;

    /**
     * Test {@link CachedDataService#retrievePublicKeyFromCert(String, OffsetDateTime)}.
     * <p>
     * Method under test: {@link CachedDataService#retrievePublicKeyFromCert(String, OffsetDateTime)}
     */
    @Test
    @DisplayName("Test retrievePublicKeyFromCert(String, OffsetDateTime)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono CachedDataService.retrievePublicKeyFromCert(String, OffsetDateTime)"})
    void testRetrievePublicKeyFromCert() throws UnsupportedEncodingException, AssertionError {
        // Arrange
        Mono<InputStream> justResult = Mono.just(new ByteArrayInputStream("AXAXAXAX".getBytes("UTF-8")));
        when(stateApiS3Client.getCert(Mockito.<String>any())).thenReturn(justResult);

        // Act and Assert
        FirstStep<PublicKey> createResult = StepVerifier.create(cachedDataService.retrievePublicKeyFromCert(
                "Cert Name", OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC)));
        createResult.expectError().verify();
        verify(stateApiS3Client).getCert(eq("Cert Name"));
    }

    /**
     * Test {@link CachedDataService#getStateProfile(String)}.
     * <p>
     * Method under test: {@link CachedDataService#getStateProfile(String)}
     */
    @Test
    @DisplayName("Test getStateProfile(String)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono CachedDataService.getStateProfile(String)"})
    void testGetStateProfile() throws AssertionError {
        // Arrange
        StateProfile stateProfile = new StateProfile();
        Mono<StateProfile> justResult = Mono.just(stateProfile);
        when(stateProfileRepository.getByAccountId(Mockito.<String>any())).thenReturn(justResult);

        // Act and Assert
        FirstStep<StateProfile> createResult = StepVerifier.create(cachedDataService.getStateProfile("42"));
        createResult
                .assertNext(s -> {
                    assertSame(stateProfile, s);
                    return;
                })
                .expectComplete()
                .verify();
        verify(stateProfileRepository).getByAccountId(eq("42"));
    }

    /**
     * Test {@link CachedDataService#getStateProfile(String)}.
     * <ul>
     *   <li>Given {@link Mono} {@link Mono#onErrorMap(Predicate, Function)} return just {@link StateProfile} (default constructor).</li>
     * </ul>
     * <p>
     * Method under test: {@link CachedDataService#getStateProfile(String)}
     */
    @Test
    @DisplayName(
            "Test getStateProfile(String); given Mono onErrorMap(Predicate, Function) return just StateProfile (default constructor)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono CachedDataService.getStateProfile(String)"})
    void testGetStateProfile_givenMonoOnErrorMapReturnJustStateProfile() throws AssertionError {
        // Arrange
        Mono<StateProfile> mono = mock(Mono.class);
        StateProfile stateProfile = new StateProfile();
        Mono<StateProfile> justResult = Mono.just(stateProfile);
        when(mono.onErrorMap(Mockito.<Predicate<Throwable>>any(), Mockito.<Function<Throwable, Throwable>>any()))
                .thenReturn(justResult);
        Mono<StateProfile> mono2 = mock(Mono.class);
        when(mono2.switchIfEmpty(Mockito.<Mono<StateProfile>>any())).thenReturn(mono);
        when(stateProfileRepository.getByAccountId(Mockito.<String>any())).thenReturn(mono2);

        // Act and Assert
        FirstStep<StateProfile> createResult = StepVerifier.create(cachedDataService.getStateProfile("42"));
        createResult
                .assertNext(s -> {
                    assertSame(stateProfile, s);
                    return;
                })
                .expectComplete()
                .verify();
        verify(stateProfileRepository).getByAccountId(eq("42"));
        verify(mono).onErrorMap(isA(Predicate.class), isA(Function.class));
        verify(mono2).switchIfEmpty(isA(Mono.class));
    }

    /**
     * Test {@link CachedDataService#getStateProfile(String)}.
     * <ul>
     *   <li>Given {@link Mono} {@link Mono#switchIfEmpty(Mono)} return just {@link StateProfile} (default constructor).</li>
     * </ul>
     * <p>
     * Method under test: {@link CachedDataService#getStateProfile(String)}
     */
    @Test
    @DisplayName(
            "Test getStateProfile(String); given Mono switchIfEmpty(Mono) return just StateProfile (default constructor)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono CachedDataService.getStateProfile(String)"})
    void testGetStateProfile_givenMonoSwitchIfEmptyReturnJustStateProfile() throws AssertionError {
        // Arrange
        Mono<StateProfile> mono = mock(Mono.class);
        StateProfile stateProfile = new StateProfile();
        Mono<StateProfile> justResult = Mono.just(stateProfile);
        when(mono.switchIfEmpty(Mockito.<Mono<StateProfile>>any())).thenReturn(justResult);
        when(stateProfileRepository.getByAccountId(Mockito.<String>any())).thenReturn(mono);

        // Act and Assert
        FirstStep<StateProfile> createResult = StepVerifier.create(cachedDataService.getStateProfile("42"));
        createResult
                .assertNext(s -> {
                    assertSame(stateProfile, s);
                    return;
                })
                .expectComplete()
                .verify();
        verify(stateProfileRepository).getByAccountId(eq("42"));
        verify(mono).switchIfEmpty(isA(Mono.class));
    }

    /**
     * Test {@link CachedDataService#getStateProfile(String)}.
     * <ul>
     *   <li>Then return just {@link StateProfile} (default constructor).</li>
     * </ul>
     * <p>
     * Method under test: {@link CachedDataService#getStateProfile(String)}
     */
    @Test
    @DisplayName("Test getStateProfile(String); then return just StateProfile (default constructor)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono CachedDataService.getStateProfile(String)"})
    void testGetStateProfile_thenReturnJustStateProfile() {
        // Arrange
        Mono<StateProfile> mono = mock(Mono.class);
        Mono<StateProfile> justResult = Mono.just(new StateProfile());
        when(mono.cache()).thenReturn(justResult);
        Mono<StateProfile> mono2 = mock(Mono.class);
        when(mono2.onErrorMap(Mockito.<Predicate<Throwable>>any(), Mockito.<Function<Throwable, Throwable>>any()))
                .thenReturn(mono);
        Mono<StateProfile> mono3 = mock(Mono.class);
        when(mono3.switchIfEmpty(Mockito.<Mono<StateProfile>>any())).thenReturn(mono2);
        when(stateProfileRepository.getByAccountId(Mockito.<String>any())).thenReturn(mono3);

        // Act
        Mono<StateProfile> actualStateProfile = cachedDataService.getStateProfile("42");

        // Assert
        verify(stateProfileRepository).getByAccountId(eq("42"));
        verify(mono).cache();
        verify(mono2).onErrorMap(isA(Predicate.class), isA(Function.class));
        verify(mono3).switchIfEmpty(isA(Mono.class));
        assertSame(justResult, actualStateProfile);
    }

    /**
     * Test {@link CachedDataService#getStateProfileByStateCode(String)}.
     * <p>
     * Method under test: {@link CachedDataService#getStateProfileByStateCode(String)}
     */
    @Test
    @DisplayName("Test getStateProfileByStateCode(String)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono CachedDataService.getStateProfileByStateCode(String)"})
    void testGetStateProfileByStateCode() throws AssertionError {
        // Arrange
        Mono<StateProfile> justResult = Mono.just(new StateProfile());
        when(stateProfileRepository.getByStateCode(Mockito.<String>any())).thenReturn(justResult);

        // Act and Assert
        FirstStep<StateProfileDTO> createResult =
                StepVerifier.create(cachedDataService.getStateProfileByStateCode("MD"));
        createResult.expectError().verify();
        verify(stateProfileRepository).getByStateCode(eq("MD"));
    }
}
