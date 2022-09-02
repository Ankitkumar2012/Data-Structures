package cls_25;

public class Stair_jump {
	public static void main(String[] args) {
		int n=4;
		System.out.print("\n"+ans(n,0,""));
	}

	private static int ans(int n, int i, String str) {
		// TODO Auto-generated method stub
		if(i==n) {
			System.out.print(str+" ");
			return 1;
		}
		if(i>n) {
			return 0;
		}
		
		int fs=ans(n,i+1,str+1);
		int fp=ans(n,i+2,str+2);
		int fd=ans(n,i+3,str+3);
		return fs+fp+fd;
	}

}
