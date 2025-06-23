package gov.irs.directfile.stateapi.model;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;

import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class StateRedirectDiffblueTest {
    /**
     * Test getters and setters.
     * <p>
     * Methods under test:
     * <ul>
     *   <li>default or parameterless constructor of {@link StateRedirect}
     *   <li>{@link StateRedirect#setCreatedAt(Instant)}
     *   <li>{@link StateRedirect#setExpiresAt(Instant)}
     *   <li>{@link StateRedirect#setId(Long)}
     *   <li>{@link StateRedirect#setRedirectUrl(String)}
     *   <li>{@link StateRedirect#setStateProfileId(Long)}
     *   <li>{@link StateRedirect#getCreatedAt()}
     *   <li>{@link StateRedirect#getExpiresAt()}
     *   <li>{@link StateRedirect#getId()}
     *   <li>{@link StateRedirect#getRedirectUrl()}
     *   <li>{@link StateRedirect#getStateProfileId()}
     * </ul>
     */
    @Test
    @DisplayName("Test getters and setters")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({
        "void StateRedirect.<init>()",
        "Instant StateRedirect.getCreatedAt()",
        "Instant StateRedirect.getExpiresAt()",
        "Long StateRedirect.getId()",
        "String StateRedirect.getRedirectUrl()",
        "Long StateRedirect.getStateProfileId()",
        "void StateRedirect.setCreatedAt(Instant)",
        "void StateRedirect.setExpiresAt(Instant)",
        "void StateRedirect.setId(Long)",
        "void StateRedirect.setRedirectUrl(String)",
        "void StateRedirect.setStateProfileId(Long)"
    })
    void testGettersAndSetters() {
        // Arrange and Act
        StateRedirect actualStateRedirect = new StateRedirect();
        actualStateRedirect.setCreatedAt(
                LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualStateRedirect.setExpiresAt(
                LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
        actualStateRedirect.setId(1L);
        actualStateRedirect.setRedirectUrl("https://example.org/example");
        actualStateRedirect.setStateProfileId(1L);
        Instant actualCreatedAt = actualStateRedirect.getCreatedAt();
        Instant actualExpiresAt = actualStateRedirect.getExpiresAt();
        Long actualId = actualStateRedirect.getId();
        String actualRedirectUrl = actualStateRedirect.getRedirectUrl();
        Long actualStateProfileId = actualStateRedirect.getStateProfileId();

        // Assert
        assertEquals("https://example.org/example", actualRedirectUrl);
        assertEquals(1L, actualId.longValue());
        assertEquals(1L, actualStateProfileId.longValue());
        Instant instant = actualExpiresAt.EPOCH;
        assertSame(instant, actualCreatedAt);
        assertSame(instant, actualExpiresAt);
    }
}
