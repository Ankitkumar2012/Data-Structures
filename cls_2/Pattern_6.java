package cls_2;

public class Pattern_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int star=5;
		int space=0;
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
			star--;
			space+=2;
		}

	}

}
