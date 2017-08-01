package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StringUtil {
	
	/**
	 * 统计字符串中各个字符的个数
	 */
	public Map<Character, Integer> getCharNumsOfString(String str){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++){
			if(!map.containsKey(str.charAt(i))){
				map.put(str.charAt(i), 1);
			}else{
				int value = map.get(str.charAt(i));
				map.put(str.charAt(i), ++value);
			}
		}
		return map;
	}
	
	/**
	 * 字符创是否包含字符
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
	 * 字符串分割如aabcddeeefgg
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
	
	public static void main(String args[]){
		ArrayList<String> list = divideStringByLetter("aabcddeeefgg");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}
