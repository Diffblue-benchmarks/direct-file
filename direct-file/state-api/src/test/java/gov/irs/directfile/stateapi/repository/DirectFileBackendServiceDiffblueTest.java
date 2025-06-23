package gov.irs.directfile.stateapi.repository;

import java.util.UUID;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import reactor.test.StepVerifier;
import reactor.test.StepVerifier.FirstStep;

import gov.irs.directfile.stateapi.configuration.DirectFileEndpointProperties;
import gov.irs.directfile.stateapi.model.GetStateExportedFactsResponse;
import gov.irs.directfile.stateapi.model.TaxReturnStatus;

@ContextConfiguration(classes = {DirectFileBackendService.class, DirectFileEndpointProperties.class, String.class})
@ExtendWith(SpringExtension.class)
class DirectFileBackendServiceDiffblueTest {
    @Autowired
    private DirectFileBackendService directFileBackendService;

    @Autowired
    private DirectFileEndpointProperties directFileEndpointProperties;

    /**
     * Test {@link DirectFileBackendService#getExportedFacts(String, String, String)}.
     * <ul>
     *   <li>When {@code MD}.</li>
     * </ul>
     * <p>
     * Method under test: {@link DirectFileBackendService#getExportedFacts(String, String, String)}
     */
    @Test
    @DisplayName("Test getExportedFacts(String, String, String); when 'MD'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"reactor.core.publisher.Mono DirectFileBackendService.getExportedFacts(String, String, String)"})
    void testGetExportedFacts_whenMd() throws AssertionError {
        // Arrange, Act and Assert
        FirstStep<GetStateExportedFactsResponse> createResult =
                StepVerifier.create(directFileBackendService.getExportedFacts("42", "MD", "42"));
        createResult.expectError().verify();
    }

    /**
     * Test {@link DirectFileBackendService#getStatus(int, UUID, String)}.
     * <p>
     * Method under test: {@link DirectFileBackendService#getStatus(int, UUID, String)}
     */
    @Test
    @DisplayName("Test getStatus(int, UUID, String)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"reactor.core.publisher.Mono DirectFileBackendService.getStatus(int, UUID, String)"})
    void testGetStatus() throws AssertionError {
        // Arrange
        DirectFileBackendService directFileBackendService = new DirectFileBackendService(
                new DirectFileEndpointProperties("https://example.org/example", "Backend Context Path", "1.0.2"));

        // Act and Assert
        FirstStep<TaxReturnStatus> createResult =
                StepVerifier.create(directFileBackendService.getStatus(1, UUID.randomUUID(), "42"));
        createResult.expectError().verify();
    }
}
