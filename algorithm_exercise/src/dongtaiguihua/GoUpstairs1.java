package dongtaiguihua;

public class GoUpstairs1 {
	public int countWays(int n) {
        // write code here
		int a[]=new int [n];
		a[0]=1;
		a[1]=2;
		a[2]=4;
		for(int i=3;i<n;i++){
			a[i]=((a[i-1]%1000000007+a[i-2]%1000000007)%1000000007+a[i-3]%1000000007)%1000000007;
		}
		return a[n-1];
    }
	
	public static void main(String args[]){
		GoUpstairs1 g=new GoUpstairs1();
		System.out.print(g.countWays(3));
	}
}
