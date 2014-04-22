
public class GasStation {
	
	public static int canCompleteCircuit(int[] gas,int[] cost){
		if(gas.length==0||cost.length==0){
			return -1;
		}
		
		for(int i=0;i<gas.length;i++){
			int resource = 0;
			int count = 1;
			resource+=gas[i];
			resource-=cost[i];
			if(resource<0){
				continue;		
			}	
			for(int j=i+1;count<gas.length;j++){	
				count++;
				if(j>gas.length-1){
					j = j-gas.length;
				}
				resource+=gas[j];
				resource-=cost[j];
				if(resource<0){
					break;
				}
			}
			if(count == gas.length && resource >= 0){
				return i;
			}
		}

		return -1;
	}
	
	public static void main(String args[]){
		int[] gas = {1,2,3,3};
		int[] cost = {2,1,5,1};
		System.out.println(canCompleteCircuit(gas,cost));
		
		
	}
}
