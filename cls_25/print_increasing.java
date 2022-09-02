package cls_25;

public class print_increasing {
	public static void main(String[] args) {
		int n=5;
		ans(n);
	}

	private static void ans(int n) {
		// TODO Auto-generated method stub
		if(n==0)
		return;
		
		ans(n-1);
		System.out.println(n);
	}

}
