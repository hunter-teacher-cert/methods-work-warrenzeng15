import java.io.*;
import java.util.*;

/**
 * The Rules of Life:
 * Survivals:
 * A cell with 2 or 3 living neighbours will survive for the next generation.
 * Death:
 * Each cell with >3 neighbours will die from overpopulation.
 * Every cell with <2 neighbours will die from isolation.
 * Birth:
 * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It
 * will come alive next generation.
 * 
 * NOTA BENE: All births and deaths occur simultaneously. Together, they
 * constitute a single generation
 */

public class Cgol {

  // initialize empty board (all cells dead): char ' '/empty space means dead cell
  public static char[][] createNewBoard(int rows, int cols) {
    char board[][] = new char[rows][cols];
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[row].length; col++) {
        board[row][col] = ' '; // all cells dead first
      }
    }
    return board;
  }

  // print the board to the terminal
  public static void printBoard(char[][] board) { // loops through 2d array and prints everything separated by space
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[row].length; col++) {
        System.out.print(" " + board[row][col]);
      }
      System.out.println();
    }
  }

  // set cell (r,c) to val
  public static void setCell(char[][] board, int r, int c, char val) {
    board[r][c] = val;
  }

  // return number of living neigbours of board[r][c]
  public static int countNeighbours(char[][] board, int r, int c) { // loop through the adjacent cells for a target
                                                                    // index
    int numNeighbors = 0;
    for (int row = r - 1; row <= r + 1; row++) {
      for (int col = c - 1; col <= c + 1; col++) {
        if ((row == r && col == c) || row < 0 || col < 0 || row >= 25 || col >= 25) { // don't look at out of bounds
                                                                                      // cells
          continue; // also don't count the target index
        } else if (board[row][col] == 'X') {
          numNeighbors += 1;
        }
      } // end inner for loop
    } // end outer for loop
    return numNeighbors;
  }

  // precond: given a board and a cell
  // postcond: return next generation cell state based on CGOL rules
  // (alive 'X', dead ' ')

  public static char getNextGenCell(char[][] board, int r, int c) {
    char nextGen = ' ';
    int numNeighbors = countNeighbours(board, r, c);
    if (board[r][c] == 'X' && (numNeighbors == 2 || numNeighbors == 3)) { // living cells with 2or3 adjacet stay alive
      nextGen = 'X';

    } else if (board[r][c] == ' ' && numNeighbors == 3) { // dead cells with 3 adjacent living cells give birth
      nextGen = 'X';

    }
    return nextGen; // all other cases, cell is dead or becomes dead (like 4 or more neighbors =
                    // overpopulate)
  }

  // generate new board representing next generation
  public static char[][] generateNextBoard(char[][] board) {
    char newBoard[][] = createNewBoard(25, 25);
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[row].length; col++) {
        newBoard[row][col] = getNextGenCell(board, row, col); // invoke getNextgenCell for every cell on the board
      }
    }
    return newBoard;
  }

  public static void delay(int n) {
    try {
      Thread.sleep(n);
    } catch (InterruptedException e) {
    }
  }

  public static void animate(char[][] board, int gens) {
    int genCounter = 1;
    while (gens != 0) {

      System.out.print("\033[2J"); // clears the console window
      System.out.flush();          //need this for previous line to run properly
      System.out.print("\033[H"); // brings the cursor to the upper left corner of the console
      System.out.flush();
      System.out.println("Generation " + (genCounter) + ":");
      board = generateNextBoard(board);
      printBoard(board);
      delay(1000);                //delay so that output stays on screen shortly
      gens -= 1;
      genCounter += 1;

      
    }
  }

  public static void main(String[] args) {

    char[][] board;
    board = createNewBoard(25, 25);
    
    // breathe life into some cells:
    // setCell(board, 0, 0, 'X');
    // setCell(board, 0, 1, 'X');
    // setCell(board, 1, 0, 'X');
    // setCell(board, 1, 0, 'X');

    setCell(board, 1, 0, 'X');
    setCell(board, 1, 1, 'X');
    setCell(board, 1, 2, 'X');

    // setCell(board, 5, 5, 'X');
    // setCell(board, 6, 6, 'X');
    // setCell(board, 7, 4, 'X');
    // setCell(board, 7, 5, 'X');
    // setCell(board, 7, 6, 'X');

    // setCell(board, 4, 4, 'X');
    // setCell(board, 4, 5, 'X');
    // setCell(board, 4, 6, 'X');
    // setCell(board, 5, 4, 'X');

    setCell(board, 15, 15, 'X');
    setCell(board, 15, 16, 'X');
    setCell(board, 15, 17, 'X');
    setCell(board, 16, 15, 'X');
    setCell(board, 16, 16, 'X');
    setCell(board, 16, 17, 'X');
    setCell(board, 17, 15, 'X');
    setCell(board, 17, 16, 'X');
    setCell(board, 17, 17, 'X');
    setCell(board, 18, 14, 'X');
    setCell(board, 18, 13, 'X');
    setCell(board, 18, 12, 'X');
    setCell(board, 19, 14, 'X');
    setCell(board, 19, 13, 'X');
    setCell(board, 19, 12, 'X');
    setCell(board, 20, 14, 'X');
    setCell(board, 20, 13, 'X');
    setCell(board, 20, 12, 'X');
    /*
    System.out.println("Gen 1:");
    printBoard(board);
    System.out.println("--------------------------------------------\n\n");
    int genCounter = 1;

    int gens = 10;
    while (gens != 0) {
      System.out.println("Generation " + (genCounter) + ":");
      board = generateNextBoard(board);
      printBoard(board);
      System.out.println("--------------------------------------------\n\n");
      gens -= 1;
      genCounter += 1;
    }
    */
    
    animate(board, 20);
  }// end main()

}// end class