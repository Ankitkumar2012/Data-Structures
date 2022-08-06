package cls_22;

public class SubSequence {
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
//		 char ch=str.charAt(0);
		 ans(str.substring(1),ans+str.charAt(0));
		 ans(str.substring(1),ans);

	}

}
