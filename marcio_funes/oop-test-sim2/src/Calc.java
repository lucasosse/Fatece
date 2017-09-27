import java.util.Scanner;


public class Calc {
	
	public static int sum(int x, int y){
		return x+y;
	}
	
	public static int div(int x, int y){
		if(y == 0){
			System.out.println("Cannot divide by Zero");
			return 1;
			
		}
		return x/y;
	}
	
	public static int mult(int x, int y){
		return x*y;
	}
	
	public static int sub(int x, int y){
		return x-y;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Type operation: ");
		int x = reader.nextInt();
		String op = reader.next();
		int y = reader.nextInt();

		if(op.equals("+"))
			System.out.println(sum(x,y));

		else if (op.equals("-")) 	
			System.out.println(sub(x,y));
		
		else if (op.equals("*")) 	
			System.out.println(mult(x,y));
		
		else if (op.equals("/")) 	
			System.out.println(div(x,y));
		
		reader.close();

	}
	
	

}
