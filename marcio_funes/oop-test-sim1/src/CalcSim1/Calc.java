package CalcSim1;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum added = new Sum();
		Sub subtracted = new Sub();
		Mult multiplied = new Mult();
		Div divided = new Div();
		
		double v1 = 5;
		double v2 = 3;
		int op = 3;
		
		if(op==1) {
			added.sum(v1, v2);
		}
		
		if(op==2) {
			subtracted.sub(v1, v2);
		}
		
		if(op==3) {
			multiplied.mult(v1, v2);
		}
		
		if(op==4) {
			divided.div(v1, v2);
		}

	}

}
