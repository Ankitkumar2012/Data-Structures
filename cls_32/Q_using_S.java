package cls_32;

public class Q_using_S {
	
private Dynamic_Stack data;
	
	public Q_using_S() {
		data=new Dynamic_Stack();
	}
	
	public boolean isEmpty() {
		return data.isEmpty();
	}
	
	public int size() {
		return data.size();
	}
	
	
	public void Enqueue(int x) throws Exception {
		data.push(x);
	}
	
	
	public int Dequeue() throws Exception {
		Dynamic_Stack temp=new Dynamic_Stack();
		while(data.size()!=1) {
			temp.push(data.pop());
		}
		int x=data.pop();
		while(temp.size()!=0) {
			data.push(temp.pop());
		}
		return x;
	}
	
	
	
	public int getFront() throws Exception {
		Dynamic_Stack temp=new Dynamic_Stack();
		while(data.size()!=1) {
			temp.push(data.pop());
		}
		int x=data.peek();
		while(temp.size()!=0) {
			data.push(temp.pop());
		}
		return x;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		Q_using_S qs=new Q_using_S();
		qs.Enqueue(10);
		qs.Enqueue(20);
		qs.Enqueue(30);
		qs.Enqueue(40);
		qs.Enqueue(50);
		qs.Enqueue(60);
		System.out.println(qs.Dequeue());
	}
	

}
