import java.util.ArrayList;
public class GrayCode {
	
	public static ArrayList<Integer> graycode(int num){
		
		ArrayList<Integer> lst = new ArrayList<Integer>();
		ArrayList<Integer> res = new ArrayList<Integer>();
		res.add(0);
		int gray;
		int k;
		int count=0;
		for(int i=0;i<= ((1<<num) -1);i++){
			lst.add(i);
		}
		
		for(int j=1;j<lst.size();j++){

			k=1;
			
			while(k <= lst.size() && count <= lst.size()){
				if(lst.get(k)<0){
					k++;

					continue;
				}
				gray = res.get(count)^lst.get(k);
				
				if(gray % 2 == 0 || gray == 1){
					res.add(lst.get(k));
					lst.set(k,-1);  //this will change the lst content, maybe use res content?
					k++;
					count++;
					break;
				}
				
				k++;
			}
			
		}
		return res;
	}
	
	public static void main(String args[]){
//		int num = 3;
//		System.out.println(3^1);
//		if (num % 2 == 0 || num == 1){
//			System.out.println("This is good");
//		}
		//shift num and minus 1, create the array 0 - num and find the gray code in the array
//		System.out.println(GrayCode.graycode(3));
		System.out.println(2^4);
//		System.out.println(Integer.toBinaryString(4));
		
	}
	
}
