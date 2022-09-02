package cls_25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N_queen {
	static int count=0;
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
//		int n=ak.nextInt();
		int n=4;
		boolean arr [][]=new boolean[n][n];	
		List<String> ans=new ArrayList<>();
		List<List<String>> sol=new ArrayList<>();
		placed(arr,0,n,ans,sol);
		System.out.print(sol);
	}

	private static void placed(boolean[][] arr, int row,int tq,List<String> ans,List<List<String>> sol) {
		// TODO Auto-generated method stub
		if(tq==0) {
			display(arr,ans,sol);
			sol.add(new ArrayList<>(ans));
			ans.clear();
			return;
		}
		
		if(row==arr.length) {
			return;
		}
		
		
		for (int col = 0; col < arr.length; col++) {
			if(ispossible(arr,row,col)==true) {
				arr[row][col]=true;
				placed(arr,row+1,tq-1, ans, sol);
				arr[row][col]=false;

			}
		}
		
	}
	private static void display(boolean[][] arr, List<String> ans, List<List<String>> sol) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < arr.length; i++) {
			String k="";
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i][j]==true) {
					k+="Q";
				}
				else
					k+=".";
			}
			ans.add(k);
		}
	}

	private static boolean ispossible(boolean[][] arr, int row,int col) {
		// TODO Auto-generated method stub
		//upper case
		int r=row;
		while(r>=0) {
			if(arr[r][col]==true) {
				return false;
			}
			r--;
		}
		//left diagonal
		r=row;
		int c=col;
		while(r>=0 && c>=0) {
			if(arr[r][c]==true) {
				return false;
			}
			r--;
			c--;
		}
		
		//right diagonal
		 r=row;
		 c=col;
		while(r>=0 && c<arr.length) {
			if(arr[r][c]==true) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}
}
