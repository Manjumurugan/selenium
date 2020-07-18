package week.day2;

public class Calculator {
	public int add(int num1, int num2) {

		int sum = num1 + num2;

		return sum;
	}

	public double sub(double num1, double num2) {
		double diff = num1 - num2;

		return diff;
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();

		System.out.println(calc.sub(768, 76));
		System.out.println(calc.add(50, 40));
	}

}
