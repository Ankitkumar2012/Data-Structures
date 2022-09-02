package cls_25;

import java.util.Scanner;

public class Rat_chases_its_cheese {
	static boolean flag=false;
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		int n=ak.nextInt();
		int m=ak.nextInt();
		char [][] maze=new char [n][m];
		for (int i = 0; i < maze.length; i++) {
			String str=ak.next();
			for (int j = 0; j < str.length(); j++) {
				maze[i][j]=str.charAt(j);
			}
		}
		int [][] ans=new int [n][m];
		ans(maze,ans,0,0);
		if(flag==false) {
			System.out.println("path not found");
		}
	}

	private static void ans(char[][] maze, int[][] ans,int cr,int cc) {
		
		if(cc==maze[0].length-1 && cr==maze.length-1) {
			if(maze[cr][cc]!='X') {
			flag=true;
			ans[cr][cc]=1;
			disply(ans);
			}
			return;
		}
		
		if(cc<0 || cc>=maze[0].length || cr<0 || cr>=maze.length || maze[cr][cc]=='X') {
			return ;
		}
		int [] r= {-1,1,0,0};
		int [] c= {0,0,1,-1};
		
		maze[cr][cc]='X';
		ans[cr][cc]=1;
		for (int i = 0; i < c.length; i++) {
			ans(maze,ans,cr+r[i],cc+c[i]);
		}
		maze[cr][cc]='O';
		ans[cr][cc]=0;
	}

	private static void disply(int[][] ans) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j]+" ");
			}
		System.out.println();
		}
	}

}
//5 4
//OXOO
//OOOX
//XOXO
//XOOX
//XXOO
//1 0 0 0 
//1 1 0 0 
//0 1 0 0 
//0 1 1 0 
//0 0 1 1 