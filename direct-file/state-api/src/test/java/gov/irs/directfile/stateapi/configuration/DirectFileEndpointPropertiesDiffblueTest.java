package gov.irs.directfile.stateapi.configuration;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ContextConfiguration(classes = {DirectFileEndpointProperties.class, String.class})
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
@ExtendWith(SpringExtension.class)
class DirectFileEndpointPropertiesDiffblueTest {
    @Autowired
    private DirectFileEndpointProperties directFileEndpointProperties;

    /**
     * Test getters and setters.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link DirectFileEndpointProperties#getBackendApiVersion()}
     *   <li>{@link DirectFileEndpointProperties#getBackendContextPath()}
     *   <li>{@link DirectFileEndpointProperties#getBackendUrl()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "String DirectFileEndpointProperties.getBackendApiVersion()",
        "String DirectFileEndpointProperties.getBackendContextPath()",
        "String DirectFileEndpointProperties.getBackendUrl()"
    })
    void testGettersAndSetters() {
        // Arrange
        DirectFileEndpointProperties directFileEndpointProperties =
                new DirectFileEndpointProperties("https://example.org/example", "Backend Context Path", "1.0.2");

        // Act
        String actualBackendApiVersion = directFileEndpointProperties.getBackendApiVersion();
        String actualBackendContextPath = directFileEndpointProperties.getBackendContextPath();

        // Assert
        assertEquals("1.0.2", actualBackendApiVersion);
        assertEquals("Backend Context Path", actualBackendContextPath);
        assertEquals("https://example.org/example", directFileEndpointProperties.getBackendUrl());
    }

    /**
     * Test {@link DirectFileEndpointProperties#DirectFileEndpointProperties(String, String, String)}.
     * <ul>
     *   <li>When {@code 1.0.2}.</li>
     *   <li>Then return BackendApiVersion is {@code 1.0.2}.</li>
     * </ul>
     * <p>
     * Method under test: {@link DirectFileEndpointProperties#DirectFileEndpointProperties(String, String, String)}
     */
    @Test
    @DisplayName(
            "Test new DirectFileEndpointProperties(String, String, String); when '1.0.2'; then return BackendApiVersion is '1.0.2'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void DirectFileEndpointProperties.<init>(String, String, String)"})
    void testNewDirectFileEndpointProperties_when102_thenReturnBackendApiVersionIs102() {
        // Arrange and Act
        DirectFileEndpointProperties actualDirectFileEndpointProperties =
                new DirectFileEndpointProperties("https://example.org/example", "Backend Context Path", "1.0.2");

        // Assert
        assertEquals("1.0.2", actualDirectFileEndpointProperties.getBackendApiVersion());
        assertEquals("Backend Context Path", actualDirectFileEndpointProperties.getBackendContextPath());
        assertEquals("https://example.org/example", actualDirectFileEndpointProperties.getBackendUrl());
    }

    /**
     * Test {@link DirectFileEndpointProperties#setBackendApiVersion(String)}.
     * <ul>
     *   <li>Then {@link DirectFileEndpointProperties} BackendApiVersion is {@code 1.0.2}.</li>
     * </ul>
     * <p>
     * Method under test: {@link DirectFileEndpointProperties#setBackendApiVersion(String)}
     */
    @Test
    @DisplayName("Test setBackendApiVersion(String); then DirectFileEndpointProperties BackendApiVersion is '1.0.2'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void DirectFileEndpointProperties.setBackendApiVersion(String)"})
    void testSetBackendApiVersion_thenDirectFileEndpointPropertiesBackendApiVersionIs102() {
        // Arrange and Act
        directFileEndpointProperties.setBackendApiVersion("1.0.2");

        // Assert
        assertEquals("1.0.2", directFileEndpointProperties.getBackendApiVersion());
    }

    /**
     * Test {@link DirectFileEndpointProperties#setBackendContextPath(String)}.
     * <p>
     * Method under test: {@link DirectFileEndpointProperties#setBackendContextPath(String)}
     */
    @Test
    @DisplayName("Test setBackendContextPath(String)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void DirectFileEndpointProperties.setBackendContextPath(String)"})
    void testSetBackendContextPath() {
        // Arrange and Act
        directFileEndpointProperties.setBackendContextPath("Backend Context Path");

        // Assert
        assertEquals("Backend Context Path", directFileEndpointProperties.getBackendContextPath());
    }

    /**
     * Test {@link DirectFileEndpointProperties#setBackendUrl(String)}.
     * <p>
     * Method under test: {@link DirectFileEndpointProperties#setBackendUrl(String)}
     */
    @Test
    @DisplayName("Test setBackendUrl(String)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void DirectFileEndpointProperties.setBackendUrl(String)"})
    void testSetBackendUrl() {
        // Arrange and Act
        directFileEndpointProperties.setBackendUrl("https://example.org/example");

        // Assert
        assertEquals("https://example.org/example", directFileEndpointProperties.getBackendUrl());
    }
}
