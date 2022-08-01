package cls_16;

import java.util.Scanner;

public class String_pallindrome {
	public static void main(String[] args) {
		//String str=new String ("ntin");
		Scanner ak=new Scanner (System.in);
		String str=ak.nextLine();
		System.out.println(ispall(str));
	}	

	private static boolean ispall(String str) {
		// TODO Auto-generated method stub
		int a=0;
		int b=str.length()-1;
	     while(a<b) {
	    	 if(str.charAt(a)!=str.charAt(b)) {
	    		 return false;
	    	 }
		a++;
		b--;
	}
	     return true;
	     
	}

}
