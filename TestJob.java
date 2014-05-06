
public class TestJob implements Runnable {
	private AutomatedTellerMachine atm = new AutomatedTellerMachine();
	
	public void run(){
		for(int i=0;i<1;i++){
			makeWithdrawal(10.0f);
		}
	}
	
	public synchronized void makeWithdrawal(float amount){
		atm.login("name","password");
		try{
			Thread.sleep(500);
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
		atm.withdraw(amount);
		atm.printBalance();
		atm.logoff();
	}
	
	
	public static void main(String args[]){
		TestJob job = new TestJob();
		Thread one = new Thread(job);
		Thread two = new Thread(job);
		one.setName("Darya");
		two.setName("Mehrak");
		one.start();
		two.start();
	}
	
	
	
}
