package jingdong;

import java.util.Scanner;

public class Main11 {

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		for(int i=str.length()-1; i>=0;i--){
			if(judge(str.substring(0,i))){
				System.out.println(i);
				break;
			}
		}
	}
	
	public static boolean judge(String str){
		boolean flag = false;
		String str1 = str.substring(0, str.length()/2);
//		System.out.println("str1 "+str1);
		String str2 = str.substring(str.length()/2,str.length());
//		System.out.println("str2 "+str2);
		if(str1.equals(str2)){
			flag = true;
		}
		return flag;
	}
}
