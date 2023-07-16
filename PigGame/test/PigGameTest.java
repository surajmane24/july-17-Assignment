package com.aurionpro.test;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import com.aurionpro.model.PigGame;

public class PigGameTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int storedScore = 0;
		int score = 0;
		int turn= 0;
		String choise = "r";
		System.out.println("Game Start ==>");
		
		do {
//			turn++;
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
