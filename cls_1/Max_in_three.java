package cls_1;
import java.util.*;
public class Max_in_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int a=ak.nextInt();
		int b=ak.nextInt();
		int c=ak.nextInt();
		if(a>b && a>c) {
		System.out.println(a);
		}
		else if(b>a && b>c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	}

}
