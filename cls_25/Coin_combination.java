package cls_25;

public class Coin_combination {
	public static void main(String[] args) {
		int arr[]= {2,3,4,5};
		ans(arr,0,"",10,0);
	}

	private static void ans(int[] arr, int sum, String ans,int total,int idx) {
		// TODO Auto-generated method stub
		if(sum==total) {
			System.out.println(ans);
			return;
		}		
		if(sum>total) {
			return;
		}		
		for (int i = idx; i < arr.length; i++) {
			ans(arr,sum+arr[i],ans+arr[i],total,i+1);
		}
	}

}
