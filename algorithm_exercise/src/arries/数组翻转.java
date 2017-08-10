package arries;

import java.util.ArrayList;
import java.util.Scanner;

public class 数组翻转 {
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		int num = rev(rev(x)+rev(y));
		System.out.println(num);
	}
	
	/**
	 * 获取一个数各个位上的数值
	 * @param num
	 * @return
	 */
	public static ArrayList<Integer> getLetterInANum(int num){
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(num != 0){
			int temp = num%10;
			list.add(temp);
			num = num/10;
		}
		return list;
	}
	
	public static int rev(int n){
		int total = 0;
		ArrayList<Integer> list = getLetterInANum(n);
		for(int i=list.size()-1;i>=0;i--){
			total = (int) (total + list.get(i)*Math.pow(10, list.size()-i-1));
		}
		return total;
	}

}
