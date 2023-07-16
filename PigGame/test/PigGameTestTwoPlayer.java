package com.aurionpro.test;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import com.aurionpro.model.PigGame;

public class PigGameTestTwoPlayer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Game Start ==>");
		System.out.println("How many players\n Single Press- 1 \n Two Press- 2");
		int play = sc.nextInt();
		
		switch(play) {
		case 1:
			PigGame player = new PigGame();
			gameLogic(player);
			break;
		case 2:
			PigGame player1 = new PigGame();
			System.out.println("Player 1 Playing==> ");
			gameLogic(player1);
			PigGame player2 = new PigGame();
			System.out.println("Player 2 Playing==> ");
			gameLogic(player2);
			
			if(player1.getTurn() > player2.getTurn()) {
				System.out.println("Player 2 is the winner...");
			}
			else if(player1.getTurn() < player2.getTurn()) {
				System.out.println("Player 1 is the winner...");
			}
			else{
				System.out.println("match draw.. Playe Again..");
			}
		}	
	}
	
	public static void gameLogic(PigGame player) {
		Scanner sc = new Scanner(System.in);
		String choise = "r";
		int storedScore = 0;
		int score = 0;
		int turn= 0;
		do {
			if(choise.equalsIgnoreCase("r")) {
				int dieNumber = ThreadLocalRandom.current().nextInt(1, 6 + 1);
				System.out.println(dieNumber);
				if(dieNumber == 1) {
					score = 0;
					turn++;
				}
				else {
					score += dieNumber;
				}	
				System.out.println("Score ==>"+score);
				System.out.println("Enter your choise Roll or hold? (r/h): ");
				choise = sc.next();	
			}
			else if(choise.equalsIgnoreCase("h")) {
				turn++;
				storedScore += score;
				if(storedScore >= 20) {
					System.out.println("You finished in " + turn + " turns!" + "\nYour Final Score==> "+ storedScore);
					player.setTurn(turn); //Here we returns value that decide winner
					break;
				}
				
				score = 0;		
				System.out.println("Stored Score ==>" + storedScore);
				System.out.println("Enter your choise Roll or hold? (r/h): ");
				choise = sc.next();
			}
		}while(choise.equalsIgnoreCase("r") || choise.equalsIgnoreCase("h"));
	}

}
