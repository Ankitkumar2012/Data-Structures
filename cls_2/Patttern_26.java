package cls_2;

public class Patttern_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int star=1;
		int space=n-1;
		int val=1;
		while(row<=n) {
			int sp=1;
			while(sp<=space) {
				System.out.print("\t");
				sp++;
			}
			int st=1;
			while(st<=star) {
				System.out.print(val+"\t");
				val++;
				st++;
		}
			space--;
			star+=2;
			row++;
			val=1;
			System.out.println();
			}


	}

}
