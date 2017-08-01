package utils;

import java.util.ArrayList;

public class 进制转化 {

	/**
	 * 10进制转2进制
	 * @param a
	 * @return
	 */
	public static String tenTo2(int a){
		String result = "";
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(a!=0){
			int k = a%2;
			list.add(k);
			a=a/2;
		}
		for(int i=list.size()-1;i>=0;i--){
			result = result + list.get(i);
		}
		return result;
	}
	
	/**
	 * 二进制转10进制
	 * @param str
	 * @return
	 */
	public static int twoTo10(String str){
		int total =0;
		for(int i=str.length()-1; i>=0;i--){
			total = (int) (total + (str.charAt(i)-'0')*Math.pow(2, str.length()-i-1));
		}
		return total;
	}
	
	public static void main(String args[]){
		System.out.println(tenTo2(8));
		System.out.println(twoTo10("1110"));
	}
}
