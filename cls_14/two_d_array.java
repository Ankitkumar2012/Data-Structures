package cls_14;

public class two_d_array {
	public static void main(String[] args) {
		int [] [] arr= new int [3][4];
		System.out.println(arr[0]);
		System.out.println(arr);
		System.out.println(arr[1]);
		System.out.println(arr[1][3]);
		
		int [] [] othr =arr;
		System.out.println(othr);
	}

}
