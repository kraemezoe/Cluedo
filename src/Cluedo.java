import java.util.Scanner;

public class Cluedo {



	public Cluedo() {
		// TODO Auto-generated constructor stub
	}

	public void walk(){


	}

	public void step(){
		System.out.println("What direction do you want to move?");


	}


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Starting Cluedo");
		System.out.println("How many players?");
		int next = (Integer)sc.nextInt();

		Game game1 = new Game(next);
	}


}
