package cls_17;

import java.util.Scanner;

public class Play_WithGoodStrings {
	public static void main(String[] args) {
	//	String str ="baaecdaeioujhae";
		Scanner ak=new Scanner (System.in);
		String str=ak.nextLine();
				System.out.println(ans(str));
	}
	public static int ans(String str) {
		int ans=0;
		for(int i=0; i<str.length(); i++) {
			int ch=str.charAt(i);
			if(isvowel(str.charAt(i))==true){
				int count =0;
				while(i<str.length() && isvowel(str.charAt(i))==true){
					count++;
					i++;
				}
				ans=Math.max(ans, count);
			}
		}
		return ans;
	}
	public static boolean isvowel(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			return true;
		}
		return false;
		
	}

}
