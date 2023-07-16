package com.aurionpro.test;
import com.aurionpro.model.BookCricket;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class BookCricketTest {

	public static void main(String[] args) {
		BookCricket player1 = new BookCricket();
		BookCricket player2 = new BookCricket();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1 to start the game and 0 to exit => ");
		int usrInput = sc.nextInt();
		if(usrInput == 1) {
			System.out.print("Enter player 1 name => ");
			player1.setName(sc.next());
			System.out.print("Enter player 2 name => ");
			player2.setName(sc.next());
			//Calling Game Start Method...
			gameStart(player1, player2);
		}
	}
	public static void gameStart(BookCricket player1, BookCricket player2) {
		gameLogic(player1);
		int target = player1.getScore()+1;
		System.out.println(player2.getName()+" Needs "+target +" Score in "+player1.getTurns()+" Round to WIN MATCH.");
		gameLogic(player1, player2);
	}
	
	public static void gameLogic(BookCricket player) {
		Scanner sc = new Scanner(System.in);
		int tempResult = 1;
		System.out.println("Player==> " + player.getName());
		while(tempResult != 0) {
			System.out.print("Enter 1 to open a book: ");
			int userInput = sc.nextInt();
			if(userInput == 1) {
				int pageNumber = ThreadLocalRandom.current().nextInt(1, 300 + 1);
				player.setPoint(pageNumber%7);
				player.setScore(player.getScore() + player.getPoint());
				player.setTurns(player.getTurns()+1);
				BookCricket.round++;
				System.out.println("Page Number => "+ pageNumber + "	Point => " +
						player.getPoint() + "	Score => "+ player.getScore());
				tempResult = player.getPoint();
			}
			else {
				System.out.println("Wrong Input..............");
				break;
			}
		}
		System.out.println(player.getName()+ " Total Score => " + player.getScore());
		System.out.println(player.getName()+ " Takes " + player.getTurns() + " round ");
		
	}
	
	public static void gameLogic(BookCricket player1, BookCricket player2) {
		Scanner sc = new Scanner(System.in);
		int tempResult = 1;
		System.out.println("Player==> " + player2.getName());
		while(tempResult != 0) {
			System.out.print("Enter 1 to open a book: ");
			int userInput = sc.nextInt();
			if(userInput == 1) {
				int pageNumber = ThreadLocalRandom.current().nextInt(1, 300 + 1);
				player2.setPoint(pageNumber%7);
				player2.setScore(player2.getScore() + player2.getPoint());
				player2.setTurns(player2.getTurns()+1);
//				--BookCricket.round;
				System.out.println("Page Number => "+pageNumber+ "	Point => "+player2.getPoint()+
						"	Score => "+player2.getScore()+"		Round Left => "+ --BookCricket.round);
				tempResult = player2.getPoint();
				if(player2.getPoint() == 0 || BookCricket.round == 0) {
					if(BookCricket.round == 0) {
						System.out.println("--------"+player2.getName()+" Rounds are Over"+"--------");
						System.out.println("--------"+player1.getName()+" Win Match !!"+"--------");
					}
					else{
						System.out.println("--------"+player1.getName()+" Win Match !!"+"--------");
					}
					break;
				}
				else if(player2.getScore() >= player1.getScore() ) {
					if(player2.getScore() == player1.getScore()) {
						if(player2.getTurns() < player1.getTurns()) {
							System.out.println("--------"+player2.getName()+" Win Match !!"+"--------");
							break;
						}
						else {
							System.out.println("--------"+player1.getName()+" Win Match !!"+"--------");
							break;
						}
					}
					System.out.println("--------"+player2.getName()+" Win Match !!"+"--------");
					break;
				}
				
			}
			else {
				System.out.println("Wrong Input..............");
				break;
			}	
		}
	}
}
