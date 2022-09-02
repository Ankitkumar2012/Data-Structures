package cls_23;

import java.util.ArrayList;
import java.util.Collections;

public class DiagonalTraversal {
	public static void main(String[] args) {
		int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		digtraversal(arr);
		
	}
	public static void digtraversal(int [][] arr) {
		int m = arr.length;
		int n = arr[0].length;
		for (int d = 0; d < m + n - 1; d++) {
			int r = 0, c = 0;
			if (d < n) {
				r = 0;
				c = d;
			} else {
				r = d - n + 1;
				c = n - 1;
			}
			ArrayList<Integer> list = new ArrayList<>();
			while (r < m && c >= 0) {
				list.add(arr[r][c]);
				r++;
				c--;
			}
			if(d%2==0) {
				Collections.reverse(list);
			}
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i)+" ");
				
			}

		}
}
 
}
