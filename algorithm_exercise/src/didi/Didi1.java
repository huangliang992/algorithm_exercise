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
			if(sum>max){
				max=sum;
				}
			for(int j=i+1;j<n;j++){
				sum=sum+a[j];
				if(sum>max){
					max=sum;
				}
				
			}
		}
		System.out.println(max);
	}
}
