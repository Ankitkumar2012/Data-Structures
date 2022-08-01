 package cls_10;

import java.util.Scanner;

public class Bubble_sort {
	public static void main(String[] args) {
		//int [] arr= {6,4,1,8,4,8,3};
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int [] arr=new int [n];
		for(int i=0; i<n; i++) {
			arr[i]=ak.nextInt();
		}
		
		sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void sort(int [] arr) {
		
		for(int i=1; i<arr.length; i++) {
			for(int j=0;j<arr.length-i; j++) {
				if(arr[j]>arr[j+1]) {
					int t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		
	}

}
