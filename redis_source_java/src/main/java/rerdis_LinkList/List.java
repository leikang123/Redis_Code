package rerdis_LinkList;
/**
 * 多个连表组成一个双端表
 * @author mac1094
 *
 */
public class List {
	// 表头
  private listNode head;
  //表尾巴
  private listNode tail;
  // 该表的总长度
  private long len;
  // 复制的函数
  private String  ptr;
  
public List(listNode head, listNode tail, long len, String ptr) {
	super();
	this.head = head;
	this.tail = tail;
	this.len = len;
	this.ptr = ptr;
}
  
}
