package gov.irs.directfile.stateapi.events;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import gov.irs.directfile.stateapi.events.Event.EventBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ContextConfiguration(classes = {EventBuilder.class})
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
@ExtendWith(SpringExtension.class)
class EventDiffblueTest {
    @Autowired
    private EventBuilder eventBuilder;

    /**
     * Test EventBuilder {@link EventBuilder#build()}.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link EventBuilder#build()}
     *   <li>{@link EventBuilder#detail(EventDetail)}
     *   <li>{@link EventBuilder#eventErrorMessage(String)}
     *   <li>{@link EventBuilder#eventId(EventId)}
     *   <li>{@link EventBuilder#eventStatus(EventStatus)}
     *   <li>{@link EventBuilder#remoteAddress(String)}
     *   <li>{@link EventBuilder#responseStatusCode(String)}
     *   <li>{@link EventBuilder#stateId(String)}
     *   <li>{@link EventBuilder#taxPeriod(String)}
     *   <li>{@link EventBuilder#taxReturnId(String)}
     *   <li>{@link EventBuilder#userType(String)}
     * </ul>
     */
    @Test
    @DisplayName("Test EventBuilder build()")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void EventBuilder.<init>()",
        "Event EventBuilder.build()",
        "EventBuilder EventBuilder.detail(EventDetail)",
        "EventBuilder EventBuilder.eventErrorMessage(String)",
        "EventBuilder EventBuilder.eventId(EventId)",
        "EventBuilder EventBuilder.eventStatus(EventStatus)",
        "EventBuilder EventBuilder.remoteAddress(String)",
        "EventBuilder EventBuilder.responseStatusCode(String)",
        "EventBuilder EventBuilder.stateId(String)",
        "EventBuilder EventBuilder.taxPeriod(String)",
        "EventBuilder EventBuilder.taxReturnId(String)",
        "String EventBuilder.toString()",
        "EventBuilder EventBuilder.userType(String)"
    })
    void testEventBuilderBuild() {
        // Arrange
        EventBuilder builderResult = Event.builder();
        EventDetail detail = new EventDetail();

        // Act
        Event actualBuildResult = builderResult
                .detail(detail)
                .eventErrorMessage("An error occurred")
                .eventId(EventId.CREATE_AUTHORIZATION_CODE)
                .eventStatus(EventStatus.SUCCESS)
                .remoteAddress("42 Main St")
                .responseStatusCode("Response Status Code")
                .stateId("MD")
                .taxPeriod("Tax Period")
                .taxReturnId("42")
                .userType("User Type")
                .build();

        // Assert
        assertEquals("42 Main St", actualBuildResult.getRemoteAddress());
        assertEquals("42", actualBuildResult.getTaxReturnId());
        assertEquals("An error occurred", actualBuildResult.getEventErrorMessage());
        assertEquals("MD", actualBuildResult.getStateId());
        assertEquals("Response Status Code", actualBuildResult.getResponseStatusCode());
        assertEquals("STATE_API", actualBuildResult.getEventType());
        assertEquals("Tax Period", actualBuildResult.getTaxPeriod());
        assertEquals("User Type", actualBuildResult.getUserType());
        assertEquals(EventId.CREATE_AUTHORIZATION_CODE, actualBuildResult.getEventId());
        assertEquals(EventStatus.SUCCESS, actualBuildResult.getEventStatus());
        assertTrue(actualBuildResult.isCyberOnly());
        EventDetail detail2 = actualBuildResult.getDetail();
        assertTrue(detail2.getDetailMap().isEmpty());
        assertSame(detail, detail2);
    }

    /**
     * Test EventBuilder {@link EventBuilder#cyberOnly(boolean)}.
     * <p>
     * Method under test: {@link EventBuilder#cyberOnly(boolean)}
     */
    @Test
    @DisplayName("Test EventBuilder cyberOnly(boolean)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"EventBuilder EventBuilder.cyberOnly(boolean)"})
    void testEventBuilderCyberOnly() {
        // Arrange, Act and Assert
        assertSame(eventBuilder, eventBuilder.cyberOnly(true));
    }

    /**
     * Test EventBuilder {@link EventBuilder#eventType(String)}.
     * <p>
     * Method under test: {@link EventBuilder#eventType(String)}
     */
    @Test
    @DisplayName("Test EventBuilder eventType(String)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"EventBuilder EventBuilder.eventType(String)"})
    void testEventBuilderEventType() {
        // Arrange, Act and Assert
        assertSame(eventBuilder, eventBuilder.eventType("Event Type"));
    }

    /**
     * Test getters and setters.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>{@link Event#getDetail()}
     *   <li>{@link Event#getEventErrorMessage()}
     *   <li>{@link Event#getEventId()}
     *   <li>{@link Event#getEventStatus()}
     *   <li>{@link Event#getEventType()}
     *   <li>{@link Event#getRemoteAddress()}
     *   <li>{@link Event#getResponseStatusCode()}
     *   <li>{@link Event#getStateId()}
     *   <li>{@link Event#getTaxPeriod()}
     *   <li>{@link Event#getTaxReturnId()}
     *   <li>{@link Event#getTimestamp()}
     *   <li>{@link Event#getUserType()}
     *   <li>{@link Event#isCyberOnly()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "EventDetail Event.getDetail()",
        "String Event.getEventErrorMessage()",
        "EventId Event.getEventId()",
        "EventStatus Event.getEventStatus()",
        "String Event.getEventType()",
        "String Event.getRemoteAddress()",
        "String Event.getResponseStatusCode()",
        "String Event.getStateId()",
        "String Event.getTaxPeriod()",
        "String Event.getTaxReturnId()",
        "java.time.Instant Event.getTimestamp()",
        "String Event.getUserType()",
        "boolean Event.isCyberOnly()"
    })
    void testGettersAndSetters() {
        // Arrange
        EventBuilder builderResult = Event.builder();
        EventDetail detail = new EventDetail();
        Event buildResult = builderResult
                .detail(detail)
                .eventErrorMessage("An error occurred")
                .eventId(EventId.CREATE_AUTHORIZATION_CODE)
                .eventStatus(EventStatus.SUCCESS)
                .remoteAddress("42 Main St")
                .responseStatusCode("Response Status Code")
                .stateId("MD")
                .taxPeriod("Tax Period")
                .taxReturnId("42")
                .userType("User Type")
                .build();

        // Act
        EventDetail actualDetail = buildResult.getDetail();
        String actualEventErrorMessage = buildResult.getEventErrorMessage();
        EventId actualEventId = buildResult.getEventId();
        EventStatus actualEventStatus = buildResult.getEventStatus();
        String actualEventType = buildResult.getEventType();
        String actualRemoteAddress = buildResult.getRemoteAddress();
        String actualResponseStatusCode = buildResult.getResponseStatusCode();
        String actualStateId = buildResult.getStateId();
        String actualTaxPeriod = buildResult.getTaxPeriod();
        String actualTaxReturnId = buildResult.getTaxReturnId();
        buildResult.getTimestamp();
        String actualUserType = buildResult.getUserType();

        // Assert
        assertEquals("42 Main St", actualRemoteAddress);
        assertEquals("42", actualTaxReturnId);
        assertEquals("An error occurred", actualEventErrorMessage);
        assertEquals("MD", actualStateId);
        assertEquals("Response Status Code", actualResponseStatusCode);
        assertEquals("STATE_API", actualEventType);
        assertEquals("Tax Period", actualTaxPeriod);
        assertEquals("User Type", actualUserType);
        assertEquals(EventId.CREATE_AUTHORIZATION_CODE, actualEventId);
        assertEquals(EventStatus.SUCCESS, actualEventStatus);
        assertTrue(buildResult.isCyberOnly());
        assertTrue(actualDetail.getDetailMap().isEmpty());
        assertSame(detail, actualDetail);
    }

    /**
     * Test {@link Event#Event(EventStatus, EventId, String, String, String, String, String, String, String, EventDetail, String, boolean)}.
     * <p>
     * Method under test: {@link Event#Event(EventStatus, EventId, String, String, String, String, String, String, String, EventDetail, String, boolean)}
     */
    @Test
    @DisplayName(
            "Test new Event(EventStatus, EventId, String, String, String, String, String, String, String, EventDetail, String, boolean)")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void Event.<init>(EventStatus, EventId, String, String, String, String, String, String, String, EventDetail, String, boolean)"
    })
    void testNewEvent() {
        // Arrange
        EventDetail detail = new EventDetail();

        // Act
        Event actualEvent = new Event(
                EventStatus.SUCCESS,
                EventId.CREATE_AUTHORIZATION_CODE,
                "Response Status Code",
                "Tax Period",
                "User Type",
                "42 Main St",
                "MD",
                "42",
                "An error occurred",
                detail,
                "Event Type",
                true);

        // Assert
        assertEquals("42 Main St", actualEvent.getRemoteAddress());
        assertEquals("42", actualEvent.getTaxReturnId());
        assertEquals("An error occurred", actualEvent.getEventErrorMessage());
        assertEquals("Event Type", actualEvent.getEventType());
        assertEquals("MD", actualEvent.getStateId());
        assertEquals("Response Status Code", actualEvent.getResponseStatusCode());
        assertEquals("Tax Period", actualEvent.getTaxPeriod());
        assertEquals("User Type", actualEvent.getUserType());
        assertEquals(EventId.CREATE_AUTHORIZATION_CODE, actualEvent.getEventId());
        assertEquals(EventStatus.SUCCESS, actualEvent.getEventStatus());
        assertTrue(actualEvent.isCyberOnly());
        assertSame(detail, actualEvent.getDetail());
    }
}
