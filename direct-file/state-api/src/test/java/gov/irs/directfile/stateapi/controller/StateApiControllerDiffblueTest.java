package gov.irs.directfile.stateapi.controller;

import java.util.UUID;

import com.diffblue.cover.annotations.MethodsUnderTest;
import dev.openfeature.sdk.Client;
import jakarta.servlet.http.HttpServletRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.reactive.server.WebTestClient.RequestBodySpec;
import org.springframework.test.web.reactive.server.WebTestClient.RequestHeadersSpec;
import org.springframework.test.web.reactive.server.WebTestClient.RequestHeadersUriSpec;
import org.springframework.test.web.reactive.server.WebTestClient.ResponseSpec;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;
import reactor.test.StepVerifier.FirstStep;

import gov.irs.directfile.dto.AuthCodeResponse;
import gov.irs.directfile.stateapi.dto.StateProfileDTO;
import gov.irs.directfile.stateapi.model.AuthCodeRequest;
import gov.irs.directfile.stateapi.model.ExportResponse;
import gov.irs.directfile.stateapi.service.StateApiService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@ContextConfiguration(classes = {StateApiController.class})
@DisabledInAotMode
@ExtendWith(SpringExtension.class)
@WebFluxTest(controllers = {StateApiController.class})
class StateApiControllerDiffblueTest {
    @MockBean
    private Client client;

    @Autowired
    private StateApiController stateApiController;

    @MockBean
    private StateApiService stateApiService;

    @Autowired
    private WebTestClient webTestClient;

    /**
     * Test {@link StateApiController#createAuthorizationCode(AuthCodeRequest, HttpServletRequest)}.
     * <ul>
     *   <li>Given {@link AuthCodeRequest#AuthCodeRequest()} TaxReturnUuid is {@link UUID#UUID(long, long)} with one and one.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiController#createAuthorizationCode(AuthCodeRequest, HttpServletRequest)}
     */
    @Test
    @DisplayName(
            "Test createAuthorizationCode(AuthCodeRequest, HttpServletRequest); given AuthCodeRequest() TaxReturnUuid is UUID(long, long) with one and one")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiController.createAuthorizationCode(AuthCodeRequest, HttpServletRequest)"})
    void testCreateAuthorizationCode_givenAuthCodeRequestTaxReturnUuidIsUuidWithOneAndOne() throws AssertionError {
        // Arrange
        AuthCodeRequest authCodeRequest = new AuthCodeRequest();
        authCodeRequest.setTaxReturnUuid(new UUID(1L, 1L));
        Mono<AuthCodeRequest> justResult = Mono.just(authCodeRequest);
        RequestBodySpec contentTypeResult =
                webTestClient.post().uri("/state-api/authorization-code").contentType(MediaType.APPLICATION_JSON);
        Class<AuthCodeRequest> elementClass = AuthCodeRequest.class;

        // Act
        ResponseSpec actualExchangeResult =
                contentTypeResult.body(justResult, elementClass).exchange();

        // Assert
        actualExchangeResult.expectStatus().isEqualTo(400).expectHeader().contentType("application/json");
        Class<AuthCodeResponse> elementClass2 = AuthCodeResponse.class;
        FirstStep<AuthCodeResponse> createResult = StepVerifier.create(
                actualExchangeResult.returnResult(elementClass2).getResponseBody());
        createResult
                .assertNext(a -> {
                    AuthCodeResponse authCodeResponse = a;
                    assertNull(authCodeResponse.getAuthCode());
                    assertNull(authCodeResponse.getErrorCode());
                    return;
                })
                .expectComplete()
                .verify();
    }

    /**
     * Test {@link StateApiController#createAuthorizationCode(AuthCodeRequest, HttpServletRequest)}.
     * <ul>
     *   <li>Given {@link AuthCodeRequest#AuthCodeRequest()} TaxReturnUuid is {@link UUID#UUID(long, long)} with one and one.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiController#createAuthorizationCode(AuthCodeRequest, HttpServletRequest)}
     */
    @Test
    @DisplayName(
            "Test createAuthorizationCode(AuthCodeRequest, HttpServletRequest); given AuthCodeRequest() TaxReturnUuid is UUID(long, long) with one and one")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiController.createAuthorizationCode(AuthCodeRequest, HttpServletRequest)"})
    void testCreateAuthorizationCode_givenAuthCodeRequestTaxReturnUuidIsUuidWithOneAndOne2() throws AssertionError {
        // Arrange
        AuthCodeRequest authCodeRequest = new AuthCodeRequest();
        authCodeRequest.setTaxReturnUuid(new UUID(1L, 1L));
        Mono<AuthCodeRequest> justResult = Mono.just(authCodeRequest);
        RequestBodySpec contentTypeResult =
                webTestClient.post().uri("/state-api/authorization-code").contentType(MediaType.APPLICATION_JSON);
        Class<AuthCodeRequest> elementClass = AuthCodeRequest.class;

        // Act
        ResponseSpec actualExchangeResult =
                contentTypeResult.body(justResult, elementClass).exchange();

        // Assert
        actualExchangeResult.expectStatus().isEqualTo(400).expectHeader().contentType("application/json");
        Class<AuthCodeResponse> elementClass2 = AuthCodeResponse.class;
        FirstStep<AuthCodeResponse> createResult = StepVerifier.create(
                actualExchangeResult.returnResult(elementClass2).getResponseBody());
        createResult
                .assertNext(a -> {
                    AuthCodeResponse authCodeResponse = a;
                    assertNull(authCodeResponse.getAuthCode());
                    assertNull(authCodeResponse.getErrorCode());
                    return;
                })
                .expectComplete()
                .verify();
    }

    /**
     * Test {@link StateApiController#createAuthorizationCode(AuthCodeRequest, HttpServletRequest)}.
     * <ul>
     *   <li>Given {@link AuthCodeRequest#AuthCodeRequest()} TaxReturnUuid is {@link UUID#UUID(long, long)} with one and one.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiController#createAuthorizationCode(AuthCodeRequest, HttpServletRequest)}
     */
    @Test
    @DisplayName(
            "Test createAuthorizationCode(AuthCodeRequest, HttpServletRequest); given AuthCodeRequest() TaxReturnUuid is UUID(long, long) with one and one")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiController.createAuthorizationCode(AuthCodeRequest, HttpServletRequest)"})
    void testCreateAuthorizationCode_givenAuthCodeRequestTaxReturnUuidIsUuidWithOneAndOne3() throws AssertionError {
        // Arrange
        AuthCodeRequest authCodeRequest = new AuthCodeRequest();
        authCodeRequest.setTaxReturnUuid(new UUID(1L, 1L));
        Mono<AuthCodeRequest> justResult = Mono.just(authCodeRequest);
        RequestBodySpec contentTypeResult =
                webTestClient.post().uri("/state-api/authorization-code").contentType(MediaType.APPLICATION_JSON);
        Class<AuthCodeRequest> elementClass = AuthCodeRequest.class;

        // Act
        ResponseSpec actualExchangeResult =
                contentTypeResult.body(justResult, elementClass).exchange();

        // Assert
        actualExchangeResult.expectStatus().isEqualTo(400).expectHeader().contentType("application/json");
        Class<AuthCodeResponse> elementClass2 = AuthCodeResponse.class;
        FirstStep<AuthCodeResponse> createResult = StepVerifier.create(
                actualExchangeResult.returnResult(elementClass2).getResponseBody());
        createResult
                .assertNext(a -> {
                    AuthCodeResponse authCodeResponse = a;
                    assertNull(authCodeResponse.getAuthCode());
                    assertNull(authCodeResponse.getErrorCode());
                    return;
                })
                .expectComplete()
                .verify();
    }

    /**
     * Test {@link StateApiController#createAuthorizationCode(AuthCodeRequest, HttpServletRequest)}.
     * <ul>
     *   <li>Given {@link AuthCodeRequest#AuthCodeRequest()} TaxReturnUuid is {@link UUID#UUID(long, long)} with one and one.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiController#createAuthorizationCode(AuthCodeRequest, HttpServletRequest)}
     */
    @Test
    @DisplayName(
            "Test createAuthorizationCode(AuthCodeRequest, HttpServletRequest); given AuthCodeRequest() TaxReturnUuid is UUID(long, long) with one and one")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiController.createAuthorizationCode(AuthCodeRequest, HttpServletRequest)"})
    void testCreateAuthorizationCode_givenAuthCodeRequestTaxReturnUuidIsUuidWithOneAndOne4() throws AssertionError {
        // Arrange
        AuthCodeRequest authCodeRequest = new AuthCodeRequest();
        authCodeRequest.setTaxReturnUuid(new UUID(1L, 1L));
        Mono<AuthCodeRequest> justResult = Mono.just(authCodeRequest);
        RequestBodySpec contentTypeResult =
                webTestClient.post().uri("/state-api/authorization-code").contentType(MediaType.APPLICATION_JSON);
        Class<AuthCodeRequest> elementClass = AuthCodeRequest.class;

        // Act
        ResponseSpec actualExchangeResult =
                contentTypeResult.body(justResult, elementClass).exchange();

        // Assert
        actualExchangeResult.expectStatus().isEqualTo(400).expectHeader().contentType("application/json");
        Class<AuthCodeResponse> elementClass2 = AuthCodeResponse.class;
        FirstStep<AuthCodeResponse> createResult = StepVerifier.create(
                actualExchangeResult.returnResult(elementClass2).getResponseBody());
        createResult
                .assertNext(a -> {
                    AuthCodeResponse authCodeResponse = a;
                    assertNull(authCodeResponse.getAuthCode());
                    assertNull(authCodeResponse.getErrorCode());
                    return;
                })
                .expectComplete()
                .verify();
    }

    /**
     * Test {@link StateApiController#exportReturn(String, HttpServletRequest)}.
     * <ul>
     *   <li>Given {@code Bearer}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiController#exportReturn(String, HttpServletRequest)}
     */
    @Test
    @DisplayName("Test exportReturn(String, HttpServletRequest); given 'Bearer'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiController.exportReturn(String, HttpServletRequest)"})
    void testExportReturn_givenBearer() throws AssertionError {
        // Arrange and Act
        ResponseSpec actualExchangeResult = ((RequestHeadersSpec<?>)
                        ((RequestHeadersSpec<?>) webTestClient.get().uri("/state-api/export-return"))
                                .header("Authorization", "Bearer "))
                .exchange();

        // Assert
        actualExchangeResult.expectStatus().is5xxServerError().expectHeader().contentType("application/json");
        Class<ExportResponse> elementClass = ExportResponse.class;
        FirstStep<ExportResponse> createResult = StepVerifier.create(
                actualExchangeResult.returnResult(elementClass).getResponseBody());
        createResult
                .assertNext(e -> {
                    ExportResponse exportResponse = e;
                    assertEquals("Internal Server Error", exportResponse.getError());
                    assertEquals("500", exportResponse.getStatus());
                    assertNull(exportResponse.getTaxReturn());
                    return;
                })
                .expectComplete()
                .verify();
    }

    /**
     * Test {@link StateApiController#exportReturn(String, HttpServletRequest)}.
     * <ul>
     *   <li>Given {@code Bearer}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiController#exportReturn(String, HttpServletRequest)}
     */
    @Test
    @DisplayName("Test exportReturn(String, HttpServletRequest); given 'Bearer'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiController.exportReturn(String, HttpServletRequest)"})
    void testExportReturn_givenBearer2() throws AssertionError {
        // Arrange and Act
        ResponseSpec actualExchangeResult = ((RequestHeadersSpec<?>)
                        ((RequestHeadersSpec<?>) webTestClient.get().uri("/state-api/export-return"))
                                .header("Authorization", "Bearer "))
                .exchange();

        // Assert
        Class<ExportResponse> elementClass = ExportResponse.class;
        FirstStep<ExportResponse> createResult = StepVerifier.create(
                actualExchangeResult.returnResult(elementClass).getResponseBody());
        createResult
                .assertNext(e -> {
                    ExportResponse exportResponse = e;
                    assertEquals("Internal Server Error", exportResponse.getError());
                    assertEquals("500", exportResponse.getStatus());
                    assertNull(exportResponse.getTaxReturn());
                    return;
                })
                .expectComplete()
                .verify();
    }

    /**
     * Test {@link StateApiController#exportReturn(String, HttpServletRequest)}.
     * <ul>
     *   <li>Given {@code JaneDoe}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiController#exportReturn(String, HttpServletRequest)}
     */
    @Test
    @DisplayName("Test exportReturn(String, HttpServletRequest); given 'JaneDoe'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiController.exportReturn(String, HttpServletRequest)"})
    void testExportReturn_givenJaneDoe() throws AssertionError {
        // Arrange and Act
        ResponseSpec actualExchangeResult = ((RequestHeadersSpec<?>)
                        ((RequestHeadersSpec<?>) webTestClient.get().uri("/state-api/export-return"))
                                .header("Authorization", "JaneDoe"))
                .exchange();

        // Assert
        Class<ExportResponse> elementClass = ExportResponse.class;
        FirstStep<ExportResponse> createResult = StepVerifier.create(
                actualExchangeResult.returnResult(elementClass).getResponseBody());
        createResult
                .assertNext(e -> {
                    ExportResponse exportResponse = e;
                    assertEquals("Internal Server Error", exportResponse.getError());
                    assertEquals("500", exportResponse.getStatus());
                    assertNull(exportResponse.getTaxReturn());
                    return;
                })
                .expectComplete()
                .verify();
    }

    /**
     * Test {@link StateApiController#exportReturn(String, HttpServletRequest)}.
     * <ul>
     *   <li>Given {@code JaneDoe}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiController#exportReturn(String, HttpServletRequest)}
     */
    @Test
    @DisplayName("Test exportReturn(String, HttpServletRequest); given 'JaneDoe'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiController.exportReturn(String, HttpServletRequest)"})
    void testExportReturn_givenJaneDoe2() throws AssertionError {
        // Arrange and Act
        ResponseSpec actualExchangeResult = ((RequestHeadersSpec<?>)
                        ((RequestHeadersSpec<?>) webTestClient.get().uri("/state-api/export-return"))
                                .header("Authorization", "JaneDoe"))
                .exchange();

        // Assert
        actualExchangeResult.expectStatus().is5xxServerError().expectHeader().contentType("application/json");
        Class<ExportResponse> elementClass = ExportResponse.class;
        FirstStep<ExportResponse> createResult = StepVerifier.create(
                actualExchangeResult.returnResult(elementClass).getResponseBody());
        createResult
                .assertNext(e -> {
                    ExportResponse exportResponse = e;
                    assertEquals("Internal Server Error", exportResponse.getError());
                    assertEquals("500", exportResponse.getStatus());
                    assertNull(exportResponse.getTaxReturn());
                    return;
                })
                .expectComplete()
                .verify();
    }

    /**
     * Test {@link StateApiController#getStateProfile(String, HttpServletRequest)}.
     * <p>
     * Method under test: {@link StateApiController#getStateProfile(String, HttpServletRequest)}
     */
    @Test
    @DisplayName("Test getStateProfile(String, HttpServletRequest)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiController.getStateProfile(String, HttpServletRequest)"})
    void testGetStateProfile() throws AssertionError {
        // Arrange
        RequestHeadersUriSpec<?> getResult = webTestClient.get();

        // Act
        ResponseSpec actualExchangeResult = ((RequestHeadersSpec<?>)
                        getResult.uri(UriComponentsBuilder.fromPath("/state-api/state-profile")
                                .queryParam("stateCode", "MD")
                                .build()
                                .toUriString()))
                .exchange();

        // Assert
        actualExchangeResult.expectStatus().is5xxServerError().expectHeader().contentType("application/json");
        Class<StateProfileDTO> elementClass = StateProfileDTO.class;
        FirstStep<StateProfileDTO> createResult = StepVerifier.create(
                actualExchangeResult.returnResult(elementClass).getResponseBody());
        createResult
                .assertNext(s -> {
                    StateProfileDTO stateProfileDTO = s;
                    assertNull(stateProfileDTO.acceptedOnly());
                    assertNull(stateProfileDTO.archived());
                    assertNull(stateProfileDTO.customFilingDeadline());
                    assertNull(stateProfileDTO.defaultRedirectUrl());
                    assertNull(stateProfileDTO.departmentOfRevenueUrl());
                    assertNull(stateProfileDTO.filingRequirementsUrl());
                    assertNull(stateProfileDTO.landingUrl());
                    assertNull(stateProfileDTO.languages());
                    assertNull(stateProfileDTO.redirectUrls());
                    assertNull(stateProfileDTO.stateCode());
                    assertNull(stateProfileDTO.taxSystemName());
                    assertNull(stateProfileDTO.transferCancelUrl());
                    assertNull(stateProfileDTO.waitingForAcceptanceCancelUrl());
                    return;
                })
                .expectComplete()
                .verify();
    }

    /**
     * Test {@link StateApiController#getStateProfile(String, HttpServletRequest)}.
     * <p>
     * Method under test: {@link StateApiController#getStateProfile(String, HttpServletRequest)}
     */
    @Test
    @DisplayName("Test getStateProfile(String, HttpServletRequest)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"Mono StateApiController.getStateProfile(String, HttpServletRequest)"})
    void testGetStateProfile2() throws AssertionError {
        // Arrange
        RequestHeadersUriSpec<?> getResult = webTestClient.get();

        // Act
        ResponseSpec actualExchangeResult = ((RequestHeadersSpec<?>)
                        getResult.uri(UriComponentsBuilder.fromPath("/state-api/state-profile")
                                .queryParam("stateCode", "MD")
                                .build()
                                .toUriString()))
                .exchange();

        // Assert
        Class<StateProfileDTO> elementClass = StateProfileDTO.class;
        FirstStep<StateProfileDTO> createResult = StepVerifier.create(
                actualExchangeResult.returnResult(elementClass).getResponseBody());
        createResult
                .assertNext(s -> {
                    StateProfileDTO stateProfileDTO = s;
                    assertNull(stateProfileDTO.acceptedOnly());
                    assertNull(stateProfileDTO.archived());
                    assertNull(stateProfileDTO.customFilingDeadline());
                    assertNull(stateProfileDTO.defaultRedirectUrl());
                    assertNull(stateProfileDTO.departmentOfRevenueUrl());
                    assertNull(stateProfileDTO.filingRequirementsUrl());
                    assertNull(stateProfileDTO.landingUrl());
                    assertNull(stateProfileDTO.languages());
                    assertNull(stateProfileDTO.redirectUrls());
                    assertNull(stateProfileDTO.stateCode());
                    assertNull(stateProfileDTO.taxSystemName());
                    assertNull(stateProfileDTO.transferCancelUrl());
                    assertNull(stateProfileDTO.waitingForAcceptanceCancelUrl());
                    return;
                })
                .expectComplete()
                .verify();
    }
}
