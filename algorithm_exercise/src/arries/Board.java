package arries;

public class Board {
	public boolean checkWon(int[][] board) {
        // write code here
		boolean f=false;
		for(int i=0;i<3;i++){
			if(board[i][0]==1&&board[i][1]==1&&board[i][2]==1){
				f=true;
				break;
			}
			if(board[0][i]==1&&board[1][i]==1&&board[2][i]==1){
				f=true;
				break;
			}
		}
		if(board[0][0]==1&&board[1][1]==1&&board[2][2]==1){
			f=true;
		}
		if(board[0][2]==1&&board[1][1]==1&&board[2][0]==1){
			f=true;
		}
		return f;
    }
	
	public static void main(String args[]){
		Board b=new Board();
		int board[][]={{1,0,1},{0,-1,-1},{1,-1,0}};
		System.out.print(b.checkWon(board));
	}
}
