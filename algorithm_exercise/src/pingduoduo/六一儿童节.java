package pingduoduo;

import java.util.Scanner;

public class 六一儿童节 {
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = s.nextInt();
		}
		int m = s.nextInt();
		int b[] = new int[m];
		for(int i=0;i<m;i++){
			b[i] = s.nextInt();
		}
		fromBigToSmall(a, 0, n-1);
		fromBigToSmall(b, 0, m-1);
		int total = 0;
		for(int i=0; i<m; i++){
			int temp = 0;
			for(int j=temp;j<n;j++){
				if(b[i]>=a[j]){
					total++;
					temp = j+1;
					break;
				}
			}
		}
		System.out.println(total);
	}
	
	/**
	 * 从大到小排序
	 * @param a
	 * @param low
	 * @param high
	 */
	public static void fromBigToSmall(int[] a, int low, int high){
		int start = low;
		int end = high;
		int key = a[low];

		while (end > start) {
			while (end > start && a[end] <= key)
				end--;
			if (a[end] >= key) {
				int temp = a[end];
				a[end] = a[start];
				a[start] = temp;
			}
			while (end > start && a[start] >= key)
				start++;
			if (a[start] <= key) {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
		}
		if (start > low)
			fromBigToSmall(a, low, start - 1);
		if (end < high)
			fromBigToSmall(a, end + 1, high);
	}

}
