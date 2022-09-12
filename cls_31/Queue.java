package cls_31;

public class Queue { 
	protected int []data;
	protected int front;
	protected int size;
	
	public Queue() {
		data=new int [5];
		front =0;
		size=0;
	}
	public Queue(int cap) {
		data=new int [cap];
		front =0;
		size=0;
	}
	public boolean isEmpty(){
		return size==0;
	}
	public boolean isFull(){
		return size==data.length; 
	}
	public int size(){
		return this.size; 
	}
	public void Enqueue(int item)throws Exception {
		if(isFull()==true) {
			throw new Exception("bilkul jgh nhii h");
		}
		int i=(size+front)%data.length;
		data[ i]=item;
		size++;
	}
	public int Dequeue() throws Exception{
		if(isEmpty()==true) {
			throw new Exception("bilkul khali h");
		}
		int ans=data[front];
		 front=(front+1)%data.length;
		size--;
		return ans;
	}
	public int getFront(int front) throws Exception{
		if(isEmpty()==true) {
			throw new Exception("bilkul khali h");
		}
		int re=data[front];
		return re;
	}
	public void display() {
		for (int i = 0; i < size; i++) {
//			int idx=(front+i)%data.length;
			int idx=i;
			System.out.print(data[idx]+" ");	
		}
		System.out.println();
	}

}
