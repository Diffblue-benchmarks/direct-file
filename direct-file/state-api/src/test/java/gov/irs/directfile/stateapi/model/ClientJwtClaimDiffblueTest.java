package gov.irs.directfile.stateapi.model;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ClientJwtClaimDiffblueTest {
    /**
     * Test {@link ClientJwtClaim#equals(Object)}, and {@link ClientJwtClaim#hashCode()}.
     * <ul>
     *   <li>When other is equal.</li>
     *   <li>Then return equal.</li>
     * </ul>
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link ClientJwtClaim#equals(Object)}
     *   <li>{@link ClientJwtClaim#hashCode()}
     * </ul>
     */
    @Test
    @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ClientJwtClaim.equals(Object)", "int ClientJwtClaim.hashCode()"})
    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
        // Arrange
        ClientJwtClaim clientJwtClaim = new ClientJwtClaim();
        clientJwtClaim.setAccountId("42");
        clientJwtClaim.setAuthorizationCode("JaneDoe");

        ClientJwtClaim clientJwtClaim2 = new ClientJwtClaim();
        clientJwtClaim2.setAccountId("42");
        clientJwtClaim2.setAuthorizationCode("JaneDoe");

        // Act and Assert
        assertEquals(clientJwtClaim, clientJwtClaim2);
        int expectedHashCodeResult = clientJwtClaim.hashCode();
        assertEquals(expectedHashCodeResult, clientJwtClaim2.hashCode());
    }

    /**
     * Test {@link ClientJwtClaim#equals(Object)}, and {@link ClientJwtClaim#hashCode()}.
     * <ul>
     *   <li>When other is equal.</li>
     *   <li>Then return equal.</li>
     * </ul>
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link ClientJwtClaim#equals(Object)}
     *   <li>{@link ClientJwtClaim#hashCode()}
     * </ul>
     */
    @Test
    @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ClientJwtClaim.equals(Object)", "int ClientJwtClaim.hashCode()"})
    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
        // Arrange
        ClientJwtClaim clientJwtClaim = new ClientJwtClaim();
        clientJwtClaim.setAccountId(null);
        clientJwtClaim.setAuthorizationCode("JaneDoe");

        ClientJwtClaim clientJwtClaim2 = new ClientJwtClaim();
        clientJwtClaim2.setAccountId(null);
        clientJwtClaim2.setAuthorizationCode("JaneDoe");

        // Act and Assert
        assertEquals(clientJwtClaim, clientJwtClaim2);
        int expectedHashCodeResult = clientJwtClaim.hashCode();
        assertEquals(expectedHashCodeResult, clientJwtClaim2.hashCode());
    }

    /**
     * Test {@link ClientJwtClaim#equals(Object)}, and {@link ClientJwtClaim#hashCode()}.
     * <ul>
     *   <li>When other is equal.</li>
     *   <li>Then return equal.</li>
     * </ul>
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link ClientJwtClaim#equals(Object)}
     *   <li>{@link ClientJwtClaim#hashCode()}
     * </ul>
     */
    @Test
    @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ClientJwtClaim.equals(Object)", "int ClientJwtClaim.hashCode()"})
    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
        // Arrange
        ClientJwtClaim clientJwtClaim = new ClientJwtClaim();
        clientJwtClaim.setAccountId("42");
        clientJwtClaim.setAuthorizationCode(null);

        ClientJwtClaim clientJwtClaim2 = new ClientJwtClaim();
        clientJwtClaim2.setAccountId("42");
        clientJwtClaim2.setAuthorizationCode(null);

        // Act and Assert
        assertEquals(clientJwtClaim, clientJwtClaim2);
        int expectedHashCodeResult = clientJwtClaim.hashCode();
        assertEquals(expectedHashCodeResult, clientJwtClaim2.hashCode());
    }

    /**
     * Test {@link ClientJwtClaim#equals(Object)}, and {@link ClientJwtClaim#hashCode()}.
     * <ul>
     *   <li>When other is same.</li>
     *   <li>Then return equal.</li>
     * </ul>
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link ClientJwtClaim#equals(Object)}
     *   <li>{@link ClientJwtClaim#hashCode()}
     * </ul>
     */
    @Test
    @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ClientJwtClaim.equals(Object)", "int ClientJwtClaim.hashCode()"})
    void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
        // Arrange
        ClientJwtClaim clientJwtClaim = new ClientJwtClaim();
        clientJwtClaim.setAccountId("42");
        clientJwtClaim.setAuthorizationCode("JaneDoe");

        // Act and Assert
        assertEquals(clientJwtClaim, clientJwtClaim);
        int expectedHashCodeResult = clientJwtClaim.hashCode();
        assertEquals(expectedHashCodeResult, clientJwtClaim.hashCode());
    }

    /**
     * Test {@link ClientJwtClaim#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link ClientJwtClaim#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ClientJwtClaim.equals(Object)", "int ClientJwtClaim.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
        // Arrange
        ClientJwtClaim clientJwtClaim = new ClientJwtClaim();
        clientJwtClaim.setAccountId("3");
        clientJwtClaim.setAuthorizationCode("JaneDoe");

        ClientJwtClaim clientJwtClaim2 = new ClientJwtClaim();
        clientJwtClaim2.setAccountId("42");
        clientJwtClaim2.setAuthorizationCode("JaneDoe");

        // Act and Assert
        assertNotEquals(clientJwtClaim, clientJwtClaim2);
    }

    /**
     * Test {@link ClientJwtClaim#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link ClientJwtClaim#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ClientJwtClaim.equals(Object)", "int ClientJwtClaim.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
        // Arrange
        ClientJwtClaim clientJwtClaim = new ClientJwtClaim();
        clientJwtClaim.setAccountId(null);
        clientJwtClaim.setAuthorizationCode("JaneDoe");

        ClientJwtClaim clientJwtClaim2 = new ClientJwtClaim();
        clientJwtClaim2.setAccountId("42");
        clientJwtClaim2.setAuthorizationCode("JaneDoe");

        // Act and Assert
        assertNotEquals(clientJwtClaim, clientJwtClaim2);
    }

    /**
     * Test {@link ClientJwtClaim#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link ClientJwtClaim#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ClientJwtClaim.equals(Object)", "int ClientJwtClaim.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
        // Arrange
        ClientJwtClaim clientJwtClaim = new ClientJwtClaim();
        clientJwtClaim.setAccountId("42");
        clientJwtClaim.setAuthorizationCode("42");

        ClientJwtClaim clientJwtClaim2 = new ClientJwtClaim();
        clientJwtClaim2.setAccountId("42");
        clientJwtClaim2.setAuthorizationCode("JaneDoe");

        // Act and Assert
        assertNotEquals(clientJwtClaim, clientJwtClaim2);
    }

    /**
     * Test {@link ClientJwtClaim#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link ClientJwtClaim#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ClientJwtClaim.equals(Object)", "int ClientJwtClaim.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
        // Arrange
        ClientJwtClaim clientJwtClaim = new ClientJwtClaim();
        clientJwtClaim.setAccountId("42");
        clientJwtClaim.setAuthorizationCode(null);

        ClientJwtClaim clientJwtClaim2 = new ClientJwtClaim();
        clientJwtClaim2.setAccountId("42");
        clientJwtClaim2.setAuthorizationCode("JaneDoe");

        // Act and Assert
        assertNotEquals(clientJwtClaim, clientJwtClaim2);
    }

    /**
     * Test {@link ClientJwtClaim#equals(Object)}.
     * <ul>
     *   <li>When other is {@code null}.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link ClientJwtClaim#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ClientJwtClaim.equals(Object)", "int ClientJwtClaim.hashCode()"})
    void testEquals_whenOtherIsNull_thenReturnNotEqual() {
        // Arrange
        ClientJwtClaim clientJwtClaim = new ClientJwtClaim();
        clientJwtClaim.setAccountId("42");
        clientJwtClaim.setAuthorizationCode("JaneDoe");

        // Act and Assert
        assertNotEquals(clientJwtClaim, null);
    }

    /**
     * Test {@link ClientJwtClaim#equals(Object)}.
     * <ul>
     *   <li>When other is wrong type.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link ClientJwtClaim#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ClientJwtClaim.equals(Object)", "int ClientJwtClaim.hashCode()"})
    void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
        // Arrange
        ClientJwtClaim clientJwtClaim = new ClientJwtClaim();
        clientJwtClaim.setAccountId("42");
        clientJwtClaim.setAuthorizationCode("JaneDoe");

        // Act and Assert
        assertNotEquals(clientJwtClaim, "Different type to ClientJwtClaim");
    }

    /**
     * Test getters and setters.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>default or parameterless constructor of {@link ClientJwtClaim}
     *   <li>{@link ClientJwtClaim#setAccountId(String)}
     *   <li>{@link ClientJwtClaim#setAuthorizationCode(String)}
     *   <li>{@link ClientJwtClaim#toString()}
     *   <li>{@link ClientJwtClaim#getAccountId()}
     *   <li>{@link ClientJwtClaim#getAuthorizationCode()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void ClientJwtClaim.<init>()",
        "String ClientJwtClaim.getAccountId()",
        "String ClientJwtClaim.getAuthorizationCode()",
        "void ClientJwtClaim.setAccountId(String)",
        "void ClientJwtClaim.setAuthorizationCode(String)",
        "String ClientJwtClaim.toString()"
    })
    void testGettersAndSetters() {
        // Arrange and Act
        ClientJwtClaim actualClientJwtClaim = new ClientJwtClaim();
        actualClientJwtClaim.setAccountId("42");
        actualClientJwtClaim.setAuthorizationCode("JaneDoe");
        String actualToStringResult = actualClientJwtClaim.toString();
        String actualAccountId = actualClientJwtClaim.getAccountId();

        // Assert
        assertEquals("42", actualAccountId);
        assertEquals("ClientJwtClaim(accountId=42, authorizationCode=JaneDoe)", actualToStringResult);
        assertEquals("JaneDoe", actualClientJwtClaim.getAuthorizationCode());
    }
}
