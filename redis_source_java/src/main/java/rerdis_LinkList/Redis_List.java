package rerdis_LinkList;
/**
 * 连表的属性底层
 * @author mac1094
 *
 */
// 连表的时间复杂度增加和删除为O(1);搜索(查找)为O(n);
public class Redis_List {
	// 前节点
	private listNode prev;
	// 后节点
	private listNode next;
	// 节点的值
	private  String value;
	

}
