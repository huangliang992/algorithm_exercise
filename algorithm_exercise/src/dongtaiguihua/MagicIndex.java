package dongtaiguihua;

public class MagicIndex {
	public boolean findMagicIndex(int[] A, int n) {
        // write code here
		boolean f=false;
		int i=0;
		int j=n-1;
		while(i!=j){
			int temp=i+j/2;
			if(A[temp]>temp){
				j=temp;
			}else if(A[temp]==temp){
				f=true;
				break;
			}
		}
		return f;
    }
	
	public static void main(String args[]){
		MagicIndex m=new MagicIndex();
		int a[]={1,2,3,4,5,6};
		System.out.print(m.findMagicIndex(a, 6));
		
	}
	
}
