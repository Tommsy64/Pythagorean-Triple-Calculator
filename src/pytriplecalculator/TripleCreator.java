package pytriplecalculator;

public class TripleCreator {

	private double n;
	private double m;

	private double a;
	private double b;
	private double c;

	public TripleCreator(double number1, double number2) {
		n = number1;
		m = number2;

		a = m * m - n * n;
		b = 2 * m * n;
		c = m * m + n * n;
	}

	public String[] toStringArray() {
		String[] string = new String[3];

		string[0] = a + "^2 + " + b + "^2 = " + c + "^2";
		string[1] = a * a + " + " + b * b + " = " + c * c;
		string[2] = a * a + b * b + " = " + c * c;

		return string;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getASqr() {
		return a * a;
	}

	public double getBSqr() {
		return b * b;
	}

	public double getCSqr() {
		return c * c;
	}
}
