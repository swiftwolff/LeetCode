import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Pascal {
	
    public static ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> lst = new ArrayList<ArrayList<Integer>>();
        if (numRows==0){
            return lst;
        }
		ArrayList<Integer> coeff = new ArrayList<Integer>();
		coeff.add(1);
		lst.add(coeff);
		if (numRows==1){
			return lst;
		}
		
		build(lst,0,numRows);
		
		return lst;
    }
    
    public static void build(ArrayList<ArrayList<Integer>> lst,int prev,int stop){
		
		 if (stop ==1){
			 return;
		 }
		 
		 ArrayList<Integer> last = lst.get(prev);
		 ArrayList<Integer> coeff = new ArrayList<Integer>();
		 
		 coeff.add(1);
		 for(int i=0;i<lst.size();i++){
			 if (i+1>lst.size()-1){
				 break;
			 }
			 coeff.add(last.get(i) + last.get(i+1));
		 }
		 coeff.add(1);
		 
		 lst.add(coeff);
		 
		 build(lst,prev+1,stop-1);
		
	}
	
	public static void main(String args[]) throws IOException{
		
		System.out.println(Pascal.generate(3));
        
	}

}
