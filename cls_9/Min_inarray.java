package cls_9;

public class Min_inarray {
	public static void main(String[] args) {
		int [] arr= {1,4,2,6,9,-9,4,7};
		int n=-8;
		System.out.println(min(arr));
	}
	public static int min(int [] arr) {
		int min=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
		
	}

}
