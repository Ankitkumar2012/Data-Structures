package cls_33;

import cls_31.Stack;

public class Continous_small {
	public static void main(String[] args) throws Exception {
		int arr[]= {73,74,75,71,69,72,76,73};
		ans(arr);
	}

	private static void ans(int[] arr) throws Exception {
		// TODO Auto-generated method stub
		Stack st=new Stack();
		int []brr=new int[arr.length];
		for (int i = 0; i < brr.length; i++) {
			while(!st.isEmpty() && arr[i]>arr[st.peek()]) {
				st.pop();
			}
			if(!st.isEmpty()) {
				brr[i]=i-st.peek();
			}else {
				brr[i]=i-1;
			}
			st.push(i);
		}
		for (int i = 0; i < brr.length; i++) {
			System.out.println(arr[i]+"  "+brr[i]);	
	}

}
}
