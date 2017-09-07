package bank2;

public class CompileClient {

	public static void main(String[] args) {
		//new object
		CreditCard cc = new CreditCard();
		Client c = new Client();
		Account acc = new Account();
		
		//connecting objects
		cc.client = c;
		c.account = acc;
		
		c.account.funds = 1000;
		cc.client.name = "Silvio Santos";
		//c.account.funds = 
		System.out.println(cc.client.name);
		System.out.println(c.account.funds);

	}

}
