package studio7;

public class Fraction {
	private int numer;
	private int denom;
	
	public Fraction(int numer, int denom) {
		this.numer = numer;
		this.denom = denom;
	}
	
	public String print() {
		return numer + "/" + denom;
	}
	
	public String multiply(Fraction a, Fraction b) {
		int newNumer = a.numer * b.numer;
		int newDenom = a.denom * b.denom;
		return newNumer + "/" + newDenom;
	}
	
	public String reciprocal() {
		return denom + "/" + numer;
	}
	
	public String simplify() {
		if (denom%numer ==0) {
			int newNumer = 1;
			int newDenom = denom/numer;
			return newNumer + "/" + newDenom;
		}
		else {
			return numer + "/" + denom;
		}
	}
	
	public String add(Fraction a, Fraction b) {
		int newDenom = a.denom * b.denom;
		int newNumer1 = a.denom * b.numer;
		int newNumer2 = b.denom * a.numer;
		int newNumer = newNumer1 + newNumer2;
		return newNumer + "/" + newDenom;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction a = new Fraction(1,2);
		Fraction b = new Fraction(3,16);
		System.out.println(a.print());
		System.out.println((a.multiply(a,b)));
		System.out.println(a.reciprocal());
		System.out.println(b.simplify());
		System.out.println(a.add(a, b));
	}

}
