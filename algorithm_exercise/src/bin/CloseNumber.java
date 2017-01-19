package bin;

import java.util.ArrayList;

public class CloseNumber {
	public int[] getCloseNumber(int x) {
        // write code here
		ArrayList<Integer> xl=toBin(x);
		int n=oneNumber(xl);
		int b[]=new int [2];
		for(int i=x-1;i>0;i--){
			ArrayList<Integer> a=toBin(i);
			int num=oneNumber(a);
			if(num==n){
				b[0]=i;
				break;
			}
		}
		for(int i=x+1;i<2*x+1;i++){
			ArrayList<Integer> a=toBin(i);
			int num=oneNumber(a);
			if(num==n){
				b[1]=i;
				break;
			}
		}
		return b;
    }
	
	public ArrayList<Integer> toBin(int n){
		ArrayList<Integer> arr=new ArrayList<Integer>();
		if(n==0){
			arr.add(0);
		}
		else{
			while(n!=0){
				arr.add(n%2);
				n=n/2;
			}
		}
		return arr;//8---0001
	}
	
	public int oneNumber(ArrayList<Integer> ar){
		int n=0;
		for(int i=0;i<ar.size();i++){
			if(ar.get(i)==1){
				n++;
			}
		}
		return n;
	}
	
	public static void main(String args[]){
		CloseNumber c=new CloseNumber();
		int a[]=c.getCloseNumber(34);
		System.out.println(a[0]);
		System.out.println(a[1]);
	}
}
