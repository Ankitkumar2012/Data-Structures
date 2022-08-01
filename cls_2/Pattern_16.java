package cls_2;

public class Pattern_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int space=n-1;
		int star=n;
		int row=1;
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
			if(row<n) {
				space--;
				star--;
			}else {
				star++;
				space++;
			}
			row++;
			System.out.println();
		}

	}

}
