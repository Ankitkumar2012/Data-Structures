package cls_9;

import java.util.Scanner;

public class Reverse_array {
	public static void main(String[] args) {
		//int [] arr= {2,4,6,8,10};
		//int [] brr= {3,5,4,3,3,2,1,2,4,6,8,10};
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int [] arr =new int [n];	
		for(int i=0;i<n;i++){
	        arr[i]=ak.nextInt();
	    }

		reverse(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void reverse(int [] arr) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}

}
