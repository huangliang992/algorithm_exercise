package wangyi;

import java.util.Scanner;
//
public class XiPai {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int k=in.nextInt();
		for(int i=0;i<k;i++){
			int n=in.nextInt()*2;
			int a []=new int [n];
			int m=in.nextInt();
			for(int j=0;j<n;j++){
				a[j]=in.nextInt();
			}
			for(int h=0;h<m;h++){
				a=xipai(a);
			}
			for(int j=0;j<n;j++){
				if(j<n-1){
				System.out.print(a[j]+" ");
				}else{
					System.out.print(a[j]);
				}
			}
			System.out.println();
		}
	}
	public static int [] xipai(int a[]){
		int r[]=new int [a.length];
		for(int i=0;i<a.length;i++){
			if(i%2==0){
				r[i]=a[i/2];
			}else{
				r[i]=a[(a.length+i-1)/2];
			}
		}
		return r;
	}
}
