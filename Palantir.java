import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Palantir {
	
	class Cordinates{
		double x;
		double y;
		Cordinates(double xnumber,double ynumber){
			x = xnumber;
			y = ynumber;
		}
	}
		
	public String answer(){
		System.out.println("Please input lines: ");
	    Scanner in = new Scanner(System.in);
	    
	    int lines = in.nextInt();
	    if (lines < 4){
	    	return "NO";
	    }
	    double xnumber;
	    double ynumber;
	    double slope;
	    double intercept;
	    ArrayList<Cordinates> dataset = new ArrayList<Cordinates>();
	    HashMap<String,Integer> res = new HashMap<String,Integer>();
	    HashMap<String, ArrayList<String>> table = new HashMap<String,ArrayList<String>>();
	    for (int i = 0;i<lines;i++){
	    	in = new Scanner(System.in);
	    	xnumber = in.nextDouble();
	    	ynumber = in.nextDouble();
	    	Cordinates tmp = new Cordinates(xnumber,ynumber);
	    	dataset.add(tmp);
	    }
	    
	    for (int j = 0;j<dataset.size();j++){
	    	//Need to take care of j+1 exceeding
	    	for (int k=j+1;k<dataset.size();k++){
//	    		if(j+1==dataset.size()){
//		    		break;
//		    	}
		    	System.out.println("xnumber: " +dataset.get(j).x);
		    	System.out.println("ynumber: " +dataset.get(j).y);
		    	System.out.println("xnumber next: " +dataset.get(k).x);
		    	System.out.println("ynumber next: " +dataset.get(k).y);
		    	System.out.println(table);
		    	
		    	String curCoord = ""+dataset.get(k).x+dataset.get(k).y;
		    	
		    	if(dataset.get(k).y-dataset.get(j).y==0){
		    		String hkey= "slope0xaxis";
		    		if (res.get(hkey)==null){
		    			res.put(hkey, 2);
		    			ArrayList<String> tmp = new ArrayList<String>();
		    			String coord = "" + dataset.get(k).x+dataset.get(k).y;
		    			tmp.add(coord);
		    			table.put(hkey, tmp);
		    			System.out.println("Detected New Line!");
		    		}else{
		    			if(table.get(hkey).contains(curCoord)){
		    				System.out.println("Overlapped!");
		    				continue;
		    			}else{
		    				res.put(hkey,res.get(hkey)+1);
		    				ArrayList<String> tmp = new ArrayList<String>();
			    			String coord = "" + dataset.get(k).x+dataset.get(k).y;
			    			tmp.add(coord);
			    			table.put(hkey, tmp);
		    				System.out.println("Exisint adding one!");
			    			if(res.get(hkey)>=4){
			    				System.out.println(res);
			    				return "YES";
			    			}
		    			}
		    		}
		    		continue;
		    	}
		    	if(dataset.get(k).x-dataset.get(j).x==0){
		    		String hkey= "slope0yaxis";
		    		if (res.get(hkey)==null){
		    			res.put(hkey, 2);
		    			ArrayList<String> tmp = new ArrayList<String>();
		    			String coord = "" + dataset.get(k).x+dataset.get(k).y;
		    			tmp.add(coord);
		    			table.put(hkey, tmp);
		    			System.out.println("Detected New Line!");
		    		}else{
		    			if(table.get(hkey).contains(curCoord)){
		    				System.out.println("Overlapped!");
		    				continue;
		    			}else{
		    				System.out.println("Exisint adding one!");
		    				res.put(hkey,res.get(hkey)+1);
		    				ArrayList<String> tmp = new ArrayList<String>();
			    			String coord = "" + dataset.get(k).x+dataset.get(k).y;
			    			tmp.add(coord);
			    			table.put(hkey, tmp);
			    			if(res.get(hkey)>=4){
			    				System.out.println(res);
			    				return "YES";
			    			}
		    			}		
		    		}
		    		continue;
		    	}
		    	slope = (dataset.get(k).y-dataset.get(j).y)/(dataset.get(k).x-dataset.get(j).x);
		    	intercept = dataset.get(j).y-slope*dataset.get(j).x;
		    	String hkey = ""+slope+" "+intercept;
		    	
		    	if (res.get(hkey)==null){
		    		res.put(hkey, 2);
		    		ArrayList<String> tmp = new ArrayList<String>();
	    			String coord = "" + dataset.get(k).x+dataset.get(k).y;
	    			tmp.add(coord);
	    			table.put(hkey, tmp);
		    		System.out.println("Detected New Line!");
		    	}else{
		    		if(table.get(hkey).contains(curCoord)){
		    			System.out.println("Overlapped!");
	    				continue;
	    			}else{
	    				res.put(hkey,res.get(hkey)+1);
	    				ArrayList<String> tmp = new ArrayList<String>();
		    			String coord = "" + dataset.get(k).x+dataset.get(k).y;
		    			tmp.add(coord);
		    			table.put(hkey, tmp);
	    				System.out.println("Exisint adding one!");
	    				if(res.get(hkey)>=4){
	    				System.out.println(res);
	    				return "YES";
	    				}
	    			}
		    	}
		    	System.out.println(res);
		    	
		    }
	    }
	    System.out.println(res);
		return "NO";
	}
	
	
	
	public static void main(String args[]){
		
		Palantir data = new Palantir();
		System.out.println(data.answer());
	}
}
