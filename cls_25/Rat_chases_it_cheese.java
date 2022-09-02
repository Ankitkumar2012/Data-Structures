package cls_25;

import java.util.Scanner;

public class Rat_chases_it_cheese {
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
		path(maze,0,0,ans);
		if(flag==false) {
			System.out.println("no path found");
		}
	}

	private static void path(char[][] maze, int cr, int cc, int[][] ans) {
		// TODO Auto-generated method stub
		
		if(cr==maze.length-1 && cc==maze[0].length-1) {
			if(maze[cr][cc]!='X') {
				ans[cr][cc]=1;
				display(ans);
				flag=true;
			}
			return;
		}
		
		if(cr<0 ||cr>=maze.length ||cc<0 ||cc>=maze[0].length || maze[cr][cc]=='X') {
			return;
		}
		
		
		maze[cr][cc]='X';
		ans[cr][cc]=1;
		path(maze,cr-1,cc,ans);
		path(maze,cr+1,cc,ans);
		path(maze,cr,cc+1,ans);
		path(maze,cr,cc-1,ans);
		maze[cr][cc]='O';
		ans[cr][cc]=0;
	}

	private static void display(int[][] ans) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
