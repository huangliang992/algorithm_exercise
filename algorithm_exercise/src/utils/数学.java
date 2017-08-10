package utils;

import java.util.ArrayList;
import java.util.List;

public class ��ѧ {

	/**
	 * ��ȡһ��������λ�ϵ���ֵ
	 * @param num
	 * @return
	 */
	public static ArrayList<Integer> getLetterInANum(int num){
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(num != 0){
			int temp = num%10;
			list.add(temp);
			num = num/10;
		}
		return list;
	}
	
	/**
	 * a��������,ʹ��ż����ǰ�����������ں�ݼ�
	 * @param a
	 * @return
	 */
	public static ArrayList<Integer> reverse(int[] a){
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++){
			if(i%2==0){
				list1.add(a[i]);
			}else{
				list2.add(a[i]);
			}
		}
		for(int i=list2.size()-1;i>=0;i--){
			list1.add(list2.get(i));
		}
		return list1;
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
	
	/**
	 * ��m, n�����Լ��
	 * @param m
	 * @param n
	 * @return
	 */
	public static int maxCommonDivisor(int m, int n) {  
        if (m < n) {// ��֤m>n,��m<n,��������ݽ���  
            int temp = m;  
            m = n;  
            n = temp;  
        }  
        if (m % n == 0) {// ������Ϊ0,�������Լ��  
            return n;  
        } else { // ����,���еݹ�,��n����m,����������n  
            return maxCommonDivisor(n, m % n);  
        }  
    }  
	
	/**
	 * ��m��n����С������
	 * @param m
	 * @param n
	 * @return
	 */
    public static int minCommonMultiple(int m, int n) {  
        return m * n / maxCommonDivisor(m, n);  
    } 
    
    /**
     * ��ȡn�����е�Լ��
     * @param n
     * @return
     */
    public static ArrayList<Integer> getYueshu(int n){
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for(int i=2;i<n;i++){
    		if(n%i==0){
    			list.add(i);
    		}
    	}
    	return list;
    }
    
	
	public static void main(String args[]){
		int a[] = {0,1,2,3,4};
		List<Integer> list = getLetterInANum(100);
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
	}
}
