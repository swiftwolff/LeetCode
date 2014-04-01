import java.util.Random;
public class GenereateList {
	
	public static int[] genereate(int sum, int k, int max){
		
		int[] res = new int[k];
		Random rand = new Random();
	    int stop = Math.min(sum,max);
	    
	    for(int i=0;i<k;i++){
	    	if(i==k-1){
	    		res[i] = sum;
	    		break;
	    	}
	    	int next = rand.nextInt(stop);
	    	res[i] = next;
	    	sum-=next;
	    	if(sum==0){
	    		break;
	    	}
	    	
	    }
		return res;
	}
	
	
	public static void main(String args[]){
		int[] a = genereate(2,3,8);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
