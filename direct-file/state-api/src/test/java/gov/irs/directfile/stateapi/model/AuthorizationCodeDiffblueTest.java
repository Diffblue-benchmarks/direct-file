package gov.irs.directfile.stateapi.model;

import java.sql.Timestamp;
import java.util.UUID;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;

class AuthorizationCodeDiffblueTest {
    /**
     * Test {@link AuthorizationCode#equals(Object)}, and {@link AuthorizationCode#hashCode()}.
     * <ul>
     *   <li>When other is same.</li>
     *   <li>Then return equal.</li>
     * </ul>
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link AuthorizationCode#equals(Object)}
     *   <li>{@link AuthorizationCode#hashCode()}
     * </ul>
     */
    @Test
    @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthorizationCode.equals(Object)", "int AuthorizationCode.hashCode()"})
    void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
        // Arrange
        AuthorizationCode authorizationCode = new AuthorizationCode();
        authorizationCode.setAuthorizationCode(UUID.randomUUID());
        authorizationCode.setExpiresAt(mock(Timestamp.class));
        authorizationCode.setId(1L);
        authorizationCode.setStateCode("MD");
        authorizationCode.setSubmissionId("42");
        authorizationCode.setTaxReturnUuid(UUID.randomUUID());
        authorizationCode.setTaxYear(1);

        // Act and Assert
        assertEquals(authorizationCode, authorizationCode);
        int expectedHashCodeResult = authorizationCode.hashCode();
        assertEquals(expectedHashCodeResult, authorizationCode.hashCode());
    }

    /**
     * Test {@link AuthorizationCode#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuthorizationCode#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthorizationCode.equals(Object)", "int AuthorizationCode.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
        // Arrange
        AuthorizationCode authorizationCode = new AuthorizationCode();
        authorizationCode.setAuthorizationCode(UUID.randomUUID());
        authorizationCode.setExpiresAt(mock(Timestamp.class));
        authorizationCode.setId(1L);
        authorizationCode.setStateCode("MD");
        authorizationCode.setSubmissionId("42");
        authorizationCode.setTaxReturnUuid(UUID.randomUUID());
        authorizationCode.setTaxYear(1);

        AuthorizationCode authorizationCode2 = new AuthorizationCode();
        authorizationCode2.setAuthorizationCode(UUID.randomUUID());
        authorizationCode2.setExpiresAt(mock(Timestamp.class));
        authorizationCode2.setId(1L);
        authorizationCode2.setStateCode("MD");
        authorizationCode2.setSubmissionId("42");
        authorizationCode2.setTaxReturnUuid(UUID.randomUUID());
        authorizationCode2.setTaxYear(1);

        // Act and Assert
        assertNotEquals(authorizationCode, authorizationCode2);
    }

    /**
     * Test {@link AuthorizationCode#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuthorizationCode#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthorizationCode.equals(Object)", "int AuthorizationCode.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
        // Arrange
        AuthorizationCode authorizationCode = new AuthorizationCode();
        authorizationCode.setAuthorizationCode(UUID.randomUUID());
        authorizationCode.setExpiresAt(mock(Timestamp.class));
        authorizationCode.setId(2L);
        authorizationCode.setStateCode("MD");
        authorizationCode.setSubmissionId("42");
        authorizationCode.setTaxReturnUuid(UUID.randomUUID());
        authorizationCode.setTaxYear(1);

        AuthorizationCode authorizationCode2 = new AuthorizationCode();
        authorizationCode2.setAuthorizationCode(UUID.randomUUID());
        authorizationCode2.setExpiresAt(mock(Timestamp.class));
        authorizationCode2.setId(1L);
        authorizationCode2.setStateCode("MD");
        authorizationCode2.setSubmissionId("42");
        authorizationCode2.setTaxReturnUuid(UUID.randomUUID());
        authorizationCode2.setTaxYear(1);

        // Act and Assert
        assertNotEquals(authorizationCode, authorizationCode2);
    }

    /**
     * Test {@link AuthorizationCode#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuthorizationCode#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthorizationCode.equals(Object)", "int AuthorizationCode.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
        // Arrange
        AuthorizationCode authorizationCode = new AuthorizationCode();
        authorizationCode.setAuthorizationCode(UUID.randomUUID());
        authorizationCode.setExpiresAt(mock(Timestamp.class));
        authorizationCode.setId(null);
        authorizationCode.setStateCode("MD");
        authorizationCode.setSubmissionId("42");
        authorizationCode.setTaxReturnUuid(UUID.randomUUID());
        authorizationCode.setTaxYear(1);

        AuthorizationCode authorizationCode2 = new AuthorizationCode();
        authorizationCode2.setAuthorizationCode(UUID.randomUUID());
        authorizationCode2.setExpiresAt(mock(Timestamp.class));
        authorizationCode2.setId(1L);
        authorizationCode2.setStateCode("MD");
        authorizationCode2.setSubmissionId("42");
        authorizationCode2.setTaxReturnUuid(UUID.randomUUID());
        authorizationCode2.setTaxYear(1);

        // Act and Assert
        assertNotEquals(authorizationCode, authorizationCode2);
    }

    /**
     * Test {@link AuthorizationCode#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuthorizationCode#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthorizationCode.equals(Object)", "int AuthorizationCode.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
        // Arrange
        AuthorizationCode authorizationCode = new AuthorizationCode();
        authorizationCode.setAuthorizationCode(UUID.randomUUID());
        authorizationCode.setExpiresAt(mock(Timestamp.class));
        authorizationCode.setId(1L);
        authorizationCode.setStateCode("MD");
        authorizationCode.setSubmissionId("42");
        authorizationCode.setTaxReturnUuid(null);
        authorizationCode.setTaxYear(1);

        AuthorizationCode authorizationCode2 = new AuthorizationCode();
        authorizationCode2.setAuthorizationCode(UUID.randomUUID());
        authorizationCode2.setExpiresAt(mock(Timestamp.class));
        authorizationCode2.setId(1L);
        authorizationCode2.setStateCode("MD");
        authorizationCode2.setSubmissionId("42");
        authorizationCode2.setTaxReturnUuid(UUID.randomUUID());
        authorizationCode2.setTaxYear(1);

        // Act and Assert
        assertNotEquals(authorizationCode, authorizationCode2);
    }

    /**
     * Test {@link AuthorizationCode#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuthorizationCode#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthorizationCode.equals(Object)", "int AuthorizationCode.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
        // Arrange
        AuthorizationCode authorizationCode = new AuthorizationCode();
        authorizationCode.setAuthorizationCode(UUID.randomUUID());
        authorizationCode.setExpiresAt(mock(Timestamp.class));
        authorizationCode.setId(1L);
        authorizationCode.setStateCode("MD");
        authorizationCode.setSubmissionId("42");
        authorizationCode.setTaxReturnUuid(UUID.randomUUID());
        authorizationCode.setTaxYear(3);

        AuthorizationCode authorizationCode2 = new AuthorizationCode();
        authorizationCode2.setAuthorizationCode(UUID.randomUUID());
        authorizationCode2.setExpiresAt(mock(Timestamp.class));
        authorizationCode2.setId(1L);
        authorizationCode2.setStateCode("MD");
        authorizationCode2.setSubmissionId("42");
        authorizationCode2.setTaxReturnUuid(UUID.randomUUID());
        authorizationCode2.setTaxYear(1);

        // Act and Assert
        assertNotEquals(authorizationCode, authorizationCode2);
    }

    /**
     * Test {@link AuthorizationCode#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuthorizationCode#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthorizationCode.equals(Object)", "int AuthorizationCode.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
        // Arrange
        AuthorizationCode authorizationCode = new AuthorizationCode();
        authorizationCode.setAuthorizationCode(UUID.randomUUID());
        authorizationCode.setExpiresAt(mock(Timestamp.class));
        authorizationCode.setId(null);
        authorizationCode.setStateCode("MD");
        authorizationCode.setSubmissionId("42");
        authorizationCode.setTaxReturnUuid(UUID.randomUUID());
        authorizationCode.setTaxYear(1);

        AuthorizationCode authorizationCode2 = new AuthorizationCode();
        authorizationCode2.setAuthorizationCode(UUID.randomUUID());
        authorizationCode2.setExpiresAt(mock(Timestamp.class));
        authorizationCode2.setId(null);
        authorizationCode2.setStateCode("MD");
        authorizationCode2.setSubmissionId("42");
        authorizationCode2.setTaxReturnUuid(UUID.randomUUID());
        authorizationCode2.setTaxYear(1);

        // Act and Assert
        assertNotEquals(authorizationCode, authorizationCode2);
    }

    /**
     * Test {@link AuthorizationCode#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuthorizationCode#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthorizationCode.equals(Object)", "int AuthorizationCode.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
        // Arrange
        AuthorizationCode authorizationCode = new AuthorizationCode();
        authorizationCode.setAuthorizationCode(UUID.randomUUID());
        authorizationCode.setExpiresAt(mock(Timestamp.class));
        authorizationCode.setId(1L);
        authorizationCode.setStateCode("MD");
        authorizationCode.setSubmissionId("42");
        authorizationCode.setTaxReturnUuid(null);
        authorizationCode.setTaxYear(1);

        AuthorizationCode authorizationCode2 = new AuthorizationCode();
        authorizationCode2.setAuthorizationCode(UUID.randomUUID());
        authorizationCode2.setExpiresAt(mock(Timestamp.class));
        authorizationCode2.setId(1L);
        authorizationCode2.setStateCode("MD");
        authorizationCode2.setSubmissionId("42");
        authorizationCode2.setTaxReturnUuid(null);
        authorizationCode2.setTaxYear(1);

        // Act and Assert
        assertNotEquals(authorizationCode, authorizationCode2);
    }

    /**
     * Test {@link AuthorizationCode#equals(Object)}.
     * <ul>
     *   <li>When other is {@code null}.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuthorizationCode#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthorizationCode.equals(Object)", "int AuthorizationCode.hashCode()"})
    void testEquals_whenOtherIsNull_thenReturnNotEqual() {
        // Arrange
        AuthorizationCode authorizationCode = new AuthorizationCode();
        authorizationCode.setAuthorizationCode(UUID.randomUUID());
        authorizationCode.setExpiresAt(mock(Timestamp.class));
        authorizationCode.setId(1L);
        authorizationCode.setStateCode("MD");
        authorizationCode.setSubmissionId("42");
        authorizationCode.setTaxReturnUuid(UUID.randomUUID());
        authorizationCode.setTaxYear(1);

        // Act and Assert
        assertNotEquals(authorizationCode, null);
    }

    /**
     * Test {@link AuthorizationCode#equals(Object)}.
     * <ul>
     *   <li>When other is wrong type.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuthorizationCode#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean AuthorizationCode.equals(Object)", "int AuthorizationCode.hashCode()"})
    void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
        // Arrange
        AuthorizationCode authorizationCode = new AuthorizationCode();
        authorizationCode.setAuthorizationCode(UUID.randomUUID());
        authorizationCode.setExpiresAt(mock(Timestamp.class));
        authorizationCode.setId(1L);
        authorizationCode.setStateCode("MD");
        authorizationCode.setSubmissionId("42");
        authorizationCode.setTaxReturnUuid(UUID.randomUUID());
        authorizationCode.setTaxYear(1);

        // Act and Assert
        assertNotEquals(authorizationCode, "Different type to AuthorizationCode");
    }

    /**
     * Test getters and setters.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>default or parameterless constructor of {@link AuthorizationCode}
     *   <li>{@link AuthorizationCode#setExpiresAt(Timestamp)}
     *   <li>{@link AuthorizationCode#setId(Long)}
     *   <li>{@link AuthorizationCode#setStateCode(String)}
     *   <li>{@link AuthorizationCode#setSubmissionId(String)}
     *   <li>{@link AuthorizationCode#setTaxReturnUuid(UUID)}
     *   <li>{@link AuthorizationCode#setTaxYear(int)}
     *   <li>{@link AuthorizationCode#toString()}
     *   <li>{@link AuthorizationCode#getAuthorizationCode()}
     *   <li>{@link AuthorizationCode#getExpiresAt()}
     *   <li>{@link AuthorizationCode#getId()}
     *   <li>{@link AuthorizationCode#getStateCode()}
     *   <li>{@link AuthorizationCode#getSubmissionId()}
     *   <li>{@link AuthorizationCode#getTaxReturnUuid()}
     *   <li>{@link AuthorizationCode#getTaxYear()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void AuthorizationCode.<init>()",
        "String AuthorizationCode.getAuthorizationCode()",
        "Timestamp AuthorizationCode.getExpiresAt()",
        "Long AuthorizationCode.getId()",
        "String AuthorizationCode.getStateCode()",
        "String AuthorizationCode.getSubmissionId()",
        "UUID AuthorizationCode.getTaxReturnUuid()",
        "int AuthorizationCode.getTaxYear()",
        "void AuthorizationCode.setExpiresAt(Timestamp)",
        "void AuthorizationCode.setId(Long)",
        "void AuthorizationCode.setStateCode(String)",
        "void AuthorizationCode.setSubmissionId(String)",
        "void AuthorizationCode.setTaxReturnUuid(UUID)",
        "void AuthorizationCode.setTaxYear(int)",
        "String AuthorizationCode.toString()"
    })
    void testGettersAndSetters() {
        // Arrange and Act
        AuthorizationCode actualAuthorizationCode = new AuthorizationCode();
        Timestamp expiresAt = mock(Timestamp.class);
        actualAuthorizationCode.setExpiresAt(expiresAt);
        actualAuthorizationCode.setId(1L);
        actualAuthorizationCode.setStateCode("MD");
        actualAuthorizationCode.setSubmissionId("42");
        UUID taxReturnUuid = UUID.randomUUID();
        actualAuthorizationCode.setTaxReturnUuid(taxReturnUuid);
        actualAuthorizationCode.setTaxYear(1);
        actualAuthorizationCode.toString();
        String actualAuthorizationCode2 = actualAuthorizationCode.getAuthorizationCode();
        Timestamp actualExpiresAt = actualAuthorizationCode.getExpiresAt();
        Long actualId = actualAuthorizationCode.getId();
        String actualStateCode = actualAuthorizationCode.getStateCode();
        String actualSubmissionId = actualAuthorizationCode.getSubmissionId();
        UUID actualTaxReturnUuid = actualAuthorizationCode.getTaxReturnUuid();

        // Assert
        assertEquals("42", actualSubmissionId);
        assertEquals("MD", actualStateCode);
        assertNull(actualAuthorizationCode2);
        assertEquals(1, actualAuthorizationCode.getTaxYear());
        assertEquals(1L, actualId.longValue());
        assertSame(taxReturnUuid, actualTaxReturnUuid);
        assertSame(expiresAt, actualExpiresAt);
    }
}
