package gov.irs.directfile.stateapi.audit;

import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.spi.ThrowableProxy;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ContextConfiguration(classes = {NoMessageStackTraceConverter.class})
@ExtendWith(SpringExtension.class)
class NoMessageStackTraceConverterDiffblueTest {
    @Autowired
    private NoMessageStackTraceConverter noMessageStackTraceConverter;

    /**
     * Test {@link NoMessageStackTraceConverter#throwableProxyToString(IThrowableProxy)}.
     * <p>
     * Method under test: {@link NoMessageStackTraceConverter#throwableProxyToString(IThrowableProxy)}
     */
    @Test
    @DisplayName("Test throwableProxyToString(IThrowableProxy)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"String NoMessageStackTraceConverter.throwableProxyToString(IThrowableProxy)"})
    void testThrowableProxyToString() {
        // Arrange
        ThrowableProxy tp = mock(ThrowableProxy.class);
        when(tp.getSuppressed()).thenReturn(new IThrowableProxy[] {new ThrowableProxy(new Throwable())});
        when(tp.getCause()).thenReturn(new ThrowableProxy(new Throwable()));
        when(tp.getStackTraceElementProxyArray()).thenReturn(new StackTraceElementProxy[] {
            new StackTraceElementProxy(new StackTraceElement("foo", "foo", "foo", 1))
        });
        when(tp.getCommonFrames()).thenReturn(1);
        when(tp.getClassName()).thenReturn("Class Name");

        // Act
        String actualThrowableProxyToStringResult = noMessageStackTraceConverter.throwableProxyToString(tp);

        // Assert
        verify(tp, atLeast(1)).getCause();
        verify(tp).getClassName();
        verify(tp).getCommonFrames();
        verify(tp).getStackTraceElementProxyArray();
        verify(tp).getSuppressed();
        assertEquals(
                "java.lang.Throwable\nClass Name\n\tSuppressed: java.lang.Throwable\n",
                actualThrowableProxyToStringResult);
    }

    /**
     * Test {@link NoMessageStackTraceConverter#throwableProxyToString(IThrowableProxy)}.
     * <ul>
     *   <li>Given {@code null}.</li>
     *   <li>Then return {@code Throwable Class Name}.</li>
     * </ul>
     * <p>
     * Method under test: {@link NoMessageStackTraceConverter#throwableProxyToString(IThrowableProxy)}
     */
    @Test
    @DisplayName(
            "Test throwableProxyToString(IThrowableProxy); given 'null'; then return 'java.lang.Throwable Class Name'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"String NoMessageStackTraceConverter.throwableProxyToString(IThrowableProxy)"})
    void testThrowableProxyToString_givenNull_thenReturnJavaLangThrowableClassName() {
        // Arrange
        ThrowableProxy tp = mock(ThrowableProxy.class);
        when(tp.getSuppressed()).thenReturn(null);
        when(tp.getCause()).thenReturn(new ThrowableProxy(new Throwable()));
        when(tp.getStackTraceElementProxyArray()).thenReturn(new StackTraceElementProxy[] {
            new StackTraceElementProxy(new StackTraceElement("foo", "foo", "foo", 1))
        });
        when(tp.getCommonFrames()).thenReturn(1);
        when(tp.getClassName()).thenReturn("Class Name");

        // Act
        String actualThrowableProxyToStringResult = noMessageStackTraceConverter.throwableProxyToString(tp);

        // Assert
        verify(tp, atLeast(1)).getCause();
        verify(tp).getClassName();
        verify(tp).getCommonFrames();
        verify(tp).getStackTraceElementProxyArray();
        verify(tp).getSuppressed();
        assertEquals("java.lang.Throwable\nClass Name\n", actualThrowableProxyToStringResult);
    }

    /**
     * Test {@link NoMessageStackTraceConverter#throwableProxyToString(IThrowableProxy)}.
     * <ul>
     *   <li>Then return {@code Throwable}.</li>
     * </ul>
     * <p>
     * Method under test: {@link NoMessageStackTraceConverter#throwableProxyToString(IThrowableProxy)}
     */
    @Test
    @DisplayName("Test throwableProxyToString(IThrowableProxy); then return 'java.lang.Throwable'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"String NoMessageStackTraceConverter.throwableProxyToString(IThrowableProxy)"})
    void testThrowableProxyToString_thenReturnJavaLangThrowable() {
        // Arrange, Act and Assert
        assertEquals(
                "java.lang.Throwable\n",
                noMessageStackTraceConverter.throwableProxyToString(new ThrowableProxy(new Throwable())));
    }

    /**
     * Test {@link NoMessageStackTraceConverter#recursiveAppendRootCauseFirst(StringBuilder, String, int, IThrowableProxy)}.
     * <p>
     * Method under test: {@link NoMessageStackTraceConverter#recursiveAppendRootCauseFirst(StringBuilder, String, int, IThrowableProxy)}
     */
    @Test
    @DisplayName("Test recursiveAppendRootCauseFirst(StringBuilder, String, int, IThrowableProxy)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void NoMessageStackTraceConverter.recursiveAppendRootCauseFirst(StringBuilder, String, int, IThrowableProxy)"
    })
    void testRecursiveAppendRootCauseFirst() {
        // Arrange
        StringBuilder sb = new StringBuilder("foo");

        // Act
        noMessageStackTraceConverter.recursiveAppendRootCauseFirst(
                sb, "Prefix", 1, new ThrowableProxy(new Throwable()));

        // Assert
        assertEquals("fooPrefixjava.lang.Throwable\n", sb.toString());
    }

    /**
     * Test {@link NoMessageStackTraceConverter#recursiveAppendRootCauseFirst(StringBuilder, String, int, IThrowableProxy)}.
     * <p>
     * Method under test: {@link NoMessageStackTraceConverter#recursiveAppendRootCauseFirst(StringBuilder, String, int, IThrowableProxy)}
     */
    @Test
    @DisplayName("Test recursiveAppendRootCauseFirst(StringBuilder, String, int, IThrowableProxy)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void NoMessageStackTraceConverter.recursiveAppendRootCauseFirst(StringBuilder, String, int, IThrowableProxy)"
    })
    void testRecursiveAppendRootCauseFirst2() {
        // Arrange
        StringBuilder sb = new StringBuilder("foo");
        ThrowableProxy tp = mock(ThrowableProxy.class);
        when(tp.getSuppressed()).thenReturn(new IThrowableProxy[] {new ThrowableProxy(new Throwable())});
        when(tp.getCause()).thenReturn(new ThrowableProxy(new Throwable()));
        when(tp.getStackTraceElementProxyArray()).thenReturn(new StackTraceElementProxy[] {
            new StackTraceElementProxy(new StackTraceElement("foo", "foo", "foo", 1))
        });
        when(tp.getCommonFrames()).thenReturn(1);
        when(tp.getClassName()).thenReturn("Class Name");

        // Act
        noMessageStackTraceConverter.recursiveAppendRootCauseFirst(sb, "Prefix", 1, tp);

        // Assert
        verify(tp, atLeast(1)).getCause();
        verify(tp).getClassName();
        verify(tp).getCommonFrames();
        verify(tp).getStackTraceElementProxyArray();
        verify(tp).getSuppressed();
        assertEquals("fooPrefixjava.lang.Throwable\nClass Name\n\tSuppressed: java.lang.Throwable\n", sb.toString());
    }

    /**
     * Test {@link NoMessageStackTraceConverter#recursiveAppendRootCauseFirst(StringBuilder, String, int, IThrowableProxy)}.
     * <p>
     * Method under test: {@link NoMessageStackTraceConverter#recursiveAppendRootCauseFirst(StringBuilder, String, int, IThrowableProxy)}
     */
    @Test
    @DisplayName("Test recursiveAppendRootCauseFirst(StringBuilder, String, int, IThrowableProxy)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void NoMessageStackTraceConverter.recursiveAppendRootCauseFirst(StringBuilder, String, int, IThrowableProxy)"
    })
    void testRecursiveAppendRootCauseFirst3() {
        // Arrange
        StringBuilder sb = new StringBuilder("foo");
        ThrowableProxy tp = mock(ThrowableProxy.class);
        when(tp.getSuppressed()).thenReturn(null);
        when(tp.getCause()).thenReturn(new ThrowableProxy(new Throwable()));
        when(tp.getStackTraceElementProxyArray()).thenReturn(new StackTraceElementProxy[] {
            new StackTraceElementProxy(new StackTraceElement("foo", "foo", "foo", 1))
        });
        when(tp.getCommonFrames()).thenReturn(1);
        when(tp.getClassName()).thenReturn("Class Name");

        // Act
        noMessageStackTraceConverter.recursiveAppendRootCauseFirst(sb, "Prefix", 1, tp);

        // Assert
        verify(tp, atLeast(1)).getCause();
        verify(tp).getClassName();
        verify(tp).getCommonFrames();
        verify(tp).getStackTraceElementProxyArray();
        verify(tp).getSuppressed();
        assertEquals("fooPrefixjava.lang.Throwable\nClass Name\n", sb.toString());
    }

    /**
     * Test new {@link NoMessageStackTraceConverter} (default constructor).
     * <p>
     * Method under test: default or parameterless constructor of {@link NoMessageStackTraceConverter}
     */
    @Test
    @DisplayName("Test new NoMessageStackTraceConverter (default constructor)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void NoMessageStackTraceConverter.<init>()"})
    void testNewNoMessageStackTraceConverter() {
        // Arrange and Act
        NoMessageStackTraceConverter actualNoMessageStackTraceConverter = new NoMessageStackTraceConverter();

        // Assert
        assertNull(actualNoMessageStackTraceConverter.getContext());
        assertNull(actualNoMessageStackTraceConverter.getNext());
        assertNull(actualNoMessageStackTraceConverter.getFormattingInfo());
        assertNull(actualNoMessageStackTraceConverter.getFirstOption());
        assertFalse(actualNoMessageStackTraceConverter.isStarted());
    }
}
