package bank;

public class AccTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person per = new Person();
		Account acc = new Account();
		Card debCard = new Card();
		Agency ag = new Agency();
		acc.agency = ag;
		
		per.name = "Jeff Bezos";
		per.ssn = "401334548";
		acc.funds = 1000;
		acc.limit = 2000;
		debCard.number = 1234567;
		acc.agency.code = 2345;
		acc.number = 00001234;
		
		acc.deposit(10);
		boolean answer = acc.withdraw(1500);
		
		System.out.println("Client: " + per.name);
		System.out.println("SS Number: " + per.ssn);
		System.out.println("Funds: " + acc.funds);
		System.out.println("Debit Card: " + debCard.number);
		System.out.println("Agency Code: " + acc.agency.code);
		System.out.println("Acc. Number: " + acc.number);
		System.out.println("Acc. Limit: " + acc.limit);
		System.out.println("--------------------------");
		
		if(answer){
			System.out.println("Successful withdraw, your current funds are " 
					+ acc.funds);
		} else System.out.println("Unsuccessful withdraw, your current funds are " 
					+ acc.funds);
		

	}

}
