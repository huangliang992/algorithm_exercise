package Tree;

public class LCA {
	public int getLCA(int a, int b) {
        // write code here
		int dp1=(int) (Math.log(a)/Math.log(2))+1;
		int dp2=(int) (Math.log(b)/Math.log(2))+1;
		if(dp1>dp2){
			int c=dp1-dp2;
			int a1=(int) (a/(Math.pow(2, c)));
			if(a1==b){
				return a1;
			}else{
				return getLCA(a1/2,b/2);
			}
		}else if(dp1<dp2){
			int c=dp2-dp1;
			int b1=(int) (b/(Math.pow(2, c)));
			if(b1==a){
				return b1;
			}else{
				return getLCA(a/2,b1/2);
			}
		}else{
			if(a==b){
				return a;
			}else{
				return getLCA(a/2,b/2);
			}
		}
    }
	public static void main(String args[]){
		LCA l=new LCA();
		System.out.println(l.getLCA(7, 13));
	}
}
