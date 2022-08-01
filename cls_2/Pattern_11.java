package cls_2;

public class Pattern_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int space=n-1;
		int star=1;
		int row=1;
		while(row<=n) {
			int sp=1;
			while(sp<=space) {
				System.out.print("  ");
				sp++;
			}
			int st=1;
			while(st<=star) {
				if(st%2!=0) {
					System.out.print("*"+" ");
					}else {
						System.out.print(" "+" ");
					}
					st++;
			}
			row++;
			System.out.println();
			star+=2;
			space--;
			
		}
	}

}
