package cls_3;

import java.util.Scanner;

public class Reverse_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int i;
		while(n>0) {
			int rem=n%10;
			System.out.print(rem);
			n=n/10;
				
		}
	}
}