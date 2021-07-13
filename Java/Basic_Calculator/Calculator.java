public class Calculator {

	public Calculator() {

	}

	// addition method
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	// substraction method
	public int substract(int a, int b) {
		int c = a - b;
		return c;
	}

	// multiplication method
	public int multiply(int a, int b) {
		int c = a * b;
		return c;
	}

	// division method
	public int divide(int a, int b) {
		int c = a / b;
		return c;
	}

	// modulo method
	public int modulo(int a, int b) {
		int c = a % b;
		return c;
	}

	public static void main(String[] args) {
		Calculator myCalculator = new Calculator();
		System.out.println(myCalculator.add(5,7));
		System.out.println(myCalculator.substract(45, 11));
		System.out.println(myCalculator.multiply(5, 4));
		System.out.println(myCalculator.divide(36, 6));
		System.out.println(myCalculator.modulo(9, 2));
	}
}