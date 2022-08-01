package cls_20;

public class Print_continue {
	public static void main(String[] args) {
		int n=5;
		ans(n);
	}

	private static void ans(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return;
		}
		System.out.println(n);
		ans(n-1);
		System.out.println(n);
		
	}

}
