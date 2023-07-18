import java.io.*;
import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class Nim {

  // intialize the game - 12 stones, win condition is to remove the last stone.
  public static void nimGame() {
    int stones = 12; //start with 12 stones
    System.out.println("There are 12 stones in a bag. The winner is the one that takes the last stone out!\n");
    do {   //program runs until #of stones reaches 0 via do-while loop
      System.out.println("How many stones would you like to remove?");
      Scanner in = new Scanner(System.in);
      int playerMove = in.nextInt();

      while (playerMove < 1 || playerMove > 3 || playerMove > stones ) {  //check for valid moves only
        System.out.println("Please enter a number between 1 and 3 that is not greater than the number of stones                 remaining.");
        playerMove = in.nextInt();
      }
        stones = stones - playerMove;
        System.out.println("There are " + stones + " stone(s) remaining.\n");
      
        if (stones == 0){
          System.out.println("You win!"); // win condition reached for human
          break;
        }

      int thisTurn = computerTurn(stones);
      stones = stones - thisTurn;
      System.out.println("The computer removes "+ thisTurn+ "stone(s).");
      System.out.println("There are " + stones + " stone(s) remaining.\n");
        if (stones == 0){
          System.out.println("Computer wins!"); // win condition reached for computer
          break; // not technically needed, but I put for clarity
        }
        
    } while (stones > 0); //"while the number of stones is greater than 0, the program runs"
  }

  
  public static int computerTurn(int stonesLeft) {  // method for computer turn 
    Random random = new Random(); 
    int computerChoice = random.nextInt(3)+1; //random number between 1-3
    while(computerChoice > stonesLeft){ //loop to subtract 1 from choice if > stones, to avoid negative stones
      computerChoice -= 1;
    }
    return computerChoice;
    
  }

  public static void main(String[] args) {
    nimGame();

  }

}
