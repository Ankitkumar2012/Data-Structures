package cls_32;

public class Function_Overloading {
	public static void main(String[] args) {
		System.out.println(add(2,4));
		System.out.println(add(2,9.8f));
		System.out.println(add(2,7,11));
		System.out.println(add(1,2,3,4,5,6,7));
	}
	public static int add(int a,int b) {
		return a+b;
	}
	public static int add(int a,float b) {
		return (int)(a+b);
	}
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
	public static int add(int b,int...a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}

}
