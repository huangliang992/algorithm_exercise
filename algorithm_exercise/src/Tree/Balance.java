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
