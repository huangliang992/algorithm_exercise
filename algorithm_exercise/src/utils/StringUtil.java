package utils;

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
}
