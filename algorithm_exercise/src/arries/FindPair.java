package arries;

public class FindPair {
	public int countPairs(int[] A, int n, int sum) {
        // write code here
		int number=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if((A[i]+A[j])==sum){
					number++;
				}
			}
		}
		return number;
    }
}
