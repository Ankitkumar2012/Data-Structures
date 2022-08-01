package cls_18;

public class Toggle_case {
	public static void main(String[] args) {
		String s="aaaaaa";
		StringBuilder str= new StringBuilder(s);
		ans(str);
	}

       public static void ans(StringBuilder str) {
		// TODO Auto-generated method stub
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				str.replace(i, i+1, (char)(str.charAt(i)+32)+"");
			}else {
				str.replace(i, i+1, (char)(str.charAt(i)-32)+"");
			}
		
		}
		System.out.println(str);
	}

}
