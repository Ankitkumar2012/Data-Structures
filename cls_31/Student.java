package cls_31;

public class Student {
	String name;
	int age;
	static int count=0;
	
	public Student() {
		count++;
	}
	public Student(String name,int age) {
		this.age=age;
		this.name=name;
		count++;
	}
	
	@Override
	public String toString() {
		return this.name+" "+this.age;
	}
	public static void hello() {
		System.out.println("Hey");
	}
	static {
		System.out.println("Ankit");
	}

}
