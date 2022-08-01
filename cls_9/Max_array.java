package cls_9;

import java.util.Scanner;

public class Max_array {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int [] arr =new int [n];	
		for(int i=0;i<n;i++){
	        arr[i]=ak.nextInt();
	    }

	      System.out.println(reverse(arr));
	}
	public static int reverse(int [] arr) {
		int max=arr[0];
	for(int i=0; i<arr.length; i++) {
		if(arr[i]>max) {
			max=arr[i];
			}
		}
	return max;
	
	}

}
