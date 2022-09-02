package cls_24;

public class coin_combination {
	public static void main(String[] args) {
		  int [] coin = {2,3,8,5};
		  int amount=10;  //Total queen
		  String str="";
		  int idx=0;
		  ans(coin,amount,str,idx);
	}

	private static void ans(int[] coin, int amount, String str,int idx) {
		// TODO Auto-generated method stub
			if(amount==0) {
				System.out.println(str);
				return;
			}
			for (int i =idx; i< coin.length; i++) {
				if(amount>=coin[i]) {
					ans(coin,amount-coin[i],str+coin[i],i);
				}
		}
	}

}
