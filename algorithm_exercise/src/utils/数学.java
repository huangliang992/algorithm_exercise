package utils;

import java.util.ArrayList;
import java.util.List;

public class 数学 {

	/**
	 * 获取一个数各个位上的数值
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
	 * a递增有序,使它偶数在前递增，奇数在后递减
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
	
	/**
	 * 找m, n的最大公约数
	 * @param m
	 * @param n
	 * @return
	 */
	public static int maxCommonDivisor(int m, int n) {  
        if (m < n) {// 保证m>n,若m<n,则进行数据交换  
            int temp = m;  
            m = n;  
            n = temp;  
        }  
        if (m % n == 0) {// 若余数为0,返回最大公约数  
            return n;  
        } else { // 否则,进行递归,把n赋给m,把余数赋给n  
            return maxCommonDivisor(n, m % n);  
        }  
    }  
	
	/**
	 * 求m，n的最小公倍数
	 * @param m
	 * @param n
	 * @return
	 */
    public static int minCommonMultiple(int m, int n) {  
        return m * n / maxCommonDivisor(m, n);  
    } 
    
    /**
     * 获取n的所有的约数
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
