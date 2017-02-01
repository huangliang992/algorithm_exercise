package arries;

public class AntiOrder {
	public int count(int[] A, int n) {
        // write code here
		int total=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(A[i]>A[j]){
					total++;
				}
			}
		}
		return total;
    }
}
