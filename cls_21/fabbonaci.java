package cls_21;

public class fabbonaci {
	public static void main(String[] args) {
		int n=6;
		System.out.println(fibo(n));
	}

	private static int fibo(int n) {
		// TODO Auto-generated method stub
		if(n==0 || n==1) {
			return n;
		}
		int fn=fibo(n-1)+fibo(n-2);
		return fn;
	}

}
