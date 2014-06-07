import java.util.Arrays;
public class Candy {
//	public static int candy(int[] ratings) {
//        if(ratings.length==0) return 0;
//        int[] DP = new int[ratings.length];
//        int sum = ratings.length;
//        for(int i=1;i<ratings.length;i++){ 
//            int cur = i;
//            for(int j=i-1;j>=0;j--){ 
//                if(ratings[j]>ratings[cur] && DP[j]<=DP[cur]){
//                	sum-=DP[j];
//                    DP[j] = DP[j] + 1;
//                    sum+=DP[j];
//                }
//                if(ratings[cur]>ratings[j]){
//                	sum-=DP[cur];
//                    DP[cur] = DP[j] + 1;
//                    sum+=DP[cur];
//                    break;
//                }
//                cur--;
//            }
//   
//        }
//        return sum;
//    }
	
	public static int candy(int[] ratings) {
        if(ratings.length==0) return 0;
        int[] DP = new int[ratings.length];
        DP[0] = 1;
        for(int i=1;i<ratings.length;i++){
            DP[i] = 1;
            if(ratings[i]>ratings[i-1]){
                DP[i] = DP[i-1]+1;
            }
        }
        
        for(int j=ratings.length-2;j>=0;j--){
            if(ratings[j]>ratings[j+1] && DP[j]<=DP[j+1]){  //can be replaced with Math.max(DP[i], DP[i + 1] + 1); 
                DP[j] = DP[j+1] + 1;
            }
            
        }
        System.out.println(Arrays.toString(DP));
        int sum = 0;
        for(int i:DP){
            sum+=i;
        }
        return sum;
    }
	
	
	public static void main(String args[]){
		int[] ratings = {4,2,3,5};
		System.out.println(candy(ratings));
	}
	
	
	
}
