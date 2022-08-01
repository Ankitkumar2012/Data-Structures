package cls_8;

import java.util.Scanner;

public class Take_input {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int [] arr=new int [n];	
		for(int i=0; i<arr.length; i++) {
			arr[i]=ak.nextInt();
			
		}
		display(arr);
		
	}
	public static void display(int [] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		} 
	}

}
