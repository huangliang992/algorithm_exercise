package bin;

/**
 * 将一个数的二进制取反
 */
import java.util.ArrayList;

public class Exchange {
	public int exchangeOddEven(int x) {
        // write code here
		int result=0;
		ArrayList<Integer> a=toBin(x);
		ArrayList<Integer> b=new ArrayList<Integer>();
		for(int i=0;i<a.size();i++){
			if(a.get(i)==0){
				b.add(1);
			}
			else{
				b.add(0);
			}
		}
		for(int i=0;i<b.size();i++){
			System.out.print(b.get(i));
			result=(int) (result+b.get(i)*Math.pow(2, i));
		}
		System.out.println();
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
		Exchange e=new Exchange();
		System.out.println(e.exchangeOddEven(5));
	}
}
