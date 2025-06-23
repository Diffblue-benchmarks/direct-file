package gov.irs.directfile.stateapi.exception;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import gov.irs.directfile.error.StateApiErrorCode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@ContextConfiguration(classes = {StateApiExportedFactsDisabledException.class})
@ExtendWith(SpringExtension.class)
class StateApiExportedFactsDisabledExceptionDiffblueTest {
    @Autowired
    private StateApiExportedFactsDisabledException stateApiExportedFactsDisabledException;

    /**
     * Test new {@link StateApiExportedFactsDisabledException} (default constructor).
     * <p>
     * Method under test: default or parameterless constructor of {@link StateApiExportedFactsDisabledException}
     */
    @Test
    @DisplayName("Test new StateApiExportedFactsDisabledException (default constructor)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void StateApiExportedFactsDisabledException.<init>()"})
    void testNewStateApiExportedFactsDisabledException() {
        // Arrange and Act
        StateApiExportedFactsDisabledException actualStateApiExportedFactsDisabledException =
                new StateApiExportedFactsDisabledException();

        // Assert
        assertEquals(
                "E_EXPORTED_FACTS_DISABLEDEncountered unexpected configuration mismatch - exported facts are disabled"
                        + " in the backend api, but not in the state-api",
                actualStateApiExportedFactsDisabledException.getMessage());
        assertEquals(
                "E_EXPORTED_FACTS_DISABLEDEncountered unexpected configuration mismatch - exported facts are disabled"
                        + " in the backend api, but not in the state-api",
                actualStateApiExportedFactsDisabledException.getLocalizedMessage());
        assertNull(actualStateApiExportedFactsDisabledException.getCause());
        assertEquals(0, actualStateApiExportedFactsDisabledException.getSuppressed().length);
        assertEquals(
                StateApiErrorCode.E_EXPORTED_FACTS_DISABLED,
                actualStateApiExportedFactsDisabledException.getErrorCode());
    }

    /**
     * Test {@link StateApiExportedFactsDisabledException#getMessage()}.
     * <p>
     * Method under test: {@link StateApiExportedFactsDisabledException#getMessage()}
     */
    @Test
    @DisplayName("Test getMessage()")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"java.lang.String StateApiExportedFactsDisabledException.getMessage()"})
    void testGetMessage() {
        // Arrange, Act and Assert
        assertEquals(
                "E_EXPORTED_FACTS_DISABLEDEncountered unexpected configuration mismatch - exported facts are disabled"
                        + " in the backend api, but not in the state-api",
                stateApiExportedFactsDisabledException.getMessage());
    }
}
