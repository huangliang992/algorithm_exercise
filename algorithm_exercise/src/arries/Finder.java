package arries;

public class Finder {
	public int findMissing(int[][] numbers, int n) {
        // write code here
		int num=n;
		int temp=1;
		for(int i=0;i<n;i++){
			if(numbers[i][0]!=temp){
				temp=numbers[i][0];
			}else{
				//这个数前面那个缺了
				num=i;
				break;
			}
		}
		return num;
    }
	
	public static void main(String args[]){
		Finder f=new Finder();
		int a[][]={{0},{1,0},{1,1}};
		System.out.println(f.findMissing(a, 3));
	}
}
