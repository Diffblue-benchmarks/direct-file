package gov.irs.directfile.stateapi.configuration;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CertificationOverridePropertiesDiffblueTest {
    /**
     * Test getters and setters.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link CertificationOverrideProperties#CertificationOverrideProperties(String)}
     *   <li>{@link CertificationOverrideProperties#getCertLocationOverride()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void CertificationOverrideProperties.<init>(String)",
        "String CertificationOverrideProperties.getCertLocationOverride()"
    })
    void testGettersAndSetters() {
        // Arrange, Act and Assert
        assertEquals(
                "Cert Location Override",
                new CertificationOverrideProperties("Cert Location Override").getCertLocationOverride());
    }
}
