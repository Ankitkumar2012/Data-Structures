package cls_25;

public class Fibonacci {
	public static void main(String[] args) {
		int n=10;
		System.out.println(ans(n));
		
	}

	private static int ans(int n) {
		// TODO Auto-generated method stub
		if(n==0||n==1){
			return n;
		}
		int f1=ans(n-1);
		int f2=ans(n-2);
		return f1+f2;
	}

}
