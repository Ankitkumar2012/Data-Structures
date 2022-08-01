package cls_13;

import java.util.Scanner;

public class Calculate_thesum {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int [] arr= new int [n];
		for(int i=0; i<arr.length; i++) {
			arr[i] =ak.nextInt();
		}
		int a=ak.nextInt();		
		while(a>0) {
			int k= ak.nextInt();
			arr=ans(arr,k);
			a--;
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			
		}
		System.out.println(sum%1000000007);
	}

	private static int [] ans(int[] arr, int x) {
		int [] brr=new int [arr.length];
		for(int i=0; i<arr.length; i++){
			int j=i-x;
			if(j<0) {
				j+=arr.length;
			}
			brr[j]=arr[i]+arr[j];
		}
		return brr;
	}

}
