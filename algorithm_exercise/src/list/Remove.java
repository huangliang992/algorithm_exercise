package list;

public class Remove {
	public boolean removeNode(ListNode pNode) {
        // write code here
		if(pNode.next==null){
			return false;
		}else{
			while(pNode.next!=null){
				pNode.val=pNode.next.val;
				if(pNode.next.next==null){
					pNode.next=null;
				}else{
					pNode=pNode.next;
				}
			}
			return true;
		}
    }
}
