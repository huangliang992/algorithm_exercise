package 回文;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 制造回文 {
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		Map<Character, Integer> c = getCharNumsOfString(str);
		//统计奇数的个数,偶数个数
		int odd = 0;
		int ou = 0;
		int total = 0;
		for(Map.Entry<Character, Integer> entry : c.entrySet()){
			int value = entry.getValue();
			if(value%2!=0){
				odd++;
			}else{
				ou++;
			}
			
		}
		total = odd;
		System.out.println(total);
	}
	
	/**
	 * 统计字符串中各个字符的个数
	 */
	public static Map<Character, Integer> getCharNumsOfString(String str){
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
}
