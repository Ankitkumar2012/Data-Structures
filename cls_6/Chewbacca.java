package cls_6;

import java.util.Scanner;

public class Chewbacca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		long n=ak.nextLong();
		long sum=0;
		int mul=1;
		while(n!=0) {
			long t=n%10;
			if(t>=5) {
				sum=sum+(9-t)*mul;
			}else {
				sum=sum+t*mul;
			}
			n=n/10;
			mul=mul*10;
		}
		System.out.println(sum);

	}

}
