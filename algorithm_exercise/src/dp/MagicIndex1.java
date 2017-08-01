package dp;

public class MagicIndex1 {
	public boolean findMagicIndex(int[] A, int n) {
        // write code here
		boolean f=false;
		for(int i=0;i<n;i++){
			if(A[i]==i){
				return true;
			}
		}
		return f;
    }
}
