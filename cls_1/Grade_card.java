package cls_1;
import java.util.*;
public class Grade_card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		if(n>=75) {
			System.out.println("grade A");
		}
		else if(n<75 && n>=65) {
			System.out.println("grade B");
		}
		else if(n<65 && n>=55) {
			System.out.println("grade C");
		}
		else if(n<55 && n>=45) {
			System.out.println("grade D");
		}
		else {
			System.out.println("fail");
		}

	}

}
