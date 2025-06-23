package gov.irs.directfile.stateapi.configuration;

import java.util.ArrayList;
import java.util.List;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

class XmlSanitizedConfigurationPropertiesDiffblueTest {
    /**
     * Test getters and setters.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link XmlSanitizedConfigurationProperties#XmlSanitizedConfigurationProperties(List, List)}
     *   <li>{@link XmlSanitizedConfigurationProperties#getAllowedHeaders()}
     *   <li>{@link XmlSanitizedConfigurationProperties#getExcludedTags()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void XmlSanitizedConfigurationProperties.<init>(List, List)",
        "List XmlSanitizedConfigurationProperties.getAllowedHeaders()",
        "List XmlSanitizedConfigurationProperties.getExcludedTags()"
    })
    void testGettersAndSetters() {
        // Arrange
        ArrayList<String> allowedHeaders = new ArrayList<>();
        ArrayList<String> excludedTags = new ArrayList<>();

        // Act
        XmlSanitizedConfigurationProperties actualXmlSanitizedConfigurationProperties =
                new XmlSanitizedConfigurationProperties(allowedHeaders, excludedTags);
        List<String> actualAllowedHeaders = actualXmlSanitizedConfigurationProperties.getAllowedHeaders();
        List<String> actualExcludedTags = actualXmlSanitizedConfigurationProperties.getExcludedTags();

        // Assert
        assertTrue(actualAllowedHeaders.isEmpty());
        assertTrue(actualExcludedTags.isEmpty());
        assertSame(allowedHeaders, actualAllowedHeaders);
        assertSame(excludedTags, actualExcludedTags);
    }
}
