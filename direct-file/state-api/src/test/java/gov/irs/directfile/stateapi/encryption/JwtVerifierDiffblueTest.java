package gov.irs.directfile.stateapi.encryption;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import gov.irs.directfile.stateapi.exception.StateApiException;

import static org.junit.jupiter.api.Assertions.assertThrows;

class JwtVerifierDiffblueTest {
    /**
     * Test {@link JwtVerifier#getAccountId(String)}.
     * <ul>
     *   <li>When {@code \.42}.</li>
     * </ul>
     * <p>
     * Method under test: {@link JwtVerifier#getAccountId(String)}
     */
    @Test
    @DisplayName("Test getAccountId(String); when '\\.42'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"String JwtVerifier.getAccountId(String)"})
    void testGetAccountId_when42() {
        // Arrange, Act and Assert
        assertThrows(StateApiException.class, () -> JwtVerifier.getAccountId("\\.42"));
    }

    /**
     * Test {@link JwtVerifier#getAccountId(String)}.
     * <ul>
     *   <li>When {@code ABC123JwtVerifier}.</li>
     * </ul>
     * <p>
     * Method under test: {@link JwtVerifier#getAccountId(String)}
     */
    @Test
    @DisplayName("Test getAccountId(String); when 'ABC123gov.irs.directfile.stateapi.encryption.JwtVerifier'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"String JwtVerifier.getAccountId(String)"})
    void testGetAccountId_whenABC123govIrsDirectfileStateapiEncryptionJwtVerifier() {
        // Arrange, Act and Assert
        assertThrows(
                StateApiException.class,
                () -> JwtVerifier.getAccountId("ABC123gov.irs.directfile.stateapi.encryption.JwtVerifier"));
    }

    /**
     * Test {@link JwtVerifier#getAccountId(String)}.
     * <ul>
     *   <li>When {@code ABC123}.</li>
     * </ul>
     * <p>
     * Method under test: {@link JwtVerifier#getAccountId(String)}
     */
    @Test
    @DisplayName("Test getAccountId(String); when 'ABC123'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"String JwtVerifier.getAccountId(String)"})
    void testGetAccountId_whenAbc123() {
        // Arrange, Act and Assert
        assertThrows(StateApiException.class, () -> JwtVerifier.getAccountId("ABC123"));
    }

    /**
     * Test {@link JwtVerifier#getAccountId(String)}.
     * <ul>
     *   <li>When {@code \.ABC123}.</li>
     * </ul>
     * <p>
     * Method under test: {@link JwtVerifier#getAccountId(String)}
     */
    @Test
    @DisplayName("Test getAccountId(String); when '\\.ABC123'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"String JwtVerifier.getAccountId(String)"})
    void testGetAccountId_whenAbc1232() {
        // Arrange, Act and Assert
        assertThrows(StateApiException.class, () -> JwtVerifier.getAccountId("\\.ABC123"));
    }

    /**
     * Test {@link JwtVerifier#getAccountId(String)}.
     * <ul>
     *   <li>When {@code \.\.}.</li>
     * </ul>
     * <p>
     * Method under test: {@link JwtVerifier#getAccountId(String)}
     */
    @Test
    @DisplayName("Test getAccountId(String); when '\\.\\.'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"String JwtVerifier.getAccountId(String)"})
    void testGetAccountId_whenBackslashDotBackslashDot() {
        // Arrange, Act and Assert
        assertThrows(StateApiException.class, () -> JwtVerifier.getAccountId("\\.\\."));
    }

    /**
     * Test {@link JwtVerifier#getAccountId(String)}.
     * <ul>
     *   <li>When {@code JwtVerifier}.</li>
     * </ul>
     * <p>
     * Method under test: {@link JwtVerifier#getAccountId(String)}
     */
    @Test
    @DisplayName("Test getAccountId(String); when 'gov.irs.directfile.stateapi.encryption.JwtVerifier'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"String JwtVerifier.getAccountId(String)"})
    void testGetAccountId_whenGovIrsDirectfileStateapiEncryptionJwtVerifier() {
        // Arrange, Act and Assert
        assertThrows(
                StateApiException.class,
                () -> JwtVerifier.getAccountId("gov.irs.directfile.stateapi.encryption.JwtVerifier"));
    }
}
