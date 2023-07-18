import java.io.*;
import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class Nim {

  // This game of Nim has 12 stones, one human player and one computer player. 
  // The players take turns removing their choice of 1, 2 or 3 stones from the pile at a time. The winner is the one that removes the last stone.
  
  public static void nimGame() {
    int stones = 12; //start with 12 stones 
    System.out.println("There are 12 stones in a bag. The winner is the one that takes the last stone out!\n"); 

  //We use a do-while loop here, but it isn't finished. Check the question at line 42!
    do {   
      System.out.println("How many stones would you like to remove?");
      Scanner in = new Scanner(System.in);
      int playerMove = in.nextInt();
      
            while (     ) {  // Q: We need to check for valid moves only! What needs to go inside the parentheses?
              System.out.println("Please enter a number for a valid move.");
              playerMove = in.nextInt();
            }
              stones = stones - playerMove;
              System.out.println("There are " + stones + " stone(s) remaining.\n");
            
              if (     ){ // Q: This is the win condition for the player. What needs to go inside the parentheses?
                System.out.println("You win!"); 
                break;
              }
        
            int thisTurn = computerTurn(stones);
            stones = stones - thisTurn;
            System.out.println("The computer removes "+ thisTurn+ "stone(s).");
            System.out.println("There are " + stones + " stone(s) remaining.\n");

              if (        ){   // Q: This is the win condition for the computer. Fill in the parentheses. Hint: it's  the same as the one above!
                System.out.println("Computer wins!"); 
                break; 
              }
        
    } while (       ); //END OF DO-WHILE LOOP! Q: What needs to go inside the parentheses? Hint: Think of what 
  }

  
  // This is the method for the computer turn. Note that we do not want the computer to take more stones than there are, in order to avoid negative stones.
  public static int computerTurn(int stonesLeft) {  
    Random random = new Random(); 
    int computerChoice = random.nextInt(3)+1; //this picks a random number between 1-3, the number of stones that the computer will choose to remove.
    while(    ){     //Q: We need to create a loop to subtract from the computer's choice as long as it's choice is invalid. What should the while loop look like?
      computerChoice -= 1;
    }
    return computerChoice;
  }

  public static void main(String[] args) {    
    nimGame();
  }

}
