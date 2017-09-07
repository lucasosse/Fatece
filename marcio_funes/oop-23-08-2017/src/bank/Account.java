package bank;

public class Account {
	
	double funds;
	double limit;
	int number;
	Agency agency;
	
	void deposit(double amount){
		this.funds+=amount;
	}
	
	boolean withdraw(double amount) {
		if(amount > this.funds){
			//System.out.println("Insufficient funds to withdraw");
			return false;
		}
		else{
			this.funds-=amount;
			return true;
		}
	}

}
