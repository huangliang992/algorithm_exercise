package bin;

import java.util.ArrayList;

public class Transform {
	public int calcCost(int A, int B) {
        // write code here
		ArrayList<Integer> a=toBin(A);
		ArrayList<Integer> b=toBin(B);
		int n=0;
		if(a.size()>=b.size()){
			for(int i=0;i<b.size();i++){
				if(a.get(i)!=b.get(i)){
					n++;
				}
			}
			for(int i=b.size();i<a.size();i++){
				if(a.get(i)==1){
					n++;
				}
			}
		}else{
			for(int i=0;i<a.size();i++){
				if(a.get(i)!=b.get(i)){
					n++;
				}
			}
			for(int i=a.size();i<b.size();i++){
				if(b.get(i)==1){
					n++;
				}
			}
		}
		return n;
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
	
	public static void main(String args[]){
		Transform t=new Transform();
		System.out.println(t.calcCost(20, 10));
	}
}
