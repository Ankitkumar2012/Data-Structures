package cls_31;

public class Dynamic_Stack extends Stack {

	public void push(int item) throws Exception {
		if(isfull()) {
			int []arr=new int[2*data.length];
			for (int i = 0; i < data.length; i++) {
				arr[i]=data[i];
			}
			data=arr;
		}
		super.push(item);
	}
}
