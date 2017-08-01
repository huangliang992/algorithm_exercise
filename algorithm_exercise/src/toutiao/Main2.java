package toutiao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * what a fuck，内存超出限制
 * @author hl
 *
 */
public class Main2 {
	
	public static final ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static final StringBuilder sb = new StringBuilder();
	
	public static String str = "";
	
	public static void main(String args[]){
		System.out.println(tenTo2(17));
		System.out.println(tenTo2(24));
		System.out.println(yihuo(tenTo2(17),tenTo2(24)));
		System.out.println(twoTo10(yihuo(tenTo2(17),tenTo2(24))));
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
		list.clear();
		str = "";
		while(a!=0){
			int k = a%2;
			list.add(k);
			a=a/2;
		}
		for(int i=list.size()-1;i>=0;i--){
			str = str + list.get(i);
		}
		return str;
	}
	
	/**
	 * 二进制a异或b
	 * @param a
	 * @param b
	 * @return
	 */
	public static String yihuo(String a, String b){
		sb.delete(0, sb.length());//使用前清空一下
		str = "";
		if(a.length()>b.length()){
			str = b;
			for(int i=0;i<a.length()-b.length(); i++){
				str = '0' + str;
			}
			for(int i=0;i<str.length();i++){
				if(a.charAt(i)==str.charAt(i)){
					sb.append('0');
				}else{
					sb.append('1');
				}
			}
		}else if(b.length()>a.length()){
			str = a;
			for(int i=0;i<b.length()-a.length(); i++){
				str = '0' + str;
			}
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)==b.charAt(i)){
					sb.append('0');
				}else{
					sb.append('1');
				}
			}
		}else{
			for(int i=0;i<a.length();i++){
				if(a.charAt(i)==b.charAt(i)){
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
