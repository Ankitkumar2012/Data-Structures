package cls_31;

public class Client {
	public static void main(String[] args) {
		//CASE 1
//		P obj=new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		obj.fun();
//		obj.fun2();
		
//		CASE 2
//		P obj=new C();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(((C)(obj)).d2);
// 		System.out.println(((C)(obj)).d);
//		obj.fun();
//		obj.fun1();
//		((C)(obj)).fun2();
		
		
//NOT POSSIBLE		
//		CASE 3
//		C obj=new P();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(obj.d2);
//		obj.fun();
		
		
//		CASE 4
		C obj=new C();
		System.out.println(obj.d);
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		System.out.println(((P)obj).d);
		obj.fun();
	}

}
