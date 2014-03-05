import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Pascal {
	
	public static ArrayList<ArrayList<Integer>> generate(int numRows) {
        if (numRows==0){
            return new ArrayList<ArrayList<Integer>>();
        }
        ArrayList<ArrayList<Integer>>triangle = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> prev = new ArrayList<Integer>();
        ArrayList<Integer>inner = new ArrayList<Integer>();
        inner.add(1);
        triangle.add(inner);
        int i = 1;
        while(i<=numRows-1){
            prev = triangle.get(i-1);
            ArrayList<Integer>tmp = new ArrayList<Integer>();
            tmp.add(1);
            for(int j=0;j<prev.size();j++){
                if(j+1==prev.size()){
                    break;
                }
                tmp.add(prev.get(j)+prev.get(j+1));
            }
            tmp.add(1);
            triangle.add(tmp);
            i++;
        }
        return triangle;
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
		
		System.out.println(generate(3));
        
	}

}
