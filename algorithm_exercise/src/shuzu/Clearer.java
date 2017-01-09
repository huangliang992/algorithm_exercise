package shuzu;

public class Clearer {
	public int[][] clearZero(int[][] mat, int n) {
        // write code here
		int a[][]=new int [n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=1;
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(mat[i][j]==0){
					for(int k=0;k<n;k++){
						a[i][k]=0;
						a[k][j]=0;
					}
				}else{
					if(a[i][j]!=0){
						a[i][j]=mat[i][j];
					}
				}
			}
		}
		return a;
	}
	
	public static void main(String args[]){
		Clearer cl=new Clearer();
		int mat[][]={{1,2,3},{0,1,2},{0,0,1}};
		int a[][]=cl.clearZero(mat, 3);
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}