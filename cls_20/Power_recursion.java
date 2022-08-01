package cls_20;

public class Power_recursion {
	public static void main(String[] args) {
		int a=5;
		int b=3;
		System.out.println(ans(a,b));
	}

	private static int ans(int a, int b) {
		// TODO Auto-generated method stub
		if(b==0) {
			return 1;
		}
		int fn=ans(a, b-1);
		return a*fn; 
	} 
}
