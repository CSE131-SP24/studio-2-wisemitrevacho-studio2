package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is the starting amount?");
		double startAmount = in.nextDouble();
		System.out.println("What is the win chance?");
		double winChance = in.nextDouble();
		System.out.println("What is the win limit?");
		double winLimit = in.nextDouble();
		System.out.println ("How many days would you like to simulate?");
		double dayssim = in.nextDouble();
		// double start = 1
		
		while(startAmount < winLimit && startAmount > 0) {
		double random = (Math.random());
		
		if (random > winLimit) {
			startAmount -- ;
			System.out.println(startAmount);
		}
		else 	
		{
			startAmount ++;
			System.out.println(startAmount);
			//start ++;
			
		}
		
		if(startAmount == winLimit){
			System.out.println("You win!");
		}
		else if(startAmount == 0) {
			System.out.println("You lose. :(");
		}
		
		
	
		// random needs to be greater than win chance
		
	
				
			
			
			
			
		}
		


	}

}
