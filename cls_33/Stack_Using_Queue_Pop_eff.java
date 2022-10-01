package cls_33;

import cls_32.Dynamic_Queue;

public class Stack_Using_Queue_Pop_eff {
	private Dynamic_Queue data;

	public Stack_Using_Queue_Pop_eff() {
		// TODO Auto-generated constructor stub
		data = new Dynamic_Queue();
	}

	public boolean isempty() {
		return this.data.isEmpty();
	}

	public int size() {
		return this.data.size();
	}

	public void push(int item) throws Exception {
		Dynamic_Queue hlp = new Dynamic_Queue();
		while (!data.isEmpty()) {
			hlp.Enqueue(data.Dequeue());
		}
		data.Enqueue(item);
		while (!hlp.isEmpty()) {
			data.Enqueue(hlp.Dequeue());
		}

	}

	public int peek() throws Exception {
		return data.getFront();
	}

	public int pop() throws Exception {
		return data.Dequeue();
	}

	public static void main(String[] args) throws Exception {
		Stack_Using_Queue_Pop_eff s = new Stack_Using_Queue_Pop_eff();
		s.push(10);
		s.push(120);
		s.push(30);
		s.push(40);
		s.push(-10);
		s.push(190);
		System.out.println(s.peek());
	}

}
