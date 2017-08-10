package arries;

import java.util.Scanner;

/**
 * buy(n) = min{buy(n-1),buy(n-2)}+1;怎么实现
 * @author hl
 *
 */
public class 买苹果 {
	
	private static int f = 0;

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		f = n;
		int total = buy(n);
		if(total<n){
			System.out.println(total);
		}else System.out.println(-1);
		
	}
	
	public static int buy(int n){
		if(n==8||n==6){
			return 1;
		}else if(n<6 || n==7){
			return f;
		}else{
			if(buy(n-6)<= buy(n-8)){
				return buy(n-6)+1;
			}else{
				return buy(n-8)+1;
			}
		}
		
	}
}
