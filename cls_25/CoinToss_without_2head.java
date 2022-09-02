package cls_25;

public class CoinToss_without_2head {
	public static void main(String[] args) {
		int n=3;
		ans(n,"");
	}

	private static void ans(int n, String ans) {
		// TODO Auto-generated method stub
		if(n==0){
			System.out.println(ans);
			return;
			}
			
			if(ans.length()==0 || ans.charAt(ans.length()-1)!='H') {
				ans(n-1,ans+"H");
			}
			ans(n-1,ans+"T");
	}

}
