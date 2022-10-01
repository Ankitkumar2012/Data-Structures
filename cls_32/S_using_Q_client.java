package cls_32;

public class S_using_Q_client {
	public static void main(String[] args) throws Exception {
		S_using_Q st=new S_using_Q();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st.peek());
	}

}
