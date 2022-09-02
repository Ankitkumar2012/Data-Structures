package cls_25;

public class Last_occurance {
	public static void main(String[] args) {
		int []arr= {1,2,3,4,4,5,6,9,6,4,3,3,4};
		int n=3;
		System.out.println(ans(arr,arr.length-1,n));
	}

	private static int ans(int[] arr,int i, int n) {
		// TODO Auto-generated method stub
		if(i<0)return -1;
		
		if(arr[i]==n)
			return i;
		
		return ans(arr,i-1,n);
	}

}
