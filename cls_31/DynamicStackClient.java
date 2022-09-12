package cls_31;

public class DynamicStackClient {
	public static void main(String[] args) throws Exception {
		Dynamic_Stack ds=new Dynamic_Stack();
		ds.push(10);
		ds.push(10);
		ds.push(10);
		ds.push(10);
		ds.push(40);
		System.out.println(ds.peek());
		ds.display();
		ds.push(40);
		ds.push(40);
		ds.push(40);
		ds.push(40);
		ds.push(40);
		ds.display();
	}

}
