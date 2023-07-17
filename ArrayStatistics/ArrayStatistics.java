package com.aurionpro.model;

public class ArrayStatistics {

	public static void main(String[] args) {
		System.out.println("Sum of all Numbers==> "+sum(args));
		System.out.println("Average of Numbers==> " + average(args));
		System.out.println("Max of Number==> " + max(args));
		System.out.println("Min of Number==> " + min(args));
		System.out.println("Median of Number==> " + median(args));
		System.out.println("frequency of each number in the array:");
		frequencyOfElement(args);
	}
	
	public static double sum(String[] args) {
		int sum=0;
		for(int i=0; i< args.length; i++) {
			sum += Integer.parseInt(args[i]);	
		}
		return sum;
	}
	
	public static double average(String[] args) {
		return sum(args)/args.length;
	}
	
	public static int max(String[] args) {
		int max = Integer.parseInt(args[0]);
		for(int i=0; i<args.length; i++) {
			if(max< Integer.parseInt(args[i])) {
				max = Integer.parseInt(args[i]);
			}
		}
		return max;
	}
	
	public static int min(String[] args) {
		int min = Integer.parseInt(args[0]);
		for(int i=0; i<args.length; i++) {
			if(min> Integer.parseInt(args[i])) {
				min = Integer.parseInt(args[i]);
			}
		}
		return min;
	}
	
	public static double median(String[] args) {
		int[] numberArray = new int[args.length];
		for(int i=0; i<args.length; i++) {
			numberArray[i] = Integer.parseInt(args[i]);
		}
		
		for(int i=0; i<numberArray.length; i++) {
			for(int j=i+1; j<numberArray.length; j++) {
				int temp =0;
				temp = numberArray[i];
				numberArray[i] = numberArray[j];
				numberArray[j] = temp;
			}
		}
		if(numberArray.length%2 != 0) {
			return numberArray[numberArray.length/2];
		}
		return (numberArray[(numberArray.length - 1) / 2] + numberArray[numberArray.length / 2]) / 2.0;
	}
	
	public static void frequencyOfElement(String[] args) {
		int[] numberArray = new int[args.length];	
		for(int i=0; i<args.length; i++) {
			numberArray[i] = Integer.parseInt(args[i]);
		}	
		int range = numberArray.length;
		boolean visited[] = new boolean[range];
		for(int i=0; i<range; i++) {
			
			if(visited[i] == true) {
				continue;
			}
			int count = 1;
			for(int j=i+1; j<range; j++) {
				if(numberArray[i] == numberArray[j]) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println(numberArray[i] + " " + count);
		}
	}
}
