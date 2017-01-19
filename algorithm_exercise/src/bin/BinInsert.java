package bin;

import java.util.ArrayList;

public class BinInsert {
	public int binInsert(int n, int m, int j, int i) {
        // write code here
		ArrayList<Integer> a1=toBin(n);
		ArrayList<Integer> a2=toBin(m);
		int a[]=new int[a1.size()];
		for(int k=0;k<a1.size();k++){
			if(k>=j&&k<=i&&k-j<a2.size()){
				a[k]=a2.get(k-j);
			}else{
				a[k]=a1.get(k);
			}
		}
		int result=0;
		for(int k=0;k<a.length;k++){
			//System.out.print(a[k]);
			result=(int) (result+a[k]*Math.pow(2, k));
		}
		return result;
    }
	
	public ArrayList<Integer> toBin(int n){
		ArrayList<Integer> arr=new ArrayList<Integer>();
		while(n!=0){
			arr.add(n%2);
			n=n/2;
		}
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		for(int i=0;i<arr.size();i++){
			arr1.add(arr.get(i));
			System.out.print(arr.get(i));
		}
		System.out.println();
		return arr1;
	}
	
	public static void main(String args[]){
		BinInsert b=new BinInsert();
		System.out.println(b.binInsert(4355, 4, 2, 7));
	}
}
