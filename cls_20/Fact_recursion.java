package cls_20;

public class Fact_recursion {
	public static void main(String[] args) {
		int n=5;
		System.out.println(fact(n));
	}

	private static int fact(int n) {
		// TODO Auto-generated method stub
		if(n==1) {
			return 1;
		}
		
		int fn=fact(n-1);
		return n*fn;
		
	}

}
