package cls_27;

public class Partition_in_array {
	public static void main(String[] args) {
		int [] arr= {15,13,2,1,5,7,9,6,3,11,5};
		partation(arr,0,arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static int[] partation(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		int pivote=arr[ei];
		int pi=si;
		for (int i=si; i<ei; i++) {
			if(arr[i]<=pivote) {
				int temp=arr[i];
				arr[i]=arr[pi];
				arr[pi]=temp;
				pi++;
			}
		}
		int temp=arr[ei];
		arr[ei]=arr[pi];
		arr[pi]=temp;
		System.out.println(pi);
		return arr;
	}

}
