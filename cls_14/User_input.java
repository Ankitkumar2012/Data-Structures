package cls_14;

import java.util.Scanner;

public class User_input {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int m=ak.nextInt();
		int [] [] arr=new int [n][m];
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[0].length;j++) {
			  arr[i][j]=ak.nextInt();
			}	
		}
		
		display(arr);
		
	}

	private static void display(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[0].length;j++) {
			  System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
