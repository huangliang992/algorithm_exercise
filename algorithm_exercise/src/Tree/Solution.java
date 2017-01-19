package Tree;

import java.util.ArrayList;

public class Solution {
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        int num=0;
        ArrayList<Integer> l=new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
        travers(root,target,num,list,l);
        return list;
    }
	
	public void travers(TreeNode root,int target,int num, 
			ArrayList<ArrayList<Integer>> list,ArrayList<Integer>l){
		if(root!=null){
			num=num+root.val;
			l.add(root.val);
			if(num<target){
				if(root.left!=null){
					travers(root.left,target,num,list,l);
				}
				if(root.right!=null){
					travers(root.right,target,num,list,l);
				}
			}else if(num==target){
				if(root.left==null&&root.right==null){
					ArrayList<Integer> al=new ArrayList<Integer>();
					for(int i=0;i<l.size();i++){
						//System.out.println(l.get(i));
						al.add(l.get(i));
					}
					list.add(al);
				}
			}
			num=num-root.val;
			l.remove(l.size()-1);
		}
	}
	
	public static void main(String args[]){
		Solution s=new Solution();
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		root.right.left=new TreeNode(6);
		root.right.right=new TreeNode(7);
		ArrayList<ArrayList<Integer>>l=s.FindPath(root, 8);
		System.out.println(l.size());
		for(int i=0;i<l.size();i++){
			ArrayList<Integer> list=l.get(i);
			System.out.println(list.size());
			for(int j=0;j<list.size();j++){
				System.out.print(list.get(j));
			}
			System.out.println();
		}
	}
}
