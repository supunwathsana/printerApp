
public class PrinterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Number1;
		int Number2;
		int multiplication;
		int addition;
		double division;
		int Substraction;
		String creater;
		
		System.out.println("Printer App");
		System.out.println("This app is made by:");
		
		creater = "Supun";
		
		System.out.println(creater);
		System.out.println("This app is made by: " + creater);
		
		Number1 = 2;
		Number2 = 3;
		
		double num1 = (double) Number1;
		double num2 = (double) Number2;
		
		//System.out.println(Number1);
		System.out.println("The value of Number1 is " + Number1 );
		System.out.println("The value of Number2 is " + Number2 );
		multiplication = Number1 * Number2;
						System.out.println(Number1 + " * " + Number2 + " = " + multiplication);
		addition = Number1 + Number2;
		System.out.println(Number1 + " + " + Number2 + " = " + addition);
		division = num1 / num2;
		System.out.println(Number1 + " / " + Number2 + " = " + division);
		Substraction = Number1 - Number2;
		System.out.println(Number1 + " - " + Number2 + " = " + Substraction);
	}

}
