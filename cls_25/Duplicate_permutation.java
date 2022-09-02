package cls_25;

public class Duplicate_permutation {
	public static void main(String[] args) {
		String str="abca";
		ans(str,"");
	}

	private static void ans(String str, String atr) {
		if(str.length()==0) {
			System.out.print(atr+" ");
			return;
		}
		
		for (int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			boolean is=true;
			for (int j = i+1; j < str.length(); j++) {
				if(ch==str.charAt(j))
					is=false;
			}
			if(is) {
			String ans=str.substring(0,i)+str.substring(i+1);
			ans(ans,atr+ch);
			}
		}
	}

}
