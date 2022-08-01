package cls_21;

public class First_occurance {
	public static void main(String[] args) {
		int [] arr= {2,3,4,5,6,7,};
		System.out.println(ans(arr,3,0));
	}

	private static int ans(int[] arr,int a,int i) {
		// TODO Auto-generated method stub
		if(arr[i]==a) {
			return i;
		}
		if(arr[i]==arr.length) {
			return -1;
		}
		return ans(arr,a,i+1);
	}

}
