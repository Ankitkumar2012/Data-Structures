package cls_1;
import java.util.*;
public class Prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int a=2;
		int f=0;
		while(a<n) {
			if (n%a==0) {
				f=f+1;
			}
			a=a+1;
		}
		if (f>=1) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}

	}

}
