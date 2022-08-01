package cls_2;

public class Pattern_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int star=n/2+1;
		int space=-1;
		int row=1;
		while(row<=n) {
			int st=1;
			while(st<=star) {
			System.out.print("*"+" ");
			st++;
			}
			int sp=1;
			while(sp<=space) {
				System.out.print(" "+" ");
				sp++;
			}
			int k=1;
			if(row==1 || row==n) {
				k++; 
			}
			while(k<=star) {
				System.out.print("*"+" ");
				k++;
			}
			if(row<=n/2) {
				star--;
				space+=2;
			}else {
				star++;
				space-=2;
			}
			row++;
			System.out.println();
		}

	}

}
