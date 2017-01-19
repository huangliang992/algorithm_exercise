package Tree;

import java.util.ArrayList;

public class Successor {
	public int findSucc(TreeNode root, int p) {
        // write code here
		ArrayList<Integer> list=new ArrayList<Integer>();
		travers(root,list);
		int result=-1;
		for(int i=0;i<list.size();i++){
			if(list.get(i)==p){
				if(i+1<list.size()){
					return list.get(i+1);
				}
			}
			
		}
		return result;
    }
	public void travers(TreeNode root, ArrayList<Integer> list){
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
}
