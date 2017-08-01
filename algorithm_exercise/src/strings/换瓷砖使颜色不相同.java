package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 计算重复字母的子串个数，问题的本质是重复字母的个数
 * @author hl
 *
 */
public class 换瓷砖使颜色不相同 {
	
	public static void main(String args[]){
//		List<String> list = getDup("aacbdaadddefff");
//		for(int i=0;i<list.size();i++){
//			System.out.println(list.get(i));
//		}
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		List<String> list = getDup(str);
		int total = 0;
		for(int i=0;i<list.size();i++){
			int len = list.get(i).length();
			if(len > 1){
				total = total + len/2;
			}
		}
		System.out.println(total);
		
	}
	
	public static List<String> getDup(String str){
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<str.length();i++){
			int f = 1;
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i)!=str.charAt(j)){
					list.add(str.substring(i,j));
					f=0;
					i = j-1;
					break;
				}
			}
			if(f == 1){
				list.add(str.substring(i,str.length()));
				break;
			}
		}
		return list;
	}

}
