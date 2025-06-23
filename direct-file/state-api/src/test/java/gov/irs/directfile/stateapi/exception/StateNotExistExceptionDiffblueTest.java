package gov.irs.directfile.stateapi.exception;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import gov.irs.directfile.error.StateApiErrorCode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StateNotExistExceptionDiffblueTest {
    /**
     * Test {@link StateNotExistException#StateNotExistException(StateApiErrorCode)}.
     * <p>
     * Method under test: {@link StateNotExistException#StateNotExistException(StateApiErrorCode)}
     */
    @Test
    @DisplayName("Test new StateNotExistException(StateApiErrorCode)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void StateNotExistException.<init>(StateApiErrorCode)"})
    void testNewStateNotExistException() {
        // Arrange and Act
        StateNotExistException actualStateNotExistException =
                new StateNotExistException(StateApiErrorCode.E_BEARER_TOKEN_MISSING);

        // Assert
        assertEquals("E_BEARER_TOKEN_MISSING", actualStateNotExistException.getLocalizedMessage());
        assertEquals("E_BEARER_TOKEN_MISSING", actualStateNotExistException.getMessage());
        assertNull(actualStateNotExistException.getCause());
        assertEquals(0, actualStateNotExistException.getSuppressed().length);
        assertEquals(StateApiErrorCode.E_BEARER_TOKEN_MISSING, actualStateNotExistException.getErrorCode());
    }
}
