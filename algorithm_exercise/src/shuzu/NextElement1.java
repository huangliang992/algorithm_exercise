package shuzu;

import java.util.Stack;

public class NextElement1 {
	public int[] findNext(int[] A, int n) {
        // write code here
		for(int i=0;i<n;i++){
			int temp=A[i];
			for(int j=i+1;j<n;j++){
				if(A[j]>temp){
					A[i]=A[j];
					break;
				}
			}
			for(int j=i+1;j<n;j++){
				if(A[j]>temp&&A[j]<A[i]){
					A[i]=A[j];
				}
			}
			if(A[i]==temp){
				A[i]=-1;
			}
		}
		return A;
    }
	
	public static void main(String args[]){
		NextElement1 n=new NextElement1();
		int A[]={11,13,10,5,12,21,3};
		int b[]=n.findNext(A, 7);
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}
}
