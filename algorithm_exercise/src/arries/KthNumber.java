package arries;

public class KthNumber {
	public int findKth(int k) {
        // write code here
		int n=0;
		int temp=3;
		for(int i=3;i<100000000;i++){
			if(n>=k){
				break;
			}else
			if(isTh(i)){
				n++;
				temp=i;
			}
		}
		return temp;
    }
	
	public boolean isTh(int n){
		boolean b=true;
		while(n%3==0||n%5==0||n%7==0&&n!=1){
			if(n%3==0){
				n=n/3;
			}if(n%5==0){
				n=n/5;
			}if(n%7==0){
				n=n/7;
			}
		}
		if(n!=1){
			b=false;
		}
		return b;
	}
	
	public static void main(String args[]){
		KthNumber k=new KthNumber();
		System.out.println(k.isTh(5));
		System.out.println(k.findKth(5));
	}
}
