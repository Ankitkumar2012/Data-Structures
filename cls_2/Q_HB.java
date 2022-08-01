package cls_2;
import java.util.*;
public class Q_HB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int space=n-1;
		int star=1;
		int row=1;
		int val=1;
		int space1=-1;
		while(row<=n) {
			int sp=1;
			while(sp<=space) {
				System.out.print("  ");
				sp++;
			}
			int st=1;
			int v=val;
			while(st<=star) {
				System.out.print(v+" ");
				v--;
				st++;
				}
			int sp1=1;
			while(sp1<=space1) {
				System.out.print("  ");
				sp1++;
			}
			int st1=1;
			int l=1;
			if(row==1 || row==n) {
				st1++;
			}
			while(st1<=star) {
				System.out.print(l+" ");
				st1++;
				l++;
			}
			if(row<=n/2) {
				space-=2;
				star++;
				space1+=2;
				val++;
			}else {
				space+=2;
				star--;
				space1-=2;
				val--;
			}
			row++;
			System.out.println();
		}

	}
}

