package gov.irs.directfile.stateapi.model;

import java.util.UUID;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class AuthCodeRequestDiffblueTest {
    /**
     * Test {@link AuthCodeRequest#equals(Object)}, and {@link AuthCodeRequest#hashCode()}.
     * <ul>
     *   <li>When other is equal.</li>
     *   <li>Then return equal.</li>
     * </ul>
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link AuthCodeRequest#equals(Object)}
     *   <li>{@link AuthCodeRequest#hashCode()}
     * </ul>
     */
    @Test
    @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthCodeRequest.equals(Object)", "int AuthCodeRequest.hashCode()"})
    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
        // Arrange
        AuthCodeRequest authCodeRequest = new AuthCodeRequest();
        AuthCodeRequest authCodeRequest2 = new AuthCodeRequest();

        // Act and Assert
        assertEquals(authCodeRequest, authCodeRequest2);
        int expectedHashCodeResult = authCodeRequest.hashCode();
        assertEquals(expectedHashCodeResult, authCodeRequest2.hashCode());
    }

    /**
     * Test {@link AuthCodeRequest#equals(Object)}, and {@link AuthCodeRequest#hashCode()}.
     * <ul>
     *   <li>When other is equal.</li>
     *   <li>Then return equal.</li>
     * </ul>
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link AuthCodeRequest#equals(Object)}
     *   <li>{@link AuthCodeRequest#hashCode()}
     * </ul>
     */
    @Test
    @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthCodeRequest.equals(Object)", "int AuthCodeRequest.hashCode()"})
    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
        // Arrange
        AuthCodeRequest authCodeRequest = new AuthCodeRequest();
        authCodeRequest.setTin("Tin");

        AuthCodeRequest authCodeRequest2 = new AuthCodeRequest();
        authCodeRequest2.setTin("Tin");

        // Act and Assert
        assertEquals(authCodeRequest, authCodeRequest2);
        int expectedHashCodeResult = authCodeRequest.hashCode();
        assertEquals(expectedHashCodeResult, authCodeRequest2.hashCode());
    }

    /**
     * Test {@link AuthCodeRequest#equals(Object)}, and {@link AuthCodeRequest#hashCode()}.
     * <ul>
     *   <li>When other is equal.</li>
     *   <li>Then return equal.</li>
     * </ul>
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link AuthCodeRequest#equals(Object)}
     *   <li>{@link AuthCodeRequest#hashCode()}
     * </ul>
     */
    @Test
    @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthCodeRequest.equals(Object)", "int AuthCodeRequest.hashCode()"})
    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual3() {
        // Arrange
        AuthCodeRequest authCodeRequest = new AuthCodeRequest();
        authCodeRequest.setStateCode("MD");

        AuthCodeRequest authCodeRequest2 = new AuthCodeRequest();
        authCodeRequest2.setStateCode("MD");

        // Act and Assert
        assertEquals(authCodeRequest, authCodeRequest2);
        int expectedHashCodeResult = authCodeRequest.hashCode();
        assertEquals(expectedHashCodeResult, authCodeRequest2.hashCode());
    }

    /**
     * Test {@link AuthCodeRequest#equals(Object)}, and {@link AuthCodeRequest#hashCode()}.
     * <ul>
     *   <li>When other is equal.</li>
     *   <li>Then return equal.</li>
     * </ul>
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link AuthCodeRequest#equals(Object)}
     *   <li>{@link AuthCodeRequest#hashCode()}
     * </ul>
     */
    @Test
    @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthCodeRequest.equals(Object)", "int AuthCodeRequest.hashCode()"})
    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual4() {
        // Arrange
        AuthCodeRequest authCodeRequest = new AuthCodeRequest();
        authCodeRequest.setSubmissionId("42");

        AuthCodeRequest authCodeRequest2 = new AuthCodeRequest();
        authCodeRequest2.setSubmissionId("42");

        // Act and Assert
        assertEquals(authCodeRequest, authCodeRequest2);
        int expectedHashCodeResult = authCodeRequest.hashCode();
        assertEquals(expectedHashCodeResult, authCodeRequest2.hashCode());
    }

    /**
     * Test {@link AuthCodeRequest#equals(Object)}, and {@link AuthCodeRequest#hashCode()}.
     * <ul>
     *   <li>When other is same.</li>
     *   <li>Then return equal.</li>
     * </ul>
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link AuthCodeRequest#equals(Object)}
     *   <li>{@link AuthCodeRequest#hashCode()}
     * </ul>
     */
    @Test
    @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthCodeRequest.equals(Object)", "int AuthCodeRequest.hashCode()"})
    void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
        // Arrange
        AuthCodeRequest authCodeRequest = new AuthCodeRequest();

        // Act and Assert
        assertEquals(authCodeRequest, authCodeRequest);
        int expectedHashCodeResult = authCodeRequest.hashCode();
        assertEquals(expectedHashCodeResult, authCodeRequest.hashCode());
    }

    /**
     * Test {@link AuthCodeRequest#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuthCodeRequest#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthCodeRequest.equals(Object)", "int AuthCodeRequest.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
        // Arrange
        AuthCodeRequest authCodeRequest = new AuthCodeRequest(UUID.randomUUID(), "Tin", 1, "MD", "42");

        // Act and Assert
        assertNotEquals(authCodeRequest, new AuthCodeRequest());
    }

    /**
     * Test {@link AuthCodeRequest#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuthCodeRequest#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthCodeRequest.equals(Object)", "int AuthCodeRequest.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
        // Arrange
        AuthCodeRequest authCodeRequest = new AuthCodeRequest();
        authCodeRequest.setTaxReturnUuid(UUID.randomUUID());

        // Act and Assert
        assertNotEquals(authCodeRequest, new AuthCodeRequest());
    }

    /**
     * Test {@link AuthCodeRequest#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuthCodeRequest#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthCodeRequest.equals(Object)", "int AuthCodeRequest.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
        // Arrange
        AuthCodeRequest authCodeRequest = new AuthCodeRequest();
        authCodeRequest.setTin("Tin");

        // Act and Assert
        assertNotEquals(authCodeRequest, new AuthCodeRequest());
    }

    /**
     * Test {@link AuthCodeRequest#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuthCodeRequest#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthCodeRequest.equals(Object)", "int AuthCodeRequest.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
        // Arrange
        AuthCodeRequest authCodeRequest = new AuthCodeRequest();
        authCodeRequest.setStateCode("MD");

        // Act and Assert
        assertNotEquals(authCodeRequest, new AuthCodeRequest());
    }

    /**
     * Test {@link AuthCodeRequest#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuthCodeRequest#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthCodeRequest.equals(Object)", "int AuthCodeRequest.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
        // Arrange
        AuthCodeRequest authCodeRequest = new AuthCodeRequest();
        authCodeRequest.setSubmissionId("42");

        // Act and Assert
        assertNotEquals(authCodeRequest, new AuthCodeRequest());
    }

    /**
     * Test {@link AuthCodeRequest#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuthCodeRequest#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthCodeRequest.equals(Object)", "int AuthCodeRequest.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
        // Arrange
        AuthCodeRequest authCodeRequest = new AuthCodeRequest();

        AuthCodeRequest authCodeRequest2 = new AuthCodeRequest();
        authCodeRequest2.setTaxReturnUuid(UUID.randomUUID());

        // Act and Assert
        assertNotEquals(authCodeRequest, authCodeRequest2);
    }

    /**
     * Test {@link AuthCodeRequest#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuthCodeRequest#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthCodeRequest.equals(Object)", "int AuthCodeRequest.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
        // Arrange
        AuthCodeRequest authCodeRequest = new AuthCodeRequest();

        AuthCodeRequest authCodeRequest2 = new AuthCodeRequest();
        authCodeRequest2.setTin("Tin");

        // Act and Assert
        assertNotEquals(authCodeRequest, authCodeRequest2);
    }

    /**
     * Test {@link AuthCodeRequest#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuthCodeRequest#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthCodeRequest.equals(Object)", "int AuthCodeRequest.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
        // Arrange
        AuthCodeRequest authCodeRequest = new AuthCodeRequest();

        AuthCodeRequest authCodeRequest2 = new AuthCodeRequest();
        authCodeRequest2.setStateCode("MD");

        // Act and Assert
        assertNotEquals(authCodeRequest, authCodeRequest2);
    }

    /**
     * Test {@link AuthCodeRequest#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuthCodeRequest#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthCodeRequest.equals(Object)", "int AuthCodeRequest.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
        // Arrange
        AuthCodeRequest authCodeRequest = new AuthCodeRequest();

        AuthCodeRequest authCodeRequest2 = new AuthCodeRequest();
        authCodeRequest2.setSubmissionId("42");

        // Act and Assert
        assertNotEquals(authCodeRequest, authCodeRequest2);
    }

    /**
     * Test {@link AuthCodeRequest#equals(Object)}.
     * <ul>
     *   <li>When other is {@code null}.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuthCodeRequest#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthCodeRequest.equals(Object)", "int AuthCodeRequest.hashCode()"})
    void testEquals_whenOtherIsNull_thenReturnNotEqual() {
        // Arrange, Act and Assert
        assertNotEquals(new AuthCodeRequest(), null);
    }

    /**
     * Test {@link AuthCodeRequest#equals(Object)}.
     * <ul>
     *   <li>When other is wrong type.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuthCodeRequest#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthCodeRequest.equals(Object)", "int AuthCodeRequest.hashCode()"})
    void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
        // Arrange, Act and Assert
        assertNotEquals(new AuthCodeRequest(), "Different type to AuthCodeRequest");
    }

    /**
     * Test getters and setters.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link AuthCodeRequest#AuthCodeRequest()}
     *   <li>{@link AuthCodeRequest#setStateCode(String)}
     *   <li>{@link AuthCodeRequest#setSubmissionId(String)}
     *   <li>{@link AuthCodeRequest#setTaxReturnUuid(UUID)}
     *   <li>{@link AuthCodeRequest#setTaxYear(int)}
     *   <li>{@link AuthCodeRequest#setTin(String)}
     *   <li>{@link AuthCodeRequest#toString()}
     *   <li>{@link AuthCodeRequest#getStateCode()}
     *   <li>{@link AuthCodeRequest#getSubmissionId()}
     *   <li>{@link AuthCodeRequest#getTaxReturnUuid()}
     *   <li>{@link AuthCodeRequest#getTaxYear()}
     *   <li>{@link AuthCodeRequest#getTin()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void AuthCodeRequest.<init>()",
        "void AuthCodeRequest.<init>(UUID, String, int, String, String)",
        "String AuthCodeRequest.getStateCode()",
        "String AuthCodeRequest.getSubmissionId()",
        "UUID AuthCodeRequest.getTaxReturnUuid()",
        "int AuthCodeRequest.getTaxYear()",
        "String AuthCodeRequest.getTin()",
        "void AuthCodeRequest.setStateCode(String)",
        "void AuthCodeRequest.setSubmissionId(String)",
        "void AuthCodeRequest.setTaxReturnUuid(UUID)",
        "void AuthCodeRequest.setTaxYear(int)",
        "void AuthCodeRequest.setTin(String)",
        "String AuthCodeRequest.toString()"
    })
    void testGettersAndSetters() {
        // Arrange and Act
        AuthCodeRequest actualAuthCodeRequest = new AuthCodeRequest();
        actualAuthCodeRequest.setStateCode("MD");
        actualAuthCodeRequest.setSubmissionId("42");
        UUID taxReturnUuid = UUID.randomUUID();
        actualAuthCodeRequest.setTaxReturnUuid(taxReturnUuid);
        actualAuthCodeRequest.setTaxYear(1);
        actualAuthCodeRequest.setTin("Tin");
        actualAuthCodeRequest.toString();
        String actualStateCode = actualAuthCodeRequest.getStateCode();
        String actualSubmissionId = actualAuthCodeRequest.getSubmissionId();
        UUID actualTaxReturnUuid = actualAuthCodeRequest.getTaxReturnUuid();
        int actualTaxYear = actualAuthCodeRequest.getTaxYear();

        // Assert
        assertEquals("42", actualSubmissionId);
        assertEquals("MD", actualStateCode);
        assertEquals("Tin", actualAuthCodeRequest.getTin());
        assertEquals(1, actualTaxYear);
        assertSame(taxReturnUuid, actualTaxReturnUuid);
    }

    /**
     * Test getters and setters.
     * <ul>
     *   <li>When randomUUID.</li>
     * </ul>
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link AuthCodeRequest#AuthCodeRequest(UUID, String, int, String, String)}
     *   <li>{@link AuthCodeRequest#setStateCode(String)}
     *   <li>{@link AuthCodeRequest#setSubmissionId(String)}
     *   <li>{@link AuthCodeRequest#setTaxReturnUuid(UUID)}
     *   <li>{@link AuthCodeRequest#setTaxYear(int)}
     *   <li>{@link AuthCodeRequest#setTin(String)}
     *   <li>{@link AuthCodeRequest#toString()}
     *   <li>{@link AuthCodeRequest#getStateCode()}
     *   <li>{@link AuthCodeRequest#getSubmissionId()}
     *   <li>{@link AuthCodeRequest#getTaxReturnUuid()}
     *   <li>{@link AuthCodeRequest#getTaxYear()}
     *   <li>{@link AuthCodeRequest#getTin()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters; when randomUUID")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void AuthCodeRequest.<init>()",
        "void AuthCodeRequest.<init>(UUID, String, int, String, String)",
        "String AuthCodeRequest.getStateCode()",
        "String AuthCodeRequest.getSubmissionId()",
        "UUID AuthCodeRequest.getTaxReturnUuid()",
        "int AuthCodeRequest.getTaxYear()",
        "String AuthCodeRequest.getTin()",
        "void AuthCodeRequest.setStateCode(String)",
        "void AuthCodeRequest.setSubmissionId(String)",
        "void AuthCodeRequest.setTaxReturnUuid(UUID)",
        "void AuthCodeRequest.setTaxYear(int)",
        "void AuthCodeRequest.setTin(String)",
        "String AuthCodeRequest.toString()"
    })
    void testGettersAndSetters_whenRandomUUID() {
        // Arrange and Act
        AuthCodeRequest actualAuthCodeRequest = new AuthCodeRequest(UUID.randomUUID(), "Tin", 1, "MD", "42");
        actualAuthCodeRequest.setStateCode("MD");
        actualAuthCodeRequest.setSubmissionId("42");
        UUID taxReturnUuid = UUID.randomUUID();
        actualAuthCodeRequest.setTaxReturnUuid(taxReturnUuid);
        actualAuthCodeRequest.setTaxYear(1);
        actualAuthCodeRequest.setTin("Tin");
        actualAuthCodeRequest.toString();
        String actualStateCode = actualAuthCodeRequest.getStateCode();
        String actualSubmissionId = actualAuthCodeRequest.getSubmissionId();
        UUID actualTaxReturnUuid = actualAuthCodeRequest.getTaxReturnUuid();
        int actualTaxYear = actualAuthCodeRequest.getTaxYear();

        // Assert
        assertEquals("42", actualSubmissionId);
        assertEquals("MD", actualStateCode);
        assertEquals("Tin", actualAuthCodeRequest.getTin());
        assertEquals(1, actualTaxYear);
        assertSame(taxReturnUuid, actualTaxReturnUuid);
    }
}
