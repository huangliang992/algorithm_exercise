package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class 黑化的牛牛 {

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<str.length();i++){
			String temp = remove(str,i);
			if(!list.contains(temp)){
				list.add(temp);
			}
		}
		System.out.println(list.size());
	}
	
	/**
	 * 去掉第i个字符后的串
	 * @param str
	 * @param i
	 * @return
	 */
	public static String remove(String str, int i){
		return str.substring(0,i)+str.substring(i+1, str.length());
	}
}
