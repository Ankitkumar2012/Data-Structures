package cls_9;

import java.util.Scanner;

public class Linear_search {
	public static void main(String[] args) {
	//	int [] arr= {1,3,6,4,7,2,8,3,9,5};	
	  //  int a =	find(arr, -4);
		Scanner ak=new Scanner (System.in);
		int item=ak.nextInt();
		int n=ak.nextInt();
		int [] arr =new int [n];	
		for(int i=0;i<n;i++){
	        arr[i]=ak.nextInt();
	    }

		System.out.println(find(arr,item));
	}
	public static int find(int [] arr, int item) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==item) {
				return i;
			}
		}
		return -1;
		
	}
}
