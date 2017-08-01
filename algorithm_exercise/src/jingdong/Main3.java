package jingdong;

import java.util.Scanner;

public class Main3 {

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String [] a = new String [str.length()];
		int [] tag = new int [str.length()];
		for(int i=0;i<str.length();i++){
			String temp = "";
			tag[i] = 0;
			for(int j=0;j<str.length();j++){
				if(j!=i){
					temp = temp + str.charAt(j);
				}
			}
			a[i] = temp;
		}
		
		int flag = 0;
		for(int i=0;i<str.length();i++){
			if(tag[i] == 0){
				flag++;
				tag[i] = flag;
				for(int j=i+1;j<str.length();j++){
					if(a[i].equals(a[j])){
						tag[j] = tag[i];
					}
				}
			}
		}
		
		System.out.println(flag);
	}
}
