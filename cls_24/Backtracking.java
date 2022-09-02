package cls_24;

public class Backtracking {
	public static void main(String[] args) {
		  boolean [] board =new boolean[4];
		  int t=2;  //Total queen
		  String str="";
		  int qpsf=0; //Queen place so far
		  ans(board,t,str,qpsf);
	}

	private static void ans(boolean[] board, int t, String str, int qpsf) {
		// TODO Auto-generated method stub
			if(qpsf==t) {
				System.out.println(str);
				return;
			}
			for (int i = 0; i< board.length; i++) {
				if(board[i]==false) {
					board[i]=true;
					ans(board, t,str+"b"+i+"q"+qpsf,qpsf+1);
					board[i]=false;
				}
		}
	}

}
