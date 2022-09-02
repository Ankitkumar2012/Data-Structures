 package cls_23;

public class Alphabat {
	static String[] arr= {" ","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="189";
		keypaid(str,"");
        
	}
	public static void keypaid(String str,String ans) {
		if(str.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		char ch=str.charAt(0);
		int idx =ch-'0';
		String key=arr[idx];
		for(int i=0;i<key.length();i++) {
			keypaid(str.substring(1),ans+key.charAt(i));
		}
		
		
	}
}
