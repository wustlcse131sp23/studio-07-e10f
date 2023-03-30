package studio7;

public class HockeyPlayer {
	private int jersey;
	private String name;
	private boolean isRight;
	private int shoots;
	private int points;
	private int games;
	
	public HockeyPlayer(String name, int jersey, boolean isRight, int shoots) {
		this.name = name;
		this.jersey = jersey;
		this.isRight = isRight;
		this.shoots = shoots;
	}
	
	public String name() {
		return "The player's name is " + name;
	}
	
	public String jersey() {
		return name + "'s jersey number is " + jersey;
	}
	
	public String whichHand() {
		if (isRight == true) {
			return name + " is right-handed";
		}
		else {
			return name + " is left-handed";
		}
	}
	
	public String shoots() {
		if (shoots == 0) {
			return name + " shoots right-handed";
		}
		else if (shoots == 1) {
			return name + " shoots left-handed";
		}
		else if (shoots == 2) {
			return name + " is able to shoot both ways";
		}
		else {
			return "Not valid";
		}
	}
	
	public String game(int stats) {
		games++;
		points += stats;
		return "In " + name + "'s " + games + " game, they scored " + stats + " points, bringing their season total to " + points;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HockeyPlayer e10 = new HockeyPlayer("Ethan Feng", 10, true, 2);
		System.out.println(e10.name());
		System.out.println(e10.jersey());
		System.out.println(e10.whichHand());
		System.out.println(e10.shoots());
		System.out.println(e10.game(10));
		System.out.println(e10.game(10));
	}

}
