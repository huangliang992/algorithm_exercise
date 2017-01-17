package stack;

import java.util.ArrayList;
import java.util.Stack;

public class TwoStacks {
	public ArrayList<Integer> twoStacksSort(int[] numbers) {
        // write code here
		for(int i=0;i<numbers.length;i++){
			for(int j=i;j<numbers.length;j++){
				//从小到大
				if(numbers[j]<numbers[i]){
					int temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=numbers.length-1;i>=0;i--){
			list.add(numbers[i]);
		}
		return list;
    }
	public static void main(String args[]){
		TwoStacks t=new TwoStacks();
		int a[]={54695,46580,6418,52304,5595,5149,51943,11454};
		ArrayList<Integer> l=t.twoStacksSort(a);
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
	}
}
