package arries;

import java.util.ArrayList;

public class Coins {
	public int countWays(int n) {
        // write code here
		ArrayList<Integer> list=new ArrayList<Integer>();
		int a[]={1,5,10,25};
		int k=0;
		int t=0;
		count(n,k,list,a,t);
		ArrayList<Integer> list1=new ArrayList<Integer>();
		for(int i=0;i<list.size();i++){
			if(!list1.contains(list.get(i))){
				list1.add(list.get(i));
			}
		}
		return list1.size()%1000000007;
    }
	
	public void count(int n, int k, ArrayList<Integer> list, int a[],int t){
		if(k<n){
			for(int i=0;i<a.length;i++){
				t++;
				count(n,k+a[i],list,a,t);
				t--;
			}
		}else if(k==n){
			list.add(t);
		}
	}
	
	public int countWays1(int n) {
        // write code here
        int coins[]={1,5,10,25};
        int dp[] = new int [100001];     
        for(int i=1;i<dp.length;i++){
        	dp[i]=0;
        }
        dp[0] = 1;
        for(int i = 0;i < 4;++i){
            for(int j = coins[i];j <= n;++j){
                dp[j] =(dp[j]+dp[j-coins[i]])%1000000007;               
            }
        }
        return dp[n];
    }
	
	public static void main(String args[]){
		Coins c=new Coins();
		System.out.println(c.countWays1(32));
		System.out.println(c.countWays(32));
	}
}
