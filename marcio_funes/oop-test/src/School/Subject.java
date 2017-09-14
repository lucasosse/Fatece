package School;

public class Subject {
	
	String name;
	int id;
	int stuCount;
	
	boolean checkCount(){
		if (stuCount > 50) return true;
		else return false;
	}

	
}

