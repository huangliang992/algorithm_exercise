package jingdong;

import java.util.Scanner;

public class Main5 {

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] a = new int [n];
		for(int i =0;i< n;i++){
			a[i] = s.nextInt();
		}
		int total = n*(n-1)/2;
		int num = 0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]==a[j]){
					num ++;
				}
			}
		}
		System.out.println(total - num);
	}
}
