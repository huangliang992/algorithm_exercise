package jingdong;

import java.util.Scanner;

public class Main1 {

	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = scanner.nextInt();
		}
		int [][] b = new int [n][n];
		int total = 0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				//判断从i山到j山是否看得到
				if(judge(a, i, j)){
					b[i][j] = 1;
				}else b[i][j] = 0;
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
//				System.out.print(b[i][j]+" ");
				if(b[i][j]==b[j][i]&& b[i][j]==1 && i!=j){
					System.out.println(i+" "+j);
					total++;
				}
			}
			System.out.println();
		}
		System.out.println(total/2);
	}
	
	public static boolean judge(int[] a, int i, int j){
		boolean f = true;
		if(i < j && j-i > 1){
			for(int k=i + 1; k< j; k++){
				if(a[k] > a[j]){
					f = false;
				}
			}
		}else if(i > j && i-j>1){
			for(int k = i+1; k<a.length; k++){
				if(a[k]>a[j]){
					f = false;
				}
			}
			for(int k=0; k<j; k++){
				if(a[k] > a[j]){
					f = false;
				}
			}
		}
		
		return f;
	}
}
