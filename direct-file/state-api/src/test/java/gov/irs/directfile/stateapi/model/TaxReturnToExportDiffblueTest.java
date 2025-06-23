package gov.irs.directfile.stateapi.model;

import java.util.HashMap;
import java.util.Map;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import gov.irs.directfile.stateapi.model.TaxReturnToExport.TaxReturnToExportBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ContextConfiguration(classes = {TaxReturnToExportBuilder.class})
@ExtendWith(SpringExtension.class)
class TaxReturnToExportDiffblueTest {
    @Autowired
    private TaxReturnToExportBuilder taxReturnToExportBuilder;

    /**
     * Test {@link TaxReturnToExport#equals(Object)}, and {@link TaxReturnToExport#hashCode()}.
     * <ul>
     *   <li>When other is equal.</li>
     *   <li>Then return equal.</li>
     * </ul>
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link TaxReturnToExport#equals(Object)}
     *   <li>{@link TaxReturnToExport#hashCode()}
     * </ul>
     */
    @Test
    @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean TaxReturnToExport.equals(Object)", "int TaxReturnToExport.hashCode()"})
    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
        // Arrange
        TaxReturnToExportBuilder builderResult = TaxReturnToExport.builder();
        TaxReturnToExport buildResult = builderResult
                .directFileData(new HashMap<>())
                .status("Status")
                .submissionId("42")
                .xml("Xml")
                .build();
        TaxReturnToExportBuilder builderResult2 = TaxReturnToExport.builder();
        TaxReturnToExport buildResult2 = builderResult2
                .directFileData(new HashMap<>())
                .status("Status")
                .submissionId("42")
                .xml("Xml")
                .build();

        // Act and Assert
        assertEquals(buildResult, buildResult2);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult2.hashCode());
    }

    /**
     * Test {@link TaxReturnToExport#equals(Object)}, and {@link TaxReturnToExport#hashCode()}.
     * <ul>
     *   <li>When other is equal.</li>
     *   <li>Then return equal.</li>
     * </ul>
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link TaxReturnToExport#equals(Object)}
     *   <li>{@link TaxReturnToExport#hashCode()}
     * </ul>
     */
    @Test
    @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean TaxReturnToExport.equals(Object)", "int TaxReturnToExport.hashCode()"})
    void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
        // Arrange
        TaxReturnToExportBuilder taxReturnToExportBuilder = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder.xml(Mockito.<String>any())).thenReturn(TaxReturnToExport.builder());
        TaxReturnToExportBuilder taxReturnToExportBuilder2 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder2.submissionId(Mockito.<String>any())).thenReturn(taxReturnToExportBuilder);
        TaxReturnToExportBuilder taxReturnToExportBuilder3 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder3.status(Mockito.<String>any())).thenReturn(taxReturnToExportBuilder2);
        TaxReturnToExportBuilder taxReturnToExportBuilder4 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder4.directFileData(Mockito.<Map<String, Object>>any()))
                .thenReturn(taxReturnToExportBuilder3);
        TaxReturnToExport buildResult = taxReturnToExportBuilder4
                .directFileData(new HashMap<>())
                .status("Status")
                .submissionId("42")
                .xml("Xml")
                .build();
        TaxReturnToExportBuilder taxReturnToExportBuilder5 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder5.directFileData(Mockito.<Map<String, Object>>any()))
                .thenReturn(TaxReturnToExport.builder());
        TaxReturnToExport buildResult2 = taxReturnToExportBuilder5
                .directFileData(new HashMap<>())
                .status(null)
                .submissionId(null)
                .xml(null)
                .build();

        // Act and Assert
        assertEquals(buildResult, buildResult2);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult2.hashCode());
    }

    /**
     * Test {@link TaxReturnToExport#equals(Object)}, and {@link TaxReturnToExport#hashCode()}.
     * <ul>
     *   <li>When other is same.</li>
     *   <li>Then return equal.</li>
     * </ul>
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link TaxReturnToExport#equals(Object)}
     *   <li>{@link TaxReturnToExport#hashCode()}
     * </ul>
     */
    @Test
    @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean TaxReturnToExport.equals(Object)", "int TaxReturnToExport.hashCode()"})
    void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
        // Arrange
        TaxReturnToExportBuilder builderResult = TaxReturnToExport.builder();
        TaxReturnToExport buildResult = builderResult
                .directFileData(new HashMap<>())
                .status("Status")
                .submissionId("42")
                .xml("Xml")
                .build();

        // Act and Assert
        assertEquals(buildResult, buildResult);
        int expectedHashCodeResult = buildResult.hashCode();
        assertEquals(expectedHashCodeResult, buildResult.hashCode());
    }

    /**
     * Test {@link TaxReturnToExport#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link TaxReturnToExport#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean TaxReturnToExport.equals(Object)", "int TaxReturnToExport.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
        // Arrange
        TaxReturnToExportBuilder taxReturnToExportBuilder = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder.directFileData(Mockito.<Map<String, Object>>any()))
                .thenReturn(TaxReturnToExport.builder());
        TaxReturnToExport buildResult = taxReturnToExportBuilder
                .directFileData(new HashMap<>())
                .status("Status")
                .submissionId("42")
                .xml("Xml")
                .build();
        TaxReturnToExportBuilder builderResult = TaxReturnToExport.builder();
        TaxReturnToExport buildResult2 = builderResult
                .directFileData(new HashMap<>())
                .status("Status")
                .submissionId("42")
                .xml("Xml")
                .build();

        // Act and Assert
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Test {@link TaxReturnToExport#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link TaxReturnToExport#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean TaxReturnToExport.equals(Object)", "int TaxReturnToExport.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
        // Arrange
        TaxReturnToExportBuilder taxReturnToExportBuilder = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder.status(Mockito.<String>any())).thenReturn(TaxReturnToExport.builder());
        TaxReturnToExportBuilder taxReturnToExportBuilder2 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder2.directFileData(Mockito.<Map<String, Object>>any()))
                .thenReturn(taxReturnToExportBuilder);
        TaxReturnToExport buildResult = taxReturnToExportBuilder2
                .directFileData(new HashMap<>())
                .status("Status")
                .submissionId("42")
                .xml("Xml")
                .build();
        TaxReturnToExportBuilder builderResult = TaxReturnToExport.builder();
        TaxReturnToExport buildResult2 = builderResult
                .directFileData(new HashMap<>())
                .status("Status")
                .submissionId("42")
                .xml("Xml")
                .build();

        // Act and Assert
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Test {@link TaxReturnToExport#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link TaxReturnToExport#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean TaxReturnToExport.equals(Object)", "int TaxReturnToExport.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
        // Arrange
        TaxReturnToExportBuilder taxReturnToExportBuilder = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder.status(Mockito.<String>any())).thenReturn(TaxReturnToExport.builder());
        TaxReturnToExportBuilder taxReturnToExportBuilder2 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder2.directFileData(Mockito.<Map<String, Object>>any()))
                .thenReturn(taxReturnToExportBuilder);
        TaxReturnToExport buildResult = taxReturnToExportBuilder2
                .directFileData(new HashMap<>())
                .status("Status")
                .submissionId("42")
                .xml("Xml")
                .build();
        TaxReturnToExportBuilder builderResult = TaxReturnToExport.builder();
        TaxReturnToExport buildResult2 = builderResult
                .directFileData(new HashMap<>())
                .status(null)
                .submissionId("42")
                .xml("Xml")
                .build();

        // Act and Assert
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Test {@link TaxReturnToExport#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link TaxReturnToExport#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean TaxReturnToExport.equals(Object)", "int TaxReturnToExport.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
        // Arrange
        TaxReturnToExportBuilder taxReturnToExportBuilder = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder.submissionId(Mockito.<String>any())).thenReturn(TaxReturnToExport.builder());
        TaxReturnToExportBuilder taxReturnToExportBuilder2 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder2.status(Mockito.<String>any())).thenReturn(taxReturnToExportBuilder);
        TaxReturnToExportBuilder taxReturnToExportBuilder3 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder3.directFileData(Mockito.<Map<String, Object>>any()))
                .thenReturn(taxReturnToExportBuilder2);
        TaxReturnToExport buildResult = taxReturnToExportBuilder3
                .directFileData(new HashMap<>())
                .status("Status")
                .submissionId("42")
                .xml("Xml")
                .build();
        TaxReturnToExportBuilder builderResult = TaxReturnToExport.builder();
        TaxReturnToExport buildResult2 = builderResult
                .directFileData(new HashMap<>())
                .status(null)
                .submissionId("42")
                .xml("Xml")
                .build();

        // Act and Assert
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Test {@link TaxReturnToExport#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link TaxReturnToExport#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean TaxReturnToExport.equals(Object)", "int TaxReturnToExport.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
        // Arrange
        TaxReturnToExportBuilder taxReturnToExportBuilder = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder.submissionId(Mockito.<String>any())).thenReturn(TaxReturnToExport.builder());
        TaxReturnToExportBuilder taxReturnToExportBuilder2 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder2.status(Mockito.<String>any())).thenReturn(taxReturnToExportBuilder);
        TaxReturnToExportBuilder taxReturnToExportBuilder3 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder3.directFileData(Mockito.<Map<String, Object>>any()))
                .thenReturn(taxReturnToExportBuilder2);
        TaxReturnToExport buildResult = taxReturnToExportBuilder3
                .directFileData(new HashMap<>())
                .status("Status")
                .submissionId("42")
                .xml("Xml")
                .build();
        TaxReturnToExportBuilder builderResult = TaxReturnToExport.builder();
        TaxReturnToExport buildResult2 = builderResult
                .directFileData(new HashMap<>())
                .status(null)
                .submissionId(null)
                .xml("Xml")
                .build();

        // Act and Assert
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Test {@link TaxReturnToExport#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link TaxReturnToExport#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean TaxReturnToExport.equals(Object)", "int TaxReturnToExport.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
        // Arrange
        TaxReturnToExportBuilder builderResult = TaxReturnToExport.builder();
        builderResult.status("Status");
        TaxReturnToExportBuilder taxReturnToExportBuilder = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder.submissionId(Mockito.<String>any())).thenReturn(builderResult);
        TaxReturnToExportBuilder taxReturnToExportBuilder2 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder2.status(Mockito.<String>any())).thenReturn(taxReturnToExportBuilder);
        TaxReturnToExportBuilder taxReturnToExportBuilder3 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder3.directFileData(Mockito.<Map<String, Object>>any()))
                .thenReturn(taxReturnToExportBuilder2);
        TaxReturnToExport buildResult = taxReturnToExportBuilder3
                .directFileData(new HashMap<>())
                .status("Status")
                .submissionId("42")
                .xml("Xml")
                .build();
        TaxReturnToExportBuilder builderResult2 = TaxReturnToExport.builder();
        TaxReturnToExport buildResult2 = builderResult2
                .directFileData(new HashMap<>())
                .status(null)
                .submissionId("42")
                .xml("Xml")
                .build();

        // Act and Assert
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Test {@link TaxReturnToExport#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link TaxReturnToExport#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean TaxReturnToExport.equals(Object)", "int TaxReturnToExport.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
        // Arrange
        TaxReturnToExportBuilder taxReturnToExportBuilder = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder.xml(Mockito.<String>any())).thenReturn(TaxReturnToExport.builder());
        TaxReturnToExportBuilder taxReturnToExportBuilder2 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder2.submissionId(Mockito.<String>any())).thenReturn(taxReturnToExportBuilder);
        TaxReturnToExportBuilder taxReturnToExportBuilder3 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder3.status(Mockito.<String>any())).thenReturn(taxReturnToExportBuilder2);
        TaxReturnToExportBuilder taxReturnToExportBuilder4 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder4.directFileData(Mockito.<Map<String, Object>>any()))
                .thenReturn(taxReturnToExportBuilder3);
        TaxReturnToExport buildResult = taxReturnToExportBuilder4
                .directFileData(new HashMap<>())
                .status("Status")
                .submissionId("42")
                .xml("Xml")
                .build();
        TaxReturnToExportBuilder builderResult = TaxReturnToExport.builder();
        TaxReturnToExport buildResult2 = builderResult
                .directFileData(new HashMap<>())
                .status(null)
                .submissionId(null)
                .xml("Xml")
                .build();

        // Act and Assert
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Test {@link TaxReturnToExport#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link TaxReturnToExport#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean TaxReturnToExport.equals(Object)", "int TaxReturnToExport.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
        // Arrange
        TaxReturnToExportBuilder taxReturnToExportBuilder = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder.xml(Mockito.<String>any())).thenReturn(TaxReturnToExport.builder());
        TaxReturnToExportBuilder taxReturnToExportBuilder2 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder2.submissionId(Mockito.<String>any())).thenReturn(taxReturnToExportBuilder);
        TaxReturnToExportBuilder taxReturnToExportBuilder3 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder3.status(Mockito.<String>any())).thenReturn(taxReturnToExportBuilder2);
        TaxReturnToExportBuilder taxReturnToExportBuilder4 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder4.directFileData(Mockito.<Map<String, Object>>any()))
                .thenReturn(taxReturnToExportBuilder3);
        TaxReturnToExport buildResult = taxReturnToExportBuilder4
                .directFileData(new HashMap<>())
                .status("Status")
                .submissionId("42")
                .xml("Xml")
                .build();
        TaxReturnToExportBuilder builderResult = TaxReturnToExport.builder();
        TaxReturnToExport buildResult2 = builderResult
                .directFileData(new HashMap<>())
                .status(null)
                .submissionId(null)
                .xml(null)
                .build();

        // Act and Assert
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Test {@link TaxReturnToExport#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link TaxReturnToExport#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean TaxReturnToExport.equals(Object)", "int TaxReturnToExport.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
        // Arrange
        TaxReturnToExportBuilder builderResult = TaxReturnToExport.builder();
        builderResult.submissionId("42");
        TaxReturnToExportBuilder taxReturnToExportBuilder = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder.xml(Mockito.<String>any())).thenReturn(builderResult);
        TaxReturnToExportBuilder taxReturnToExportBuilder2 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder2.submissionId(Mockito.<String>any())).thenReturn(taxReturnToExportBuilder);
        TaxReturnToExportBuilder taxReturnToExportBuilder3 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder3.status(Mockito.<String>any())).thenReturn(taxReturnToExportBuilder2);
        TaxReturnToExportBuilder taxReturnToExportBuilder4 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder4.directFileData(Mockito.<Map<String, Object>>any()))
                .thenReturn(taxReturnToExportBuilder3);
        TaxReturnToExport buildResult = taxReturnToExportBuilder4
                .directFileData(new HashMap<>())
                .status("Status")
                .submissionId("42")
                .xml("Xml")
                .build();
        TaxReturnToExportBuilder builderResult2 = TaxReturnToExport.builder();
        TaxReturnToExport buildResult2 = builderResult2
                .directFileData(new HashMap<>())
                .status(null)
                .submissionId(null)
                .xml("Xml")
                .build();

        // Act and Assert
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Test {@link TaxReturnToExport#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link TaxReturnToExport#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean TaxReturnToExport.equals(Object)", "int TaxReturnToExport.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual10() {
        // Arrange
        TaxReturnToExportBuilder builderResult = TaxReturnToExport.builder();
        builderResult.xml("Xml");
        TaxReturnToExportBuilder taxReturnToExportBuilder = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder.xml(Mockito.<String>any())).thenReturn(builderResult);
        TaxReturnToExportBuilder taxReturnToExportBuilder2 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder2.submissionId(Mockito.<String>any())).thenReturn(taxReturnToExportBuilder);
        TaxReturnToExportBuilder taxReturnToExportBuilder3 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder3.status(Mockito.<String>any())).thenReturn(taxReturnToExportBuilder2);
        TaxReturnToExportBuilder taxReturnToExportBuilder4 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder4.directFileData(Mockito.<Map<String, Object>>any()))
                .thenReturn(taxReturnToExportBuilder3);
        TaxReturnToExport buildResult = taxReturnToExportBuilder4
                .directFileData(new HashMap<>())
                .status("Status")
                .submissionId("42")
                .xml("Xml")
                .build();
        TaxReturnToExportBuilder taxReturnToExportBuilder5 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder5.directFileData(Mockito.<Map<String, Object>>any()))
                .thenReturn(TaxReturnToExport.builder());
        TaxReturnToExport buildResult2 = taxReturnToExportBuilder5
                .directFileData(new HashMap<>())
                .status(null)
                .submissionId(null)
                .xml(null)
                .build();

        // Act and Assert
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Test {@link TaxReturnToExport#equals(Object)}.
     * <ul>
     *   <li>When other is different.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link TaxReturnToExport#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is different; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean TaxReturnToExport.equals(Object)", "int TaxReturnToExport.hashCode()"})
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual11() {
        // Arrange
        TaxReturnToExportBuilder builderResult = TaxReturnToExport.builder();
        builderResult.directFileData(new HashMap<>());
        TaxReturnToExportBuilder taxReturnToExportBuilder = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder.xml(Mockito.<String>any())).thenReturn(builderResult);
        TaxReturnToExportBuilder taxReturnToExportBuilder2 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder2.submissionId(Mockito.<String>any())).thenReturn(taxReturnToExportBuilder);
        TaxReturnToExportBuilder taxReturnToExportBuilder3 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder3.status(Mockito.<String>any())).thenReturn(taxReturnToExportBuilder2);
        TaxReturnToExportBuilder taxReturnToExportBuilder4 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder4.directFileData(Mockito.<Map<String, Object>>any()))
                .thenReturn(taxReturnToExportBuilder3);
        TaxReturnToExport buildResult = taxReturnToExportBuilder4
                .directFileData(new HashMap<>())
                .status("Status")
                .submissionId("42")
                .xml("Xml")
                .build();
        TaxReturnToExportBuilder taxReturnToExportBuilder5 = mock(TaxReturnToExportBuilder.class);
        when(taxReturnToExportBuilder5.directFileData(Mockito.<Map<String, Object>>any()))
                .thenReturn(TaxReturnToExport.builder());
        TaxReturnToExport buildResult2 = taxReturnToExportBuilder5
                .directFileData(new HashMap<>())
                .status(null)
                .submissionId(null)
                .xml(null)
                .build();

        // Act and Assert
        assertNotEquals(buildResult, buildResult2);
    }

    /**
     * Test {@link TaxReturnToExport#equals(Object)}.
     * <ul>
     *   <li>When other is {@code null}.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link TaxReturnToExport#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean TaxReturnToExport.equals(Object)", "int TaxReturnToExport.hashCode()"})
    void testEquals_whenOtherIsNull_thenReturnNotEqual() {
        // Arrange
        TaxReturnToExportBuilder builderResult = TaxReturnToExport.builder();
        TaxReturnToExport buildResult = builderResult
                .directFileData(new HashMap<>())
                .status("Status")
                .submissionId("42")
                .xml("Xml")
                .build();

        // Act and Assert
        assertNotEquals(buildResult, null);
    }

    /**
     * Test {@link TaxReturnToExport#equals(Object)}.
     * <ul>
     *   <li>When other is wrong type.</li>
     *   <li>Then return not equal.</li>
     * </ul>
     * <p>
     * Method under test: {@link TaxReturnToExport#equals(Object)}
     */
    @Test
    @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"boolean TaxReturnToExport.equals(Object)", "int TaxReturnToExport.hashCode()"})
    void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
        // Arrange
        TaxReturnToExportBuilder builderResult = TaxReturnToExport.builder();
        TaxReturnToExport buildResult = builderResult
                .directFileData(new HashMap<>())
                .status("Status")
                .submissionId("42")
                .xml("Xml")
                .build();

        // Act and Assert
        assertNotEquals(buildResult, "Different type to TaxReturnToExport");
    }

    /**
     * Test getters and setters.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link TaxReturnToExport#TaxReturnToExport()}
     *   <li>{@link TaxReturnToExport#setDirectFileData(Map)}
     *   <li>{@link TaxReturnToExport#setStatus(String)}
     *   <li>{@link TaxReturnToExport#setSubmissionId(String)}
     *   <li>{@link TaxReturnToExport#setXml(String)}
     *   <li>{@link TaxReturnToExport#toString()}
     *   <li>{@link TaxReturnToExport#getDirectFileData()}
     *   <li>{@link TaxReturnToExport#getStatus()}
     *   <li>{@link TaxReturnToExport#getSubmissionId()}
     *   <li>{@link TaxReturnToExport#getXml()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void TaxReturnToExport.<init>()",
        "void TaxReturnToExport.<init>(String, String, String, Map)",
        "Map TaxReturnToExport.getDirectFileData()",
        "String TaxReturnToExport.getStatus()",
        "String TaxReturnToExport.getSubmissionId()",
        "String TaxReturnToExport.getXml()",
        "void TaxReturnToExport.setDirectFileData(Map)",
        "void TaxReturnToExport.setStatus(String)",
        "void TaxReturnToExport.setSubmissionId(String)",
        "void TaxReturnToExport.setXml(String)",
        "String TaxReturnToExport.toString()"
    })
    void testGettersAndSetters() {
        // Arrange and Act
        TaxReturnToExport actualTaxReturnToExport = new TaxReturnToExport();
        HashMap<String, Object> directFileData = new HashMap<>();
        actualTaxReturnToExport.setDirectFileData(directFileData);
        actualTaxReturnToExport.setStatus("Status");
        actualTaxReturnToExport.setSubmissionId("42");
        actualTaxReturnToExport.setXml("Xml");
        String actualToStringResult = actualTaxReturnToExport.toString();
        Map<String, Object> actualDirectFileData = actualTaxReturnToExport.getDirectFileData();
        String actualStatus = actualTaxReturnToExport.getStatus();
        String actualSubmissionId = actualTaxReturnToExport.getSubmissionId();

        // Assert
        assertEquals("42", actualSubmissionId);
        assertEquals("Status", actualStatus);
        assertEquals(
                "TaxReturnToExport(status=Status, submissionId=42, xml=Xml, directFileData={})", actualToStringResult);
        assertEquals("Xml", actualTaxReturnToExport.getXml());
        assertTrue(actualDirectFileData.isEmpty());
        assertSame(directFileData, actualDirectFileData);
    }

    /**
     * Test getters and setters.
     * <ul>
     *   <li>When {@code Status}.</li>
     * </ul>
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link TaxReturnToExport#TaxReturnToExport(String, String, String, Map)}
     *   <li>{@link TaxReturnToExport#setDirectFileData(Map)}
     *   <li>{@link TaxReturnToExport#setStatus(String)}
     *   <li>{@link TaxReturnToExport#setSubmissionId(String)}
     *   <li>{@link TaxReturnToExport#setXml(String)}
     *   <li>{@link TaxReturnToExport#toString()}
     *   <li>{@link TaxReturnToExport#getDirectFileData()}
     *   <li>{@link TaxReturnToExport#getStatus()}
     *   <li>{@link TaxReturnToExport#getSubmissionId()}
     *   <li>{@link TaxReturnToExport#getXml()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters; when 'Status'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void TaxReturnToExport.<init>()",
        "void TaxReturnToExport.<init>(String, String, String, Map)",
        "Map TaxReturnToExport.getDirectFileData()",
        "String TaxReturnToExport.getStatus()",
        "String TaxReturnToExport.getSubmissionId()",
        "String TaxReturnToExport.getXml()",
        "void TaxReturnToExport.setDirectFileData(Map)",
        "void TaxReturnToExport.setStatus(String)",
        "void TaxReturnToExport.setSubmissionId(String)",
        "void TaxReturnToExport.setXml(String)",
        "String TaxReturnToExport.toString()"
    })
    void testGettersAndSetters_whenStatus() {
        // Arrange and Act
        TaxReturnToExport actualTaxReturnToExport = new TaxReturnToExport("Status", "42", "Xml", new HashMap<>());
        HashMap<String, Object> directFileData = new HashMap<>();
        actualTaxReturnToExport.setDirectFileData(directFileData);
        actualTaxReturnToExport.setStatus("Status");
        actualTaxReturnToExport.setSubmissionId("42");
        actualTaxReturnToExport.setXml("Xml");
        String actualToStringResult = actualTaxReturnToExport.toString();
        Map<String, Object> actualDirectFileData = actualTaxReturnToExport.getDirectFileData();
        String actualStatus = actualTaxReturnToExport.getStatus();
        String actualSubmissionId = actualTaxReturnToExport.getSubmissionId();

        // Assert
        assertEquals("42", actualSubmissionId);
        assertEquals("Status", actualStatus);
        assertEquals(
                "TaxReturnToExport(status=Status, submissionId=42, xml=Xml, directFileData={})", actualToStringResult);
        assertEquals("Xml", actualTaxReturnToExport.getXml());
        assertTrue(actualDirectFileData.isEmpty());
        assertSame(directFileData, actualDirectFileData);
    }

    /**
     * Test TaxReturnToExportBuilder {@link TaxReturnToExportBuilder#build()}.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link TaxReturnToExportBuilder#build()}
     *   <li>{@link TaxReturnToExportBuilder#directFileData(Map)}
     *   <li>{@link TaxReturnToExportBuilder#status(String)}
     *   <li>{@link TaxReturnToExportBuilder#submissionId(String)}
     *   <li>{@link TaxReturnToExportBuilder#xml(String)}
     * </ul>
     */
    @Test
    @DisplayName("Test TaxReturnToExportBuilder build()")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void TaxReturnToExportBuilder.<init>()",
        "TaxReturnToExport TaxReturnToExportBuilder.build()",
        "TaxReturnToExportBuilder TaxReturnToExportBuilder.directFileData(Map)",
        "TaxReturnToExportBuilder TaxReturnToExportBuilder.status(String)",
        "TaxReturnToExportBuilder TaxReturnToExportBuilder.submissionId(String)",
        "String TaxReturnToExportBuilder.toString()",
        "TaxReturnToExportBuilder TaxReturnToExportBuilder.xml(String)"
    })
    void testTaxReturnToExportBuilderBuild() {
        // Arrange
        TaxReturnToExportBuilder builderResult = TaxReturnToExport.builder();
        HashMap<String, Object> directFileData = new HashMap<>();

        // Act
        TaxReturnToExport actualBuildResult = builderResult
                .directFileData(directFileData)
                .status("Status")
                .submissionId("42")
                .xml("Xml")
                .build();

        // Assert
        assertEquals("42", actualBuildResult.getSubmissionId());
        assertEquals("Status", actualBuildResult.getStatus());
        assertEquals("Xml", actualBuildResult.getXml());
        Map<String, Object> directFileData2 = actualBuildResult.getDirectFileData();
        assertTrue(directFileData2.isEmpty());
        assertSame(directFileData, directFileData2);
    }
}
