package cls_19;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist2 {
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(-10);
		System.out.println(list);
		list.set(2,90);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println( );
		for(int v: list) {
			System.out.print(v+" ");
		}
	}

}
