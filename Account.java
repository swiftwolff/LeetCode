
public class Account {
	private float total = 100;
	private BusyFlag flag = new BusyFlag();
	
	public synchronized boolean deduct(float t){
		if(t<=total){
			total -= t;
			return true;
		}else{
			return false;
		}
	}
	
	public synchronized float balance(){
		return total;
	}
	public void lock(){
		flag.getBusyFlag();
	}
	public void unlock(){
		flag.freeBusyFlag();
	}
	public static void main(String args[]){
		int hi = (int) Math.ceil((double)5/2);
		System.out.println(hi);
	}
}
