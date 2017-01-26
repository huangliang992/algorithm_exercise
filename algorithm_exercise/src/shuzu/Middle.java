package shuzu;

public class Middle {
	public int[] getMiddle(int[] A, int n) {
        // write code here
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=get(A,i);
		}
		return a;
    }
	
	public int get(int[] a,int k){
		for(int i=0;i<=k;i++){
			for(int j=i+1;j<=k;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[k/2];
	}
	
	public static void main(String args[]){
		Middle m=new Middle();
		int A[]={1,3,3,4,2,6};
		int a[]=m.getMiddle(A, 6);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
