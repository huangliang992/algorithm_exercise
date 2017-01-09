package list;

public class Solution {
	 public ListNode FindKthToTail(ListNode head,int k) {
		 int n=0;
		 ListNode l=head;
		 while(l.next!=null){
			l=l.next;
		 	n++;
		 }
		 ListNode ln=head;
        if(k>n+1){
            return null;
        }
		 for(int i=0;i<n+1-k;i++){
			ln=ln.next;
		 }
		 return ln;
	  }
	 
	 public static void main(String args[]){
		 ListNode ln=new ListNode(1);
		 ln.next=new ListNode(2);
		 ln.next.next=new ListNode(3);
		 ln.next.next.next=new ListNode(4);
		 Solution sl=new Solution();
		 ListNode l=sl.FindKthToTail(ln, 2);
		 System.out.println(l.val);
		 ListNode ln1=new ListNode(100);
		 ListNode l1=sl.FindKthToTail(ln1, 1);
		 System.out.println(l1.val);
	 }
}
