package com.aurionpro.model;
import java.util.Scanner;
public class WaterBillApp {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Number of unit consume: ");
		int unit = sc.nextInt();

		System.out.println("Total Water Bill==> "+ calculateWaterBill(unit));
	}

	public static int calculateWaterBill(int unit) {
		int meterCharge = 75;
		int charge = 0;
		if(unit<=100) {
			charge = unit*5;
		}
		else {
			if(unit <= 250) {
				charge = unit*10;
			}
			else {
				charge = unit*20;
			}
		}
		int totalWaterBill  = charge + meterCharge;
		return totalWaterBill;
	}

}
