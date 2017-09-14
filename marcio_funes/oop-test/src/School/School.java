package School;

import java.util.Scanner; // This will import the Scanner class.
/**
 * @author estagio-lucas
 *
 */

public class School {
	
	public static void main(String args[]){
				
		Student stu = new Student();
		Subject sub = new Subject();
		
		Scanner userInputScanner = new Scanner(System.in);
		System.out.println("How many Students are in this Subject?");
		sub.stuCount = userInputScanner.nextInt();
		
		if(sub.checkCount()){
			System.out.println("You cannot register a new Student");
		}
		
		else{
			
			stu.name = "John Smith";
			stu.age = 16;
			stu.id = 789;
			stu.ssn = 1234567;
			
			sub.name = "Math";
			sub.id = 1478;
			
			System.out.println("Print Student info?");
			
			String out = "y";
			
			if(out.equals("y")){

				System.out.println(stu.name);
				System.out.println(stu.age);
				System.out.println(stu.id);
				System.out.println(stu.ssn);
				System.out.println("Subject: "+sub.name);
				System.out.println("Class ID: "+sub.id);
				System.out.println("----------------");


			}
		}
		
	}
	


}
