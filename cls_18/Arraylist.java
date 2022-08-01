package cls_18;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		
	
	ArrayList<Integer> list = new ArrayList<>();
	System.out.println(list);
	System.out.println(list.size());
	// add method
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(-20);
	System.out.println(list);
	// add at any index
	// index range 0 to size
	list.add(2, 89);
	System.out.println(list);
//	
//	// remove
//	// index range 0 to size-1
	System.out.println(list.remove(2));
	System.out.println(list);
//	
//	//get 
//
	System.out.println(list.get(1));
	System.out.println(list);
}
}