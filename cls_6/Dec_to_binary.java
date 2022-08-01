package cls_6;

import java.util.Scanner;

public class Dec_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int sum=0;
		int mul=1;
		while(n!=0) {
			int rem=n%2;
			sum=sum+rem*mul;
			n=n/2;
			mul=mul*10;
		}
		System.out.println(sum);
		
	}

}
