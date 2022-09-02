package cls_25;

import java.util.ArrayList;

public class Lexographical_order {
	public static void main(String[] args) {
		int n=13;
		ArrayList <Integer>list=new ArrayList<>();
		ans(0,n,list);
        list.remove(0);
		System.out.println(list);
	}

	private static void ans(int curr, int end,ArrayList list) {
		// TODO Auto-generated method stub
		if(curr>end)
		return;
		list.add(curr);
			int i=0;
			if(curr==0) {
				i=1;
			}			
		for (; i<=9; i++) {
			ans(curr*10+i,end,list);
		}
	}

}
