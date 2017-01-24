package arries;

public class Rearrange {
	public int[] findSegment(int[] A, int n) {
        // write code here
		int k1=0;
		int k2=0;
		for(int i=0;i<n;i++){
			int temp=A[i];
			for(int j=i+1;j<n;j++){
				if(A[j]<A[i]){
					temp=A[j];
					k1=i;
					break;
				}
			}
			if(temp<A[i]){
				break;
			}
		}
		for(int i=n-1;i>=0;i--){
			int temp=A[i];
			for(int j=i-1;j>=0;j--){
				if(A[i]<A[j]){
					temp=A[j];
					k2=i;
					break;
				}
			}
			if(temp>A[i]){
				break;
			}
		}
		int result[]={k1,k2};
		return result;
    }
	public static void main(String args[]){
		Rearrange r=new Rearrange();
		int A[]={1,4,6,5,11,10};
		int a[]=r.findSegment(A, 6);
		System.out.print(a[0]+" "+a[1]);
	}
}
