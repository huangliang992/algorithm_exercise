package list;

public class Joseph {
	public int getResult(int n, int m) {
        // write code here
		int k=0;
		int a[]=new int[n];
		int r=1;
		for(int i=0;i<n;i++){
			a[i]=0;
		}
		for(int i=0;i<n;i=(i+1)%n){
			if(a[i]==0){
				k++;
			}
			if(k%m==0){
				a[i]=1;
				if(judge(a)){
					r=i+1;
					break;
				}
			}
		}
		return r;
    }
	
	public boolean judge(int[] a){
		boolean b=true;
		for(int i=0;i<a.length;i++){
			if(a[i]==0){
				b=false;
				break;
			}
		}
		return b;
	}
	
	public static void main(String args[]){
		Joseph j=new Joseph();
		System.out.print(j.getResult(5, 2));
	}
}
