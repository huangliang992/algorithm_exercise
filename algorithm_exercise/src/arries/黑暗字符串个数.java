package arries;

import java.util.Scanner;

public class ºÚ°µ×Ö·û´®¸öÊý {

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int total = count(n);
		System.out.println(total);
	}
	
	public static int count(int n){
		if(n==1){
			return 3;
		}else if(n == 2){
			return 9;
		}else if(n == 3){
			return 21;
		}else{
			return 21*count(n-3);
		}
	}
}
