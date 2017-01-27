package arries;

public class SubMatrix {
	public int maxSubMatrix(int[][] mat, int n) {
        // write code here
		int max=0;
		for(int i=0;i<n;i++){//行
			for(int j=0;j<n;j++){//第一个点列
				for(int k=j+1;k<n;k++){//第二个点列	
					boolean f=judge(mat,i,j,k);
					if(f&&(k-j)>max){
						max=k-j;
					}
				}
			}
		}
		return max+1;
    }
	
	public boolean judge(int [][] mat, int i, int j, int k){//i行，j，k列
		if(i+k-j>mat.length-1){
			return false;
		}
		for(int n=j;n<=k;n++){
			if(mat[i][n]!=mat[i][j]){
				return false;
			}
			if(mat[i+k-j][n]!=mat[i][j]){
				return false;
			}
		}
		for(int n=i;n<=i+k-j;n++){
			if(mat[n][j]!=mat[i][j]){
				return false;
			}
			if(mat[n][k]!=mat[i][j]){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]){
		SubMatrix s=new SubMatrix();
		int a[][]={{0,1,0,0},{1,0,0,0},{0,0,1,1},{0,1,0,1}};
		System.out.print(s.maxSubMatrix(a, 4));
	}
}
