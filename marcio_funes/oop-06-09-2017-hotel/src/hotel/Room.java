package hotel;

public class Room {
	
	Client client;
	
	int id;
	double price;
	int beds;
	boolean bathroom;
	
	void hasBath(){
		if(bathroom) price = 100;
		else price = 50;
	}

}
