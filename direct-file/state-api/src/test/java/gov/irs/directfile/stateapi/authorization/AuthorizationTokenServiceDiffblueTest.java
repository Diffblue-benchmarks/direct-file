package gov.irs.directfile.stateapi.authorization;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import reactor.test.StepVerifier;
import reactor.test.StepVerifier.FirstStep;

import gov.irs.directfile.models.encryption.DataEncryptDecrypt;

@ContextConfiguration(classes = {AuthorizationTokenService.class, String.class})
@DisabledInAotMode
@ExtendWith(SpringExtension.class)
class AuthorizationTokenServiceDiffblueTest {
    @Autowired
    private AuthorizationTokenService authorizationTokenService;

    @MockBean
    private DataEncryptDecrypt dataEncryptDecrypt;

    /**
     * Test {@link AuthorizationTokenService#generateAndEncrypt(AuthorizationTokenClaims)}.
     * <p>
     * Method under test: {@link AuthorizationTokenService#generateAndEncrypt(AuthorizationTokenClaims)}
     */
    @Test
    @DisplayName("Test generateAndEncrypt(AuthorizationTokenClaims)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "reactor.core.publisher.Mono AuthorizationTokenService.generateAndEncrypt(AuthorizationTokenClaims)"
    })
    void testGenerateAndEncrypt() throws AssertionError {
        // Arrange, Act and Assert
        FirstStep<String> createResult = StepVerifier.create(authorizationTokenService.generateAndEncrypt(
                new AuthorizationTokenClaims("01234567-89AB-CDEF-FEDC-BA9876543210", "42", "MD", 1)));
        createResult.expectError().verify();
    }

    /**
     * Test {@link AuthorizationTokenService#generateAndEncrypt(AuthorizationTokenClaims)}.
     * <p>
     * Method under test: {@link AuthorizationTokenService#generateAndEncrypt(AuthorizationTokenClaims)}
     */
    @Test
    @DisplayName("Test generateAndEncrypt(AuthorizationTokenClaims)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "reactor.core.publisher.Mono AuthorizationTokenService.generateAndEncrypt(AuthorizationTokenClaims)"
    })
    void testGenerateAndEncrypt2() throws AssertionError {
        // Arrange, Act and Assert
        FirstStep<String> createResult = StepVerifier.create(
                authorizationTokenService.generateAndEncrypt(new AuthorizationTokenClaims("1234", "42", "MD", 1)));
        createResult.expectError().verify();
    }
}
