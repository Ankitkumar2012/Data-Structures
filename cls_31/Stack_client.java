package cls_31;

public class Stack_client {
	public static void main(String[] args) throws Exception {	
	Stack s=new Stack(20);
	s.push(10);
	s.push(20);
	s.push(30);
	s.push(40);
	s.push(50);
	s.push(50);
	s.display();
	s.pop();
	System.out.println(s.peek());
	s.display();
//	s.push(40);
//	s.display();
//	s.push(50);
//	s.push(60);
//	s.display();
//	s.size(data);
	}
}
