package cls_15;

public class Print_circleMatrix {
	public static void main(String[] args) {
		//int [] [] arr= {{1,4,7,11,15},{2,5,8,12,19},
			//{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		int [] [] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		ans(arr);
	}

	private static void ans(int[][] arr) {
		// TODO Auto-generated method stub
		int col=0;
		int row=0;
		int row1=arr.length-1;
		int col1=arr[0].length-1;
		int count=0;
		int target=arr.length*arr[0].length;
        while(count<target) {
		for(int i=col; i<=col1 && count<target; i++) {
			System.out.print(arr[row][i]+" ");
			count++;
		}
		row++;
		for(int i=row; i<=row1&&count<target; i++) {
			System.out.print(arr[i][col1]+" ");
			count++;
		}
		col1--;
		for(int i=col1; i>=col&&count<target; i--) {
			System.out.print(arr[row1][i]+" ");
			count++;
		}
		row1--;
		for(int i=row1; i>=row&&count<target; i--) {
			System.out.print(arr[i][col]+" ");
			count++;
		}
		col++;
        }
	}

}
