package backtrace;

import java.util.Scanner;

public class 猜数游戏 {
	
	public static int total = 0;
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] select = new int[n];
		for(int i =0;i<n;i++){
			if(i == 0){
				select[i] = 1;
			}else{
				select[i] = 0;
			}
		}
		count(n, 1, select);
		System.out.println(total);
		
	}
	
	public static void count(int n, int t, int[] select){
		//t从1开始
		if(t<n){
			for(int i=0;i<2;i++){
				boolean f = judge(select, t, i);
				if(f){
					select[t] = i;
					count(n, t+1, select);
					select[t] = 0;
				}
			}
		}else{
			total = total +1;
		}
	}
	
	/**
	 * 判断select的第n个位置能否填i
	 * @param select
	 * @param n
	 * @param i
	 * @return
	 */
	public static boolean judge(int[] select, int n, int i){
		if(i==1){
			//n+1的约数要为1
			for(int j=0;j<=n/2;j++){
				if((n+1)%(j+1)==0 && select[j] == 0){
					return false;
				}
			}
		}
		if(i==0){
			int temp = n+1;
			for(int j=n/2; j>=0; j--){
				if(select[j]==1 && temp%(j+1)==0){
					temp = temp/(j+1);
				}
			}
			if(temp == 1){
				return false;
			}
		}
		return true;
	}
}
