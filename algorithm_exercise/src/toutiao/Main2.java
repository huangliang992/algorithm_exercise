package toutiao;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
	
	public static final ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int [] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = s.nextInt();
		}
		int total =0;
		for(int i=0;i<n;i++){
			String str1 = tenTo2(a[i]);
			for(int j=i+1;j<n;j++){
				String str2 = tenTo2(a[j]);
				String r = yihuo(str1, str2);
				int result = twoTo10(r);
				if(result > m){
					total ++;
				}
			}
		}
		System.out.println(total);
	}

	
	
	/**
	 * 10进制转2进制
	 * @param a
	 * @return
	 */
	public static String tenTo2(int a){
		String result = "";
		
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
	 * 二进制a异或b
	 * @param a
	 * @param b
	 * @return
	 */
	public static String yihuo(String a, String b){
		String temp = "";
		StringBuilder sb = new StringBuilder();
		if(a.length()>b.length()){
			temp = b;
			for(int i=0;i<a.length()-b.length(); i++){
				temp = '0' + temp;
			}
			for(int i=0;i<temp.length();i++){
				if(a.charAt(i)==temp.charAt(i)){
					sb.append('0');
				}else{
					sb.append('1');
				}
			}
		}
		if(b.length()>a.length()){
			temp = a;
			for(int i=0;i<b.length()-a.length(); i++){
				temp = '0' + temp;
			}
			for(int i=0;i<temp.length();i++){
				if(temp.charAt(i)==b.charAt(i)){
					sb.append('0');
				}else{
					sb.append('1');
				}
			}
		}
		return sb.toString();
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
}
