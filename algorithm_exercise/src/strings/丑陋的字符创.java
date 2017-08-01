package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class ³óÂªµÄ×Ö·û´´ {

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		StringBuilder sb = new StringBuilder();
		//ÌîÎÊºÅ
		while(stringContainsChar(str,'?')){
			sb.delete(0, sb.length());
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)=='?'){
					if(i+1<str.length() && str.charAt(i+1)!='?'){
						sb.append(str.charAt(i+1)=='A'?'B':'A');
					}else if(i-1>=0 && str.charAt(i-1) != '?'){
						sb.append(str.charAt(i-1)=='A'?'B':'A');
					}else{
						sb.append(str.charAt(i));
					}
				}else{
					sb.append(str.charAt(i));
				}
			}
			str = sb.toString();
		}
		ArrayList<String> list = divideStringByLetter(str);
		int total = 0;
		for(int i=0;i<list.size();i++){
			String tt = list.get(i);
			if(tt.length()>1){
				total = total + tt.length()-1;
			}
		}
		System.out.println(total);
	}
	
	/**
	 * ×Ö·û´´ÊÇ·ñ°üº¬×Ö·û
	 * @param str
	 * @param k
	 * @return
	 */
	public static boolean stringContainsChar(String str, char k){
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==k){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * ×Ö·û´®·Ö¸îÈçaabcddeeefgg
	 * aa|b|c|dd|eee|f|gg
	 * @param str
	 * @return
	 */
	public static ArrayList<String> divideStringByLetter(String str){
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<str.length();i++){
			int f = 1;
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(j)!=str.charAt(i)){
					list.add(str.substring(i,j));
					i=j-1;
					f = 0;
					break;
				}
			}
			if(f==1){
				list.add(str.substring(i,str.length()));
				break;
			}
		}	
		return list;
	}
}
