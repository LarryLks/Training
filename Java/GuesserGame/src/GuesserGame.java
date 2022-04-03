
import java.util.Scanner;

class Guesser{
	int gNum;
	int guessNum() {
		System.out.println("Guesser, kindly guess a number:(0-50)");
		Scanner scan = new Scanner(System.in);
		gNum = scan.nextInt();
		return gNum;
		
	}
}


class Player{
	int gNum;
	int guessNum() {
		System.out.println("Player, kindly guess a number:(0-50)");
		Scanner scan = new Scanner(System.in);
		gNum = scan.nextInt();
		return gNum;
		
	}
}

class Umpire{
	int numFromGuesser;
	int numFromP1;
	int numFromP2;
	int numFromP3;

	void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
	}
	
	void collectNumFromP1() {
		Player p1 = new Player();
		numFromP1 = p1.guessNum();
	}
	
	void collectNumFromP2() {
		Player p2 = new Player();
		numFromP2 = p2.guessNum();
	}
	
	void collectNumFromP3() {
		Player p3 = new Player();
		numFromP3 = p3.guessNum();
	}
	
	void compare(){
		if(numFromGuesser == numFromP1){
			System.out.println("Player 1 Wins!");
		}
		else {
			System.out.println("Player 1 Lose!");
		}
		
		if(numFromGuesser == numFromP2){
			System.out.println("Player 2 Wins!");
		}
		else {
			System.out.println("Player 2 Lose!");
		}
		
		if(numFromGuesser == numFromP3){
			System.out.println("Player 3 Wins!");
		}
		else {
			System.out.println("Player 3 Lose!");
		}
		
	}

}

public class Game {
	public static void main(String[] args) {
		Umpire u = new Umpire();
		
		u.collectNumFromGuesser();
		u.collectNumFromP1();
		u.collectNumFromP2();
		u.collectNumFromP3();
		u.compare();
	}
}
