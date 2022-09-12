package cls_31;

public final class Method_overloading {
	public static void main(String[] args) {
		System.out.println(add(2,4));
		System.out.println(add(2,4,9));
		System.out.println(add(2,4,9.7));
		System.out.println(add(2,4,9,5,4,3,3,5,6,4,4,4,55,5,5,5,5));
	}
	public static int add(int a,int b) {
		return a+b;
	}
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
	public static int add(int a,int b,double c) {
		return (int) (a+b+c);
	}
	public static int add(int...a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}

}
