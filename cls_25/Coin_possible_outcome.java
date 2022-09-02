package cls_25;

public class Coin_possible_outcome {
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
			
			ans(n-1,ans+"H");
			ans(n-1,ans+"T");
	}

}
