package cls_32;

public class Queue_Reverse {
	public static void main(String[] args) throws Exception {
		Dynamic_Queue dq=new Dynamic_Queue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		dq.display();
		Reverse(dq);
		dq.display();
		

	}

	public static void Reverse(Dynamic_Queue dq) throws Exception {
		
		if(dq.isEmpty()) {
			return;
		}
		int ii = dq.Dequeue();
		
		Reverse(dq);
		dq.Enqueue(ii);

	}

}