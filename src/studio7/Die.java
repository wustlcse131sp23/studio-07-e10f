package studio7;

public class Die {
	private int sides;
	
	public  Die(int sides) {
		this.sides = sides;
	}
	
	public int roll() {
		return (int)(1+ Math.random()*(sides));
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die dungeons = new Die(12);
		System.out.println(dungeons.roll());
	}

}
