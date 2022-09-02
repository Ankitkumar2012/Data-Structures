package cls_25;

public class power {
	public static void main(String[] args) {
		int a=2;
		int b=10;
		System.out.println(ans(a,b));
	}

	private static int ans(int a, int b) {
		// TODO Auto-generated method stub
		if(b==0)
		return 1;
		
		int fn=ans(a,b-1);
		return fn*a;
	}

}
