package cls_25;

public class Permatution {
	static int count=0;
	public static void main(String[] args) {
		String atr="abc";
		ans(atr,"");
		System.out.println(count);
	}

	private static int ans(String atr, String ans) {
		// TODO Auto-generated method stub
		if(atr.length()==0){
			System.out.print(ans+" ");
			count++;
			return 0;
		}
		
		for (int i=0; i<atr.length(); i++) {
		String str=atr.substring(0,i)+atr.substring(i+1);
		char ch=atr.charAt(i);
		ans(str,ans+ch);
		}
		return count;
	}

}
