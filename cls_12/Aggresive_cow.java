package cls_12; 

import java.util.Arrays;
import java.util.Scanner;

public class Aggresive_cow {
	public static void main(String[] args) {
		Scanner ak=new Scanner (System.in);
			int nos=ak.nextInt();
			int noc=ak.nextInt();
			int [] stall =new int [nos];
			for(int i=0; i<stall.length; i++) {
				stall[i]=ak.nextInt();
			}
			Arrays.sort(stall);
			System.out.println(mindistance(stall,noc));
		}
	public static int mindistance(int [] stall, int noc) {
	      int lo=0;
	      int hi=stall.length-1;
	      int ans=0;
	      while(lo<=hi) {
	    	  int mid=(lo+hi)/2;
	    	  if(isitpossible(stall,noc,mid)){
	    		  ans=mid;
	    		  lo=mid+1;
	    	  }else {
	    		  hi=mid-1;
	    	  }
	      }
	      return ans;
	      
	}
	public static boolean isitpossible(int [] stall , int noc, int mid) {
		int cows=1;
		int pos=stall[0];
		for(int i=1; i<stall.length;i++) {
			if (stall[i] - pos >= mid) {
				cows++;
				pos = stall[i];
			}
			if (pos >= noc)
				return true;
		}
		return false;
	}
	

}
