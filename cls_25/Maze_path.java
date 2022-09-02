package cls_25;

public class Maze_path {
	public static void main(String[] args) {
		int m=3;
		int n=3;
		ans(m-1,n-1,0,0,"");
	}

	private static void ans(int i, int j, int k, int l, String ans) {
		// TODO Auto-generated method stub
		if(i==k && j==l) {
			System.out.print(ans+" ");
			return;
		}
		if(k>i || l>j)
			return;
		
		ans(i,j,k,l+1,ans+"H");
		ans(i,j,k+1,l,ans+"V");
	}

}
