package cls_32;

public class S_using_Q {
	
	private Dynamic_Queue data;
	
	public S_using_Q() {
		data=new Dynamic_Queue();
	}
	
	public boolean isEmpty() {
		return data.isEmpty();
	}
	
	public int size() {
		return data.size();
	}
	
	public void push(int item) throws Exception {
		Dynamic_Queue temp=new Dynamic_Queue();
		while(!data.isEmpty()) {
			temp.Enqueue(data.Dequeue());
		}
		data.Enqueue(item);
		while(!temp.isEmpty()) {
			data.Enqueue(temp.Dequeue());
		}
	}
	public int pop() throws Exception{
		return data.Dequeue();
	}
	public int peek() throws Exception{
		return data.Dequeue();
	}

}
