package arries;

import java.util.ArrayList;

public class 打印阵列 {

	public static void main(String args[]){
		squarePatternPrint(5);
		
	}
	
	public static void squarePatternPrint(int n){
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = i;
		}
		//每行的开始数字为list.getIndex(i)*n+1
		ArrayList<Integer> list = reverse(a);
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				int temp = list.get(i)*n + j + 1;
				if(j<n-1){
					System.out.print(temp + "*");
				}else{
					System.out.print(temp);
				}
			}
			System.out.println();
		}
	}
	
	/**
	 * a递增有序,使它偶数在前递增，奇数在后递减
	 * @param a
	 * @return
	 */
	public static ArrayList<Integer> reverse(int[] a){
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++){
			if(i%2==0){
				list1.add(a[i]);
			}else{
				list2.add(a[i]);
			}
		}
		for(int i=list2.size()-1;i>=0;i--){
			list1.add(list2.get(i));
		}
		return list1;
	}
}
