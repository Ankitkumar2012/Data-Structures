package cls_25;

public class print_decrese_increse {
	public static void main(String[] args) {
		int n=5;
		ans(n);
	}

	private static void ans(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			System.out.println(n);
			return ;
		}
		
		System.out.println((n));
		ans(n-1);
		System.out.println(n);
	}

}
