package cls_2;

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int star=n;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
			System.out.print("*"+" ");
			i++;
			}
			row++;
			System.out.println();
		}

	}

}
