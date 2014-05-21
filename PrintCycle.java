
public class PrintCycle {
	public void cyclePrint(int len){
	    
        if(len==0) return;
        for(int i=0;i<len;i++){
           System.out.print(3-Math.abs((3-i)%4) + " ");
        }
    return;
    
    }
	public static void main(String args[]){
		PrintCycle solution = new PrintCycle();
		solution.cyclePrint(10);
	}
}
