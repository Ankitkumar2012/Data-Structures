package cls_22;

public class climb_stair {
	public static void main(String[] args) {
		int n=4;
		ans(0,n,"");
	}

	private static void ans(int n,int m,String ans) {
		// TODO Auto-generated method stub
		if(n==m) {
			System.out.println(ans);
			return;
		}
		if(n>m) {
			return;
		}
		ans(n+1,m,ans+1);
		ans(n+2,m,ans+2);
		ans(n+3,m,ans+3);
//		for (int i = 1; i <= 3; i++) {
//			ans(n+i,m,ans+i);
//		}
	}

}
