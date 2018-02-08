package game.run;

import java.util.Scanner;

import game.Computer;
import game.Move;
import game.User;
import game.utils.GameUtils;

/**
 * <h1>RockPaperScissors Game!</h1> RockPaperScissors is one of the most known
 * games around the world this application simulate the RockPaperScissors game
 * with 2 players user and computer user make a move (always chooses Paper) and
 * computer make a random move with choices (ROCK,PAPER,SCISSORS) . Game Rules :
 * 
 * SCISSORS beats PAPER ,PAPER beats ROCK.
 *
 * @author Ahmed Gamal
 * @version 1.0
 */
public class RockPaperScissors {

	private User user;
	private Computer computer;
	// private Scanner inputScanner;

	/**
	 * determine how many games user will play
	 * */
	private int numberOfGames = 100;

	/**
	 * Class constructor initiate players and game settings
	 *
	 ***/
	public RockPaperScissors() {
		user = new User();
		computer = new Computer();
	}

	/**
	 * Manage the game flow setup players and handle user moves (inputs) , start
	 * new game every time user press y at the end of the game and finally when
	 * the user end the game print the game final results
	 * 
	 */
	public void play() {
		System.out.println("ROCK, PAPER, SCISSORS!");
		Move userMove = user.getMove();
		Move computerMove = computer.getMove();
		System.out.println("\nYou played " + userMove + ".");
		System.out.println("Computer played " + computerMove + ".\n");
		int result = userMove.whoWin(computerMove);
		if (result == 0) {
			System.out.println("Tie!");
		} else if (result == 1) {
			System.out.println(userMove + " beats " + computerMove
					+ ". You won!");
			user.score++;
		} else if (result == -1) {
			System.out.println(computerMove + " beats " + userMove
					+ ". You lost.");
			computer.score++;
		}

		// to make the game flow to ask the user for play again instead of start
		// new game automatically
		/*
		 * System.out.print("Can you beat the computer , press y if you want ?!")
		 * ; inputScanner = new Scanner(System.in); String userInput =
		 * inputScanner.nextLine(); userInput = userInput.toUpperCase(); if
		 * (GameUtils.playAgain(userInput.charAt(0))) {
		 * GameUtils.printDashes(30); play(); } else {
		 * GameUtils.printResults(user.score, computer.score, numberOfGames); }
		 */
	}

	/**
	 * Main method
	 * **/
	public static void main(String[] args) {
		RockPaperScissors game = new RockPaperScissors();
		// play 100 round
		while (--game.numberOfGames != 0)
			game.play();
		GameUtils.printResults(game.user.score, game.computer.score, 100);
	}
}
