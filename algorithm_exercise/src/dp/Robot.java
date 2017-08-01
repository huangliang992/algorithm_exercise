package dp;

public class Robot {
	public int countWays(int x, int y) {
        // write code here
		if(x>1&&y>1){
			return countWays(x-1,y)+countWays(x,y-1);
		}else{
			return 1;
		}
    }
	public static void main(String args[]){
		Robot r=new Robot();
		System.out.println(r.countWays(2, 2));
	}
}
