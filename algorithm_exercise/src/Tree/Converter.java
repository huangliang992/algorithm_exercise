package Tree;


import java.util.ArrayList;

import list.ListNode;

public class Converter {
	
	
	public ListNode treeToList(TreeNode root) {
        // write code here
		ListNode head=new ListNode(10);
		ListNode result=head;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		cov(root,arr);
		for(int i=0;i<arr.size();i++){
			//System.out.println(arr.get(i));
			ListNode l=new ListNode(arr.get(i));
			head.next=l;
			head=head.next;
		}
		return result.next;
    }
	
	public void cov(TreeNode t,ArrayList<Integer> list){
		if(t!=null){
			if(t.left!=null){
				cov(t.left,list);
			}
			list.add(t.val);
			if(t.right!=null){
				cov(t.right,list);
			}
		}
	}
	
	public static void main(String args[]){
		Converter c=new Converter();
		TreeNode t=new TreeNode(4);
		t.left=new TreeNode(2);
		t.right=new TreeNode(6);
		t.left.left=new TreeNode(1);
		t.left.right=new TreeNode(3);
		t.right.left=new TreeNode(5);
		t.right.right=new TreeNode(7);
		ListNode h=c.treeToList(t);
		while(h!=null){
			System.out.println(h.val);
			h=h.next;
			
		}
	}
}
