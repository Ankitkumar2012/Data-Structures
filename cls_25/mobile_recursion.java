package cls_25;

import java.util.ArrayList;

public class mobile_recursion {
	static String [] mob= {"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		String str="12";
		ans(str,list,"");
		System.out.println(list);
	}

	private static void ans(String str,ArrayList list,String ans) {
		// TODO Auto-generated method stub
		if(str.length()==0) {		
			list.add(ans);
			return;
		}
		
		char ch=str.charAt(0);
		String pstring=mob[ch-48];
		for (int i=0; i<pstring.length(); i++) {
			ans(str.substring(1),list,ans+pstring.charAt(i));
		}
		
	}

}
