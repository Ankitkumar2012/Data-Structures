package cls_10;

public class Insertion_sort {
	public static void main(String[] args) {
		int [] arr= {6,4,1,8,4,8,3};
		sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		// if array is already sorted  insertion sort 
		//is better then other beacuse loop is not work or run
	}
	public static void sort(int [] arr) {
		for(int i=0; i<arr.length; i++) {
			int j=i-1;
			int temp=arr[i];
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			j++;
			arr[j]=temp;
		}
		
	}

}
