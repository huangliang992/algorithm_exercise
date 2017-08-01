package jingdong;

import java.util.Scanner;

public class 进制各位数和及最大公约数 {
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int total = 0;
		for(int i=2;i<n;i++){
			total = total + sum(n, i);
		}
		String result = yuefeng(total, n-2);
		System.out.println(result);
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
	
	/**
	 * 约分m/n
	 * @return
	 */
	public static String yuefeng(int m, int n){
		int temp = 1;
		//找m,n的最大公约数
		if(m>n){
			for(int i=n;i>0;i--){
				if(n%i==0&&m%i==0){
					temp = i;
					break;
				}
			}
		}else{
			for(int i=m;i>0;i--){
				if(n%i==0&&m%i==0){
					temp = i;
					break;
				}
			}
		}
		int k1 = m/temp;
		int k2 = n/temp;
		return k1 + "/" + k2;
	}
}
