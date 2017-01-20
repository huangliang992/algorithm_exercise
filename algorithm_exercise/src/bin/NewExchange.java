package bin;

import java.util.ArrayList;

public class NewExchange {
	public int exchangeOddEven(int x) {
        // write code here
		ArrayList<Integer> a=toBin(x);
		ArrayList<Integer> b=new ArrayList<Integer>();//放偶数
		ArrayList<Integer> b1=new ArrayList<Integer>();//放奇数
		ArrayList<Integer> f=new ArrayList<Integer>();
		
		for(int i=0;i<a.size();i++){
			if(i%2==0){
				b.add(a.get(i));
			}else{
				b1.add(a.get(i));
			}
		}
		if(b1.size()<b.size()){
			b1.add(0);
		}
		for(int i=0;i<b.size();i++){
			f.add(b1.get(i));
			f.add(b.get(i));
		}
		int result=0;
		for(int i=0;i<f.size();i++){
			result=(int) (result+f.get(i)*Math.pow(2, i));
		}
		return result;
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
		NewExchange e=new NewExchange();
		System.out.println(e.exchangeOddEven(10));
	}
	
}
