package cls_23;

public class TowerofHanoi {
	public static void main(String[] args) {
		int n=3;
		String str="A";
		String hlp="B";
		String des="C";
		toh(n,str,hlp,des);
	}

	private static void toh(int n,String str, String hlp, String des) {
		// TODO Auto-generated method stub
		if(n==0) {
			return;
		}
		toh(n-1,str,des,hlp);
		System.out.println("move "+n+"th disc from "+str+" to "+des);
		toh(n-1,hlp,str,des);
		
	}

}
