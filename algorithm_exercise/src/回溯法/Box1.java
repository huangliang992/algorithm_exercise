package »ØËÝ·¨;

public class Box1 {
	public int getHeight(int[] w, int[] l, int[] h, int n) {
        // write code here
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(w[j]>w[i]){
					int temp1=w[i];
					w[i]=w[j];
					w[j]=temp1;
					int temp2=l[i];
					l[i]=l[j];
					l[j]=temp2;
					int temp3=h[i];
					h[i]=h[j];
					h[j]=temp3;
				}
			}
		}
		int m[]=new int[n];
		for(int i=n-1;i>=0;i--){
			m[i]=h[i];
			int max=0;
			for(int j=n-1;j>=i+1;j--){
				if(m[j]>max&&l[i]>l[j]&&w[i]>w[j]){
					max=m[j];
				}
			}
			m[i]=m[i]+max;
			System.out.println(m[i]);
		}
		int Max=0;
		for(int i=0;i<n;i++){
			
			if(m[i]>Max){
				Max=m[i];
			}
		}
		return Max;
	}
	
	public static void main(String args[]){
		Box1 b=new Box1();
		int w[]={3,3,1};
		int l[]={4,3,1};
		int h[]={4,7,1};
		System.out.print(b.getHeight(w, l, h, 3));
	}
}