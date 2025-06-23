package gov.irs.directfile.stateapi.model;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StateLanguageDiffblueTest {
    /**
     * Test getters and setters.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>default or parameterless constructor of {@link StateLanguage}
     *   <li>{@link StateLanguage#setDfLanguageCode(String)}
     *   <li>{@link StateLanguage#setId(Long)}
     *   <li>{@link StateLanguage#setStateLanguageCode(String)}
     *   <li>{@link StateLanguage#setStateProfileId(Long)}
     *   <li>{@link StateLanguage#getDfLanguageCode()}
     *   <li>{@link StateLanguage#getId()}
     *   <li>{@link StateLanguage#getStateLanguageCode()}
     *   <li>{@link StateLanguage#getStateProfileId()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void StateLanguage.<init>()",
        "String StateLanguage.getDfLanguageCode()",
        "Long StateLanguage.getId()",
        "String StateLanguage.getStateLanguageCode()",
        "Long StateLanguage.getStateProfileId()",
        "void StateLanguage.setDfLanguageCode(String)",
        "void StateLanguage.setId(Long)",
        "void StateLanguage.setStateLanguageCode(String)",
        "void StateLanguage.setStateProfileId(Long)"
    })
    void testGettersAndSetters() {
        // Arrange and Act
        StateLanguage actualStateLanguage = new StateLanguage();
        actualStateLanguage.setDfLanguageCode("en");
        actualStateLanguage.setId(1L);
        actualStateLanguage.setStateLanguageCode("MD");
        actualStateLanguage.setStateProfileId(1L);
        String actualDfLanguageCode = actualStateLanguage.getDfLanguageCode();
        Long actualId = actualStateLanguage.getId();
        String actualStateLanguageCode = actualStateLanguage.getStateLanguageCode();
        Long actualStateProfileId = actualStateLanguage.getStateProfileId();

        // Assert
        assertEquals("MD", actualStateLanguageCode);
        assertEquals("en", actualDfLanguageCode);
        assertEquals(1L, actualId.longValue());
        assertEquals(1L, actualStateProfileId.longValue());
    }
}
