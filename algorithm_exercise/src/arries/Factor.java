package arries;

public class Factor {
	public int getFactorSuffixZero(int n) {
        // write code here
		int r=0;
		for(int i=1;i<=n;i++){
			if(i%5==0){
				int temp=i;
				while(temp%5==0){
					r++;
					temp=temp/5;
				}
			}
		}
		return r;
    }
	
	public static void main(String args[]){
		Factor f=new Factor();
		System.out.println(f.getFactorSuffixZero(169438));

	}
}
