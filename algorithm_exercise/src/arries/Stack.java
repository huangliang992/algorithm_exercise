package arries;

public class Stack {
	public int getHeight(int[] men, int n) {
        // write code here
		int a[]=new int[n];
		a[0]=1;
		for(int i=1;i<n;i++){
			a[i]=1;
			for(int j=0;j<i;j++){
				int temp=a[j];
				if(men[i]>men[j]){
					temp=temp+1;
					if(temp>a[i]){
						a[i]=temp;
					}
				}
			}
		}
		int max=1;
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
			if(a[i]>max){
				max=a[i];
			}
		}
		return max;
    }
	
	public static void main(String args[]){
		Stack s=new Stack();
		int A[]={1,6,2,5,3,4};
		System.out.println(s.getHeight(A, 6));
	}
}
