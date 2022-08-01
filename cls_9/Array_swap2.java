package cls_9;

public class Array_swap2 {
	public static void main(String[] args) {
		int [] arr= {1,2,4,5,3,3,3};
		for(int i=0; i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
		System.out.println();
		swap(arr,0,1);
		System.out.println();
		for(int i=0; i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
	}
	public static void swap(int [] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;	
		System.out.print(arr[i]+" "+arr[j]);
	}

}
