
public class AutomatedTellerMachine {
	private Account a = new Account();
	private boolean allowed;
	
	public synchronized boolean login(String name, String password){
		System.out.println(Thread.currentThread().getName() + ": login");
		
		allowed = verifyAccount(name, password);
		
		if(!allowed){
			return false;
		}
		a.lock();
		return true;
	}
	
	public boolean verifyAccount(String name, String password){
		if((name.equals("name") && password.equals("password"))){
			return true;
		}else{
			return false;
		}
	}
	
	public void withdraw(float amount){
		if(a.deduct(amount)){
			System.out.println(Thread.currentThread().getName() + ": Deducted the amount of "+amount);
		}
	}
	
	public void printBalance(){
		System.out.println(Thread.currentThread().getName() + ": Account Balance is: " + a.balance());
		if(a.balance()<0){
			System.out.println(Thread.currentThread().getName() + ": OVERDRAWN");
		}
	}
	
	public synchronized void logoff(){
		System.out.println(Thread.currentThread().getName() + ": logoff");
		a.unlock();
	}
	
}
