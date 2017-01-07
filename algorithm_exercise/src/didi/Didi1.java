package didi;

import java.util.Scanner;

public class Didi1 {
	public static void main(String args[]){
		Scanner buffer=new Scanner(System.in);
		int n=buffer.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++){
			a[i]=buffer.nextInt();
		}
		/*
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}*/
		int max=a[0];
		for(int i=0;i<n;i++){
			int sum=a[i];
			for(int j=i+1;j<n;j++){
				if(sum+a[j]>=sum){
					sum=sum+a[j];
				}else break;
			}
			if(sum>max){
				max=sum;
			}
		}
		System.out.println(max);
	}
}
