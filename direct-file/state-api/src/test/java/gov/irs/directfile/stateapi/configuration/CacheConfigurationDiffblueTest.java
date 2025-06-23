package gov.irs.directfile.stateapi.configuration;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import com.diffblue.cover.annotations.MethodsUnderTest;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.Expiry;
import com.github.benmanes.caffeine.cache.RemovalListener;
import com.github.benmanes.caffeine.cache.Ticker;
import com.github.benmanes.caffeine.cache.stats.ConcurrentStatsCounter;
import com.github.benmanes.caffeine.cache.stats.StatsCounter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ContextConfiguration(classes = {CacheConfiguration.class})
@ExtendWith(SpringExtension.class)
class CacheConfigurationDiffblueTest {
    @Autowired
    private CacheConfiguration cacheConfiguration;

    /**
     * Test {@link CacheConfiguration#cacheManager(Caffeine)}.
     * <ul>
     *   <li>Given {@code 81985529216486895}.</li>
     * </ul>
     * <p>
     * Method under test: {@link CacheConfiguration#cacheManager(Caffeine)}
     */
    @Test
    @DisplayName("Test cacheManager(Caffeine); given '81985529216486895'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"CacheManager CacheConfiguration.cacheManager(Caffeine)"})
    void testCacheManager_given81985529216486895() {
        // Arrange
        CacheConfiguration cacheConfiguration = new CacheConfiguration();
        Caffeine<Object, Object> caffeine = Caffeine.newBuilder();
        caffeine.expireAfterWrite(81985529216486895L, TimeUnit.NANOSECONDS);

        // Act
        CacheManager actualCacheManagerResult = cacheConfiguration.cacheManager(caffeine);

        // Assert
        Collection<String> cacheNames = actualCacheManagerResult.getCacheNames();
        assertEquals(2, cacheNames.size());
        assertTrue(cacheNames instanceof Set);
        assertTrue(actualCacheManagerResult instanceof CaffeineCacheManager);
        assertTrue(cacheNames.contains("publicKeyCache"));
        assertTrue(cacheNames.contains("stateProfileCache"));
        assertTrue(((CaffeineCacheManager) actualCacheManagerResult).isAllowNullValues());
    }

    /**
     * Test {@link CacheConfiguration#cacheManager(Caffeine)}.
     * <ul>
     *   <li>Given {@link CacheConfiguration}.</li>
     *   <li>When newBuilder.</li>
     * </ul>
     * <p>
     * Method under test: {@link CacheConfiguration#cacheManager(Caffeine)}
     */
    @Test
    @DisplayName("Test cacheManager(Caffeine); given CacheConfiguration; when newBuilder")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"CacheManager CacheConfiguration.cacheManager(Caffeine)"})
    void testCacheManager_givenCacheConfiguration_whenNewBuilder() {
        // Arrange
        Caffeine<Object, Object> caffeine = Caffeine.newBuilder();

        // Act
        CacheManager actualCacheManagerResult = cacheConfiguration.cacheManager(caffeine);

        // Assert
        Collection<String> cacheNames = actualCacheManagerResult.getCacheNames();
        assertEquals(2, cacheNames.size());
        assertTrue(cacheNames instanceof Set);
        assertTrue(actualCacheManagerResult instanceof CaffeineCacheManager);
        assertTrue(cacheNames.contains("publicKeyCache"));
        assertTrue(cacheNames.contains("stateProfileCache"));
        assertTrue(((CaffeineCacheManager) actualCacheManagerResult).isAllowNullValues());
    }

    /**
     * Test {@link CacheConfiguration#cacheManager(Caffeine)}.
     * <ul>
     *   <li>Given {@link CacheConfiguration} (default constructor).</li>
     *   <li>When newBuilder.</li>
     * </ul>
     * <p>
     * Method under test: {@link CacheConfiguration#cacheManager(Caffeine)}
     */
    @Test
    @DisplayName("Test cacheManager(Caffeine); given CacheConfiguration (default constructor); when newBuilder")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"CacheManager CacheConfiguration.cacheManager(Caffeine)"})
    void testCacheManager_givenCacheConfiguration_whenNewBuilder2() {
        // Arrange
        CacheConfiguration cacheConfiguration = new CacheConfiguration();
        Caffeine<Object, Object> caffeine = Caffeine.newBuilder();

        // Act
        CacheManager actualCacheManagerResult = cacheConfiguration.cacheManager(caffeine);

        // Assert
        Collection<String> cacheNames = actualCacheManagerResult.getCacheNames();
        assertEquals(2, cacheNames.size());
        assertTrue(cacheNames instanceof Set);
        assertTrue(actualCacheManagerResult instanceof CaffeineCacheManager);
        assertTrue(cacheNames.contains("publicKeyCache"));
        assertTrue(cacheNames.contains("stateProfileCache"));
        assertTrue(((CaffeineCacheManager) actualCacheManagerResult).isAllowNullValues());
    }

    /**
     * Test {@link CacheConfiguration#cacheManager(Caffeine)}.
     * <ul>
     *   <li>Given {@link Executor}.</li>
     *   <li>When newBuilder executor {@link Executor}.</li>
     * </ul>
     * <p>
     * Method under test: {@link CacheConfiguration#cacheManager(Caffeine)}
     */
    @Test
    @DisplayName("Test cacheManager(Caffeine); given Executor; when newBuilder executor Executor")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"CacheManager CacheConfiguration.cacheManager(Caffeine)"})
    void testCacheManager_givenExecutor_whenNewBuilderExecutorExecutor() {
        // Arrange
        CacheConfiguration cacheConfiguration = new CacheConfiguration();
        Caffeine<Object, Object> caffeine = Caffeine.newBuilder();
        caffeine.executor(mock(Executor.class));

        // Act
        CacheManager actualCacheManagerResult = cacheConfiguration.cacheManager(caffeine);

        // Assert
        Collection<String> cacheNames = actualCacheManagerResult.getCacheNames();
        assertEquals(2, cacheNames.size());
        assertTrue(cacheNames instanceof Set);
        assertTrue(actualCacheManagerResult instanceof CaffeineCacheManager);
        assertTrue(cacheNames.contains("publicKeyCache"));
        assertTrue(cacheNames.contains("stateProfileCache"));
        assertTrue(((CaffeineCacheManager) actualCacheManagerResult).isAllowNullValues());
    }

    /**
     * Test {@link CacheConfiguration#cacheManager(Caffeine)}.
     * <ul>
     *   <li>Given {@link Expiry}.</li>
     *   <li>When newBuilder expireAfter {@link Expiry}.</li>
     * </ul>
     * <p>
     * Method under test: {@link CacheConfiguration#cacheManager(Caffeine)}
     */
    @Test
    @DisplayName("Test cacheManager(Caffeine); given Expiry; when newBuilder expireAfter Expiry")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"CacheManager CacheConfiguration.cacheManager(Caffeine)"})
    void testCacheManager_givenExpiry_whenNewBuilderExpireAfterExpiry() {
        // Arrange
        CacheConfiguration cacheConfiguration = new CacheConfiguration();
        Caffeine<Object, Object> caffeine = Caffeine.newBuilder();
        caffeine.<Object, Object>expireAfter(mock(Expiry.class));

        // Act
        CacheManager actualCacheManagerResult = cacheConfiguration.cacheManager(caffeine);

        // Assert
        Collection<String> cacheNames = actualCacheManagerResult.getCacheNames();
        assertEquals(2, cacheNames.size());
        assertTrue(cacheNames instanceof Set);
        assertTrue(actualCacheManagerResult instanceof CaffeineCacheManager);
        assertTrue(cacheNames.contains("publicKeyCache"));
        assertTrue(cacheNames.contains("stateProfileCache"));
        assertTrue(((CaffeineCacheManager) actualCacheManagerResult).isAllowNullValues());
    }

    /**
     * Test {@link CacheConfiguration#cacheManager(Caffeine)}.
     * <ul>
     *   <li>Given one.</li>
     *   <li>When newBuilder initialCapacity one.</li>
     * </ul>
     * <p>
     * Method under test: {@link CacheConfiguration#cacheManager(Caffeine)}
     */
    @Test
    @DisplayName("Test cacheManager(Caffeine); given one; when newBuilder initialCapacity one")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"CacheManager CacheConfiguration.cacheManager(Caffeine)"})
    void testCacheManager_givenOne_whenNewBuilderInitialCapacityOne() {
        // Arrange
        CacheConfiguration cacheConfiguration = new CacheConfiguration();
        Caffeine<Object, Object> caffeine = Caffeine.newBuilder();
        caffeine.initialCapacity(1);

        // Act
        CacheManager actualCacheManagerResult = cacheConfiguration.cacheManager(caffeine);

        // Assert
        Collection<String> cacheNames = actualCacheManagerResult.getCacheNames();
        assertEquals(2, cacheNames.size());
        assertTrue(cacheNames instanceof Set);
        assertTrue(actualCacheManagerResult instanceof CaffeineCacheManager);
        assertTrue(cacheNames.contains("publicKeyCache"));
        assertTrue(cacheNames.contains("stateProfileCache"));
        assertTrue(((CaffeineCacheManager) actualCacheManagerResult).isAllowNullValues());
    }

    /**
     * Test {@link CacheConfiguration#cacheManager(Caffeine)}.
     * <ul>
     *   <li>Given one.</li>
     *   <li>When newBuilder initialCapacity one.</li>
     *   <li>Then calls {@link Supplier#get()}.</li>
     * </ul>
     * <p>
     * Method under test: {@link CacheConfiguration#cacheManager(Caffeine)}
     */
    @Test
    @DisplayName("Test cacheManager(Caffeine); given one; when newBuilder initialCapacity one; then calls get()")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"CacheManager CacheConfiguration.cacheManager(Caffeine)"})
    void testCacheManager_givenOne_whenNewBuilderInitialCapacityOne_thenCallsGet() {
        // Arrange
        CacheConfiguration cacheConfiguration = new CacheConfiguration();
        Supplier<StatsCounter> statsCounterSupplier = mock(Supplier.class);
        when(statsCounterSupplier.get()).thenReturn(new ConcurrentStatsCounter());
        Caffeine<Object, Object> caffeine = Caffeine.newBuilder();
        caffeine.initialCapacity(1);
        caffeine.maximumSize(3L);
        caffeine.recordStats(statsCounterSupplier);

        // Act
        CacheManager actualCacheManagerResult = cacheConfiguration.cacheManager(caffeine);

        // Assert
        verify(statsCounterSupplier, atLeast(1)).get();
        Collection<String> cacheNames = actualCacheManagerResult.getCacheNames();
        assertEquals(2, cacheNames.size());
        assertTrue(cacheNames instanceof Set);
        assertTrue(actualCacheManagerResult instanceof CaffeineCacheManager);
        assertTrue(cacheNames.contains("publicKeyCache"));
        assertTrue(cacheNames.contains("stateProfileCache"));
        assertTrue(((CaffeineCacheManager) actualCacheManagerResult).isAllowNullValues());
    }

    /**
     * Test {@link CacheConfiguration#cacheManager(Caffeine)}.
     * <ul>
     *   <li>Given {@link Supplier} {@link Supplier#get()} return {@link ConcurrentStatsCounter} (default constructor).</li>
     *   <li>Then calls {@link Supplier#get()}.</li>
     * </ul>
     * <p>
     * Method under test: {@link CacheConfiguration#cacheManager(Caffeine)}
     */
    @Test
    @DisplayName(
            "Test cacheManager(Caffeine); given Supplier get() return ConcurrentStatsCounter (default constructor); then calls get()")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"CacheManager CacheConfiguration.cacheManager(Caffeine)"})
    void testCacheManager_givenSupplierGetReturnConcurrentStatsCounter_thenCallsGet() {
        // Arrange
        CacheConfiguration cacheConfiguration = new CacheConfiguration();
        Supplier<StatsCounter> statsCounterSupplier = mock(Supplier.class);
        when(statsCounterSupplier.get()).thenReturn(new ConcurrentStatsCounter());
        Caffeine<Object, Object> caffeine = Caffeine.newBuilder();
        caffeine.recordStats(statsCounterSupplier);

        // Act
        CacheManager actualCacheManagerResult = cacheConfiguration.cacheManager(caffeine);

        // Assert
        verify(statsCounterSupplier, atLeast(1)).get();
        Collection<String> cacheNames = actualCacheManagerResult.getCacheNames();
        assertEquals(2, cacheNames.size());
        assertTrue(cacheNames instanceof Set);
        assertTrue(actualCacheManagerResult instanceof CaffeineCacheManager);
        assertTrue(cacheNames.contains("publicKeyCache"));
        assertTrue(cacheNames.contains("stateProfileCache"));
        assertTrue(((CaffeineCacheManager) actualCacheManagerResult).isAllowNullValues());
    }

    /**
     * Test {@link CacheConfiguration#cacheManager(Caffeine)}.
     * <ul>
     *   <li>Given three.</li>
     *   <li>When newBuilder maximumSize three.</li>
     * </ul>
     * <p>
     * Method under test: {@link CacheConfiguration#cacheManager(Caffeine)}
     */
    @Test
    @DisplayName("Test cacheManager(Caffeine); given three; when newBuilder maximumSize three")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"CacheManager CacheConfiguration.cacheManager(Caffeine)"})
    void testCacheManager_givenThree_whenNewBuilderMaximumSizeThree() {
        // Arrange
        CacheConfiguration cacheConfiguration = new CacheConfiguration();
        Caffeine<Object, Object> caffeine = Caffeine.newBuilder();
        caffeine.maximumSize(3L);

        // Act
        CacheManager actualCacheManagerResult = cacheConfiguration.cacheManager(caffeine);

        // Assert
        Collection<String> cacheNames = actualCacheManagerResult.getCacheNames();
        assertEquals(2, cacheNames.size());
        assertTrue(cacheNames instanceof Set);
        assertTrue(actualCacheManagerResult instanceof CaffeineCacheManager);
        assertTrue(cacheNames.contains("publicKeyCache"));
        assertTrue(cacheNames.contains("stateProfileCache"));
        assertTrue(((CaffeineCacheManager) actualCacheManagerResult).isAllowNullValues());
    }

    /**
     * Test {@link CacheConfiguration#cacheManager(Caffeine)}.
     * <ul>
     *   <li>Given three.</li>
     *   <li>When newBuilder maximumSize three.</li>
     *   <li>Then calls {@link Supplier#get()}.</li>
     * </ul>
     * <p>
     * Method under test: {@link CacheConfiguration#cacheManager(Caffeine)}
     */
    @Test
    @DisplayName("Test cacheManager(Caffeine); given three; when newBuilder maximumSize three; then calls get()")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"CacheManager CacheConfiguration.cacheManager(Caffeine)"})
    void testCacheManager_givenThree_whenNewBuilderMaximumSizeThree_thenCallsGet() {
        // Arrange
        CacheConfiguration cacheConfiguration = new CacheConfiguration();
        Supplier<StatsCounter> statsCounterSupplier = mock(Supplier.class);
        when(statsCounterSupplier.get()).thenReturn(new ConcurrentStatsCounter());
        Caffeine<Object, Object> caffeine = Caffeine.newBuilder();
        caffeine.maximumSize(3L);
        caffeine.recordStats(statsCounterSupplier);

        // Act
        CacheManager actualCacheManagerResult = cacheConfiguration.cacheManager(caffeine);

        // Assert
        verify(statsCounterSupplier, atLeast(1)).get();
        Collection<String> cacheNames = actualCacheManagerResult.getCacheNames();
        assertEquals(2, cacheNames.size());
        assertTrue(cacheNames instanceof Set);
        assertTrue(actualCacheManagerResult instanceof CaffeineCacheManager);
        assertTrue(cacheNames.contains("publicKeyCache"));
        assertTrue(cacheNames.contains("stateProfileCache"));
        assertTrue(((CaffeineCacheManager) actualCacheManagerResult).isAllowNullValues());
    }

    /**
     * Test {@link CacheConfiguration#cacheManager(Caffeine)}.
     * <ul>
     *   <li>Given {@link Ticker}.</li>
     *   <li>When newBuilder ticker {@link Ticker}.</li>
     *   <li>Then calls {@link Supplier#get()}.</li>
     * </ul>
     * <p>
     * Method under test: {@link CacheConfiguration#cacheManager(Caffeine)}
     */
    @Test
    @DisplayName("Test cacheManager(Caffeine); given Ticker; when newBuilder ticker Ticker; then calls get()")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"CacheManager CacheConfiguration.cacheManager(Caffeine)"})
    void testCacheManager_givenTicker_whenNewBuilderTickerTicker_thenCallsGet() {
        // Arrange
        CacheConfiguration cacheConfiguration = new CacheConfiguration();
        Supplier<StatsCounter> statsCounterSupplier = mock(Supplier.class);
        when(statsCounterSupplier.get()).thenReturn(new ConcurrentStatsCounter());
        Caffeine<Object, Object> caffeine = Caffeine.newBuilder();
        caffeine.ticker(mock(Ticker.class));
        caffeine.recordStats(statsCounterSupplier);

        // Act
        CacheManager actualCacheManagerResult = cacheConfiguration.cacheManager(caffeine);

        // Assert
        verify(statsCounterSupplier, atLeast(1)).get();
        Collection<String> cacheNames = actualCacheManagerResult.getCacheNames();
        assertEquals(2, cacheNames.size());
        assertTrue(cacheNames instanceof Set);
        assertTrue(actualCacheManagerResult instanceof CaffeineCacheManager);
        assertTrue(cacheNames.contains("publicKeyCache"));
        assertTrue(cacheNames.contains("stateProfileCache"));
        assertTrue(((CaffeineCacheManager) actualCacheManagerResult).isAllowNullValues());
    }

    /**
     * Test {@link CacheConfiguration#cacheManager(Caffeine)}.
     * <ul>
     *   <li>When newBuilder evictionListener {@link RemovalListener}.</li>
     * </ul>
     * <p>
     * Method under test: {@link CacheConfiguration#cacheManager(Caffeine)}
     */
    @Test
    @DisplayName("Test cacheManager(Caffeine); when newBuilder evictionListener RemovalListener")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"CacheManager CacheConfiguration.cacheManager(Caffeine)"})
    void testCacheManager_whenNewBuilderEvictionListenerRemovalListener() {
        // Arrange
        CacheConfiguration cacheConfiguration = new CacheConfiguration();
        Supplier<StatsCounter> statsCounterSupplier = mock(Supplier.class);
        when(statsCounterSupplier.get()).thenReturn(new ConcurrentStatsCounter());
        Caffeine<Object, Object> caffeine = Caffeine.newBuilder();
        caffeine.<Object, Object>evictionListener(mock(RemovalListener.class));
        caffeine.maximumSize(3L);
        caffeine.recordStats(statsCounterSupplier);

        // Act
        CacheManager actualCacheManagerResult = cacheConfiguration.cacheManager(caffeine);

        // Assert
        verify(statsCounterSupplier, atLeast(1)).get();
        Collection<String> cacheNames = actualCacheManagerResult.getCacheNames();
        assertEquals(2, cacheNames.size());
        assertTrue(cacheNames instanceof Set);
        assertTrue(actualCacheManagerResult instanceof CaffeineCacheManager);
        assertTrue(cacheNames.contains("publicKeyCache"));
        assertTrue(cacheNames.contains("stateProfileCache"));
        assertTrue(((CaffeineCacheManager) actualCacheManagerResult).isAllowNullValues());
    }

    /**
     * Test {@link CacheConfiguration#cacheManager(Caffeine)}.
     * <ul>
     *   <li>When newBuilder expireAfterAccess one and {@code NANOSECONDS}.</li>
     * </ul>
     * <p>
     * Method under test: {@link CacheConfiguration#cacheManager(Caffeine)}
     */
    @Test
    @DisplayName("Test cacheManager(Caffeine); when newBuilder expireAfterAccess one and 'NANOSECONDS'")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"CacheManager CacheConfiguration.cacheManager(Caffeine)"})
    void testCacheManager_whenNewBuilderExpireAfterAccessOneAndNanoseconds() {
        // Arrange
        CacheConfiguration cacheConfiguration = new CacheConfiguration();
        Caffeine<Object, Object> caffeine = Caffeine.newBuilder();
        caffeine.expireAfterAccess(1L, TimeUnit.NANOSECONDS);

        // Act
        CacheManager actualCacheManagerResult = cacheConfiguration.cacheManager(caffeine);

        // Assert
        Collection<String> cacheNames = actualCacheManagerResult.getCacheNames();
        assertEquals(2, cacheNames.size());
        assertTrue(cacheNames instanceof Set);
        assertTrue(actualCacheManagerResult instanceof CaffeineCacheManager);
        assertTrue(cacheNames.contains("publicKeyCache"));
        assertTrue(cacheNames.contains("stateProfileCache"));
        assertTrue(((CaffeineCacheManager) actualCacheManagerResult).isAllowNullValues());
    }

    /**
     * Test {@link CacheConfiguration#cacheManager(Caffeine)}.
     * <ul>
     *   <li>When newBuilder removalListener {@link RemovalListener}.</li>
     * </ul>
     * <p>
     * Method under test: {@link CacheConfiguration#cacheManager(Caffeine)}
     */
    @Test
    @DisplayName("Test cacheManager(Caffeine); when newBuilder removalListener RemovalListener")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"CacheManager CacheConfiguration.cacheManager(Caffeine)"})
    void testCacheManager_whenNewBuilderRemovalListenerRemovalListener() {
        // Arrange
        CacheConfiguration cacheConfiguration = new CacheConfiguration();
        Caffeine<Object, Object> caffeine = Caffeine.newBuilder();
        caffeine.<Object, Object>removalListener(mock(RemovalListener.class));

        // Act
        CacheManager actualCacheManagerResult = cacheConfiguration.cacheManager(caffeine);

        // Assert
        Collection<String> cacheNames = actualCacheManagerResult.getCacheNames();
        assertEquals(2, cacheNames.size());
        assertTrue(cacheNames instanceof Set);
        assertTrue(actualCacheManagerResult instanceof CaffeineCacheManager);
        assertTrue(cacheNames.contains("publicKeyCache"));
        assertTrue(cacheNames.contains("stateProfileCache"));
        assertTrue(((CaffeineCacheManager) actualCacheManagerResult).isAllowNullValues());
    }

    /**
     * Test {@link CacheConfiguration#cacheManager(Caffeine)}.
     * <ul>
     *   <li>When newBuilder removalListener {@link RemovalListener}.</li>
     * </ul>
     * <p>
     * Method under test: {@link CacheConfiguration#cacheManager(Caffeine)}
     */
    @Test
    @DisplayName("Test cacheManager(Caffeine); when newBuilder removalListener RemovalListener")
    @Tag("MaintainedByDiffblue")
    @MethodsUnderTest({"CacheManager CacheConfiguration.cacheManager(Caffeine)"})
    void testCacheManager_whenNewBuilderRemovalListenerRemovalListener2() {
        // Arrange
        CacheConfiguration cacheConfiguration = new CacheConfiguration();
        Supplier<StatsCounter> statsCounterSupplier = mock(Supplier.class);
        when(statsCounterSupplier.get()).thenReturn(new ConcurrentStatsCounter());
        Caffeine<Object, Object> caffeine = Caffeine.newBuilder();
        caffeine.<Object, Object>removalListener(mock(RemovalListener.class));
        caffeine.maximumSize(3L);
        caffeine.recordStats(statsCounterSupplier);

        // Act
        CacheManager actualCacheManagerResult = cacheConfiguration.cacheManager(caffeine);

        // Assert
        verify(statsCounterSupplier, atLeast(1)).get();
        Collection<String> cacheNames = actualCacheManagerResult.getCacheNames();
        assertEquals(2, cacheNames.size());
        assertTrue(cacheNames instanceof Set);
        assertTrue(actualCacheManagerResult instanceof CaffeineCacheManager);
        assertTrue(cacheNames.contains("publicKeyCache"));
        assertTrue(cacheNames.contains("stateProfileCache"));
        assertTrue(((CaffeineCacheManager) actualCacheManagerResult).isAllowNullValues());
    }
}
