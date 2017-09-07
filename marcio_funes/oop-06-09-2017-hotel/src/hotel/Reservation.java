package hotel;

public class Reservation {
	
	String day;
	double price;
	
	public static void main(String[] args) {
	
		Client c = new Client();
		Room r = new Room();
		
		//room setup
		//plug object
		r.client = c;
		//details
		r.bathroom = true;
		r.hasBath();
		r.id = 777;
		r.beds = 1;
		//client details
		r.client.name = "John Smith";
		r.client.age = 33;
		r.client.ssn = 123465789;
		r.client.luggage = 2;
		
		System.out.println("Welcome, " + r.client.name);
		System.out.println("You are " + r.client.age + " years old");
		System.out.println("Social Security Number: " + r.client.ssn);
		System.out.println("You have " + r.client.luggage + " bags");
		System.out.println("Your room id is: " + r.id);
		
		if(r.bathroom)	System.out.println("One Bathroom");
		else System.out.println("No Bathrooms");
		
		System.out.println("Beds: " + r.beds);
		System.out.println("Your price is: " + r.price);

	}
}

	
