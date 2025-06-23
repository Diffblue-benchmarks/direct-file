package gov.irs.directfile.stateapi.model;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import gov.irs.directfile.error.StateApiErrorCode;
import gov.irs.directfile.stateapi.model.ErrorResponse.ErrorResponseBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ContextConfiguration(classes = {ErrorResponseBuilder.class})
@ExtendWith(SpringExtension.class)
class ErrorResponseDiffblueTest {
    @Autowired
    private ErrorResponseBuilder errorResponseBuilder;

    /**
     * Test {@link ErrorResponse#equals(Object)}, and {@link ErrorResponse#hashCode()}.
     * <ul>
     *   <li>When other is equal.</li>
     *   <li>Then return equal.</li>
     * </ul>
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link ErrorResponse#equals(Object)}
     *   <li>{@link ErrorResponse#hashCode()}
     * </ul>
     */
    @Test
    @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ErrorResponse.equals(Object)", "int ErrorResponse.hashCode()"})
    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
        // Arrange
        ErrorResponse buildResult = ErrorResponse.builder()
                .errorCode(StateApiErrorCode.E_BEARER_TOKEN_MISSING)
                .errorMessage("An error occurred")
                .build();
        ErrorResponse buildResult2 = ErrorResponse.builder()
                .errorCode(StateApiErrorCode.E_BEARER_TOKEN_MISSING)
                .errorMessage("An error occurred")
                .build();

        // Act and Assert
        assertEquals(buildResult, buildResult2);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult2.hashCode());
    }

    /**
     * Test {@link ErrorResponse#equals(Object)}, and {@link ErrorResponse#hashCode()}.
     * <ul>
     *   <li>When other is equal.</li>
     *   <li>Then return equal.</li>
     * </ul>
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link ErrorResponse#equals(Object)}
     *   <li>{@link ErrorResponse#hashCode()}
     * </ul>
     */
    @Test
    @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ErrorResponse.equals(Object)", "int ErrorResponse.hashCode()"})
    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
        // Arrange
        ErrorResponseBuilder errorResponseBuilder = mock(ErrorResponseBuilder.class);
        when(errorResponseBuilder.errorCode(Mockito.<StateApiErrorCode>any())).thenReturn(ErrorResponse.builder());
        ErrorResponse buildResult = errorResponseBuilder
                .errorCode(StateApiErrorCode.E_BEARER_TOKEN_MISSING)
                .errorMessage("An error occurred")
                .build();
        ErrorResponseBuilder errorResponseBuilder2 = mock(ErrorResponseBuilder.class);
        when(errorResponseBuilder2.errorCode(Mockito.<StateApiErrorCode>any())).thenReturn(ErrorResponse.builder());
        ErrorResponse buildResult2 = errorResponseBuilder2
                .errorCode(StateApiErrorCode.E_BEARER_TOKEN_MISSING)
                .errorMessage("An error occurred")
                .build();

        // Act and Assert
        assertEquals(buildResult, buildResult2);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult2.hashCode());
    }

    /**
     * Test {@link ErrorResponse#equals(Object)}, and {@link ErrorResponse#hashCode()}.
     * <ul>
     *   <li>When other is same.</li>
     *   <li>Then return equal.</li>
     * </ul>
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link ErrorResponse#equals(Object)}
     *   <li>{@link ErrorResponse#hashCode()}
     * </ul>
     */
    @Test
    @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ErrorResponse.equals(Object)", "int ErrorResponse.hashCode()"})
    void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
        // Arrange
        ErrorResponse buildResult = ErrorResponse.builder()
                .errorCode(StateApiErrorCode.E_BEARER_TOKEN_MISSING)
                .errorMessage("An error occurred")
                .build();

        // Act and Assert
        assertEquals(buildResult, buildResult);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult.hashCode());
    }

    /**
     * Test {@link ErrorResponse#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link ErrorResponse#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ErrorResponse.equals(Object)", "int ErrorResponse.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
        // Arrange
        ErrorResponseBuilder errorResponseBuilder = mock(ErrorResponseBuilder.class);
        when(errorResponseBuilder.errorCode(Mockito.<StateApiErrorCode>any())).thenReturn(ErrorResponse.builder());
        ErrorResponse buildResult = errorResponseBuilder
                .errorCode(StateApiErrorCode.E_BEARER_TOKEN_MISSING)
                .errorMessage("An error occurred")
                .build();
        ErrorResponse buildResult2 = ErrorResponse.builder()
                .errorCode(StateApiErrorCode.E_BEARER_TOKEN_MISSING)
                .errorMessage("An error occurred")
                .build();

        // Act and Assert
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Test {@link ErrorResponse#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link ErrorResponse#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ErrorResponse.equals(Object)", "int ErrorResponse.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
        // Arrange
        ErrorResponseBuilder errorResponseBuilder = mock(ErrorResponseBuilder.class);
        when(errorResponseBuilder.errorMessage(Mockito.<String>any())).thenReturn(ErrorResponse.builder());
        ErrorResponseBuilder errorResponseBuilder2 = mock(ErrorResponseBuilder.class);
        when(errorResponseBuilder2.errorCode(Mockito.<StateApiErrorCode>any())).thenReturn(errorResponseBuilder);
        ErrorResponse buildResult = errorResponseBuilder2
                .errorCode(StateApiErrorCode.E_BEARER_TOKEN_MISSING)
                .errorMessage("An error occurred")
                .build();
        ErrorResponseBuilder errorResponseBuilder3 = mock(ErrorResponseBuilder.class);
        when(errorResponseBuilder3.errorCode(Mockito.<StateApiErrorCode>any())).thenReturn(ErrorResponse.builder());
        ErrorResponse buildResult2 = errorResponseBuilder3
                .errorCode(StateApiErrorCode.E_BEARER_TOKEN_MISSING)
                .errorMessage("An error occurred")
                .build();

        // Act and Assert
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Test {@link ErrorResponse#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link ErrorResponse#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ErrorResponse.equals(Object)", "int ErrorResponse.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
        // Arrange
        ErrorResponseBuilder errorResponseBuilder = mock(ErrorResponseBuilder.class);
        ErrorResponse buildResult = ErrorResponse.builder()
                .errorCode(StateApiErrorCode.E_BEARER_TOKEN_MISSING)
                .errorMessage("An error occurred")
                .build();
        when(errorResponseBuilder.build()).thenReturn(buildResult);
        ErrorResponseBuilder errorResponseBuilder2 = mock(ErrorResponseBuilder.class);
        when(errorResponseBuilder2.errorMessage(Mockito.<String>any())).thenReturn(errorResponseBuilder);
        ErrorResponseBuilder errorResponseBuilder3 = mock(ErrorResponseBuilder.class);
        when(errorResponseBuilder3.errorCode(Mockito.<StateApiErrorCode>any())).thenReturn(errorResponseBuilder2);
        ErrorResponse buildResult2 = errorResponseBuilder3
                .errorCode(StateApiErrorCode.E_BEARER_TOKEN_MISSING)
                .errorMessage("An error occurred")
                .build();
        ErrorResponseBuilder errorResponseBuilder4 = mock(ErrorResponseBuilder.class);
        when(errorResponseBuilder4.errorCode(Mockito.<StateApiErrorCode>any())).thenReturn(ErrorResponse.builder());
        ErrorResponse buildResult3 = errorResponseBuilder4
                .errorCode(StateApiErrorCode.E_BEARER_TOKEN_MISSING)
                .errorMessage("An error occurred")
                .build();

        // Act and Assert
        assertNotEquals(buildResult2, buildResult3);
    }

    /**
     * Test {@link ErrorResponse#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link ErrorResponse#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ErrorResponse.equals(Object)", "int ErrorResponse.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
        // Arrange
        ErrorResponseBuilder errorResponseBuilder = mock(ErrorResponseBuilder.class);
        ErrorResponse buildResult = ErrorResponse.builder()
                .errorCode(null)
                .errorMessage("Error Message")
                .build();
        when(errorResponseBuilder.build()).thenReturn(buildResult);
        ErrorResponseBuilder errorResponseBuilder2 = mock(ErrorResponseBuilder.class);
        when(errorResponseBuilder2.errorMessage(Mockito.<String>any())).thenReturn(errorResponseBuilder);
        ErrorResponseBuilder errorResponseBuilder3 = mock(ErrorResponseBuilder.class);
        when(errorResponseBuilder3.errorCode(Mockito.<StateApiErrorCode>any())).thenReturn(errorResponseBuilder2);
        ErrorResponse buildResult2 = errorResponseBuilder3
                .errorCode(StateApiErrorCode.E_BEARER_TOKEN_MISSING)
                .errorMessage("An error occurred")
                .build();
        ErrorResponseBuilder errorResponseBuilder4 = mock(ErrorResponseBuilder.class);
        when(errorResponseBuilder4.errorCode(Mockito.<StateApiErrorCode>any())).thenReturn(ErrorResponse.builder());
        ErrorResponse buildResult3 = errorResponseBuilder4
                .errorCode(StateApiErrorCode.E_BEARER_TOKEN_MISSING)
                .errorMessage("An error occurred")
                .build();

        // Act and Assert
        assertNotEquals(buildResult2, buildResult3);
    }

    /**
     * Test {@link ErrorResponse#equals(Object)}.
     * <ul>
     *   <li>When other is {@code null}.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link ErrorResponse#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ErrorResponse.equals(Object)", "int ErrorResponse.hashCode()"})
    void testEquals_whenOtherIsNull_thenReturnNotEqual() {
        // Arrange
        ErrorResponse buildResult = ErrorResponse.builder()
                .errorCode(StateApiErrorCode.E_BEARER_TOKEN_MISSING)
                .errorMessage("An error occurred")
                .build();

        // Act and Assert
        assertNotEquals(buildResult, null);
    }

    /**
     * Test {@link ErrorResponse#equals(Object)}.
     * <ul>
     *   <li>When other is wrong type.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link ErrorResponse#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ErrorResponse.equals(Object)", "int ErrorResponse.hashCode()"})
    void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
        // Arrange
        ErrorResponse buildResult = ErrorResponse.builder()
                .errorCode(StateApiErrorCode.E_BEARER_TOKEN_MISSING)
                .errorMessage("An error occurred")
                .build();

        // Act and Assert
        assertNotEquals(buildResult, "Different type to ErrorResponse");
    }

    /**
     * Test ErrorResponseBuilder {@link ErrorResponseBuilder#build()}.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link ErrorResponseBuilder#build()}
     *   <li>{@link ErrorResponseBuilder#errorCode(StateApiErrorCode)}
     *   <li>{@link ErrorResponseBuilder#errorMessage(String)}
     * </ul>
     */
    @Test
    @DisplayName("Test ErrorResponseBuilder build()")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void ErrorResponseBuilder.<init>()",
        "ErrorResponse ErrorResponseBuilder.build()",
        "ErrorResponseBuilder ErrorResponseBuilder.errorCode(StateApiErrorCode)",
        "ErrorResponseBuilder ErrorResponseBuilder.errorMessage(String)",
        "String ErrorResponseBuilder.toString()"
    })
    void testErrorResponseBuilderBuild() {
        // Arrange and Act
        ErrorResponse actualBuildResult = ErrorResponse.builder()
                .errorCode(StateApiErrorCode.E_BEARER_TOKEN_MISSING)
                .errorMessage("An error occurred")
                .build();

        // Assert
        assertEquals("An error occurred", actualBuildResult.getErrorMessage());
        assertEquals(StateApiErrorCode.E_BEARER_TOKEN_MISSING, actualBuildResult.getErrorCode());
    }

    /**
     * Test getters and setters.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link ErrorResponse#ErrorResponse(StateApiErrorCode, String)}
     *   <li>{@link ErrorResponse#setErrorCode(StateApiErrorCode)}
     *   <li>{@link ErrorResponse#setErrorMessage(String)}
     *   <li>{@link ErrorResponse#toString()}
     *   <li>{@link ErrorResponse#getErrorCode()}
     *   <li>{@link ErrorResponse#getErrorMessage()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void ErrorResponse.<init>(StateApiErrorCode, String)",
        "StateApiErrorCode ErrorResponse.getErrorCode()",
        "String ErrorResponse.getErrorMessage()",
        "void ErrorResponse.setErrorCode(StateApiErrorCode)",
        "void ErrorResponse.setErrorMessage(String)",
        "String ErrorResponse.toString()"
    })
    void testGettersAndSetters() {
        // Arrange and Act
        ErrorResponse actualErrorResponse =
                new ErrorResponse(StateApiErrorCode.E_BEARER_TOKEN_MISSING, "An error occurred");
        actualErrorResponse.setErrorCode(StateApiErrorCode.E_BEARER_TOKEN_MISSING);
        actualErrorResponse.setErrorMessage("An error occurred");
        String actualToStringResult = actualErrorResponse.toString();
        StateApiErrorCode actualErrorCode = actualErrorResponse.getErrorCode();

        // Assert
        assertEquals("An error occurred", actualErrorResponse.getErrorMessage());
        assertEquals(
                "ErrorResponse(errorCode=E_BEARER_TOKEN_MISSING, errorMessage=An error occurred)",
                actualToStringResult);
        assertEquals(StateApiErrorCode.E_BEARER_TOKEN_MISSING, actualErrorCode);
    }
}
