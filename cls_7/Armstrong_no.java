package cls_7;

import java.util.Scanner;

public class Armstrong_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		System.out.println(ans(n));

	}
	public static int numdig(int n) {
		int c=0;
		while(n!=0) {
			c++;
			n=n/10;
		}
		return c;
	}
	public static boolean ans(int n) {
		int d=numdig(n);
		int sum=0;
		int x=n;
		while(n>0) {
			int rem=n%10;
			sum=(int)(sum+Math.pow(rem,d));
			n=n/10;
		}
		if(sum==x) {
			return true;
		}else {
			return false;
		}
	}
}
