package strings;

import java.util.Scanner;

public class 符合条件的最长子串 {
	
	public static final char[] c = {'A','T','C','G'};
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int maxLength = 0;
		for(int i=0;i<str.length();i++){
			if(isContained(c, str.charAt(i))){
				for(int j=i+1;j<str.length();j++){
					if(!isContained(c,str.charAt(j))){
						if(j-i>maxLength){
							maxLength = j-i;
						}
						break;
					}else{
						if(j+1-i>maxLength){
							maxLength = j-i+1;
						}
					}
				}
			}
		}
		System.out.println(maxLength);
	}
	
	public static boolean isContained(char[] c, char b){
		for(int i=0;i<c.length;i++){
			if(c[i]==b){
				return true;
			}
		}
		return false;
	}
}
