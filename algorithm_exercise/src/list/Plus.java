package list;

public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
    	ListNode l1=a;
    	ListNode l2=b;
    	int length1=0;
    	int length2=0;
    	while(l1!=null){
    		length1++;
    		l1=l1.next;
    	}
    	System.out.println("a的长度"+length1);
    	while(l2!=null){
    		length2++;
    		l2=l2.next;
    	}
    	System.out.println("b的长度"+length2);
    	l1=a;
    	l2=b;
    	
    	ListNode fl=new ListNode(0);
    	ListNode fl1=fl;
    	if(length1>length2){
    		while(l1.next!=null){
    			if(l2.next!=null){
    				System.out.println("yes");
    				ListNode l=new ListNode(l1.val+l2.val);
    				fl.next=l;
        			l2=l2.next;
        			l1=l1.next;
        			fl=fl.next;
    			}else{
    				ListNode l=new ListNode(l1.val);
    				fl.next=l;
    				l1=l1.next;
        			fl=fl.next;
    			}
    		}
    	}else{
    		while(l2.next!=null){
    			if(l1.next!=null){
    				System.out.println("yes");
    				ListNode l=new ListNode(l1.val+l2.val);
    				fl.next=l;
        			l2=l2.next;
        			l1=l1.next;
        			fl=fl.next;
    			}else{
    				ListNode l=new ListNode(l2.val);
    				fl.next=l;
    				l2=l2.next;
        			fl=fl.next;
    			}
    		}
    	}
    	return fl1.next;
    }
    
    public static void main(String args[]){
    	Plus p=new Plus();
    	ListNode l1=new ListNode(0);
    	l1.next=new ListNode(1);
    	l1.next.next=new ListNode(2);
    	ListNode l2=new ListNode(1);
    	l2.next=new ListNode(2);
    	ListNode l3=p.plusAB(l1, l2);
    	System.out.println(l3);
    	while(l3.next!=null){
    		System.out.println(l3.val);
    		l3=l3.next;
    	}
    }
}
