package cls_9;

public class swap {
	public static void main(String[] args) {
		int  a= 9;
		int  b= 3;
		System.out.println(a+b);
		swap(a,b);
		System.out.println(a+" "+b);
		
		//the value is not getting swap b/c it is pass by value and 
		//the value pass in next method does not swap in main method
	}
	public static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
	}

}
