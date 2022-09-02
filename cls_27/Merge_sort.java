package cls_27;

public class Merge_sort {
	public static void main(String[] args) {
		//merge sort
				int [] arr= {1,5,2,6,7,-1,4};
				int [] a=mergesort(arr,0,arr.length-1);
				for(int i=0;i<a.length;i++) {
					System.out.print(a[i]+" ");
				}
			}
			public static int [] mergesort(int[] arr,int si,int ei) {
				if(si==ei) {
					int [] bs=new int[1];
					bs[0]=arr[si];
					return bs;
				}
				int mid=(si+ei)/2;
				int [] fs=mergesort(arr,si,mid);
				int [] ss=mergesort(arr,mid+1,ei);
				return mergetwosortedarray(fs,ss);
				}
			public static int[] mergetwosortedarray(int[] arr1, int[] arr2) {
				int n = arr1.length;
				int m = arr2.length;
				int[] ans = new int[n + m];
				int i = 0;// arr1
				int j = 0;// arr2
				int k = 0;// ans

				while (i < n && j < m) {

					if (arr1[i] <= arr2[j]) {
						ans[k] = arr1[i];
						k++;
						i++;
					} else {
						ans[k] = arr2[j];
						j++;
						k++;
					}
				}
				while (i < n) {
					ans[k] = arr1[i];
					k++;
					i++;
				}
				while (j < m) {
					ans[k] = arr2[j];
					j++;
					k++;
				}
				return ans;
	}

}
