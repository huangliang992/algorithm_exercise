package jingdong;

import java.util.Scanner;

public class Main4 {

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int size = s.nextInt();
		int [] a = new int[n];
		for(int i = 0 ; i<n;i++){
			a[i] = s.nextInt();
		}
		for(int i=0;i<n;i++){
			if(a[i]==size){
				size = size*2;
			}
		}
		System.out.println(size);
	}
}
