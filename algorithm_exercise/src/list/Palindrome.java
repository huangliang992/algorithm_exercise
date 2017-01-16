package list;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
	 public boolean isPalindrome(ListNode pHead) {
	    // write code here
	    boolean flag=true;
	    ListNode tag=pHead;
	    List<Integer> list=new ArrayList<Integer>();
	    while(tag!=null){
	    	list.add(tag.val);
	    	tag=tag.next;
	    }
	    for(int i=0;i<list.size();i++){
	    	if(list.get(i)!=list.get(list.size()-i-1)){
	    		flag=false;
	    		break;
	    	}
	    }
	    return flag;
	 }
	 public static void main(String args[]){
		 Palindrome p=new Palindrome();
		 ListNode l=new ListNode(1);
		 l.next=new ListNode(2);
		 l.next.next=new ListNode(3);
		 l.next.next.next=new ListNode(2);
		 l.next.next.next.next=new ListNode(1);
		 System.out.println(p.isPalindrome(l));
	 }
}
