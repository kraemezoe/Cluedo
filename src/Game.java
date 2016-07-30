import java.util.ArrayList;

import game.Player;

public class Game {

	ArrayList<Player> players = new ArrayList<Player>();

	public Game(int NumberPlayers) {
		while(NumberPlayers>0){
			//addplayers
		}
	}
	
	public void turn(Player p){
		Random rand = new Random();
		int diceRoll = rand.nextInt(11)+2; //generate a random number between 2 and 12
		move(diceRoll, p);
		//suggestion/accusation mechanics go here
	}
	
	public void move(int diceRoll, Player p){
		while(diceRoll>0){
			System.out.println("Steps left: "+diceRoll);
			System.out.println("Choose a direction");
			String dir = System.in.toString().toUpperCase();
			switch(dir){
			case("N"):
				//go north
				break;
			case("S"):
				//go south
				break;
			case("E"):
				//go east
				break;
			case("W"):
				//go west
				break;
			default:
				System.out.println("Invalid input. Please use one of the following: N, S, E, W");
			}
			//check if player is in a room
			//if yes return?? i'm guessing here
		}
		return;
	}

}
