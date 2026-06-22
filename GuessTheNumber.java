package tasks;
import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {

	public static void main(String[] args) {
		Random rdm= new Random();
		Scanner sc= new Scanner(System.in);
		int secret_number= rdm.nextInt(100)+1;
		 int guess;
	        int attempts = 0;

	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("Guess a number between 1 and 100.");

	        do {
	            System.out.print("Enter your guess: ");
	            guess = sc.nextInt();
	            attempts++;

	            if (guess > secret_number) {
	                System.out.println("Too high! Try again.");
	            } else if (guess < secret_number) {
	                System.out.println("Too low! Try again.");
	            } else {
	                System.out.println("Congratulations! You guessed the number.");
	                System.out.println("Number of attempts: " + attempts);
	            }

	        } while (guess != secret_number);

	        sc.close();
	    }
	
		

	}


