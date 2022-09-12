package cls_31;

public class Stack {
	protected int[] data;
	private int tos;

	public Stack() {
		this.data = new int[5];
		this.tos = -1;
	}

	public Stack(int cap) {
		this.data = new int[cap];
		this.tos = -1;
	}

	public boolean isEmpty() {
		return tos == -1;
	}

	public boolean isfull() {
		return tos == data.length - 1;
	}

	public void push(int item)throws Exception{
		if(isfull()) {
			throw new Exception("bilkul  jgh nhii h");
		}
		tos++;
		data[tos] = item;
	}

	public int pop()throws Exception{
		if(isEmpty()) {
			throw new Exception("bilkul khali h");
		}
		int re = this.data[tos];
		tos--;
		return re;
	}

	public int peek() throws Exception{
		if(isEmpty()) {
			throw new Exception("bilkul jgh nhii h");
		}
		int re = this.data[tos];
		return re;
	}

	public int size(int item) {
		return tos + 1;

	}

	public void display() {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
}
