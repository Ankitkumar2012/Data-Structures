package cls_25;

public class All_sebsequences {
	public static void main(String[] args) {
		String str="abc";
		ans(str,"");
	}

	private static void ans(String str,String atr) {
		// TODO Auto-generated method stub
		if(str.length()==0){
			
		if(atr.length()!=0)
			
		System.out.println(atr);
		return;
		}
		
		char ch=str.charAt(0);
		ans(str.substring(1),atr);
		ans(str.substring(1),atr+ch);
	}

}
