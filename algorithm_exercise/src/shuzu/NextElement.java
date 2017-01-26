package shuzu;

public class NextElement {
	public int[] findNext(int[] A, int n) {
        // write code here
		for(int i=0;i<n;i++){
			int t=A[i];
			for(int j=i+1;j<n;j++){
				if(A[j]>A[i]){
					A[i]=A[j];
					break;
				}
			}
			if(A[i]==t){
				A[i]=-1;
			}
		}
		return A;
    }
	
	public static void main(String args[]){
		NextElement n=new NextElement();
		int A[]={11,13,10,5,12,21,3};
		int b[]=n.findNext(A, 7);
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}
}
