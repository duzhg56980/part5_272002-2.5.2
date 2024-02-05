import com.alibaba.dubbo.registry.redis.RedisRegistry;
public class FunctionUse4321 {
public void funcUse() {
RedisRegistry redisregistry = new RedisRegistry();
redisregistry.deferExpired();
}
}