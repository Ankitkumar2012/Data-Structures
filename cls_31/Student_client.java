package cls_31;

public class Student_client {
	public static void main(String[] args) {
		Student st=new Student("Ramlal",78);
//		Object b=new Object();
		System.out.println(st); 
		Student s1=new Student("Ramlali",78);
		System.out.println(Student.count);
		
		st.hello();
	}

}
