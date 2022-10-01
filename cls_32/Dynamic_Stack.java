package cls_32;

import cls_31.Stack;

public class Dynamic_Stack extends Stack {
	@Override
	public void push(int item) throws Exception {
		if(isfull()) {
			int []arr=new int[2*data.length];
			for (int i = 0; i < data.length; i++) {
				arr[i]=data[i];
			}
			data=arr;
		}
		//if there is same function in parent class and child class then use super keyword
		super.push(item);
	}

}
