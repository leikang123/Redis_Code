package redis_sds;
/**
 * sds的动态命令
 * @author mac1094
 *
 */
public class SDS_Common {
	// 设置命令
	private key set;
	// 获取命令
	private key get;
	// 批量设置命令
	private key mset;
	// 批量获取命令
	private key mget;
	// 计数命令，表示增加一个单位
	private int incr;
	// 计数命令，表示增加多个单位，可随意设置
	private int incrby;
	// 表示过期命令，设置时间
	private int expire;
	public SDS_Common(key set, key get, key mset, key mget, int incr, int incrby, int expire) {
		super();
		this.set = set;
		this.get = get;
		this.mset = mset;
		this.mget = mget;
		this.incr = incr;
		this.incrby = incrby;
		this.expire = expire;
	}
	public SDS_Common() {
		super();
	}
	public key getSet() {
		return set;
	}
	public void setSet(key set) {
		this.set = set;
	}
	public key getGet() {
		return get;
	}
	public void setGet(key get) {
		this.get = get;
	}
	public key getMset() {
		return mset;
	}
	public void setMset(key mset) {
		this.mset = mset;
	}
	public key getMget() {
		return mget;
	}
	public void setMget(key mget) {
		this.mget = mget;
	}
	public int getIncr() {
		return incr;
	}
	public void setIncr(int incr) {
		this.incr = incr;
	}
	public int getIncrby() {
		return incrby;
	}
	public void setIncrby(int incrby) {
		this.incrby = incrby;
	}
	public int getExpire() {
		return expire;
	}
	public void setExpire(int expire) {
		this.expire = expire;
	}
	

}
