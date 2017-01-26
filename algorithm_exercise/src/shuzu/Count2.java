package shuzu;

public class Count2 {
	public int countNumberOf2s(int n) {
        // write code here
		int k=0;
		for(int i=1;i<n;i++){
			int m=0;
			int temp=i;
			while(temp!=0){
				temp=temp/10;
				m++;
			}
			System.out.println(m);
			temp=i;
			for(int j=m-1;j>=0;j--){
				int a=(int) (temp/Math.pow(10, m));
				if(a==2){
					k++;
				}
				temp=(int) (temp-a*Math.pow(10, m));
			}
		}
		return k;
    }
	
	public int count2(int n){
		int i=n/10;
		int j=n-i*10;
		if(j<2){
			return i;
		}else return i+1;
	}
	public static void main(String args[]){
		Count2 c=new Count2();
		System.out.println(c.countNumberOf2s(22));
	}
}
