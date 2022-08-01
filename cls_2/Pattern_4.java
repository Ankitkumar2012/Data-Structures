package cls_2;

public class Pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int star=1;
		int space=n-1;
		int row=1;
		while(row<=n) {
			int sp=1;
			while(sp<=space) {
				System.out.print(" ");
				sp++;
			}
			int st=1;
			while(st<=star) {
				System.out.print("*");
				st++;
			}
			row++;
			System.out.println();
			star++;
			space--;
		}

	}

}
