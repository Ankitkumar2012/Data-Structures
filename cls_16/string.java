package cls_16;

public class string {
	public static void main(String[] args) {
		String str="hello";
		String str1="hello";
		System.out.println(str);
		String str2=new String("hello");
		String str3=new String("hello");
		str=str+"bye";
		System.out.println(str2.equals(str3));
		System.out.println(str.length());
		System.out.println(str.charAt(4));
		str=str.concat("ank");
		System.out.println(str);
		System.out.println(str.contains("llo"));
		
		//SUB STRING
		System.out.println(str.substring(2,5));
		System.out.println(str.substring(2));
			
		//duplicate pool is not alow 
		//in intern pool or string pool
	}

}
