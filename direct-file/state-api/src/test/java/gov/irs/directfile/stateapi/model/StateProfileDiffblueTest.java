package gov.irs.directfile.stateapi.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StateProfileDiffblueTest {
    /**
     * Test getters and setters.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>default or parameterless constructor of {@link StateProfile}
     *   <li>{@link StateProfile#setAcceptedOnly(Boolean)}
     *   <li>{@link StateProfile#setAccountId(String)}
     *   <li>{@link StateProfile#setArchived(Boolean)}
     *   <li>{@link StateProfile#setCertExpirationDate(OffsetDateTime)}
     *   <li>{@link StateProfile#setCertLocation(String)}
     *   <li>{@link StateProfile#setCustomFilingDeadline(String)}
     *   <li>{@link StateProfile#setDefaultRedirectUrl(String)}
     *   <li>{@link StateProfile#setDepartmentOfRevenueUrl(String)}
     *   <li>{@link StateProfile#setFilingRequirementsUrl(String)}
     *   <li>{@link StateProfile#setId(Long)}
     *   <li>{@link StateProfile#setLandingUrl(String)}
     *   <li>{@link StateProfile#setStateCode(String)}
     *   <li>{@link StateProfile#setTaxSystemName(String)}
     *   <li>{@link StateProfile#setTransferCancelUrl(String)}
     *   <li>{@link StateProfile#setWaitingForAcceptanceCancelUrl(String)}
     *   <li>{@link StateProfile#getAcceptedOnly()}
     *   <li>{@link StateProfile#getAccountId()}
     *   <li>{@link StateProfile#getArchived()}
     *   <li>{@link StateProfile#getCertExpirationDate()}
     *   <li>{@link StateProfile#getCertLocation()}
     *   <li>{@link StateProfile#getCustomFilingDeadline()}
     *   <li>{@link StateProfile#getDefaultRedirectUrl()}
     *   <li>{@link StateProfile#getDepartmentOfRevenueUrl()}
     *   <li>{@link StateProfile#getFilingRequirementsUrl()}
     *   <li>{@link StateProfile#getId()}
     *   <li>{@link StateProfile#getLandingUrl()}
     *   <li>{@link StateProfile#getStateCode()}
     *   <li>{@link StateProfile#getTaxSystemName()}
     *   <li>{@link StateProfile#getTransferCancelUrl()}
     *   <li>{@link StateProfile#getWaitingForAcceptanceCancelUrl()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void StateProfile.<init>()",
        "Boolean StateProfile.getAcceptedOnly()",
        "String StateProfile.getAccountId()",
        "Boolean StateProfile.getArchived()",
        "OffsetDateTime StateProfile.getCertExpirationDate()",
        "String StateProfile.getCertLocation()",
        "String StateProfile.getCustomFilingDeadline()",
        "String StateProfile.getDefaultRedirectUrl()",
        "String StateProfile.getDepartmentOfRevenueUrl()",
        "String StateProfile.getFilingRequirementsUrl()",
        "Long StateProfile.getId()",
        "String StateProfile.getLandingUrl()",
        "String StateProfile.getStateCode()",
        "String StateProfile.getTaxSystemName()",
        "String StateProfile.getTransferCancelUrl()",
        "String StateProfile.getWaitingForAcceptanceCancelUrl()",
        "void StateProfile.setAcceptedOnly(Boolean)",
        "void StateProfile.setAccountId(String)",
        "void StateProfile.setArchived(Boolean)",
        "void StateProfile.setCertExpirationDate(OffsetDateTime)",
        "void StateProfile.setCertLocation(String)",
        "void StateProfile.setCustomFilingDeadline(String)",
        "void StateProfile.setDefaultRedirectUrl(String)",
        "void StateProfile.setDepartmentOfRevenueUrl(String)",
        "void StateProfile.setFilingRequirementsUrl(String)",
        "void StateProfile.setId(Long)",
        "void StateProfile.setLandingUrl(String)",
        "void StateProfile.setStateCode(String)",
        "void StateProfile.setTaxSystemName(String)",
        "void StateProfile.setTransferCancelUrl(String)",
        "void StateProfile.setWaitingForAcceptanceCancelUrl(String)"
    })
    void testGettersAndSetters() {
        // Arrange and Act
        StateProfile actualStateProfile = new StateProfile();
        actualStateProfile.setAcceptedOnly(true);
        actualStateProfile.setAccountId("42");
        actualStateProfile.setArchived(true);
        OffsetDateTime certExpirationDate =
                OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC);
        actualStateProfile.setCertExpirationDate(certExpirationDate);
        actualStateProfile.setCertLocation("Cert Location");
        actualStateProfile.setCustomFilingDeadline("Custom Filing Deadline");
        actualStateProfile.setDefaultRedirectUrl("https://example.org/example");
        actualStateProfile.setDepartmentOfRevenueUrl("https://example.org/example");
        actualStateProfile.setFilingRequirementsUrl("https://example.org/example");
        actualStateProfile.setId(1L);
        actualStateProfile.setLandingUrl("https://example.org/example");
        actualStateProfile.setStateCode("MD");
        actualStateProfile.setTaxSystemName("Tax System Name");
        actualStateProfile.setTransferCancelUrl("https://example.org/example");
        actualStateProfile.setWaitingForAcceptanceCancelUrl("https://example.org/example");
        Boolean actualAcceptedOnly = actualStateProfile.getAcceptedOnly();
        String actualAccountId = actualStateProfile.getAccountId();
        Boolean actualArchived = actualStateProfile.getArchived();
        OffsetDateTime actualCertExpirationDate = actualStateProfile.getCertExpirationDate();
        String actualCertLocation = actualStateProfile.getCertLocation();
        String actualCustomFilingDeadline = actualStateProfile.getCustomFilingDeadline();
        String actualDefaultRedirectUrl = actualStateProfile.getDefaultRedirectUrl();
        String actualDepartmentOfRevenueUrl = actualStateProfile.getDepartmentOfRevenueUrl();
        String actualFilingRequirementsUrl = actualStateProfile.getFilingRequirementsUrl();
        Long actualId = actualStateProfile.getId();
        String actualLandingUrl = actualStateProfile.getLandingUrl();
        String actualStateCode = actualStateProfile.getStateCode();
        String actualTaxSystemName = actualStateProfile.getTaxSystemName();
        String actualTransferCancelUrl = actualStateProfile.getTransferCancelUrl();

        // Assert
        assertEquals("42", actualAccountId);
        assertEquals("Cert Location", actualCertLocation);
        assertEquals("Custom Filing Deadline", actualCustomFilingDeadline);
        assertEquals("MD", actualStateCode);
        assertEquals("Tax System Name", actualTaxSystemName);
        assertEquals("https://example.org/example", actualDefaultRedirectUrl);
        assertEquals("https://example.org/example", actualDepartmentOfRevenueUrl);
        assertEquals("https://example.org/example", actualFilingRequirementsUrl);
        assertEquals("https://example.org/example", actualLandingUrl);
        assertEquals("https://example.org/example", actualTransferCancelUrl);
        assertEquals("https://example.org/example", actualStateProfile.getWaitingForAcceptanceCancelUrl());
        assertEquals(1L, actualId.longValue());
        assertTrue(actualAcceptedOnly);
        assertTrue(actualArchived);
        assertSame(certExpirationDate, actualCertExpirationDate);
    }
}
