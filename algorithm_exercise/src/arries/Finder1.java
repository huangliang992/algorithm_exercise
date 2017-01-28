package arries;

public class Finder1 {
	public int[] findElement(int[][] mat, int n, int m, int x) {
        // write code here
		int row=-1;
		int num=-1;
		for(int i=0;i<n;i++){
			if(mat[i][0]<=x&&mat[i][m-1]>=x){
				row=i;
			}
		}
		for(int i=0;i<m;i++){
			if(mat[row][i]==x){
				num=i;
			}
		}
		int a[]={row,num};
		return a;
    }
}
