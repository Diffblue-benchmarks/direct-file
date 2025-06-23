package gov.irs.directfile.stateapi.configuration;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import gov.irs.directfile.stateapi.configuration.FeatureFlagsConfigurationProperties.ExportReturnFlags;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FeatureFlagsConfigurationPropertiesDiffblueTest {
    /**
     * Test ExportReturnFlags getters and setters.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link ExportReturnFlags#ExportReturnFlags(boolean)}
     *   <li>{@link ExportReturnFlags#isEnabled()}
     * </ul>
     */
    @Test
    @DisplayName("Test ExportReturnFlags getters and setters")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void ExportReturnFlags.<init>(boolean)", "boolean ExportReturnFlags.isEnabled()"})
    void testExportReturnFlagsGettersAndSetters() {
        // Arrange, Act and Assert
        assertTrue(new ExportReturnFlags(true).isEnabled());
    }

    /**
     * Test getters and setters.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link FeatureFlagsConfigurationProperties#FeatureFlagsConfigurationProperties(ExportReturnFlags)}
     *   <li>{@link FeatureFlagsConfigurationProperties#getExportReturn()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void FeatureFlagsConfigurationProperties.<init>(ExportReturnFlags)",
        "ExportReturnFlags FeatureFlagsConfigurationProperties.getExportReturn()"
    })
    void testGettersAndSetters() {
        // Arrange
        ExportReturnFlags exportReturn = new ExportReturnFlags(true);

        // Act
        ExportReturnFlags actualExportReturn = new FeatureFlagsConfigurationProperties(exportReturn).getExportReturn();

        // Assert
        assertTrue(actualExportReturn.isEnabled());
        assertSame(exportReturn, actualExportReturn);
    }
}
