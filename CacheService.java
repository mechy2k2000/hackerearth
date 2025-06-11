@Configuration
@EnableCaching
class CacheConfig {

    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager("authors", "tasks", "users");
    }

    @Bean("uuidKeyGenerator")
    public KeyGenerator uuidKeyGenerator() {
        return (target, method, params) -> {
            if (params.length == 0) {
                throw new IllegalArgumentException("No parameters to generate key from.");
            }

            Object param = params[0];

            if (param instanceof UUID uuid) {
                return uuid.toString();
            }

            try {
                Method getIdMethod = param.getClass().getMethod("getId");
                Object id = getIdMethod.invoke(param);
                if (id instanceof UUID uuid) {
                    return uuid.toString();
                }
            } catch (Exception ignored) {}

            throw new IllegalArgumentException("Cannot generate key from parameter: " + param);
        };
    }
}

@Service
public class CacheService {

    private final CacheManager cacheManager;
    private static final List<String> ALL_CACHES = List.of("authors", "tasks", "users");

    public CacheService(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    public void evictAll(String cacheName) {
        Cache cache = cacheManager.getCache(cacheName);
        if (cache != null) {
            cache.clear();
        }
    }

    public void evictByKey(String cacheName, Object key) {
        Cache cache = cacheManager.getCache(cacheName);
        if (cache != null) {
            cache.evict(key);
        }
    }

    public void evictAllCaches() {
        ALL_CACHES.forEach(this::evictAll);
    }
}
