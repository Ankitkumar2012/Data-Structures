package cls_13;

import java.util.Scanner;

public class Book_allocation {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
		int nos=ak.nextInt();
		 int n=ak.nextInt();
		 int [] page = new int [n];
	  System.out.println(minpage(page,nos));
	}
	public static boolean isitpossible(int [] page, int mid, int nos) {
		int student=1;
		int readpage=0;
		for(int i=0; i<page.length;) {
			if(readpage+page[1]<=mid) {
				readpage+=page[i];
				i++;
			}else {
				student++;
				readpage=0;
			}
			if(student>nos) {
				return false;
			}
		}
		return true;
		
	}
	public static int minpage(int [] page,int nos) {
		int hi=0;
		for(int i=0;i<page.length; i++) {
			hi=hi+page[i];
		}
		int lo=0;
		int ans=0;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(isitpossible(page,mid,nos)==true) {
				ans=mid;
				hi=mid-1;
			}else {
				lo=mid+1;
			}
		}
		return ans;
		
	}

}