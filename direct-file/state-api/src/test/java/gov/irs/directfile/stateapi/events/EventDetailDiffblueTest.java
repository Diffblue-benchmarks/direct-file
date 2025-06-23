package gov.irs.directfile.stateapi.events;

import java.util.HashMap;
import java.util.Map;

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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ContextConfiguration(classes = {EventDetail.class})
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
@ExtendWith(SpringExtension.class)
class EventDetailDiffblueTest {
    @Autowired
    private EventDetail eventDetail;

    /**
     * Test getters and setters.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>default or parameterless constructor of {@link EventDetail}
     *   <li>{@link EventDetail#setDetailMap(HashMap)}
     *   <li>{@link EventDetail#getDetailMap()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void EventDetail.<init>()",
        "Map EventDetail.getDetailMap()",
        "void EventDetail.setDetailMap(HashMap)"
    })
    void testGettersAndSetters() {
        // Arrange and Act
        EventDetail actualEventDetail = new EventDetail();
        HashMap<String, String> detailMap = new HashMap<>();
        actualEventDetail.setDetailMap(detailMap);
        Map<String, String> actualDetailMap = actualEventDetail.getDetailMap();

        // Assert
        assertTrue(actualDetailMap.isEmpty());
        assertSame(detailMap, actualDetailMap);
    }

    /**
     * Test {@link EventDetail#addDetail(String, String)}.
     * <ul>
     *   <li>Given {@link EventDetail}.</li>
     *   <li>When {@code Key}.</li>
     *   <li>Then {@link EventDetail} DetailMap size is one.</li>
     * </ul>
     * <p>
     * Method under test: {@link EventDetail#addDetail(String, String)}
     */
    @Test
    @DisplayName(
            "Test addDetail(String, String); given EventDetail; when 'Key'; then EventDetail DetailMap size is one")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void EventDetail.addDetail(String, String)"})
    void testAddDetail_givenEventDetail_whenKey_thenEventDetailDetailMapSizeIsOne() {
        // Arrange and Act
        eventDetail.addDetail("Key", "Val");

        // Assert
        Map<String, String> detailMap = eventDetail.getDetailMap();
        assertEquals(1, detailMap.size());
        assertEquals("Val", detailMap.get("Key"));
    }

    /**
     * Test {@link EventDetail#addDetail(String, String)}.
     * <ul>
     *   <li>When empty string.</li>
     *   <li>Then {@link EventDetail} DetailMap Empty.</li>
     * </ul>
     * <p>
     * Method under test: {@link EventDetail#addDetail(String, String)}
     */
    @Test
    @DisplayName("Test addDetail(String, String); when empty string; then EventDetail DetailMap Empty")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void EventDetail.addDetail(String, String)"})
    void testAddDetail_whenEmptyString_thenEventDetailDetailMapEmpty() {
        // Arrange
        eventDetail.setDetailMap(new HashMap<>());

        // Act
        eventDetail.addDetail("not empty", "");

        // Assert that nothing has changed
        assertTrue(eventDetail.getDetailMap().isEmpty());
    }

    /**
     * Test {@link EventDetail#addDetail(String, String)}.
     * <ul>
     *   <li>When empty string.</li>
     *   <li>Then {@link EventDetail} DetailMap Empty.</li>
     * </ul>
     * <p>
     * Method under test: {@link EventDetail#addDetail(String, String)}
     */
    @Test
    @DisplayName("Test addDetail(String, String); when empty string; then EventDetail DetailMap Empty")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void EventDetail.addDetail(String, String)"})
    void testAddDetail_whenEmptyString_thenEventDetailDetailMapEmpty2() {
        // Arrange
        eventDetail.setDetailMap(new HashMap<>());

        // Act
        eventDetail.addDetail("", "not empty");

        // Assert that nothing has changed
        assertTrue(eventDetail.getDetailMap().isEmpty());
    }

    /**
     * Test {@link EventDetail#addDetail(String, String)}.
     * <ul>
     *   <li>When {@code null}.</li>
     *   <li>Then {@link EventDetail} DetailMap Empty.</li>
     * </ul>
     * <p>
     * Method under test: {@link EventDetail#addDetail(String, String)}
     */
    @Test
    @DisplayName("Test addDetail(String, String); when 'null'; then EventDetail DetailMap Empty")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"void EventDetail.addDetail(String, String)"})
    void testAddDetail_whenNull_thenEventDetailDetailMapEmpty() {
        // Arrange
        eventDetail.setDetailMap(new HashMap<>());

        // Act
        eventDetail.addDetail("not empty", null);

        // Assert that nothing has changed
        assertTrue(eventDetail.getDetailMap().isEmpty());
    }
}
