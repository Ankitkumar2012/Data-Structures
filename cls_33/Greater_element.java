package cls_33;

import cls_31.Stack;

public class Greater_element {
	public static void main(String[] args) throws Exception {
		int []arr= {16,2,3,2,3,2,13,9,15,14};
		ans(arr);
	}

	private static void ans(int[] arr) throws Exception {
		// TODO Auto-generated method stub
		Stack st=new Stack();
		int []brr=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while(!st.isEmpty() && arr[i]>arr[st.peek()]) {
				brr[st.pop()]=arr[i];
			}
			st.push(i);
		}
		while(!st.isEmpty()) {
			brr[st.pop()]=-1;
		}
		for (int i = 0; i < brr.length; i++) {
			System.out.println(arr[i]+"  "+brr[i]);
		}
	}

}
