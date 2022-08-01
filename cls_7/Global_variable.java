package cls_7;

public class Global_variable {
	static int c=34;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(c);
		ankit();
		System.out.println(c);

	}
	public static void ankit() {
		int c=90;
		System.out.println(c+20);
		c=c+6;
	}

}
