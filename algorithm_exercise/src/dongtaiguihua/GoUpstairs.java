package dongtaiguihua;

public class GoUpstairs {
	public int countWays(int n) {
        // write code here
		if(n>0){
			int result=0;
			int total=0;
			result=count(n,total)%1000000007;
			return result;
		}else{
			return 0;
		}
    }
	
	public int count(int n,int total){
		if(n==0){
			return 1;
		}else if(n==1){
			return 1;
		}else if(n==2){
			return 2;
		}else{
			return total+count(n-1,total)+count(n-2,total)+count(n-3,total);
		}
	}
	
	public static void main(String args[]){
		GoUpstairs g=new GoUpstairs();
		System.out.println(g.count(34, 0));
		System.out.println(g.countWays(34));
	}
	
	
}
