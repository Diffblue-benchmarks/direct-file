package gov.irs.directfile.stateapi.audit;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import gov.irs.directfile.stateapi.events.Event;
import gov.irs.directfile.stateapi.events.EventDetail;
import gov.irs.directfile.stateapi.events.EventId;
import gov.irs.directfile.stateapi.events.EventStatus;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ContextConfiguration(classes = {AuditService.class})
@ExtendWith(SpringExtension.class)
class AuditServiceDiffblueTest {
    @Autowired
    private AuditService auditService;

    /**
     * Test {@link AuditService#logEvent(Event)}.
     * <ul>
     *   <li>Given {@code FAILURE}.</li>
     *   <li>When {@link Event} {@link Event#getEventStatus()} return {@code FAILURE}.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuditService#logEvent(Event)}
     */
    @Test
    @DisplayName("Test logEvent(Event); given 'FAILURE'; when Event getEventStatus() return 'FAILURE'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void AuditService.logEvent(Event)"})
    void testLogEvent_givenFailure_whenEventGetEventStatusReturnFailure() {
        // Arrange
        Event event = mock(Event.class);
        when(event.getDetail()).thenReturn(new EventDetail());
        when(event.getEventId()).thenReturn(EventId.CREATE_AUTHORIZATION_CODE);
        when(event.getEventStatus()).thenReturn(EventStatus.FAILURE);
        when(event.getEventErrorMessage()).thenReturn("An error occurred");
        when(event.getResponseStatusCode()).thenReturn("Response Status Code");
        when(event.getStateId()).thenReturn("MD");
        when(event.getTaxPeriod()).thenReturn("Tax Period");
        when(event.getTaxReturnId()).thenReturn("42");
        when(event.getUserType()).thenReturn("User Type");

        // Act
        auditService.logEvent(event);

        // Assert
        verify(event, atLeast(1)).getDetail();
        verify(event, atLeast(1)).getEventErrorMessage();
        verify(event, atLeast(1)).getEventId();
        verify(event, atLeast(1)).getEventStatus();
        verify(event, atLeast(1)).getResponseStatusCode();
        verify(event, atLeast(1)).getStateId();
        verify(event, atLeast(1)).getTaxPeriod();
        verify(event, atLeast(1)).getTaxReturnId();
        verify(event, atLeast(1)).getUserType();
    }

    /**
     * Test {@link AuditService#logEvent(Event)}.
     * <ul>
     *   <li>Given {@code null}.</li>
     *   <li>When {@link Event} {@link Event#getDetail()} return {@code null}.</li>
     *   <li>Then calls {@link Event#getDetail()}.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuditService#logEvent(Event)}
     */
    @Test
    @DisplayName("Test logEvent(Event); given 'null'; when Event getDetail() return 'null'; then calls getDetail()")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void AuditService.logEvent(Event)"})
    void testLogEvent_givenNull_whenEventGetDetailReturnNull_thenCallsGetDetail() {
        // Arrange
        Event event = mock(Event.class);
        when(event.getDetail()).thenReturn(null);
        when(event.getEventId()).thenReturn(EventId.CREATE_AUTHORIZATION_CODE);
        when(event.getEventStatus()).thenReturn(EventStatus.SUCCESS);
        when(event.getEventErrorMessage()).thenReturn("An error occurred");
        when(event.getResponseStatusCode()).thenReturn("Response Status Code");
        when(event.getStateId()).thenReturn("MD");
        when(event.getTaxPeriod()).thenReturn("Tax Period");
        when(event.getTaxReturnId()).thenReturn("42");
        when(event.getUserType()).thenReturn("User Type");

        // Act
        auditService.logEvent(event);

        // Assert
        verify(event).getDetail();
        verify(event, atLeast(1)).getEventErrorMessage();
        verify(event, atLeast(1)).getEventId();
        verify(event, atLeast(1)).getEventStatus();
        verify(event, atLeast(1)).getResponseStatusCode();
        verify(event, atLeast(1)).getStateId();
        verify(event, atLeast(1)).getTaxPeriod();
        verify(event, atLeast(1)).getTaxReturnId();
        verify(event, atLeast(1)).getUserType();
    }

    /**
     * Test {@link AuditService#logEvent(Event)}.
     * <ul>
     *   <li>Given {@code null}.</li>
     *   <li>When {@link Event} {@link Event#getEventId()} return {@code null}.</li>
     *   <li>Then calls {@link Event#getDetail()}.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuditService#logEvent(Event)}
     */
    @Test
    @DisplayName("Test logEvent(Event); given 'null'; when Event getEventId() return 'null'; then calls getDetail()")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void AuditService.logEvent(Event)"})
    void testLogEvent_givenNull_whenEventGetEventIdReturnNull_thenCallsGetDetail() {
        // Arrange
        Event event = mock(Event.class);
        when(event.getDetail()).thenReturn(new EventDetail());
        when(event.getEventId()).thenReturn(null);
        when(event.getEventStatus()).thenReturn(EventStatus.SUCCESS);
        when(event.getEventErrorMessage()).thenReturn("An error occurred");
        when(event.getResponseStatusCode()).thenReturn("Response Status Code");
        when(event.getStateId()).thenReturn("MD");
        when(event.getTaxPeriod()).thenReturn("Tax Period");
        when(event.getTaxReturnId()).thenReturn("42");
        when(event.getUserType()).thenReturn("User Type");

        // Act
        auditService.logEvent(event);

        // Assert
        verify(event, atLeast(1)).getDetail();
        verify(event, atLeast(1)).getEventErrorMessage();
        verify(event).getEventId();
        verify(event, atLeast(1)).getEventStatus();
        verify(event, atLeast(1)).getResponseStatusCode();
        verify(event, atLeast(1)).getStateId();
        verify(event, atLeast(1)).getTaxPeriod();
        verify(event, atLeast(1)).getTaxReturnId();
        verify(event, atLeast(1)).getUserType();
    }

    /**
     * Test {@link AuditService#logEvent(Event)}.
     * <ul>
     *   <li>Given {@code null}.</li>
     *   <li>When {@link Event} {@link Event#getEventStatus()} return {@code null}.</li>
     *   <li>Then calls {@link Event#getDetail()}.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuditService#logEvent(Event)}
     */
    @Test
    @DisplayName(
            "Test logEvent(Event); given 'null'; when Event getEventStatus() return 'null'; then calls getDetail()")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void AuditService.logEvent(Event)"})
    void testLogEvent_givenNull_whenEventGetEventStatusReturnNull_thenCallsGetDetail() {
        // Arrange
        Event event = mock(Event.class);
        when(event.getDetail()).thenReturn(new EventDetail());
        when(event.getEventId()).thenReturn(EventId.CREATE_AUTHORIZATION_CODE);
        when(event.getEventStatus()).thenReturn(null);
        when(event.getEventErrorMessage()).thenReturn("An error occurred");
        when(event.getResponseStatusCode()).thenReturn("Response Status Code");
        when(event.getStateId()).thenReturn("MD");
        when(event.getTaxPeriod()).thenReturn("Tax Period");
        when(event.getTaxReturnId()).thenReturn("42");
        when(event.getUserType()).thenReturn("User Type");

        // Act
        auditService.logEvent(event);

        // Assert
        verify(event, atLeast(1)).getDetail();
        verify(event, atLeast(1)).getEventErrorMessage();
        verify(event, atLeast(1)).getEventId();
        verify(event, atLeast(1)).getEventStatus();
        verify(event, atLeast(1)).getResponseStatusCode();
        verify(event, atLeast(1)).getStateId();
        verify(event, atLeast(1)).getTaxPeriod();
        verify(event, atLeast(1)).getTaxReturnId();
        verify(event, atLeast(1)).getUserType();
    }

    /**
     * Test {@link AuditService#logEvent(Event)}.
     * <ul>
     *   <li>Given {@code SUCCESS}.</li>
     *   <li>When {@link Event} {@link Event#getEventErrorMessage()} return {@code null}.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuditService#logEvent(Event)}
     */
    @Test
    @DisplayName("Test logEvent(Event); given 'SUCCESS'; when Event getEventErrorMessage() return 'null'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void AuditService.logEvent(Event)"})
    void testLogEvent_givenSuccess_whenEventGetEventErrorMessageReturnNull() {
        // Arrange
        Event event = mock(Event.class);
        when(event.getDetail()).thenReturn(new EventDetail());
        when(event.getEventId()).thenReturn(EventId.CREATE_AUTHORIZATION_CODE);
        when(event.getEventStatus()).thenReturn(EventStatus.SUCCESS);
        when(event.getEventErrorMessage()).thenReturn(null);
        when(event.getResponseStatusCode()).thenReturn("Response Status Code");
        when(event.getStateId()).thenReturn("MD");
        when(event.getTaxPeriod()).thenReturn("Tax Period");
        when(event.getTaxReturnId()).thenReturn("42");
        when(event.getUserType()).thenReturn("User Type");

        // Act
        auditService.logEvent(event);

        // Assert
        verify(event, atLeast(1)).getDetail();
        verify(event).getEventErrorMessage();
        verify(event, atLeast(1)).getEventId();
        verify(event, atLeast(1)).getEventStatus();
        verify(event, atLeast(1)).getResponseStatusCode();
        verify(event, atLeast(1)).getStateId();
        verify(event, atLeast(1)).getTaxPeriod();
        verify(event, atLeast(1)).getTaxReturnId();
        verify(event, atLeast(1)).getUserType();
    }

    /**
     * Test {@link AuditService#logEvent(Event)}.
     * <ul>
     *   <li>Given {@code SUCCESS}.</li>
     *   <li>When {@link Event} {@link Event#getEventStatus()} return {@code SUCCESS}.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuditService#logEvent(Event)}
     */
    @Test
    @DisplayName("Test logEvent(Event); given 'SUCCESS'; when Event getEventStatus() return 'SUCCESS'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void AuditService.logEvent(Event)"})
    void testLogEvent_givenSuccess_whenEventGetEventStatusReturnSuccess() {
        // Arrange
        Event event = mock(Event.class);
        when(event.getDetail()).thenReturn(new EventDetail());
        when(event.getEventId()).thenReturn(EventId.CREATE_AUTHORIZATION_CODE);
        when(event.getEventStatus()).thenReturn(EventStatus.SUCCESS);
        when(event.getEventErrorMessage()).thenReturn("An error occurred");
        when(event.getResponseStatusCode()).thenReturn("Response Status Code");
        when(event.getStateId()).thenReturn("MD");
        when(event.getTaxPeriod()).thenReturn("Tax Period");
        when(event.getTaxReturnId()).thenReturn("42");
        when(event.getUserType()).thenReturn("User Type");

        // Act
        auditService.logEvent(event);

        // Assert
        verify(event, atLeast(1)).getDetail();
        verify(event, atLeast(1)).getEventErrorMessage();
        verify(event, atLeast(1)).getEventId();
        verify(event, atLeast(1)).getEventStatus();
        verify(event, atLeast(1)).getResponseStatusCode();
        verify(event, atLeast(1)).getStateId();
        verify(event, atLeast(1)).getTaxPeriod();
        verify(event, atLeast(1)).getTaxReturnId();
        verify(event, atLeast(1)).getUserType();
    }

    /**
     * Test {@link AuditService#logEvent(Event)}.
     * <ul>
     *   <li>Given {@code SUCCESS}.</li>
     *   <li>When {@link Event} {@link Event#getResponseStatusCode()} return {@code null}.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuditService#logEvent(Event)}
     */
    @Test
    @DisplayName("Test logEvent(Event); given 'SUCCESS'; when Event getResponseStatusCode() return 'null'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void AuditService.logEvent(Event)"})
    void testLogEvent_givenSuccess_whenEventGetResponseStatusCodeReturnNull() {
        // Arrange
        Event event = mock(Event.class);
        when(event.getDetail()).thenReturn(new EventDetail());
        when(event.getEventId()).thenReturn(EventId.CREATE_AUTHORIZATION_CODE);
        when(event.getEventStatus()).thenReturn(EventStatus.SUCCESS);
        when(event.getEventErrorMessage()).thenReturn("An error occurred");
        when(event.getResponseStatusCode()).thenReturn(null);
        when(event.getStateId()).thenReturn("MD");
        when(event.getTaxPeriod()).thenReturn("Tax Period");
        when(event.getTaxReturnId()).thenReturn("42");
        when(event.getUserType()).thenReturn("User Type");

        // Act
        auditService.logEvent(event);

        // Assert
        verify(event, atLeast(1)).getDetail();
        verify(event, atLeast(1)).getEventErrorMessage();
        verify(event, atLeast(1)).getEventId();
        verify(event, atLeast(1)).getEventStatus();
        verify(event).getResponseStatusCode();
        verify(event, atLeast(1)).getStateId();
        verify(event, atLeast(1)).getTaxPeriod();
        verify(event, atLeast(1)).getTaxReturnId();
        verify(event, atLeast(1)).getUserType();
    }

    /**
     * Test {@link AuditService#logEvent(Event)}.
     * <ul>
     *   <li>Given {@code SUCCESS}.</li>
     *   <li>When {@link Event} {@link Event#getStateId()} return {@code null}.</li>
     *   <li>Then calls {@link Event#getDetail()}.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuditService#logEvent(Event)}
     */
    @Test
    @DisplayName("Test logEvent(Event); given 'SUCCESS'; when Event getStateId() return 'null'; then calls getDetail()")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void AuditService.logEvent(Event)"})
    void testLogEvent_givenSuccess_whenEventGetStateIdReturnNull_thenCallsGetDetail() {
        // Arrange
        Event event = mock(Event.class);
        when(event.getDetail()).thenReturn(new EventDetail());
        when(event.getEventId()).thenReturn(EventId.CREATE_AUTHORIZATION_CODE);
        when(event.getEventStatus()).thenReturn(EventStatus.SUCCESS);
        when(event.getEventErrorMessage()).thenReturn("An error occurred");
        when(event.getResponseStatusCode()).thenReturn("Response Status Code");
        when(event.getStateId()).thenReturn(null);
        when(event.getTaxPeriod()).thenReturn("Tax Period");
        when(event.getTaxReturnId()).thenReturn("42");
        when(event.getUserType()).thenReturn("User Type");

        // Act
        auditService.logEvent(event);

        // Assert
        verify(event, atLeast(1)).getDetail();
        verify(event, atLeast(1)).getEventErrorMessage();
        verify(event, atLeast(1)).getEventId();
        verify(event, atLeast(1)).getEventStatus();
        verify(event, atLeast(1)).getResponseStatusCode();
        verify(event).getStateId();
        verify(event, atLeast(1)).getTaxPeriod();
        verify(event, atLeast(1)).getTaxReturnId();
        verify(event, atLeast(1)).getUserType();
    }

    /**
     * Test {@link AuditService#logEvent(Event)}.
     * <ul>
     *   <li>Given {@code SUCCESS}.</li>
     *   <li>When {@link Event} {@link Event#getTaxPeriod()} return {@code null}.</li>
     *   <li>Then calls {@link Event#getDetail()}.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuditService#logEvent(Event)}
     */
    @Test
    @DisplayName(
            "Test logEvent(Event); given 'SUCCESS'; when Event getTaxPeriod() return 'null'; then calls getDetail()")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void AuditService.logEvent(Event)"})
    void testLogEvent_givenSuccess_whenEventGetTaxPeriodReturnNull_thenCallsGetDetail() {
        // Arrange
        Event event = mock(Event.class);
        when(event.getDetail()).thenReturn(new EventDetail());
        when(event.getEventId()).thenReturn(EventId.CREATE_AUTHORIZATION_CODE);
        when(event.getEventStatus()).thenReturn(EventStatus.SUCCESS);
        when(event.getEventErrorMessage()).thenReturn("An error occurred");
        when(event.getResponseStatusCode()).thenReturn("Response Status Code");
        when(event.getStateId()).thenReturn("MD");
        when(event.getTaxPeriod()).thenReturn(null);
        when(event.getTaxReturnId()).thenReturn("42");
        when(event.getUserType()).thenReturn("User Type");

        // Act
        auditService.logEvent(event);

        // Assert
        verify(event, atLeast(1)).getDetail();
        verify(event, atLeast(1)).getEventErrorMessage();
        verify(event, atLeast(1)).getEventId();
        verify(event, atLeast(1)).getEventStatus();
        verify(event, atLeast(1)).getResponseStatusCode();
        verify(event, atLeast(1)).getStateId();
        verify(event).getTaxPeriod();
        verify(event, atLeast(1)).getTaxReturnId();
        verify(event, atLeast(1)).getUserType();
    }

    /**
     * Test {@link AuditService#logEvent(Event)}.
     * <ul>
     *   <li>Given {@code SUCCESS}.</li>
     *   <li>When {@link Event} {@link Event#getTaxReturnId()} return {@code null}.</li>
     *   <li>Then calls {@link Event#getDetail()}.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuditService#logEvent(Event)}
     */
    @Test
    @DisplayName(
            "Test logEvent(Event); given 'SUCCESS'; when Event getTaxReturnId() return 'null'; then calls getDetail()")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void AuditService.logEvent(Event)"})
    void testLogEvent_givenSuccess_whenEventGetTaxReturnIdReturnNull_thenCallsGetDetail() {
        // Arrange
        Event event = mock(Event.class);
        when(event.getDetail()).thenReturn(new EventDetail());
        when(event.getEventId()).thenReturn(EventId.CREATE_AUTHORIZATION_CODE);
        when(event.getEventStatus()).thenReturn(EventStatus.SUCCESS);
        when(event.getEventErrorMessage()).thenReturn("An error occurred");
        when(event.getResponseStatusCode()).thenReturn("Response Status Code");
        when(event.getStateId()).thenReturn("MD");
        when(event.getTaxPeriod()).thenReturn("Tax Period");
        when(event.getTaxReturnId()).thenReturn(null);
        when(event.getUserType()).thenReturn("User Type");

        // Act
        auditService.logEvent(event);

        // Assert
        verify(event, atLeast(1)).getDetail();
        verify(event, atLeast(1)).getEventErrorMessage();
        verify(event, atLeast(1)).getEventId();
        verify(event, atLeast(1)).getEventStatus();
        verify(event, atLeast(1)).getResponseStatusCode();
        verify(event, atLeast(1)).getStateId();
        verify(event, atLeast(1)).getTaxPeriod();
        verify(event).getTaxReturnId();
        verify(event, atLeast(1)).getUserType();
    }

    /**
     * Test {@link AuditService#logEvent(Event)}.
     * <ul>
     *   <li>Given {@code SUCCESS}.</li>
     *   <li>When {@link Event} {@link Event#getUserType()} return {@code null}.</li>
     *   <li>Then calls {@link Event#getDetail()}.</li>
     * </ul>
     * <p>
     * Method under test: {@link AuditService#logEvent(Event)}
     */
    @Test
    @DisplayName(
            "Test logEvent(Event); given 'SUCCESS'; when Event getUserType() return 'null'; then calls getDetail()")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void AuditService.logEvent(Event)"})
    void testLogEvent_givenSuccess_whenEventGetUserTypeReturnNull_thenCallsGetDetail() {
        // Arrange
        Event event = mock(Event.class);
        when(event.getDetail()).thenReturn(new EventDetail());
        when(event.getEventId()).thenReturn(EventId.CREATE_AUTHORIZATION_CODE);
        when(event.getEventStatus()).thenReturn(EventStatus.SUCCESS);
        when(event.getEventErrorMessage()).thenReturn("An error occurred");
        when(event.getResponseStatusCode()).thenReturn("Response Status Code");
        when(event.getStateId()).thenReturn("MD");
        when(event.getTaxPeriod()).thenReturn("Tax Period");
        when(event.getTaxReturnId()).thenReturn("42");
        when(event.getUserType()).thenReturn(null);

        // Act
        auditService.logEvent(event);

        // Assert
        verify(event, atLeast(1)).getDetail();
        verify(event, atLeast(1)).getEventErrorMessage();
        verify(event, atLeast(1)).getEventId();
        verify(event, atLeast(1)).getEventStatus();
        verify(event, atLeast(1)).getResponseStatusCode();
        verify(event, atLeast(1)).getStateId();
        verify(event, atLeast(1)).getTaxPeriod();
        verify(event, atLeast(1)).getTaxReturnId();
        verify(event).getUserType();
    }
}
