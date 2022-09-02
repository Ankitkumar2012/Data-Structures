package cls_25;

public class Word_search {
	public static void main(String[] args) {
		char [][] maze= {{'a','b','c','e'},{'s','f','c','s'},{'a','d','e','e'}};
		String word="abc";
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				if(maze[i][j]==word.charAt(0)) {
				boolean sol=ans(maze,word,i,j,0);
				if(sol==true) {
					System.out.println(sol);
					return;
				}
				}
			}
		}
		System.out.println(false);
	}
	public static boolean ans(char[][]maze,String word,int cr,int cc,int idx) {	
		
		if(idx==word.length()) {
			return true;
		}
		
		if(cc<0 || cc>=maze[0].length || cr<0 || cr>=maze.length || maze[cr][cc]!=word.charAt(idx)) {
			return false;
		}
		
		int [] r= {-1,1,0,0};
		int [] c= {0,0,1,-1};
		
		maze[cr][cc]='*';
		for (int i = 0; i < c.length; i++) {
			boolean atr=ans(maze,word,cr+r[i],cc+c[i],idx+1);
			if(atr==true) {
				return atr;
			}
		}
		
		maze[cr][cc]=word.charAt(idx);
		return false;
	}

}
