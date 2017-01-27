package arries;

public class SubMatrix1 {
	public int sumOfSubMatrix(int[][] mat, int n) {
        // write code here
		int max=mat[0][0];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){//i行j列
				for(int k=0;k<n;k++){//i行k列
					for(int h=0;h<n;h++){//k列h行
						int total=0;
						for(int o=i;o<=h;o++){
							for(int p=j;p<=k;p++){
								total=total+mat[o][p];
							}
						}
						//System.out.println(total);
						if(total>max){
							max=total;
						}
					}
				}
			}
		}
		return max;
    }
	
	public static void main(String args[]){
		SubMatrix1 s=new SubMatrix1();
		int a[][]={{1,2,-3},{3,4,-5},{-5,-6,-7}};
		System.out.print(s.sumOfSubMatrix(a, 3));
	}
}
