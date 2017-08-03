package arries;

import java.util.Scanner;

/**
 * 
 * @author hl
 *
 */
public class 素数对之和 {

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int total = 0;
		for(int i=1;i<=n;i++){
			if(isPrime(i)){
				for(int j=i;j<=n;j++){
					if(isPrime(j) && j+i == n){
						total++;
					}
				}
			}
			
		}
		System.out.println(total);
	}
	
	/**
	 * 用于判断一个数是否为素数，若为素数，返回true,否则返回false
	 * 
	 * @param a
	 *            输入的值
	 * @return true、false
	 */
	public static boolean isPrime(int a) {
		boolean flag = true;
		if (a < 2) {// 素数不小于2
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(a); i++) {
				if (a % i == 0) {// 若能被整除，则说明不是素数，返回false
					flag = false;
					break;// 跳出循环
				}
			}
		}
		return flag;
	}
	
	
}
