package gov.irs.directfile.stateapi.model;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StateAndAuthCodeDiffblueTest {
    /**
     * Test getters and setters.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link StateAndAuthCode#StateAndAuthCode()}
     *   <li>{@link StateAndAuthCode#setAuthorizationCode(String)}
     *   <li>{@link StateAndAuthCode#setStateCode(String)}
     *   <li>{@link StateAndAuthCode#getAuthorizationCode()}
     *   <li>{@link StateAndAuthCode#getStateCode()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void StateAndAuthCode.<init>()",
        "void StateAndAuthCode.<init>(String, String)",
        "String StateAndAuthCode.getAuthorizationCode()",
        "String StateAndAuthCode.getStateCode()",
        "void StateAndAuthCode.setAuthorizationCode(String)",
        "void StateAndAuthCode.setStateCode(String)"
    })
    void testGettersAndSetters() {
        // Arrange and Act
        StateAndAuthCode actualStateAndAuthCode = new StateAndAuthCode();
        actualStateAndAuthCode.setAuthorizationCode("JaneDoe");
        actualStateAndAuthCode.setStateCode("MD");
        String actualAuthorizationCode = actualStateAndAuthCode.getAuthorizationCode();

        // Assert
        assertEquals("JaneDoe", actualAuthorizationCode);
        assertEquals("MD", actualStateAndAuthCode.getStateCode());
    }

    /**
     * Test getters and setters.
     * <ul>
     *   <li>When {@code JaneDoe}.</li>
     * </ul>
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link StateAndAuthCode#StateAndAuthCode(String, String)}
     *   <li>{@link StateAndAuthCode#setAuthorizationCode(String)}
     *   <li>{@link StateAndAuthCode#setStateCode(String)}
     *   <li>{@link StateAndAuthCode#getAuthorizationCode()}
     *   <li>{@link StateAndAuthCode#getStateCode()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters; when 'JaneDoe'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void StateAndAuthCode.<init>()",
        "void StateAndAuthCode.<init>(String, String)",
        "String StateAndAuthCode.getAuthorizationCode()",
        "String StateAndAuthCode.getStateCode()",
        "void StateAndAuthCode.setAuthorizationCode(String)",
        "void StateAndAuthCode.setStateCode(String)"
    })
    void testGettersAndSetters_whenJaneDoe() {
        // Arrange and Act
        StateAndAuthCode actualStateAndAuthCode = new StateAndAuthCode("JaneDoe", "MD");
        actualStateAndAuthCode.setAuthorizationCode("JaneDoe");
        actualStateAndAuthCode.setStateCode("MD");
        String actualAuthorizationCode = actualStateAndAuthCode.getAuthorizationCode();

        // Assert
        assertEquals("JaneDoe", actualAuthorizationCode);
        assertEquals("MD", actualStateAndAuthCode.getStateCode());
    }
}
