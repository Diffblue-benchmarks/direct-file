package gov.irs.directfile.stateapi.repository;

import java.util.UUID;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;
import reactor.test.StepVerifier.FirstStep;

import gov.irs.directfile.stateapi.model.TaxReturnStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DirectFileClientMockDiffblueTest {
    /**
     * Test {@link DirectFileClientMock#getStatus(int, UUID, String)}.
     * <ul>
     *   <li>When {@code 42}.</li>
     * </ul>
     * <p>
     * Method under test: {@link DirectFileClientMock#getStatus(int, UUID, String)}
     */
    @Test
    @DisplayName("Test getStatus(int, UUID, String); when '42'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"reactor.core.publisher.Mono DirectFileClientMock.getStatus(int, UUID, String)"})
    void testGetStatus_when42() throws AssertionError {
        // Arrange
        DirectFileClientMock directFileClientMock = new DirectFileClientMock();

        // Act and Assert
        FirstStep<TaxReturnStatus> createResult =
                StepVerifier.create(directFileClientMock.getStatus(1, UUID.randomUUID(), "42"));
        createResult
                .assertNext(t -> {
                    assertTrue(t.exists());
                    return;
                })
                .expectComplete()
                .verify();
    }

    /**
     * Test {@link DirectFileClientMock#getStatus(int, UUID, String)}.
     * <ul>
     *   <li>When {@code DirectFileClientMock}.</li>
     * </ul>
     * <p>
     * Method under test: {@link DirectFileClientMock#getStatus(int, UUID, String)}
     */
    @Test
    @DisplayName(
            "Test getStatus(int, UUID, String); when 'gov.irs.directfile.stateapi.repository.DirectFileClientMock'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"reactor.core.publisher.Mono DirectFileClientMock.getStatus(int, UUID, String)"})
    void testGetStatus_whenGovIrsDirectfileStateapiRepositoryDirectFileClientMock() throws AssertionError {
        // Arrange
        DirectFileClientMock directFileClientMock = new DirectFileClientMock();

        // Act and Assert
        FirstStep<TaxReturnStatus> createResult = StepVerifier.create(directFileClientMock.getStatus(
                1, UUID.randomUUID(), "gov.irs.directfile.stateapi.repository.DirectFileClientMock"));
        createResult
                .assertNext(t -> {
                    TaxReturnStatus taxReturnStatus = t;
                    assertTrue(taxReturnStatus.exists());
                    assertEquals("pending", taxReturnStatus.status());
                    return;
                })
                .expectComplete()
                .verify();
    }
}
