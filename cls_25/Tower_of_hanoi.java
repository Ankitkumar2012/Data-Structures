package cls_25;

public class Tower_of_hanoi {
	public static void main(String[] args) {
		int n=3;
		ans(n,"src","hlp","des");
	}

	private static void ans(int n, String src, String hlp, String des) {
		// TODO Auto-generated method stub
		if(n==0)
			return;
		
		ans(n-1,src,hlp,des);
		System.out.println("move "+n+" disc from "+src+" to "+des);
		ans(n-1,hlp,des,src);
	}

}
