package partition;

import java.util.ArrayList;

public class PermuteUnique {
	public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
	        return per(num, num.length);
	}
	
	public static ArrayList<ArrayList<Integer>> per(int[] num, int length){
		ArrayList<ArrayList<Integer>> newList = new ArrayList<ArrayList<Integer>>();
		if(length == 1){
			ArrayList<Integer> list1 = new ArrayList<Integer>();
			list1.add(num[0]);
			newList.add(list1);
		}else{
			ArrayList<ArrayList<Integer>> temp = per(num, length-1);
			newList = new ArrayList<ArrayList<Integer>>();
			for(int i=0;i<temp.size();i++){
				ArrayList<Integer> list = temp.get(i);
				for(int j=0;j<=list.size();j++){
					//�ڵ�j��λ�ò���
					ArrayList<Integer> resultList = add(list, j, num[length]);
					if(! contains(newList, resultList)){
						newList.add(resultList);
					}
				}
			}
		}
		return newList;
	}
	
	//��list�ĵ�i��λ�ò�����j
	public static ArrayList<Integer> add(ArrayList<Integer> list, int i, int num){
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for(int k=0;k<list.size();k++){
			if(k==i){
				newList.add(num);
			}
			newList.add(list.get(k));
		}
		if(i==list.size()+1){
			newList.add(num);
		}
		return newList;
	} 
	
	//�ж�1,2�Ƿ����
	public static boolean judge(ArrayList<Integer> list1, ArrayList<Integer> list2){
		boolean flag = true;
		for(int i=0;i<list1.size();i++){
			if(list1.get(i) != list2.get(0)){
				return false;
			}
		}
		return flag;
	}
	
	//list1�Ƿ����list2
	public static boolean contains(ArrayList<ArrayList<Integer>> list1, ArrayList<Integer> list2){
		return list1.contains(list2);
	}
}
