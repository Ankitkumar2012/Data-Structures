package cls_3;

public class Fibo_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int n=7;
		for(int i=1; i<=n; i++) {
			int c=a+b;
			a=b;
			b=c;
		}
		System.out.println(a);
		
		//by while loop
		while(a<=n) {
			int s=a+b;
			a=b;
			b=s;
		}
		System.out.println(a);
		a++;

	}

}
