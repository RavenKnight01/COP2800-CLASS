public class Payroll {
	public static void main(String[] args) {
		//Calculates the payroll
		int hours = 1000; //initialization (declaration and assignment)
		double grossPay, payRate = 30.0; //declaration
		double quotient = (double) hours / payRate;
		grossPay = hours * payRate;
		System.out.println("Your gross pay is: $" + grossPay);
		System.out.println("Quotient is: " + quotient);
		System.out.printf("Your gross pay is: $%.2f and quotient is %.1f\n", grossPay, quotient);
		System.out.printf("Your quotient is: $%.2f\n", quotient);
		final double PI = 3.142;
		System.out.println("PI is: " + PI);
		String name = "Joe";
		int length = name.length();
		String upper = name.toUpperCase();
		String lower = name.toLowerCase();
		char letter = name.charAt(2);
		System.out.println(name);
		System.out.println(length);
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(letter);
		
	}

}
