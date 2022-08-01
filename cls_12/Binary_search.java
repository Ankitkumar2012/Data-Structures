package cls_12;

import java.util.Scanner;

public class Binary_search {
	public static void main(String[] args) {
	//	int[] arr= {1,2,3,4,5,6,7,9};
		//int item=5;
		Scanner ak=new Scanner (System.in);
		int m=ak.nextInt();
		int n=ak.nextInt();
		int [] arr =new int [n];	
		for(int i=0;i<n;i++){
	        arr[i]=ak.nextInt();
	    }

		System.out.println(search(arr,m));
		
	}
	public static int search(int [] arr , int item){
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]==item) {
				return mid;
			}else if(arr[mid]>item) {
				hi=mid-1;
			}else {
				lo=mid+1;
			}
		}
		return -1;
		
	}

}
