package cls_9;

public class Array_swap3 {
	public static void main(String[] args) {
		int [] arr= {1,2,4,5,3,3,3};
		int [] arr1= {9,3,2,3,4,5,2};
		System.out.println(arr[0]+" "+arr1[0]);
		swap(arr,arr1);
		System.out.println(arr[0]+" "+arr1[0]);
	}
	public static void swap(int [] arr,int [] brr) {
		int [] temp=arr;
		arr=brr;
		brr=temp;	
	}

}
