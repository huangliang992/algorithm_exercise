package Tree;

/**
 * ʵ��һ�����������������Ƿ�ƽ�⣬ƽ��Ķ������£��������е�����һ����㣬�����������ĸ߶Ȳ����1��
����ָ����������ָ��TreeNode* root���뷵��һ��bool������������Ƿ�ƽ�⡣
 * @author hl
 *
 */
public class Balance {
	public boolean isBalance(TreeNode root) {
        // write code here
		TreeNode right=root.right;
		TreeNode left=root.left;
		if(right.left!=null||right.right!=null&&left==null){
			return false;
		}else if(left.left!=null||left.right!=null&&right==null){
			return false;
		}else{
			return isBalance(right)&&isBalance(left);
		}
    }
}
