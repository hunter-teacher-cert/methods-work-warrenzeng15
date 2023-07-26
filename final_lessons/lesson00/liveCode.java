import java.io.*;      
import java.util.Scanner;  
import java.util.Random;    //make sure to provide this!
  
public class Main {

    public static void main(String[] args) {      //provide
        Scanner scanner = new Scanner(System.in); //provide
        Random random = new Random();      //provide

        int secretNumber = random.nextInt(20) + 1; // Review with students how random works again. Student-prompt: How do we make the computer choose a random number between 1 and 20 (not including 0)? 
        int attempts = 0;      //provide this and tell students that it will be used to keep track of the number of attempts the user makes.
      
        int guess = 0;    //this is part of the Big idea, either skip this line and then go back, or initialize guess without assigning a value to it and then continue (will be a deliberate-error).
      
        System.out.println("Welcome to the Guessing Game!");              //provide these 2 print statements
        System.out.println("I have chosen a number between 1 and 20. Can you guess it?");

        while (guess != secretNumber)     //BIG IDEA/MUST-ANSWER-Q: Ask students what the condition of the while loop needs to be. "When should we tell the program to stop?"
                                          
        {
            System.out.println();
            System.out.print("Enter your guess: ");        //walk through the print statements with students with small student-prompts
            guess = scanner.nextInt();
            attempts++;      //student prompt: "Now that the user's attempt has gone up, what should we change here?" -> concept of iteration

            if (guess == secretNumber) {      //student-prompt: Ask students for what they would input for the if-else statements in the while loop. (include a "too high" and "too low" print statement for their respective cases)
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                break;          //this break is technically not needed in this program, but include it and explain it/how it can be used 
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

    }
}

//After the program is done, go through the whole program from start to finish one more time. 
//If time permits, play around by changing the while loop to see what happens (change the while loop condition to true and take out the break to see the infinite loop, change the condition to be related to # of attempts similar to videogame "lives",etc)


/*
PROVIDE :: code snippets or comments you definitely want to provide
STUDENT-PROMPT :: a specifically-worded question you want to ask, or a general solicitation for input, etc
MUST-ANSWER-Q :: a question that must be resolved, that a majority of your class must understand before moving on
BIG IDEA :: an introduction of a new topic, a connection to prior lesson or discussion for application here in code, etc.
BEEG REVEAL :: this is gonna blow yer minds...
DELIBERATE-ERROR :: specific code snippet or a general approach that is a bad fit for the situation, is flat-out wrong, or will lead to a compile- or run-time error, etc
*/

