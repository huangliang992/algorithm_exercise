package arries;

import java.util.Scanner;

public class ÅòÕÍµÄÅ£Å£ {
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int []a = new int [n];
		for(int i=0;i<n;i++){
			a[i] = s.nextInt();
		}
		for(int i=0;i<n;i++){
			if(a[i]==m){
				m = m*2;
			}
		}
		System.out.println(m);
	}
}
