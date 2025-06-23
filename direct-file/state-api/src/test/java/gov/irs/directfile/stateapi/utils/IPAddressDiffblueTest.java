package gov.irs.directfile.stateapi.utils;

import com.diffblue.cover.annotations.MethodsUnderTest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class IPAddressDiffblueTest {
    /**
     * Test {@link IPAddress#getClientIpAddress(HttpServletRequest)}.
     * <ul>
     *   <li>Given empty string.</li>
     *   <li>Then return {@code 42 Main St}.</li>
     * </ul>
     * <p>
     * Method under test: {@link IPAddress#getClientIpAddress(HttpServletRequest)}
     */
    @Test
    @DisplayName("Test getClientIpAddress(HttpServletRequest); given empty string; then return '42 Main St'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"String IPAddress.getClientIpAddress(HttpServletRequest)"})
    void testGetClientIpAddress_givenEmptyString_thenReturn42MainSt() {
        // Arrange
        HttpServletRequestWrapper request = mock(HttpServletRequestWrapper.class);
        when(request.getRemoteAddr()).thenReturn("42 Main St");
        when(request.getHeader(Mockito.<String>any())).thenReturn("");

        // Act
        String actualClientIpAddress = IPAddress.getClientIpAddress(request);

        // Assert
        verify(request).getRemoteAddr();
        verify(request).getHeader(eq("X-Forwarded-For"));
        assertEquals("42 Main St", actualClientIpAddress);
    }

    /**
     * Test {@link IPAddress#getClientIpAddress(HttpServletRequest)}.
     * <ul>
     *   <li>Then return {@code https://example.org/example}.</li>
     * </ul>
     * <p>
     * Method under test: {@link IPAddress#getClientIpAddress(HttpServletRequest)}
     */
    @Test
    @DisplayName("Test getClientIpAddress(HttpServletRequest); then return 'https://example.org/example'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"String IPAddress.getClientIpAddress(HttpServletRequest)"})
    void testGetClientIpAddress_thenReturnHttpsExampleOrgExample() {
        // Arrange
        HttpServletRequestWrapper request = mock(HttpServletRequestWrapper.class);
        when(request.getHeader(Mockito.<String>any())).thenReturn("https://example.org/example");

        // Act
        String actualClientIpAddress = IPAddress.getClientIpAddress(request);

        // Assert
        verify(request).getHeader(eq("X-Forwarded-For"));
        assertEquals("https://example.org/example", actualClientIpAddress);
    }
}
