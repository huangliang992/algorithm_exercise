package arries;

import java.util.ArrayList;

public class Subset {
	public ArrayList<ArrayList<Integer>> getSubsets(int[] A, int n) {
        // write code here
		//ÏÈ¶ÔAÅÅĞò
		for(int i=0;i<A.length;i++){
			for(int j=i+1;j<A.length;j++){
				if(A[j]<A[i]){
					int temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		ss(A,list,n-1);
		ArrayList<ArrayList<Integer>> list1=new ArrayList<ArrayList<Integer>>();
		//ÄæÖÃ
		for(int i=list.size()-1;i>=0;i--){
			ArrayList<Integer> a=list.get(i);
			ArrayList<Integer> ar=new ArrayList<Integer>();
			for(int j=a.size()-1;j>=0;j--){
				ar.add(a.get(j));
			}
			list1.add(ar);
		}
		return list1;
    }
	
	public void ss(int[] a,ArrayList<ArrayList<Integer>> list,int n){
		if(n==0){
			ArrayList<Integer> ar=new ArrayList<Integer>();
			ar.add(a[n]);
			list.add(ar);
		}else{
			ss(a,list,n-1);
			int temp=list.size();
			ArrayList<Integer> l2=new ArrayList<Integer>();
			l2.add(a[n]);
			list.add(l2);
			for(int i=0;i<temp;i++){
				ArrayList<Integer> l=list.get(i);
				ArrayList<Integer> l1=new ArrayList<Integer>();
				for(int j=0;j<l.size();j++){
					l1.add(l.get(j));
				}
				l1.add(a[n]);
				list.add(l1);
			}
		}
	}
	
	public static void main(String args[]){
		Subset s=new Subset();
		int a[]={123,456,789};
		ArrayList<ArrayList<Integer>> list=s.getSubsets(a, 3);
		for(int i=0;i<list.size();i++){
			ArrayList<Integer> arr=list.get(i);
			for(int j=0;j<arr.size();j++){
				System.out.print(arr.get(j)+",");
			}
			System.out.println();
		}
	}
}
