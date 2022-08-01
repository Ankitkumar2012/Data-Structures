package cls_9;

public class Reverse2 {
	public static void main(String[] args) {
		int [] arr= {2,3,4,5,6,8,11,9,13};
		reverse(arr,2,6);
		for(int i=0; i<=arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void reverse(int [] arr,int st, int end) {
		int i=st;
		int j=end;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}

}
