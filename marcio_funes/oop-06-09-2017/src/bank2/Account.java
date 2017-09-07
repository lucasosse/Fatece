package bank2;

public class Account {
	
	double funds;
	double limit;
	
	Client client;
	
	void deposit(double amount){
		this.funds += amount;
	}
	
	void withdraw(double amount){
		this.funds -= amount;
	}

	void printExtract(){
		System.out.println("Funds: " + this.funds);
		System.out.println("Limit: " + this.limit);
	}

}
