package bin;

import java.util.ArrayList;

public class BinDecimal {
	public String printBin(double num) {
        // write code here
		String s=num+"";
		String s1="";
		String s2="0.";
		int dot=s.indexOf('.');
		for(int i=0;i<dot;i++){
			s1=s1+s.charAt(i);
		}
		for(int i=dot+1;i<s.length();i++){
			s2=s2+s.charAt(i);
		}
		int n1=Integer.parseInt(s1);
		double n2=Double.parseDouble(s2);
		//System.out.println(n1);
		//System.out.println(n2);
		ArrayList<Integer> a1=toBin(n1);
		ArrayList<Integer> a2=dToBin(n2);
		String result="";
		for(int i=a1.size()-1;i>=0;i--){
			result=result+a1.get(i);
		}
		result=result+".";
		for(int i=0;i<a2.size();i++){
			result=result+a2.get(i);
		}
		if(result.length()>32){
			return "Error";
		}else return result;
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
	
	public ArrayList<Integer> dToBin(double n){
		ArrayList<Integer> arr=new ArrayList<Integer>();
		int k=0;
		while(n!=0&&k<40){
			k++;
			n=n*2;
			if(n>=1){
				arr.add(1);
				n=n-1;
			}else{
				arr.add(0);
			}
		}
		return arr;//0.125---0001
	}
	
	public static void main(String args[]){
		BinDecimal b=new BinDecimal();
		System.out.println(b.printBin(8.125));
		//System.out.println(Math.pow(2, -1));
		String s="0.011101110000101110001100111110";
		System.out.println(s.length());
	}
}
