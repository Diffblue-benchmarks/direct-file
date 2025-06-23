package gov.irs.directfile.stateapi.dto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import gov.irs.directfile.stateapi.model.StateLanguage;
import gov.irs.directfile.stateapi.model.StateProfile;
import gov.irs.directfile.stateapi.model.StateRedirect;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StateProfileDTODiffblueTest {
    /**
     * Test {@link StateProfileDTO#StateProfileDTO(StateProfile, List, List)}.
     * <ul>
     *   <li>Given {@link StateRedirect} (default constructor) Id is two.</li>
     *   <li>Then return redirectUrls size is two.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateProfileDTO#StateProfileDTO(StateProfile, List, List)}
     */
    @Test
    @DisplayName(
            "Test new StateProfileDTO(StateProfile, List, List); given StateRedirect (default constructor) Id is two; then return redirectUrls size is two")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void StateProfileDTO.<init>(StateProfile, List, List)"})
    void testNewStateProfileDTO_givenStateRedirectIdIsTwo_thenReturnRedirectUrlsSizeIsTwo() {
        // Arrange
        StateProfile stateProfile = new StateProfile();
        stateProfile.setAcceptedOnly(true);
        stateProfile.setAccountId("42");
        stateProfile.setArchived(true);
        stateProfile.setCertExpirationDate(
                OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC));
        stateProfile.setCertLocation("Cert Location");
        stateProfile.setCustomFilingDeadline("Custom Filing Deadline");
        stateProfile.setDefaultRedirectUrl("https://example.org/example");
        stateProfile.setDepartmentOfRevenueUrl("https://example.org/example");
        stateProfile.setFilingRequirementsUrl("https://example.org/example");
        stateProfile.setId(1L);
        stateProfile.setLandingUrl("https://example.org/example");
        stateProfile.setStateCode("MD");
        stateProfile.setTaxSystemName("Tax System Name");
        stateProfile.setTransferCancelUrl("https://example.org/example");
        stateProfile.setWaitingForAcceptanceCancelUrl("https://example.org/example");

        StateRedirect stateRedirect = new StateRedirect();
        stateRedirect.setCreatedAt(
                LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        stateRedirect.setExpiresAt(
                LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        stateRedirect.setId(1L);
        stateRedirect.setRedirectUrl("https://example.org/example");
        stateRedirect.setStateProfileId(1L);

        StateRedirect stateRedirect2 = new StateRedirect();
        stateRedirect2.setCreatedAt(
                LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        stateRedirect2.setExpiresAt(
                LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        stateRedirect2.setId(2L);
        stateRedirect2.setRedirectUrl("Redirect Url");
        stateRedirect2.setStateProfileId(2L);

        ArrayList<StateRedirect> stateRedirects = new ArrayList<>();
        stateRedirects.add(stateRedirect2);
        stateRedirects.add(stateRedirect);

        // Act
        StateProfileDTO actualStateProfileDTO = new StateProfileDTO(stateProfile, stateRedirects, new ArrayList<>());

        // Assert
        List<String> redirectUrlsResult = actualStateProfileDTO.redirectUrls();
        assertEquals(2, redirectUrlsResult.size());
        assertEquals("Redirect Url", redirectUrlsResult.get(0));
        assertEquals("https://example.org/example", redirectUrlsResult.get(1));
        assertTrue(actualStateProfileDTO.languages().isEmpty());
    }

    /**
     * Test {@link StateProfileDTO#StateProfileDTO(StateProfile)}.
     * <ul>
     *   <li>Then return {@code Custom Filing Deadline}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateProfileDTO#StateProfileDTO(StateProfile)}
     */
    @Test
    @DisplayName("Test new StateProfileDTO(StateProfile); then return 'Custom Filing Deadline'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void StateProfileDTO.<init>(StateProfile)"})
    void testNewStateProfileDTO_thenReturnCustomFilingDeadline() {
        // Arrange
        StateProfile stateProfile = new StateProfile();
        stateProfile.setAcceptedOnly(true);
        stateProfile.setAccountId("42");
        stateProfile.setArchived(true);
        stateProfile.setCertExpirationDate(
                OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC));
        stateProfile.setCertLocation("Cert Location");
        stateProfile.setCustomFilingDeadline("Custom Filing Deadline");
        stateProfile.setDefaultRedirectUrl("https://example.org/example");
        stateProfile.setDepartmentOfRevenueUrl("https://example.org/example");
        stateProfile.setFilingRequirementsUrl("https://example.org/example");
        stateProfile.setId(1L);
        stateProfile.setLandingUrl("https://example.org/example");
        stateProfile.setStateCode("MD");
        stateProfile.setTaxSystemName("Tax System Name");
        stateProfile.setTransferCancelUrl("https://example.org/example");
        stateProfile.setWaitingForAcceptanceCancelUrl("https://example.org/example");

        // Act
        StateProfileDTO actualStateProfileDTO = new StateProfileDTO(stateProfile);

        // Assert
        assertEquals("Custom Filing Deadline", actualStateProfileDTO.customFilingDeadline());
        assertEquals("MD", actualStateProfileDTO.stateCode());
        assertEquals("Tax System Name", actualStateProfileDTO.taxSystemName());
        assertEquals("https://example.org/example", actualStateProfileDTO.defaultRedirectUrl());
        assertEquals("https://example.org/example", actualStateProfileDTO.departmentOfRevenueUrl());
        assertEquals("https://example.org/example", actualStateProfileDTO.filingRequirementsUrl());
        assertEquals("https://example.org/example", actualStateProfileDTO.landingUrl());
        assertEquals("https://example.org/example", actualStateProfileDTO.transferCancelUrl());
        assertEquals("https://example.org/example", actualStateProfileDTO.waitingForAcceptanceCancelUrl());
        assertTrue(actualStateProfileDTO.acceptedOnly());
        assertTrue(actualStateProfileDTO.archived());
        assertTrue(actualStateProfileDTO.redirectUrls().isEmpty());
        assertTrue(actualStateProfileDTO.languages().isEmpty());
    }

    /**
     * Test {@link StateProfileDTO#StateProfileDTO(StateProfile, List, List)}.
     * <ul>
     *   <li>Then return {@code Custom Filing Deadline}.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateProfileDTO#StateProfileDTO(StateProfile, List, List)}
     */
    @Test
    @DisplayName("Test new StateProfileDTO(StateProfile, List, List); then return 'Custom Filing Deadline'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void StateProfileDTO.<init>(StateProfile, List, List)"})
    void testNewStateProfileDTO_thenReturnCustomFilingDeadline2() {
        // Arrange
        StateProfile stateProfile = new StateProfile();
        stateProfile.setAcceptedOnly(true);
        stateProfile.setAccountId("42");
        stateProfile.setArchived(true);
        stateProfile.setCertExpirationDate(
                OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC));
        stateProfile.setCertLocation("Cert Location");
        stateProfile.setCustomFilingDeadline("Custom Filing Deadline");
        stateProfile.setDefaultRedirectUrl("https://example.org/example");
        stateProfile.setDepartmentOfRevenueUrl("https://example.org/example");
        stateProfile.setFilingRequirementsUrl("https://example.org/example");
        stateProfile.setId(1L);
        stateProfile.setLandingUrl("https://example.org/example");
        stateProfile.setStateCode("MD");
        stateProfile.setTaxSystemName("Tax System Name");
        stateProfile.setTransferCancelUrl("https://example.org/example");
        stateProfile.setWaitingForAcceptanceCancelUrl("https://example.org/example");
        ArrayList<StateRedirect> stateRedirects = new ArrayList<>();

        // Act
        StateProfileDTO actualStateProfileDTO = new StateProfileDTO(stateProfile, stateRedirects, new ArrayList<>());

        // Assert
        assertEquals("Custom Filing Deadline", actualStateProfileDTO.customFilingDeadline());
        assertEquals("MD", actualStateProfileDTO.stateCode());
        assertEquals("Tax System Name", actualStateProfileDTO.taxSystemName());
        assertEquals("https://example.org/example", actualStateProfileDTO.defaultRedirectUrl());
        assertEquals("https://example.org/example", actualStateProfileDTO.departmentOfRevenueUrl());
        assertEquals("https://example.org/example", actualStateProfileDTO.filingRequirementsUrl());
        assertEquals("https://example.org/example", actualStateProfileDTO.landingUrl());
        assertEquals("https://example.org/example", actualStateProfileDTO.transferCancelUrl());
        assertEquals("https://example.org/example", actualStateProfileDTO.waitingForAcceptanceCancelUrl());
        assertTrue(actualStateProfileDTO.acceptedOnly());
        assertTrue(actualStateProfileDTO.archived());
        assertTrue(actualStateProfileDTO.redirectUrls().isEmpty());
        assertTrue(actualStateProfileDTO.languages().isEmpty());
    }

    /**
     * Test {@link StateProfileDTO#StateProfileDTO(StateProfile, List, List)}.
     * <ul>
     *   <li>Then return languages size is one.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateProfileDTO#StateProfileDTO(StateProfile, List, List)}
     */
    @Test
    @DisplayName("Test new StateProfileDTO(StateProfile, List, List); then return languages size is one")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void StateProfileDTO.<init>(StateProfile, List, List)"})
    void testNewStateProfileDTO_thenReturnLanguagesSizeIsOne() {
        // Arrange
        StateProfile stateProfile = new StateProfile();
        stateProfile.setAcceptedOnly(true);
        stateProfile.setAccountId("42");
        stateProfile.setArchived(true);
        stateProfile.setCertExpirationDate(
                OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC));
        stateProfile.setCertLocation("Cert Location");
        stateProfile.setCustomFilingDeadline("Custom Filing Deadline");
        stateProfile.setDefaultRedirectUrl("https://example.org/example");
        stateProfile.setDepartmentOfRevenueUrl("https://example.org/example");
        stateProfile.setFilingRequirementsUrl("https://example.org/example");
        stateProfile.setId(1L);
        stateProfile.setLandingUrl("https://example.org/example");
        stateProfile.setStateCode("MD");
        stateProfile.setTaxSystemName("Tax System Name");
        stateProfile.setTransferCancelUrl("https://example.org/example");
        stateProfile.setWaitingForAcceptanceCancelUrl("https://example.org/example");
        ArrayList<StateRedirect> stateRedirects = new ArrayList<>();

        StateLanguage stateLanguage = new StateLanguage();
        stateLanguage.setDfLanguageCode("en");
        stateLanguage.setId(1L);
        stateLanguage.setStateLanguageCode("MD");
        stateLanguage.setStateProfileId(1L);

        ArrayList<StateLanguage> stateLanguages = new ArrayList<>();
        stateLanguages.add(stateLanguage);

        // Act
        StateProfileDTO actualStateProfileDTO = new StateProfileDTO(stateProfile, stateRedirects, stateLanguages);

        // Assert
        assertEquals("Custom Filing Deadline", actualStateProfileDTO.customFilingDeadline());
        assertEquals("MD", actualStateProfileDTO.stateCode());
        assertEquals("Tax System Name", actualStateProfileDTO.taxSystemName());
        assertEquals("https://example.org/example", actualStateProfileDTO.defaultRedirectUrl());
        assertEquals("https://example.org/example", actualStateProfileDTO.departmentOfRevenueUrl());
        assertEquals("https://example.org/example", actualStateProfileDTO.filingRequirementsUrl());
        assertEquals("https://example.org/example", actualStateProfileDTO.landingUrl());
        assertEquals("https://example.org/example", actualStateProfileDTO.transferCancelUrl());
        assertEquals("https://example.org/example", actualStateProfileDTO.waitingForAcceptanceCancelUrl());
        Map<String, String> languagesResult = actualStateProfileDTO.languages();
        assertEquals(1, languagesResult.size());
        assertTrue(actualStateProfileDTO.acceptedOnly());
        assertTrue(actualStateProfileDTO.archived());
        assertTrue(actualStateProfileDTO.redirectUrls().isEmpty());
        assertTrue(languagesResult.containsKey("en"));
    }

    /**
     * Test {@link StateProfileDTO#StateProfileDTO(StateProfile, List, List)}.
     * <ul>
     *   <li>Then return languages size is two.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateProfileDTO#StateProfileDTO(StateProfile, List, List)}
     */
    @Test
    @DisplayName("Test new StateProfileDTO(StateProfile, List, List); then return languages size is two")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void StateProfileDTO.<init>(StateProfile, List, List)"})
    void testNewStateProfileDTO_thenReturnLanguagesSizeIsTwo() {
        // Arrange
        StateProfile stateProfile = new StateProfile();
        stateProfile.setAcceptedOnly(true);
        stateProfile.setAccountId("42");
        stateProfile.setArchived(true);
        stateProfile.setCertExpirationDate(
                OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC));
        stateProfile.setCertLocation("Cert Location");
        stateProfile.setCustomFilingDeadline("Custom Filing Deadline");
        stateProfile.setDefaultRedirectUrl("https://example.org/example");
        stateProfile.setDepartmentOfRevenueUrl("https://example.org/example");
        stateProfile.setFilingRequirementsUrl("https://example.org/example");
        stateProfile.setId(1L);
        stateProfile.setLandingUrl("https://example.org/example");
        stateProfile.setStateCode("MD");
        stateProfile.setTaxSystemName("Tax System Name");
        stateProfile.setTransferCancelUrl("https://example.org/example");
        stateProfile.setWaitingForAcceptanceCancelUrl("https://example.org/example");
        ArrayList<StateRedirect> stateRedirects = new ArrayList<>();

        StateLanguage stateLanguage = new StateLanguage();
        stateLanguage.setDfLanguageCode("en");
        stateLanguage.setId(1L);
        stateLanguage.setStateLanguageCode("MD");
        stateLanguage.setStateProfileId(1L);

        StateLanguage stateLanguage2 = new StateLanguage();
        stateLanguage2.setDfLanguageCode("eng");
        stateLanguage2.setId(2L);
        stateLanguage2.setStateLanguageCode("en");
        stateLanguage2.setStateProfileId(2L);

        ArrayList<StateLanguage> stateLanguages = new ArrayList<>();
        stateLanguages.add(stateLanguage2);
        stateLanguages.add(stateLanguage);

        // Act
        StateProfileDTO actualStateProfileDTO = new StateProfileDTO(stateProfile, stateRedirects, stateLanguages);

        // Assert
        Map<String, String> languagesResult = actualStateProfileDTO.languages();
        assertEquals(2, languagesResult.size());
        assertEquals("MD", languagesResult.get("en"));
        assertEquals("en", languagesResult.get("eng"));
        assertTrue(actualStateProfileDTO.redirectUrls().isEmpty());
    }

    /**
     * Test {@link StateProfileDTO#StateProfileDTO(StateProfile, List, List)}.
     * <ul>
     *   <li>Then return redirectUrls size is one.</li>
     * </ul>
     * <p>
     * Method under test: {@link StateProfileDTO#StateProfileDTO(StateProfile, List, List)}
     */
    @Test
    @DisplayName("Test new StateProfileDTO(StateProfile, List, List); then return redirectUrls size is one")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void StateProfileDTO.<init>(StateProfile, List, List)"})
    void testNewStateProfileDTO_thenReturnRedirectUrlsSizeIsOne() {
        // Arrange
        StateProfile stateProfile = new StateProfile();
        stateProfile.setAcceptedOnly(true);
        stateProfile.setAccountId("42");
        stateProfile.setArchived(true);
        stateProfile.setCertExpirationDate(
                OffsetDateTime.of(LocalDate.of(1970, 1, 1), LocalTime.MIDNIGHT, ZoneOffset.UTC));
        stateProfile.setCertLocation("Cert Location");
        stateProfile.setCustomFilingDeadline("Custom Filing Deadline");
        stateProfile.setDefaultRedirectUrl("https://example.org/example");
        stateProfile.setDepartmentOfRevenueUrl("https://example.org/example");
        stateProfile.setFilingRequirementsUrl("https://example.org/example");
        stateProfile.setId(1L);
        stateProfile.setLandingUrl("https://example.org/example");
        stateProfile.setStateCode("MD");
        stateProfile.setTaxSystemName("Tax System Name");
        stateProfile.setTransferCancelUrl("https://example.org/example");
        stateProfile.setWaitingForAcceptanceCancelUrl("https://example.org/example");

        StateRedirect stateRedirect = new StateRedirect();
        stateRedirect.setCreatedAt(
                LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        stateRedirect.setExpiresAt(
                LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        stateRedirect.setId(1L);
        stateRedirect.setRedirectUrl("https://example.org/example");
        stateRedirect.setStateProfileId(1L);

        ArrayList<StateRedirect> stateRedirects = new ArrayList<>();
        stateRedirects.add(stateRedirect);

        // Act
        StateProfileDTO actualStateProfileDTO = new StateProfileDTO(stateProfile, stateRedirects, new ArrayList<>());

        // Assert
        assertEquals("Custom Filing Deadline", actualStateProfileDTO.customFilingDeadline());
        assertEquals("MD", actualStateProfileDTO.stateCode());
        assertEquals("Tax System Name", actualStateProfileDTO.taxSystemName());
        assertEquals("https://example.org/example", actualStateProfileDTO.defaultRedirectUrl());
        assertEquals("https://example.org/example", actualStateProfileDTO.departmentOfRevenueUrl());
        assertEquals("https://example.org/example", actualStateProfileDTO.filingRequirementsUrl());
        assertEquals("https://example.org/example", actualStateProfileDTO.landingUrl());
        assertEquals("https://example.org/example", actualStateProfileDTO.transferCancelUrl());
        assertEquals("https://example.org/example", actualStateProfileDTO.waitingForAcceptanceCancelUrl());
        assertEquals(1, actualStateProfileDTO.redirectUrls().size());
        assertTrue(actualStateProfileDTO.acceptedOnly());
        assertTrue(actualStateProfileDTO.archived());
        assertTrue(actualStateProfileDTO.languages().isEmpty());
    }
}
