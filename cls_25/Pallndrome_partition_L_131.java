package cls_25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pallndrome_partition_L_131 {
	public static void main(String[] args) {
//		String str="nitin";
		Scanner ak=new Scanner (System.in);
		String str=ak.nextLine();
		List<String> list=new ArrayList<>();
		List<List<String>> ans=new ArrayList<>();
		  ans(str,list,ans);
		  System.out.println(ans);
	}

	private static boolean pall(String str) {
		// TODO Auto-generated method stub
		int i=0;
		int j=str.length()-1;
		while(i<=j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			else {
				i++;
				j--;
			}
		}
		return true;
	}

	private static void   ans(String str,List<String>list,List<List<String>> ans) {
		// TODO Auto-generated method stub
		
		if(str.length()==0) {
//			System.out.println(list);
			ans.add(new ArrayList<>(list));
			return;
		}
		for (int i=1; i<=str.length(); i++) {
			String s=str.substring(0,i);
			if(pall(s)==true) {
				list.add(s);
			ans(str.substring(i),list,ans);
			list.remove(list.size()-1);
			}
		}
	}

}
