package gov.irs.directfile.stateapi.events;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EventStatusDiffblueTest {
    /**
     * Test {@link EventStatus#toString()}.
     * <p>
     * Method under test: {@link EventStatus#toString()}
     */
    @Test
    @DisplayName("Test toString()")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"java.lang.String EventStatus.toString()"})
    void testToString() {
        // Arrange, Act and Assert
        assertEquals("00", EventStatus.valueOf("SUCCESS").toString());
    }
}
