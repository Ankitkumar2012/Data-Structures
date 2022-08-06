package cls_22;

public class PrintHT {
	public static void main(String[] args) {
		int n=3;
		ans(n,"");
	}

	private static void ans(int n, String ans) {
		// TODO Auto-generated method stub
		if(n==0) { 
			System.out.print(ans+" ");
			return;
		}
		ans(n-1,ans+"H");
		ans(n-1,ans+"T");
		
	}

}
