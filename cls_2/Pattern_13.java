package cls_2;

public class Pattern_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int star=1;
		while(row<=2*n-1) {
			int st=1;
			while(st<=star) {
				System.out.print("*"+" ");
				st++;
			}
			if(row<n) {
				star++;
			}else {
				star--;
			}
			
			row++;
			System.out.println();
		}

	}

}
