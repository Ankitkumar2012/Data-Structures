package cls_22;

public class NotprintHH {
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
		if(ans.length()==0 || ans.charAt(ans.length()-1)!='H') {		
			ans(n-1,ans+"H");
		}
		ans(n-1,ans+"T");
		
	}

}
