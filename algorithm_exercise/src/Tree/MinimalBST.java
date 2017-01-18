package Tree;

public class MinimalBST {
	public int buildMinimalBST(int[] vals) {
        // write code here
		int l=(int) (Math.log(vals.length)/Math.log(2));
		return l+1;
    }
	public static void main(String args[]){
		MinimalBST m=new MinimalBST();
		int a[]={1,2,3,4,5};
		System.out.println(m.buildMinimalBST(a));
	}
}
