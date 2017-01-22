package dongtaiguihua;

public class Robot1 {
	public int countWays(int [][] map,int x, int y) {
        // write code here
		if(map[x-1][y-1]==1){
			if(x>1&&y>1){
				return countWays(map,x-1,y)+countWays(map,x,y-1);
			}else{
				return 1;
			}
		}else{
			return 0;
		}
    }
	public static void main(String args[]){
		Robot1 r=new Robot1();
		int map[][]={{1,1,1},{1,0,1}};
		System.out.println(r.countWays(map,2, 3));
	}
}
