package cls_21;

public class Fact_tail {
	public static void main(String[] args) {
		int n=5;
		System.out.println(fact(n,1));
	}

	private static int fact(int n,int ans) {
		// TODO Auto-generated method stub
		if(n==0) {
			return ans;
		}
		
		return fact(n-1,ans*n);
	}

}
