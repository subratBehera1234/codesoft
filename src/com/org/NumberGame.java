package com.org;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
	
		Random random=new Random();
		int randomNumber=random.nextInt(100)+1;
		int attempt=0;
		int score=0;
		int maxAttempt=5;
		boolean play=true;
		Scanner sc =new Scanner(System.in);  
		
		while(play) {
			attempt=0;
			randomNumber=random.nextInt(100)+1;
			System.out.println("I have generated one random number in between 1 to 100");
			while(attempt<maxAttempt) {
				
			
				 System.out.println("Try to guess the number!");
				 
				 int userGuess=sc.nextInt();
				 attempt++;
				 
				 if(userGuess==randomNumber) {
					 System.out.println("Congratulations! You guessed the correct number.");
					 score=attempt;
					 break;
				 }
				 else if(userGuess<randomNumber) {
					 System.out.println("Your guess is too low. Try again!");
				 }
				 else {
					 System.out.println("Your guess is too high. Try again!");
				 }
			}
			if(attempt==maxAttempt) {
				System.out.println("Your attempt limit is over. The number was: " + randomNumber);
			}
			
			System.out.println("It took you " + attempt + " guesses.");
			System.out.println("your score is : "+score);
			
			 System.out.print("Do you want to play again? (yes/no): ");
	            String response = sc.next();
	            
	            if(response.equalsIgnoreCase("no")) {
	            	play=false;
	            }
		}
	}
}
