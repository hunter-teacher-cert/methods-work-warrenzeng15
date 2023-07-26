import java.io.*;
import java.util.Scanner;
  
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(20) + 1; // Generate a random number between 1 and 100
        int attempts = 0;
        int guess = -1;
      
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have chosen a number between 1 and 20. Can you guess it?");

        while (guess != secretNumber) 
        {
            System.out.println();
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

    }
}
