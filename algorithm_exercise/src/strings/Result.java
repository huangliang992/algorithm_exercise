package strings;


public class Result {
	public int[] calcResult(String A, String guess) {
        // write code here
		int r[]=new int[A.length()];
		int r1[]=new int[A.length()];
		for(int i=0;i<A.length();i++){
			r[i]=0;
			r1[i]=0;
		}
		for(int i=0;i<A.length();i++){
			if(A.charAt(i)==guess.charAt(i)){
				r[i]=1;
			}else{
				for(int j=0;j<A.length();j++){
					if(guess.charAt(j)==A.charAt(i)&&
							guess.charAt(j)!=A.charAt(j)&&r1[j]!=-1){
						r[i]=-1;
						r1[j]=-1;
						break;
					}
				}
			}
		}
		int k1=0;
		int k2=0;
		for(int i=0;i<r.length;i++){
			if(r[i]==1){
				k1++;
			}else if(r[i]==-1){
				k2++;
			}
		}
		int result[]={k1,k2};
		return result;
    }
	
	public static void main(String args[]){
		Result r=new Result();
		int re[]=r.calcResult("RGBY","GGRR");
		System.out.println(re[0]+" "+re[1]);
	}
}
