package arries;

import java.util.ArrayList;
import java.util.List;

public class 数的出现次数 {

	public int findDigitOccurrence(int num1, int num2){
		List<Integer> list = getLetterInANum(num2);
		int total = 0;
		for(int i=0;i<list.size();i++){
			if(list.get(i) == num1){
				total++;
			}
		}
		return total;
	}
	
	/**
	 * 获取一个数各个位上的数值
	 * @param num
	 * @return
	 */
	public ArrayList<Integer> getLetterInANum(int num){
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(num != 0){
			int temp = num%10;
			list.add(temp);
			num = num/10;
		}
		return list;
	}
}
