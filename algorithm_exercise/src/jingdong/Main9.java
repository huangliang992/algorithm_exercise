package jingdong;

import java.util.Scanner;

public class Main9 {

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		if(n<=1000&&m<=1000){
			int a[] = new int[n+m];
			for(int i=0;i<n;i++){
				a[i] = s.nextInt();
			}
			for(int i=0;i<m;i++){
				a[n+i] =  s.nextInt();
			}
			sort(a);
			String str = "";
			for(int i=0;i<a.length;i++){
				if(i > 0){
					if(a[i] > a[i-1]){
						str = str + a[i] + " ";
					}
				}else{
					str = str + a[i] + " ";
				}
			}
			System.out.println(str.substring(0, str.length()-1));
		}
	}
	
	public static int[] sort(int[] a){
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
}
