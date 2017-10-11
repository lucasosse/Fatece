
public class Hotel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer("John Marston");
		Reservation r = new Reservation(1200);
		
		System.out.println(c.getName());
		System.out.println(r.getCost());

	}

}
