package arries;

import java.util.ArrayList;
import java.util.List;

public class ���ĳ��ִ��� {

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
	 * ��ȡһ��������λ�ϵ���ֵ
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
