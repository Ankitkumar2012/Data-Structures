package cls_24;

public class Queen_combination {
	public static void main(String[] args) {
		  boolean [] board =new boolean[4];
		  int t=2;  //Total queen
		  String str="";
		  int qpsf=0; //Queen place so far
		  int idx=0;
		  ans(board,t,str,qpsf,idx);
	}

	private static void ans(boolean[] board, int t, String str, int qpsf,int idx) {
		// TODO Auto-generated method stub
			if(qpsf==t) {
				System.out.println(str);
				return;
			}
			for (int i =idx; i< board.length; i++) {
				if(board[i]==false) {
					board[i]=true;
					ans(board, t,str+"b"+i+"q"+qpsf,qpsf+1,i+1);
					board[i]=false;
				}
		}
	}

}
