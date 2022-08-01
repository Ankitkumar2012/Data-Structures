package cls_9;

public class array_swap {
	public static void main(String[] args) {
		int [] arr= {1,2,4,5,3,3,3};
		System.out.println(arr);
		swap(arr[0], arr[1]);
		for(int i=0; i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
	}
	public static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
	}

}
