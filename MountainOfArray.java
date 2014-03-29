
public class MountainOfArray {
	public static int findelement(int[] a){
		return 0;
	}
	
	public static int binarySearch(int[] a, int start, int end,int target){
		if(start > end){
			return -1;
		}
		int mid = (start+end)/2;	
			
		if(a[mid]==target){
			return mid;
		}
		
//		if(mid==0){
//			return -1;
//		}
//		
		if(a[mid]<a[mid+1]){
			if(a[mid]<target){
				return binarySearch(a,start,mid-1,target);
			}else{
				return binarySearch(a,mid+1,start,target);
			}
		}else{
			if(a[mid]<target){
				return binarySearch(a,start,mid-1,target);
			}else{
				return binarySearch(a,mid+1,end,target);
			}
		}
		
	}
	
	public static int bpeakSearch(int[] a, int start, int end){
//		if(start > end){
//			return -1;
//		}
		int mid = (start+end)/2;
		if(mid==0){
			return -1;
		}
		if(a[mid]>a[mid-1]&&a[mid]>a[mid+1]){
			return mid;
		}
		
		if(a[mid]<a[mid-1]&&a[mid]>a[mid+1]){
			return bpeakSearch(a,start,mid-1);
		}else{
			return bpeakSearch(a,mid+1,start);
		}

	}
	
	
	public static void main(String args[]){
		//first binary search the max by comparing the item before and after, if the item is found
		//just return, record the index of the max val.
		//then cut the array, and then sort each part
		int[] A = {1,2,3,4,5,3,1,0};
		
//		System.out.println(bpeakSearch(A,0,7));
//		System.out.println(binarySearch(A,0,4,0));
		System.out.println(binarySearch(A,4,7,0));  //flip again
	}
	
}
