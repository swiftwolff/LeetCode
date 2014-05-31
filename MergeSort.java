import java.util.Arrays;

public class MergeSort {
	public static int[] mergeSort(int[] arry,int start, int end){
		
		if(start > end){
			if(start > arry.length-1){
				return null;
			}
			int[] tmp = {arry[start]};
			return tmp;
		}
		
		int mid = (start+end)/2;
		int[] left = mergeSort(arry,start,mid-1);
		int [] right = mergeSort(arry,mid+1,end);
		
		return merge(left,right);
	}
	
	public static int[] merge(int[] a, int[] b){
		if(a==null||b==null) return a==null?b:a;
		int[] tmp = new int[a.length+b.length];
		int alen = a.length-1;
		int blen = b.length-1;
		int cur = 0;
		int acur = 0;
		int bcur = 0;
		
		if(a[0]>b[blen]){
			for(int i=0;i<b.length;i++){
				tmp[i] = b[i];
			}
			int index = 0;
			for(int j=b.length;j<tmp.length;j++){
				tmp[j] = a[index];
				index++;
			}
		}else if(b[0]>a[alen]){
			for(int i=0;i<a.length;i++){
				tmp[i] = a[i];
			}
			int index=0;
			for(int j=a.length;j<tmp.length;j++){
				tmp[j] = b[index];
				index++;
			}
		}else{
			
			while( cur < tmp.length){
				
				if(acur>alen){
					tmp[cur] = b[bcur];
					cur++;
					bcur++;
					continue;
				}
				if(bcur>blen){
					tmp[cur] = a[acur];
					cur++;
					acur++;
					continue;
				}
				if(a[acur]<=b[bcur]){
					tmp[cur] = a[acur];
					acur++;
					cur++;
				}else{
					tmp[cur] = b[bcur];
					bcur++;
					cur++;
				}
			}
		}
		return tmp;
	}
	public static void main(String args[]){
		
		int[] a = {7,5,3,2,1,6,9};

		System.out.println(Arrays.toString(mergeSort(a,0,a.length-1)));
		
	}
}
