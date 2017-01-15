package list;
/**
 * 编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
给定一个链表的头指针 ListNode* pHead，请返回重新排列后的链表的头指针。注意：分割以后保持原来的数据顺序不变。
 * @author hl
 *
 */
public class Partition {
	public ListNode partition(ListNode pHead, int x) {
        // write code here
		ListNode head=null;
		ListNode mid=null;
		int k=0;
		ListNode tag1=pHead;
		ListNode tag2=pHead;
		while(tag1!=null){
			k++;
			if(k==x){
				mid=tag1;
				break;
			}
			tag1=tag1.next;
		}
		while(tag2!=null){
			if(tag2.val<mid.val){
				head=tag2;
				
				
			}
		}
		return head;
    }
}
