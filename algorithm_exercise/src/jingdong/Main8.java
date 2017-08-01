package jingdong;

import java.util.Scanner;

public class Main8 {

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int total = 0;
		for(int i=1;i<=n;i++){
			int t1 = sum(i, 2);
			int  t2 = sum(i, 10);
			if(t1 == t2){
				total ++;
			}
		}
		System.out.println(total);
	}
	
	/**
	 * n的m进值各位数的和
	 * @return
	 */
	public static int sum(int n, int m){
		int sum = 0;
		while(n/m != 0){
			sum = sum + n % m;
			n = n/m;
		}
		sum = sum + n;
		return sum;
	} 
}
