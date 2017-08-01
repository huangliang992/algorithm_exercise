package toutiao;

import java.util.Scanner;
import java.util.Stack;

/**
 * https://www.nowcoder.com/test/question/57cf0b1050834901933e9b48daafbb9a?pid=6035789&tid=9479962
 * @author hl
 *
 */
public class Main1 {
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] a = new int [n];
		for(int i=0;i<a.length;i++){
			a[i] = s.nextInt();
		}
		insertSort(a);
		int total = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0;i<a.length;i++){
			stack.push(a[i]);
		}
		while(!stack.isEmpty()){
			int k1 = stack.pop();
			if(!stack.isEmpty()){
				int k2 = stack.pop();
				if(k1-k2>10 && k1-k2<=20){
					total = total +1;
				}else if(k1- k2 >20){
					total = total +2;
					stack.push(k2);
				}else if(k1 - k2<=10){
					if(! stack.isEmpty()){
						int k3 = stack.pop();
						if(k2-k3>10){
							stack.push(k2);
							stack.push(k3);
						}
					}else{
						total = total +1;
					}
				}
			}else{
				total = total +2;
			}
			
		}
		System.out.println(total+1);
	}
	
	public static void insertSort(int[] numbers) {
		int size = numbers.length;
		int temp = 0;
		int j = 0;

		for (int i = 0; i < size; i++) {
			temp = numbers[i];
			// 假如temp比前面的值小，则将前面的值后移
			for (j = i; j > 0 && temp < numbers[j - 1]; j--) {
				numbers[j] = numbers[j - 1];
			}
			numbers[j] = temp;
		}
	}
}
