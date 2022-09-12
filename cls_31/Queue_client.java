package cls_31;

public class Queue_client {
	public static void main(String[] args) throws Exception {
		Queue aa=new Queue();
		aa.Enqueue(10);
		aa.Enqueue(20);
		aa.Enqueue(30);
		aa.Enqueue(40);
 		aa.Dequeue();
		aa.Dequeue();
		aa.Enqueue(50);
		aa.Enqueue(60);
		aa.Enqueue(70);
		aa.display();

	}

}
