package ����;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ������� {
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		Map<Character, Integer> c = getCharNumsOfString(str);
		//ͳ�������ĸ���,ż������
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
	 * ͳ���ַ����и����ַ��ĸ���
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
