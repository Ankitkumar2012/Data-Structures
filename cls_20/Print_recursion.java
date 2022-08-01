package cls_20;

public class Print_recursion {
	public static void main(String[] args) {
		int n=5;
		ans(n);
	}

	private static void ans(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return;
		}
		ans(n-1);		
		System.out.println(n);
	}

}
