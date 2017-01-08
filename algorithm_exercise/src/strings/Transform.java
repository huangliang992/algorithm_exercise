package strings;

public class Transform {
    public int[][] transformImage(int[][] mat, int n) {
        // write code here
    	int a[][]=new int [n][n];
    	for(int i=0;i<n;i++){
    		for(int j=0;j<n;j++){
    			a[i][j]=mat[n-1-j][i];
    		}
    	}
    	return a;
    }
    
    public static void main(String args[]){
    	Transform tf=new Transform();

    }
}
