package Tree;

import java.util.LinkedList;
import java.util.Queue;

import list.ListNode;

public class TreeLevel {
	 public ListNode getTreeLevel(TreeNode root, int dep) {
	        // write code here
		 	Queue<TreeNode> q=new LinkedList<TreeNode>();
		 	Queue<TreeNode> q1=new LinkedList<TreeNode>();
		 	q.offer(root);
		 	int k=1;
		 	while(k<dep){
		 		k++;
		 		if(k%2==0){
			 		while(!q.isEmpty()){
			 			TreeNode tn=q.poll();
			 			if(tn.left!=null){
			 				q1.offer(tn.left);
			 			}
			 			if(tn.right!=null){
			 				q1.offer(tn.right);
			 			}
			 		}
		 		}else{
			 		while(!q1.isEmpty()){
			 			TreeNode tn=q1.poll();
			 			if(tn.left!=null){
			 				q.offer(tn.left);
			 			}
			 			if(tn.right!=null){
			 				q.offer(tn.right);
			 			}
			 			
			 		}
		 		}
		 	}
		 	ListNode ln=new ListNode(1);
		 	ListNode head=ln;
		 	if(dep%2==1){
			 	while(!q.isEmpty()){
			 		ListNode temp=new ListNode(q.poll().val);
			 		ln.next=temp;
			 		ln=ln.next;
			 	}
		 	}
		 	if(dep%2==0){
		 		while(!q1.isEmpty()){
		 			ListNode temp=new ListNode(q1.poll().val);
		 			ln.next=temp;
		 			ln=ln.next;
		 		}
		 	}
		 	return head.next;
	    }
}
