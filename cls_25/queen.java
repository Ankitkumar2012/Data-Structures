package cls_25;

public class queen {
	public static void main(String[] args) {
		boolean board []=new boolean[4];
		int n=2;
		queen(board,n,0,"",0);
	}

	private static void queen(boolean[] board, int tq, int qpsf, String ans,int idx) {
		if(tq==qpsf) {
			System.out.println(ans);
			return;
		}
		for (int i = idx; i < board.length; i++) {
//			if (board[i]==false) {
//				board[i]=true;
				queen(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf+" ",i+1);
//				board[i]=false;
//			}
		}
		
	}

}
