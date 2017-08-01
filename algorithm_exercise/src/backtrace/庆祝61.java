package backtrace;

import java.util.Scanner;

public class 庆祝61 {
	
	public static int fNum = 200;

	public static void main(String args[]){
//		int[] l1 = {0,1,2,3};
//		int[] l2 = {100, 103, 98, 105};
//		System.out.println(countLow(l1, l2));;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] a = new int [n];
		for(int i=0;i<n ;i++){
			a[i] = s.nextInt();
		}
		int select[] = new int[n];
		for(int i=0;i<n;i++){
			select[i] = -1;
		}
		backTrace(a, select, 0, n);
		System.out.println(fNum);
	}
	
	/**
	 * 回溯(最大是A20)
	 * @param a
	 * @param select
	 * @param t
	 * @param n
	 */
	public static void backTrace(int[] a, int[] select, int t, int n){
		if(t<n){
			for(int i=0;i<n;i++){
				boolean slected = judge(select, t, i);//第t次前第i个孩子是否选过了
				if(!slected){
					select[t] = i;
					backTrace(a, select, t+1, n);
					select[t] = 0;
				}
			}
		}else{
			//依据select判断最低差
			int temp = countLow(select, a);
			if(temp<fNum){
				fNum = temp;
			}
		}
	}
	
	/**
	 * 判断tci以前第k个孩子是否被选过
	 * @param select
	 * @param t
	 * @param k
	 * @return
	 */
	public static boolean judge(int[] select, int t, int k){
		for(int i=0;i<t;i++){
			if(select[i]==k){
				return true;
			}
		}
		return false;
	}
	
	public static int countLow(int[] select, int[] weight){
		int min = Math.abs(weight[select[select.length-1]] - weight[select[0]]);
		for(int i=0;i<select.length-1;i++){
			int v = Math.abs(weight[select[i+1]] - weight[select[i]]);
			if(v > min){
				min = v;
			}
		}
		return min;
	}
}
