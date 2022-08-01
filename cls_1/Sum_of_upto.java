package cls_1;
import java.util.*;
public class Sum_of_upto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int a=1;
	    int sum=0;
	    while(a<=n) {
	    	sum=sum+a;
	    	a=a+1;
	    }
	    System.out.println(sum);
	}

}
