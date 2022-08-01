package cls_15;

public class Search_inMatrix {
	public static void main(String[] args) {
		int [] [] arr= {{1,4,7,11,15},{2,5,8,12,19},
				{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		int item=4;
		 System.out.println( ans(arr,item));
		
	}

	private static boolean ans(int[][] arr,int item) {
		// TODO Auto-generated method stub
		int col=arr[0].length-1;
		int row=0;
		while(col>=0 && row<arr.length) {
			if(arr[row][col]==item) {
				return true;
			}
			else if(item>arr[row][col]){
				row++;
			}else {
				col--;
			}
		}
		return false;
	}

}
