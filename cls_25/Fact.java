package cls_25;

public class Fact {
	public static void main(String[] args) {
		int n=5;
		int ans=1;
		System.out.println(ans(n,ans));
	}

	private static int ans(int n,int ans) {
		// TODO Auto-generated method stub
//		int ans=1;
//		for (int i=1; i<=n; i++) {
//			ans=ans*i;
//		}
//		return ans;
		
		if(n==0) {
			return ans;
		}
		return ans(n-1,ans*n);
	}

}
