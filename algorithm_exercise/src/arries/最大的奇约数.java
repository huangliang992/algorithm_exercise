package arries;

import java.util.Scanner;

public class 最大的奇约数 {

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		if(n<=1000000000){
			long total = 0;
			for(long i=1;i<=n;i++){
				total = total + f(i);
			}
			System.out.println(total);
		}
		
	}
	
	public static long f(long n){
		if(n%2 != 0){
			return n;
		}else{
			while(n%2==0){
				n=n/2;
			}
			return n;
		}
	}
}