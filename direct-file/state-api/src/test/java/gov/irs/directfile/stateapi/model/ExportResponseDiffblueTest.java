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

import gov.irs.directfile.stateapi.model.ExportResponse.ExportResponseBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ContextConfiguration(classes = {ExportResponseBuilder.class})
@ExtendWith(SpringExtension.class)
class ExportResponseDiffblueTest {
    @Autowired
    private ExportResponseBuilder exportResponseBuilder;

    /**
     * Test {@link ExportResponse#equals(Object)}, and {@link ExportResponse#hashCode()}.
     * <ul>
     *   <li>When other is equal.</li>
     *   <li>Then return equal.</li>
     * </ul>
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link ExportResponse#equals(Object)}
     *   <li>{@link ExportResponse#hashCode()}
     * </ul>
     */
    @Test
    @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ExportResponse.equals(Object)", "int ExportResponse.hashCode()"})
    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
        // Arrange
        ExportResponse buildResult = ExportResponse.builder()
                .error("An error occurred")
                .status("Status")
                .taxReturn("Tax Return")
                .build();
        ExportResponse buildResult2 = ExportResponse.builder()
                .error("An error occurred")
                .status("Status")
                .taxReturn("Tax Return")
                .build();

        // Act and Assert
        assertEquals(buildResult, buildResult2);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult2.hashCode());
    }

    /**
     * Test {@link ExportResponse#equals(Object)}, and {@link ExportResponse#hashCode()}.
     * <ul>
     *   <li>When other is same.</li>
     *   <li>Then return equal.</li>
     * </ul>
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link ExportResponse#equals(Object)}
     *   <li>{@link ExportResponse#hashCode()}
     * </ul>
     */
    @Test
    @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ExportResponse.equals(Object)", "int ExportResponse.hashCode()"})
    void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
        // Arrange
        ExportResponse buildResult = ExportResponse.builder()
                .error("An error occurred")
                .status("Status")
                .taxReturn("Tax Return")
                .build();

        // Act and Assert
        assertEquals(buildResult, buildResult);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult.hashCode());
    }

    /**
     * Test {@link ExportResponse#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link ExportResponse#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ExportResponse.equals(Object)", "int ExportResponse.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
        // Arrange
        ExportResponseBuilder exportResponseBuilder = mock(ExportResponseBuilder.class);
        when(exportResponseBuilder.error(Mockito.<String>any())).thenReturn(ExportResponse.builder());
        ExportResponse buildResult = exportResponseBuilder
                .error("An error occurred")
                .status("Status")
                .taxReturn("Tax Return")
                .build();
        ExportResponse buildResult2 = ExportResponse.builder()
                .error("An error occurred")
                .status("Status")
                .taxReturn("Tax Return")
                .build();

        // Act and Assert
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Test {@link ExportResponse#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link ExportResponse#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ExportResponse.equals(Object)", "int ExportResponse.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
        // Arrange
        ExportResponseBuilder exportResponseBuilder = mock(ExportResponseBuilder.class);
        when(exportResponseBuilder.status(Mockito.<String>any())).thenReturn(ExportResponse.builder());
        ExportResponseBuilder exportResponseBuilder2 = mock(ExportResponseBuilder.class);
        when(exportResponseBuilder2.error(Mockito.<String>any())).thenReturn(exportResponseBuilder);
        ExportResponse buildResult = exportResponseBuilder2
                .error("An error occurred")
                .status("Status")
                .taxReturn("Tax Return")
                .build();
        ExportResponse buildResult2 = ExportResponse.builder()
                .error("An error occurred")
                .status("Status")
                .taxReturn("Tax Return")
                .build();

        // Act and Assert
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Test {@link ExportResponse#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link ExportResponse#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ExportResponse.equals(Object)", "int ExportResponse.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
        // Arrange
        ExportResponseBuilder exportResponseBuilder = mock(ExportResponseBuilder.class);
        when(exportResponseBuilder.status(Mockito.<String>any())).thenReturn(ExportResponse.builder());
        ExportResponseBuilder exportResponseBuilder2 = mock(ExportResponseBuilder.class);
        when(exportResponseBuilder2.error(Mockito.<String>any())).thenReturn(exportResponseBuilder);
        ExportResponse buildResult = exportResponseBuilder2
                .error("An error occurred")
                .status("Status")
                .taxReturn("Tax Return")
                .build();
        ExportResponse buildResult2 = ExportResponse.builder()
                .error("An error occurred")
                .status(null)
                .taxReturn("Tax Return")
                .build();

        // Act and Assert
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Test {@link ExportResponse#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link ExportResponse#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ExportResponse.equals(Object)", "int ExportResponse.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
        // Arrange
        ExportResponseBuilder exportResponseBuilder = mock(ExportResponseBuilder.class);
        when(exportResponseBuilder.taxReturn(Mockito.<String>any())).thenReturn(ExportResponse.builder());
        ExportResponseBuilder exportResponseBuilder2 = mock(ExportResponseBuilder.class);
        when(exportResponseBuilder2.status(Mockito.<String>any())).thenReturn(exportResponseBuilder);
        ExportResponseBuilder exportResponseBuilder3 = mock(ExportResponseBuilder.class);
        when(exportResponseBuilder3.error(Mockito.<String>any())).thenReturn(exportResponseBuilder2);
        ExportResponse buildResult = exportResponseBuilder3
                .error("An error occurred")
                .status("Status")
                .taxReturn("Tax Return")
                .build();
        ExportResponse buildResult2 = ExportResponse.builder()
                .error("An error occurred")
                .status(null)
                .taxReturn("Tax Return")
                .build();

        // Act and Assert
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Test {@link ExportResponse#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link ExportResponse#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ExportResponse.equals(Object)", "int ExportResponse.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
        // Arrange
        ExportResponseBuilder exportResponseBuilder = mock(ExportResponseBuilder.class);
        ExportResponse buildResult = ExportResponse.builder()
                .error("An error occurred")
                .status("Status")
                .taxReturn("Tax Return")
                .build();
        when(exportResponseBuilder.build()).thenReturn(buildResult);
        ExportResponseBuilder exportResponseBuilder2 = mock(ExportResponseBuilder.class);
        when(exportResponseBuilder2.taxReturn(Mockito.<String>any())).thenReturn(exportResponseBuilder);
        ExportResponseBuilder exportResponseBuilder3 = mock(ExportResponseBuilder.class);
        when(exportResponseBuilder3.status(Mockito.<String>any())).thenReturn(exportResponseBuilder2);
        ExportResponseBuilder exportResponseBuilder4 = mock(ExportResponseBuilder.class);
        when(exportResponseBuilder4.error(Mockito.<String>any())).thenReturn(exportResponseBuilder3);
        ExportResponse buildResult2 = exportResponseBuilder4
                .error("An error occurred")
                .status("Status")
                .taxReturn("Tax Return")
                .build();
        ExportResponse buildResult3 = ExportResponse.builder()
                .error("An error occurred")
                .status(null)
                .taxReturn("Tax Return")
                .build();

        // Act and Assert
        assertNotEquals(buildResult2, buildResult3);
    }

    /**
     * Test {@link ExportResponse#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link ExportResponse#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ExportResponse.equals(Object)", "int ExportResponse.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
        // Arrange
        ExportResponseBuilder exportResponseBuilder = mock(ExportResponseBuilder.class);
        ExportResponse buildResult = ExportResponse.builder()
                .error("Error")
                .status(null)
                .taxReturn("Tax Return")
                .build();
        when(exportResponseBuilder.build()).thenReturn(buildResult);
        ExportResponseBuilder exportResponseBuilder2 = mock(ExportResponseBuilder.class);
        when(exportResponseBuilder2.taxReturn(Mockito.<String>any())).thenReturn(exportResponseBuilder);
        ExportResponseBuilder exportResponseBuilder3 = mock(ExportResponseBuilder.class);
        when(exportResponseBuilder3.status(Mockito.<String>any())).thenReturn(exportResponseBuilder2);
        ExportResponseBuilder exportResponseBuilder4 = mock(ExportResponseBuilder.class);
        when(exportResponseBuilder4.error(Mockito.<String>any())).thenReturn(exportResponseBuilder3);
        ExportResponse buildResult2 = exportResponseBuilder4
                .error("An error occurred")
                .status("Status")
                .taxReturn("Tax Return")
                .build();
        ExportResponse buildResult3 = ExportResponse.builder()
                .error("An error occurred")
                .status(null)
                .taxReturn("Tax Return")
                .build();

        // Act and Assert
        assertNotEquals(buildResult2, buildResult3);
    }

    /**
     * Test {@link ExportResponse#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link ExportResponse#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ExportResponse.equals(Object)", "int ExportResponse.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
        // Arrange
        ExportResponseBuilder exportResponseBuilder = mock(ExportResponseBuilder.class);
        ExportResponse buildResult = ExportResponse.builder()
                .error("Error")
                .status(null)
                .taxReturn("Error")
                .build();
        when(exportResponseBuilder.build()).thenReturn(buildResult);
        ExportResponseBuilder exportResponseBuilder2 = mock(ExportResponseBuilder.class);
        when(exportResponseBuilder2.taxReturn(Mockito.<String>any())).thenReturn(exportResponseBuilder);
        ExportResponseBuilder exportResponseBuilder3 = mock(ExportResponseBuilder.class);
        when(exportResponseBuilder3.status(Mockito.<String>any())).thenReturn(exportResponseBuilder2);
        ExportResponseBuilder exportResponseBuilder4 = mock(ExportResponseBuilder.class);
        when(exportResponseBuilder4.error(Mockito.<String>any())).thenReturn(exportResponseBuilder3);
        ExportResponse buildResult2 = exportResponseBuilder4
                .error("An error occurred")
                .status("Status")
                .taxReturn("Tax Return")
                .build();
        ExportResponse buildResult3 = ExportResponse.builder()
                .error("An error occurred")
                .status(null)
                .taxReturn("Tax Return")
                .build();

        // Act and Assert
        assertNotEquals(buildResult2, buildResult3);
    }

    /**
     * Test {@link ExportResponse#equals(Object)}.
     * <ul>
     *   <li>When other is {@code null}.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link ExportResponse#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ExportResponse.equals(Object)", "int ExportResponse.hashCode()"})
    void testEquals_whenOtherIsNull_thenReturnNotEqual() {
        // Arrange
        ExportResponse buildResult = ExportResponse.builder()
                .error("An error occurred")
                .status("Status")
                .taxReturn("Tax Return")
                .build();

        // Act and Assert
        assertNotEquals(buildResult, null);
    }

    /**
     * Test {@link ExportResponse#equals(Object)}.
     * <ul>
     *   <li>When other is wrong type.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link ExportResponse#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean ExportResponse.equals(Object)", "int ExportResponse.hashCode()"})
    void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
        // Arrange
        ExportResponse buildResult = ExportResponse.builder()
                .error("An error occurred")
                .status("Status")
                .taxReturn("Tax Return")
                .build();

        // Act and Assert
        assertNotEquals(buildResult, "Different type to ExportResponse");
    }

    /**
     * Test ExportResponseBuilder {@link ExportResponseBuilder#build()}.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link ExportResponseBuilder#build()}
     *   <li>{@link ExportResponseBuilder#error(String)}
     *   <li>{@link ExportResponseBuilder#status(String)}
     *   <li>{@link ExportResponseBuilder#taxReturn(String)}
     * </ul>
     */
    @Test
    @DisplayName("Test ExportResponseBuilder build()")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void ExportResponseBuilder.<init>()",
        "ExportResponse ExportResponseBuilder.build()",
        "ExportResponseBuilder ExportResponseBuilder.error(String)",
        "ExportResponseBuilder ExportResponseBuilder.status(String)",
        "ExportResponseBuilder ExportResponseBuilder.taxReturn(String)",
        "String ExportResponseBuilder.toString()"
    })
    void testExportResponseBuilderBuild() {
        // Arrange and Act
        ExportResponse actualBuildResult = ExportResponse.builder()
                .error("An error occurred")
                .status("Status")
                .taxReturn("Tax Return")
                .build();

        // Assert
        assertEquals("An error occurred", actualBuildResult.getError());
        assertEquals("Status", actualBuildResult.getStatus());
        assertEquals("Tax Return", actualBuildResult.getTaxReturn());
    }

    /**
     * Test getters and setters.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link ExportResponse#ExportResponse()}
     *   <li>{@link ExportResponse#setError(String)}
     *   <li>{@link ExportResponse#setStatus(String)}
     *   <li>{@link ExportResponse#setTaxReturn(String)}
     *   <li>{@link ExportResponse#toString()}
     *   <li>{@link ExportResponse#getError()}
     *   <li>{@link ExportResponse#getStatus()}
     *   <li>{@link ExportResponse#getTaxReturn()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void ExportResponse.<init>()",
        "void ExportResponse.<init>(String, String, String)",
        "String ExportResponse.getError()",
        "String ExportResponse.getStatus()",
        "String ExportResponse.getTaxReturn()",
        "void ExportResponse.setError(String)",
        "void ExportResponse.setStatus(String)",
        "void ExportResponse.setTaxReturn(String)",
        "String ExportResponse.toString()"
    })
    void testGettersAndSetters() {
        // Arrange and Act
        ExportResponse actualExportResponse = new ExportResponse();
        actualExportResponse.setError("An error occurred");
        actualExportResponse.setStatus("Status");
        actualExportResponse.setTaxReturn("Tax Return");
        String actualToStringResult = actualExportResponse.toString();
        String actualError = actualExportResponse.getError();
        String actualStatus = actualExportResponse.getStatus();

        // Assert
        assertEquals("An error occurred", actualError);
        assertEquals(
                "ExportResponse(status=Status, taxReturn=Tax Return, error=An error occurred)", actualToStringResult);
        assertEquals("Status", actualStatus);
        assertEquals("Tax Return", actualExportResponse.getTaxReturn());
    }

    /**
     * Test getters and setters.
     * <ul>
     *   <li>When {@code Status}.</li>
     * </ul>
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link ExportResponse#ExportResponse(String, String, String)}
     *   <li>{@link ExportResponse#setError(String)}
     *   <li>{@link ExportResponse#setStatus(String)}
     *   <li>{@link ExportResponse#setTaxReturn(String)}
     *   <li>{@link ExportResponse#toString()}
     *   <li>{@link ExportResponse#getError()}
     *   <li>{@link ExportResponse#getStatus()}
     *   <li>{@link ExportResponse#getTaxReturn()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters; when 'Status'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void ExportResponse.<init>()",
        "void ExportResponse.<init>(String, String, String)",
        "String ExportResponse.getError()",
        "String ExportResponse.getStatus()",
        "String ExportResponse.getTaxReturn()",
        "void ExportResponse.setError(String)",
        "void ExportResponse.setStatus(String)",
        "void ExportResponse.setTaxReturn(String)",
        "String ExportResponse.toString()"
    })
    void testGettersAndSetters_whenStatus() {
        // Arrange and Act
        ExportResponse actualExportResponse = new ExportResponse("Status", "Tax Return", "An error occurred");
        actualExportResponse.setError("An error occurred");
        actualExportResponse.setStatus("Status");
        actualExportResponse.setTaxReturn("Tax Return");
        String actualToStringResult = actualExportResponse.toString();
        String actualError = actualExportResponse.getError();
        String actualStatus = actualExportResponse.getStatus();

        // Assert
        assertEquals("An error occurred", actualError);
        assertEquals(
                "ExportResponse(status=Status, taxReturn=Tax Return, error=An error occurred)", actualToStringResult);
        assertEquals("Status", actualStatus);
        assertEquals("Tax Return", actualExportResponse.getTaxReturn());
    }
}
