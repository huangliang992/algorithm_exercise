package jingdong;

import java.util.Scanner;

public class Main2 {

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int min = count(str, 0);
		for(int i=0;i<str.length();i++){
			int count = count(str, i);
			if(count < min){
				min = count;
			}
		}
		System.out.println(min);
	}
	
	public static int count(String str, int l){
		int count = 0;
		for(int i=l-1;i>=0;i--){
			if((l-i)%2==1 && str.charAt(i)==str.charAt(l)){
				count ++;
			}
			if((l-i)%2==0 && str.charAt(i)!=str.charAt(l)){
				count ++;
			}
		}
		for(int i=l+1;i<str.length();i++){
			if((i-l)%2==1 && str.charAt(i)==str.charAt(l)){
				count ++;
			}
			if((i-l)%2==0 && str.charAt(i)!=str.charAt(l)){
				count ++;
			}
		}
		return count;
	}
}
