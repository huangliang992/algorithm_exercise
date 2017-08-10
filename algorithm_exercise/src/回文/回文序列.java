package 回文;

import java.util.Scanner;

public class 回文序列 {

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] item = new int[n];
		for(int i=0;i<n;i++){
			item[i] = s.nextInt();
		}
		int total = count(item);
		System.out.println(total);
	}
	
	public static int count(int[] a){
		int i = 0;
		int j = a.length-1;
		int total = 0;
		int tempi = a[0];
		int tempj = a[a.length-1];
		while(j > i){
			if(tempi > tempj){
				j--;
				tempj = tempj + a[j];
				total++;
			}else if(tempi < tempj){
				i++;
				tempi = tempi + a[i];
				total++;
			}else{
				i++;
				tempi = a[i];
				j--;
				tempj = a[j];
			}
		}
		return total;
	}
}
