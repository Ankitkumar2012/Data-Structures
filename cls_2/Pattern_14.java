package cls_2;

public class Pattern_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int star=1;
		int space=n-1;
		while(row<=2*n-1) {
			int sp=1;
			while(sp<=space) {
				System.out.print(" "+" ");
				sp++;
			}
			int st=1;
			while(st<=star) {
				System.out.print("*"+" ");
				st++;
			}
			if (row<n) {
				space--;
				star++;
			}else {
				space++;
				star--;
			}
			row++;
			System.out.println();
		}

	}

}
