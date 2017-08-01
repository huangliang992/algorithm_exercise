package jingdong;

import java.util.Scanner;

public class Main6 {

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String fStr = "";
//		System.out.println(count("AAABBABBA"));
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='?'){
				char left = str.charAt(i-1);
				char right = str.charAt(i+1);
				int ln = 0;
				int rn = 0;
				int k1 = i-1;
				while(k1 >=0){
					if(str.charAt(k1)==str.charAt(i-1)){
						k1--;
					}
				}
				ln = i - k1;
				int k2 = i + 1;
				while(k2 < str.length()){
					if(str.charAt(k2)==str.charAt(i+1)){
						k2++;
					}
				}
				rn = k2 - i;
				if(left == right && left == 'A'){
					fStr = fStr + 'B';
				}else if(left == right && left == 'B'){
					fStr = fStr + 'A';
				}else{
					if(ln > rn){
						fStr = fStr + str.charAt(i+1);
					}else{
						fStr = fStr + str.charAt(i-1);
					}
				}
			}else{
				fStr = fStr + str.charAt(i);
			}
		}
		System.out.println(fStr);
		System.out.println(count(fStr));
	}
	
	public static int count(String str){
		int count = 0;
		char temp = str.charAt(0);
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)==temp){
				count++;
			}
			temp = str.charAt(i);
		}
		return count;
	}
}
