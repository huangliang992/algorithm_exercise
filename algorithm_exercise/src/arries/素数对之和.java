package arries;

import java.util.Scanner;

/**
 * 
 * @author hl
 *
 */
public class ������֮�� {

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
	 * �����ж�һ�����Ƿ�Ϊ��������Ϊ����������true,���򷵻�false
	 * 
	 * @param a
	 *            �����ֵ
	 * @return true��false
	 */
	public static boolean isPrime(int a) {
		boolean flag = true;
		if (a < 2) {// ������С��2
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(a); i++) {
				if (a % i == 0) {// ���ܱ���������˵����������������false
					flag = false;
					break;// ����ѭ��
				}
			}
		}
		return flag;
	}
	
	
}
