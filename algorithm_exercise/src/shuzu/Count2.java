package shuzu;

public class Count2 {
	
	//这种算法复杂度过大
	public int countNumberOf2s(int n) {
        // write code here
		int k=0;
		for(int i=1;i<=n;i++){
			int m=0;
			int temp=i;
			//统计i的位数
			while(temp!=0){
				temp=temp/10;
				m++;
			}
			//System.out.println(m);
			temp=i;
			for(int j=m-1;j>=0;j--){
				int a=(int) (temp/Math.pow(10, j));
				System.out.println(temp+" "+a);
				if(a==2){
					k++;
				}
				temp=(int) (temp-a*Math.pow(10, j));
			}
		}
		return k;
    }
	
	public int countNumberOf2s1(int n)
    {
        int result = 0;
        for(int i=1;i<=n;i*=10)
        {
            result+=(n/i+7)/10*i+(n/i%10==2?n%i+1:0)  ;      
        }
        return result;
            
             
    }
	
	public static void main(String args[]){
		Count2 c=new Count2();
		System.out.println(c.countNumberOf2s(1000));
		System.out.println(c.countNumberOf2s1(1000));
	}
}
