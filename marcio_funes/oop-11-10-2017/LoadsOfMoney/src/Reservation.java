
public class Reservation {
	
	float price;
	
	public Reservation(float money){
		System.out.println("Price Set");
		price = money;
	}
	
	float getCost(){
		return price;
	}

}
