package cls_28;

public class Prime_sieve_algorithm {
	public static void main(String[] args) {
		int n=100;
		primesieve(n);
	}

	private static boolean ans(int n) {
		// TODO Auto-generated method stub
		int div=2;
		while(div*div<=n) {
			if(n%div==0) {
				return false;
			}
			div++;
		}
		return true;
	}
	public static void primesieve(int n) {
		boolean []prime=new boolean [n+1];
		
		prime[0]=true;
		prime[1]=true;
		for (int i = 2; i*i < prime.length; i++) {
			if(prime[i]==false) {
				for (int j = 2; j*i < prime.length; j++) {
					prime[j*i]=true;
				}
			}
		}
		for (int i = 0; i < prime.length; i++) {
			if (prime[i] == false)
				System.out.print(i + " ");			
		}
	}

}
