package cls_16;

public class All_substring {
	public static void main(String[] args) {
		String str=new String ("nitin");
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<=str.length();j++) {
				System.out.println(str.substring(i,j));
			}
		}
	}

}
