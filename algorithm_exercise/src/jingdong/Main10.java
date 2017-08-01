package jingdong;

import java.util.Scanner;

public class Main10 {
	
	private static int num = 0;
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] a = new int[n];
		a[0]=1;
		for(int i=1;i<n;i++){
			a[i] = 0;
		}
		count(n, 1, a);
		System.out.println(num);
	}

	public static void count(int n, int t,int[] a){
		if(t<n){
			for(int i=0;i<2;i++){
				boolean f = judge(a, t, i);
				if(f){
					a[t] = i;
					count(n,t+1,a);
				}
			}
		}else{
			num++;
		}
	}
	
	public static boolean judge(int [] a, int j, int i){
		boolean f = true;
		for(int k=0;k<j;k++){
			//例如是4的倍数不是2的倍数
			if((j+1)%(k+1)==0 && a[k] ==0 && i==1){
				return false;
			}
		}
		//TODO：是2的倍数是3的倍数不是6的倍数返回FALSE
		int temp = j+1;
		for(int k=j-1;k>=1; k--){
			if(a[k]==1 && temp%(k+1)==0){
				temp=temp/(k+1);
			}
		}
		if(temp == 1 && i==0){
			return false;
		}
		return f;
	}
	
}
