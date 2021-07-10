package reentrackLock;

import java.util.Map;

import redis.clients.jedis.Jedis;

/**
 * redis分布式锁
 * @author mac1094
 *主要是所得枷锁和释放锁
 */
public class Redis_Lock {
	// 创建分布式锁
	private ThreadLocal<Map<String,Integer>> lockers = new ThreadLocal<>();
	private Jedis jedis;
	
	public Redis_Lock(Jedis jedis) {
		this.jedis = jedis;
	}
	private boolean _lock(String key) {
		return jedis.set(key,"","ex")!=null;
	}
    private void _unlock(String key) {
    	jedis.del(key);
    }
    
    private Map<String,Integer> currentLockers(){
    	Map<String,Integer> refs = lockers.get();
    	if(refs !=null) {
    		return refs;
    	}
    }
    lockers.set(new HashMap<>());
	// 未写完待续
    
}
