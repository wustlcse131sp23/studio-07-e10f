package studio7;

public class ComplexNumber {
	private int real;
	private int imag;

	public ComplexNumber(int real, int imag) {
		this.real = real;
		this.imag = imag;
	}

	public String print() {
		return real + imag + "i";
	}

	public String add(ComplexNumber a, ComplexNumber b) {
		int newReal = a.real + b.real;
		int newImag = a.imag + b.imag;
		return newReal + "+" + newImag + "i";
	}

	public String multiply(ComplexNumber a, ComplexNumber b) {
		int newReal = a.real*b.real - a.imag*b.imag;
		int newImag = a.real*b.imag + a.imag*b.real;
		return newReal + "+" + newImag + "i";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNumber a = new ComplexNumber(1,2);
		ComplexNumber b = new ComplexNumber(1,7);
		System.out.println(a.add(a, b));
		System.out.println(a.multiply(a, b));
	}

}
