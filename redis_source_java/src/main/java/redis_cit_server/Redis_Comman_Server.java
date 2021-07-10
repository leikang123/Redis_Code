package redis_cit_server;
/**
 * 
 * @author mac1094
 * redis的一些底层命令
 */

public class Redis_Comman_Server {
	// get命令
	private String get;
	// set 命令
	private String set;
	// 
	
	public String getGet() {
		return get;
	}


	public void setGet(String get) {
		this.get = get;
	}


	public String getSet() {
		return set;
	}


	public void setSet(String set) {
		this.set = set;
	}


	public Redis_Comman_Server(String get, String set) {
		super();
		this.get = get;
		this.set = set;
	}
	

}
