import java.util.ArrayList;


public class Combinations {
	public static ArrayList<ArrayList<Integer>> combine(int n, int k) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
       if(n<=0||k<=0){
           return res;
       }
       
       for(int i=1;i<=n;i++){
           ArrayList<Integer> tmp = new ArrayList<Integer>();
           tmp.add(i);
           buildList(tmp,1,i,n,k,res);
       }
       
       return res;
   }
   
   public static void buildList(ArrayList<Integer> tmp, int count, int num, int n,int k, ArrayList<ArrayList<Integer>> res){
       if(count==k){
           res.add(tmp);
           return;
       }
       
       for(int i=num+1;i<=n;i++){
    	   ArrayList<Integer> newTmp = new ArrayList<Integer>();
    	   newTmp.addAll(tmp);
           newTmp.add(i);
           buildList(newTmp,count+1,i,n,k,res);
       }
       
   }
   
   public static void main(String args[]){
	   System.out.println(combine(4,3));
   }
	
}
