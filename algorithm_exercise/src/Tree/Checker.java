package Tree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 判断一棵树是否为二叉查找树
 * 先序遍历，升序
 * @author hl
 *
 */
public class Checker {
	 public boolean checkBST(TreeNode root) {
	      // write code here
		 ArrayList<Integer> list=new ArrayList<Integer>();
		 travers(root,list);
		 boolean b=true;
		 System.out.println(list.size());
		 for(int i=0;i<list.size();i++){
			 System.out.println(list.get(i));
			 for(int j=i;j<list.size();j++){
				 if(list.get(i)>list.get(j)){
					 b=false;
					 return false;
				 }
			 }
		 }
		 return b;
	    }
	 public void travers(TreeNode root,ArrayList<Integer> list){
		 if(root!=null){
			 if(root.left!=null){
				 travers(root.left,list);
			 }
			 list.add(root.val);
			 if(root.right!=null){
				 travers(root.right,list);
			 }
		}
	 }
	 
	 public static void main(String args[]){
		 Checker c=new Checker();
		 TreeNode root=new TreeNode(4);
		 root.left=new TreeNode(2);
		 root.right=new TreeNode(6);
		 root.left.left=new TreeNode(1);
		 root.left.right=new TreeNode(5);
		 root.right.left=new TreeNode(3);
		 System.out.println(c.checkBST(root));
	 }
}
