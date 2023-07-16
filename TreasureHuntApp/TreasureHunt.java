package com.aurionpro.model;

import java.util.Scanner;

public class TreasureHunt {
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);

		System.out.println("Select Right or Left");
		String firstSelect = sc.nextLine();
		
		if(firstSelect.equalsIgnoreCase("Left")){
			
			System.out.println("Select swim or Wait");
			String secondSelect = sc.nextLine();
			if(secondSelect.equalsIgnoreCase("Wait")){
				
				System.out.println("Select Red or Blue or Yellow");
				String thirdSelect = sc.nextLine();
				if(thirdSelect.equalsIgnoreCase("Red")){
					System.out.println("Burned by fire.\n Game Over");
				}
				else if(thirdSelect.equalsIgnoreCase("Blue")){
					System.out.println("Eaten by beasts.\n Game Over");
				}
				else if(thirdSelect.equalsIgnoreCase("Yellow")){
					System.out.println("You Win!!");
				}
				else{
					System.out.println("Game Over");
				}
			}
			else{
				System.out.print("Attacked by trout. game Over");
			}
		}
		else{
			System.out.println("Fall into a hole. Game Over");
		}
		
		
	}
	
}
