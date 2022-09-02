 package cls_23;

public class Permutation {
	public static void main(String[] args) {
		String str="abc";
		ans(str,"");
		
	}

	private static void ans(String str,String ans) {
		// TODO Auto-generated method stub
		if(str.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			String s2=str.substring(i+1);
			String s1=str.substring(0,i);
			ans(s1+s2,ans+ch);
		}
		
	}

}
