package cls_21;

public class Time_of_occurance {
	public static void main(String[] args) {
		int [] arr= {1,3,2,4,5,3};
		ans(arr,3,0);
	}

	private static void ans(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		if(j==arr.length) {
			return;
		}
		if(arr[j]==i) {
			System.out.print(j+" ");
		}
		 ans(arr,i,j+1);
	}

}
