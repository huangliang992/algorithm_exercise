package list;

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
