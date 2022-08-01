package cls_21;

public class FirstLast_occurance {
	public static void main(String[] args) {
		int [] arr= {1,3,2,4,5,3};
		System.out.println(ans(arr,5,arr.length-1));
	}

	private static int ans(int[] arr, int i, int j) {
		// TODO Auto-generated method stubh 
		if(j==0) {
			return -1;
		}
		if(arr[j]==i) {
			return j;
		}
		return ans(arr,j,i-1);
	}
	
}
