package arries;

import java.util.Scanner;

public class 圆上优雅的点 {

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = (int) Math.sqrt(n);
		int total = count(m, n);
		System.out.println(total);
	}
	
	public static int count(int m, int n){
		int total = 0;
		if(m*m == n){
			total = total +4;
			for(int i=1; i<m; i++){
				if(judge(i, n)){
					total = total + 4;
				}
			}
		}else{
			for(int i=1; i<=m; i++){
				if(judge(i, n)){
					total = total + 4;
				}
			}
		}
		return total;
	}
	
	public static boolean judge(int n, int m){
		int temp = m - n*n;
		int t = (int) Math.sqrt(temp);
		if(t*t == temp){
			return true;
		}
		if( (t+1)*(t+1) == temp){
			return true;
		}
		return false;
	}
	
}
