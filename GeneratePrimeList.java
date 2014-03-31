import java.util.Arrays;


public class GeneratePrimeList {
	public static void genereatePrime(int max){ //or use odd number only!  cut in half
		boolean[] flags = new boolean[max+1];
		Arrays.fill(flags,true);
		
		int prime = 2;
		while(prime <= max){
			crossOff(flags,prime);
			prime = getNextPrime(flags,prime);
		}
		
		for(int i=0;i<flags.length;i++){
			if(flags[i]==true){
				System.out.println(i);
			}
		}
		
	}
	
	public static void crossOff(boolean[] flags, int prime){
		for(int i=prime*prime;i<flags.length;i+=prime){
			flags[i] = false;
		}
	}
	
	public static int getNextPrime(boolean[] flags, int prime){
		int next = prime + 1;
		while(next < flags.length&&!flags[next]){
			next++;
		}
		return next;
	}
	
	
	
	public static void main(String args[]){
		genereatePrime(100);
	}
}
