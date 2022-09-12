package cls_31;

public class DynamicQueue extends Queue {
@Override
	public void Enqueue(int item) throws Exception {
		if(isFull()) {
			int []arr=new int[2*data.length];
			for (int i = 0; i < data.length; i++) {
				int idx=(front+i)%data.length;
				arr[i]=data[idx];
			}
			data=arr;
			front=0;
		}
		super.Enqueue(item);
	}
}
