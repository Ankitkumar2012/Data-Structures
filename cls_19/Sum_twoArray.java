package cls_19;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum_twoArray {
	public static void main(String[] args) {
//		Scanner ak=new Scanner (System.in);
//		int n=ak.nextInt();
//		int [] arr=new int [n];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=ak.nextInt();
//		}
//		int m=ak.nextInt();
//		int [] arr1=new int [m];
//		for(int i=0;i<arr1.length;i++) {
//			arr1[i]=ak.nextInt();
//		}
		int [] arr= {1,0,2,9};
		int [] arr1= {3,4,5,6,7};
		ans(arr,arr1);
	   }

	private static void ans(int[] arr, int[] arr1) {
		// TODO Auto-generated method stub
		ArrayList<Integer>list=new ArrayList<>();
		int i=arr.length-1;
		]
		int j=arr1.length-1;
		int carry=0;
		while(i>=0 || j>=0){
			int sum=0;  
			if(i>=0) {
				sum=sum+arr[i];
				i--;
			}
			if(j>=0){
				sum=sum+arr1[j];
				j--;
			}
			sum=sum+carry;
			list.add(sum%10);
			carry=sum/10;
		}
		if(carry>0) {
			list.add(carry);
		}
		for (int k = list.size(); k >=0; k--) {
			System.out.print(list.get(k)+", ");
		}
		System.out.println();
	}
	}
