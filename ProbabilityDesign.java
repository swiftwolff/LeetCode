import java.util.Random;


public class ProbabilityDesign {
	
	public static int f(){
		
		int[] arry = {0,1,1,1}; //0 is 1/4 1 is 3/4
		Random r = new Random();
		return arry[r.nextInt(4)];
	}
	
	public static int g(){  //convert to 0 is 1/2 and 1 is 1/2
		
		int a = f();
		int b = f();
		
		while(a==b){
			a = f();
			b = f();
		}
		
		return a;
	}

	
	public static void main(String args[]){
		int one = 0;
		int zero = 0;
		for (int i=0;i<1000;i++){
			if(g()==0){
				zero++;
			}else{
				one++;
			}
		}
		
		System.out.println(zero/1000.0);
		System.out.println(one/1000.0);
		
	}
}
