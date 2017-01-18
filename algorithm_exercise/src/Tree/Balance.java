package Tree;

/**
 * 实现一个函数，检查二叉树是否平衡，平衡的定义如下，对于树中的任意一个结点，其两颗子树的高度差不超过1。
给定指向树根结点的指针TreeNode* root，请返回一个bool，代表这棵树是否平衡。
 * @author hl
 *
 */
public class Balance {
	public boolean isBalance(TreeNode root) {
        // write code here
		TreeNode right=root.right;
		TreeNode left=root.left;
		if(right==null){
			if(left!=null){
				if(left.right!=null||left.left!=null){
					return false;
				}else return true;
			}else return true;
		}else if(left==null){
			if(right.right!=null||right.left!=null){
				return false;
				}else return true;
		}else return isBalance(left)&&isBalance(right);
		
    }
}
