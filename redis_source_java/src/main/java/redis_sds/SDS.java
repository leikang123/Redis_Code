package redis_sds;
/**
 * 简单字符串类
 * @author mac1094
 *
 */
// 动态字符串类的底层源码
public class SDS {
	// 记录未使用字节的数量
	private int free;
	// 记录己使用字节的数量
	private int len;
	// 字节数组，用于保存字符串 复杂度为o(1)
	private char buf[];
	
	public SDS() {
		super();
	}

	public SDS(int free, int len, char[] buf) {
		super();
		this.free = free;
		this.len = len;
		this.buf = buf;
	}

	public int getFree() {
		return free;
	}

	public void setFree(int free) {
		this.free = free;
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public char[] getBuf() {
		return buf;
	}

	public void setBuf(char[] buf) {
		this.buf = buf;
	}
	
	

}
