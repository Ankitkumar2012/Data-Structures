package cls_25;

public class First_occurance {
	public static void main(String[] args) {
		int []arr= {1,2,3,5,6,9,6,4,3,3,4};
		int n=1;
		System.out.println(ans(arr,0,n));
	}

	private static int ans(int[] arr,int i, int n) {
		// TODO Auto-generated method stub
		if(i==arr.length)return -1;
		
		if(arr[i]==n)
			return i;
		
		return ans(arr,i+1,n);
	}

}
