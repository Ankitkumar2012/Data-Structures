package cls_32;

import cls_31.Queue;

public class Dynamic_Queue extends Queue{
	@Override
	public void Enqueue(int item) throws Exception {
		if (isFull() == true) {
			int[] arr = new int[2 * data.length];
			for (int i = 0; i < data.length; i++) {
				int idx = (front + i) % data.length;
				arr[i] = data[idx];
			}
			this.front = 0;
			data = arr;

		}
		super.Enqueue(item);
	}
}
