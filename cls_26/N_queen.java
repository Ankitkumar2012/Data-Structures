package cls_26;

public class N_queen {
	public static void main(String[] args) {
		int n=4;
		boolean [][]board=new boolean[n][n];
		nqueen(n,board,0);
	}

	private static void nqueen(int n, boolean[][] board, int row) {
		if(n==0) {
			display(board);
			System.out.println();
			return;
		}
		for (int col=0; col<board.length; col++) {
			if(itispossible(board,row,col)){
				board[row][col]=true;
				nqueen(n-1,board,row+1);
				board[row][col]=false;
			}
		}
	}
	
	
	
	private static boolean itispossible(boolean[][] board, int row, int col) {
		//Top
		int r=row;
		while(r>=0) {
			if(board[r][col]==true) {
				return false;
			}
			r--;
		}
		
		// Right Diagonal
		r=row;
		int c=col;
		while(r>=0 && c<board.length) {
			if(board[r][c]==true) {
				return false;
			}
			r--;
			c++;
		}
		
		//left Diagonal
		r=row;
		c=col;
		while(r>=0 && c>=0) {
			if(board[r][c]==true) {
				return false;
			}
			r--;
			c--;
		}
		return true;
	}
	
	

	public static void display(boolean[][]board) {
		for (int i = 0; i <board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
			
		}
	}

}
