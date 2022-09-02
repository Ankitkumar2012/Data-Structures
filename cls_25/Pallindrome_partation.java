package cls_25;

import java.util.Scanner;

public class Pallindrome_partation {
	public static void main(String[] args) {
//		String str="nitin";
		Scanner ak=new Scanner (System.in);
		String str=ak.nextLine();
		isans(str,"");
	}
	private static void isans(String str,String ans) {
		// TODO Auto-generated method stub	
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}	
		for (int i = 1; i <= str.length(); i++) {
			String s=str.substring(0,i);
			if(ispall(s)==true) {
			isans(str.substring(i),ans+str.substring(0,i)+" | ");
			}
		}	
	}
	private static boolean ispall(String str) {
		// TODO Auto-generated method stub
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j))
				return false;
			else 
			i++;
			j--;
		}
		return true;
	}
}
