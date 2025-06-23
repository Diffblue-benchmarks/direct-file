package gov.irs.directfile.stateapi.exception;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import gov.irs.directfile.error.StateApiErrorCode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

class StateApiExceptionDiffblueTest {
    /**
     * Test {@link StateApiException#StateApiException(StateApiErrorCode, Throwable)}.
     * <p>
     * Method under test: {@link StateApiException#StateApiException(StateApiErrorCode, Throwable)}
     */
    @Test
    @DisplayName("Test new StateApiException(StateApiErrorCode, Throwable)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void StateApiException.<init>(StateApiErrorCode, Throwable)"})
    void testNewStateApiException() {
        // Arrange
        Throwable e = new Throwable();

        // Act
        StateApiException actualStateApiException = new StateApiException(StateApiErrorCode.E_BEARER_TOKEN_MISSING, e);

        // Assert
        assertEquals("E_BEARER_TOKEN_MISSING", actualStateApiException.getLocalizedMessage());
        assertEquals("E_BEARER_TOKEN_MISSING", actualStateApiException.getMessage());
        assertEquals(0, actualStateApiException.getSuppressed().length);
        assertEquals(StateApiErrorCode.E_BEARER_TOKEN_MISSING, actualStateApiException.getErrorCode());
        assertSame(e, actualStateApiException.getCause());
    }

    /**
     * Test {@link StateApiException#StateApiException(StateApiErrorCode)}.
     * <ul>
     *   <li>Then return LocalizedMessage is {@code E_BEARER_TOKEN_MISSING}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiException#StateApiException(StateApiErrorCode)}
     */
    @Test
    @DisplayName(
            "Test new StateApiException(StateApiErrorCode); then return LocalizedMessage is 'E_BEARER_TOKEN_MISSING'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void StateApiException.<init>(StateApiErrorCode)"})
    void testNewStateApiException_thenReturnLocalizedMessageIsEBearerTokenMissing() {
        // Arrange and Act
        StateApiException actualStateApiException = new StateApiException(StateApiErrorCode.E_BEARER_TOKEN_MISSING);

        // Assert
        assertEquals("E_BEARER_TOKEN_MISSING", actualStateApiException.getLocalizedMessage());
        assertEquals("E_BEARER_TOKEN_MISSING", actualStateApiException.getMessage());
        assertNull(actualStateApiException.getCause());
        assertEquals(0, actualStateApiException.getSuppressed().length);
        assertEquals(StateApiErrorCode.E_BEARER_TOKEN_MISSING, actualStateApiException.getErrorCode());
    }

    /**
     * Test {@link StateApiException#getErrorCode()}.
     * <p>
     * Method under test: {@link StateApiException#getErrorCode()}
     */
    @Test
    @DisplayName("Test getErrorCode()")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"StateApiErrorCode StateApiException.getErrorCode()"})
    void testGetErrorCode() {
        // Arrange, Act and Assert
        assertEquals(
                StateApiErrorCode.E_BEARER_TOKEN_MISSING,
                new StateApiException(StateApiErrorCode.E_BEARER_TOKEN_MISSING).getErrorCode());
    }
}
