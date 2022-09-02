package cls_24;

public class Coin_arragnment {
	public static void main(String[] args) {
		  int [] coin = {2,3,8,5};
		  int amount=10;  //Total queen
		  String str="";
		  ans(coin,amount,str);
	}

	private static void ans(int[] coin, int amount, String str) {
		// TODO Auto-generated method stub
			if(amount==0) {
				System.out.println(str);
				return;
			}
			for (int i =0; i< coin.length; i++) {
				if(amount>=coin[i]) {
					ans(coin,amount-coin[i],str+coin[i]);
				}
		}
	}

}
