package cls_25;

public class Count_all_subsequences {
	static int count=0;
	public static void main(String[] args) {
		String str="abdc";
		System.out.println(ans(str,""));
//		System.out.println(count);
	}

	private static int ans(String str,String atr) {
		// TODO Auto-generated method stub
		if(str.length()==0){
//		if(atr.length()!=0)
//		System.out.println(atr);
//		count++;
		return 1;
		}
		
		char ch=str.charAt(0);
		int f1=ans(str.substring(1),atr);
		int f2=ans(str.substring(1),atr+ch);
		return f1+f2;
	}

}
