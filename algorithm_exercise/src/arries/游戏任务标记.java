package arries;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class 游戏任务标记 {

	public static int[] t = new int[32];
	
	static{
		for(int i=0;i<32;i++){
			t[i] = 0;
		}
	}
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		Hashtable hash = new Hashtable();
		int n = s.nextInt();
		int m = s.nextInt();
		if(n<1 || n >1024 || m<1 || m>1024){
			System.out.println(-1);
		}else{
			//做标记写
			int [] a = getIndex(n);
			int num = t[a[0]];
			String str = tenTo2(num);
			StringBuilder sb = new StringBuilder();
			for(int i=31; i>=0;i--){
				if(i>=str.length()){
					sb.append('0');
				}else{
					sb.append(str.charAt(i));
				}
			}
			str = sb.toString();
			sb.delete(0, sb.length());
			for(int i=0;i<str.length();i++){
				if(i==a[1]){
					sb.append('1');
				}else{
					sb.append(str.charAt(i));
				}
			}
			str = sb.toString();
			num = twoTo10(str);
			t[a[0]] = num;
			//读
			sb.delete(0, sb.length());
			int [] b = getIndex(m);
			num = t[b[0]];
			str = tenTo2(num);
			for(int i=31; i>=0;i--){
				if(i>=str.length()){
					sb.append('0');
				}else{
					sb.append(str.charAt(i));
				}
			}
			str = sb.toString();
			if(str.charAt(b[1])=='1'){
				System.out.println("1");
			}else{
				System.out.println("0");
			}
		}
		
	}
	
	public static int[] getIndex(int n){
		int [] a = new int [2];
		a[0] = (n-1)/32;
		a[1] = (n-1)%32;
		return a;
	}
	
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
}
