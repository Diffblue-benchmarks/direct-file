package gov.irs.directfile.stateapi.exception;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import gov.irs.directfile.error.StateApiErrorCode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ContextConfiguration(classes = {StateApiExceptionHandler.class})
@ExtendWith(SpringExtension.class)
class StateApiExceptionHandlerDiffblueTest {
    @Autowired
    private StateApiExceptionHandler stateApiExceptionHandler;

    /**
     * Test {@link StateApiExceptionHandler#handleStateApiException(StateApiException)}.
     * <ul>
     *   <li>Then StatusCode return {@link HttpStatus}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateApiExceptionHandler#handleStateApiException(StateApiException)}
     */
    @Test
    @DisplayName("Test handleStateApiException(StateApiException); then StatusCode return HttpStatus")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"ResponseEntity StateApiExceptionHandler.handleStateApiException(StateApiException)"})
    void testHandleStateApiException_thenStatusCodeReturnHttpStatus() {
        // Arrange and Act
        ResponseEntity<String> actualHandleStateApiExceptionResult = stateApiExceptionHandler.handleStateApiException(
                new StateApiException(StateApiErrorCode.E_BEARER_TOKEN_MISSING));

        // Assert
        HttpStatusCode statusCode = actualHandleStateApiExceptionResult.getStatusCode();
        assertTrue(statusCode instanceof HttpStatus);
        assertEquals("E_BEARER_TOKEN_MISSING", actualHandleStateApiExceptionResult.getBody());
        assertEquals(500, actualHandleStateApiExceptionResult.getStatusCodeValue());
        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, statusCode);
        assertTrue(actualHandleStateApiExceptionResult.hasBody());
        assertTrue(actualHandleStateApiExceptionResult.getHeaders().isEmpty());
    }
}
