/**
   classwork -- Day 02
   2D array application :: Conway's Game of Life
   M. Zamansky, T. Mykolyk, F. Dragon, et al
   June 2020

   USAGE:
   > javac Life.java
   > java Life
   Ctrl-C to quit
**/


import java.io.*;
import java.util.*;

/*
  2D array 

  set up 
  change values in it

  a way of applying the GOL rules 
*/



public class Life
{

  /*
    create a new 2D array, fill it with ' ' 
    representing that the entire board is empty.
  */
  public static char[][] createNewBoard(int rows, int cols)
  {
    char[][] board = new char[rows][cols];
    for (int r = 0; r < rows; r++) {
	    for (int c = 0; c < cols; c++) {
        board[r][c] = ' ';
	    }
    }
    return board;
  }

    
  public static void printBoard(char[][] board)
  {
    for (int r = 0; r < board.length; r++) {
	    for (int c = 0; c < board[r].length; c++) {
        System.out.printf("%c",board[r][c]);
	    }
	    System.out.println();
    }
    System.out.println("\n\n------------------\n\n");
  }

  
  /*
    set the cell (r,c) to value
  */
  public static void setCell(char[][] board, int r, int c, char val)
  {
    if (r>=0 && r<board.length && c>=0 && c<board[r].length){
	    board[r][c] = val;
    }
  }


  /* 
     Count and return the number of living neigbours around board[r][c]
     opted for #2 below:
     approach 1 - lots of if statements (exactly 8)
     approach 2 - you can loop over the grid from board[r-1][c-1]
     to board[r+1][c+1]
  */
  public static int countNeighbours(char[][] board, int r, int c)
  {
    int numLivingNeighbours = 0; // init count to return

    //will need to know overall board dimensions
    //...to determine whether I'm on an edge or not
    int rows = board.length;
    int cols = board[0].length;
    
    /* nested FOR loops:
       iterate thru each cell of 3x3 grid
       ...starting at upper left, moving left-to-right across each row
    */
    for (int row = r-1; row <= r+1 ; row++) { 
	    for (int col = c-1; col <= c+1 ; col++) { 
        if (row < 0 || col < 0 || row >= rows || col >= cols) //OOB check
          continue; //skip rest of code block, go to next iteration of FOR
        if (row==r && col==c) //am I me? (do not count self)
          continue; //skip rest of code block, go to next iteration of FOR
        if (board[row][col]=='X')
          numLivingNeighbours++;
      }
    }   
    return numLivingNeighbours;
  }//end countNeighbours()

 
  /*
    given a board and a cell, determine, based on the rules for 
    Conway's GOL if the cell is alive ('X') or dead (' ') in the 
    next generation. 
  */
  public static char getNextGenCell(char[][] board,int r, int c)
  {
    // calculate the number of living neighbors around board[r][c]

    // determine if board[r][c] is living or dead
    //    if living and 2 or 3 neighbors then remain alive
    //    if dead and 3 neighbors then become alive

    //init temp vars to clean up logic below:
    int n = countNeighbours(board, r, c);
    char current = board[r][c];

    if ( current=='X' && (n==2 || n==3) ) //i'm alive and will survive
      return 'X';
    else if ( current==' ' && n==3 )      //i'm dead but will come alive
      return 'X';
    else              //about to die, or i'm dead and will stay dead
      return ' '; 
  }//end getNextGenCell()



  /*
    scan the board to generate a NEW board with the
    next generation
  */
  public static char[][] generateNextBoard( char[][] board )
  {
    int rows = board.length;
    int cols = board[0].length;
    char[][] newBoard = createNewBoard(rows, cols);

    // fill the new board
    for (int r = 0; r < rows; r++){
      for (int c = 0; c < cols; c++){
        char nextCell = getNextGenCell(board,r,c);
        newBoard[r][c] = nextCell;
      }
    }
    return newBoard;
  }//end generateNextBoard()


  //helper method to slow down animation 
  public static void delay(int n)
  {
    try {
        Thread.sleep(n);
    } 
    catch(InterruptedException e) {}
  }

  
  public static void animateBoard(char[][] board)
  {
    //send ANSI control char to clear terminal and put cursor at top left
    System.out.print("[0;0H\n"); 
    for( int row=0; row<board.length; row++ ) {
	    for ( int col=0; col<board[row].length; col++ ) {
        System.out.print( board[row][col] );
	    }
	    System.out.println();
    }
    delay(1000);
  }


  

  
  public static void main(String[] args)
  {
    char[][] board;
    board = createNewBoard(25,25);

    /**
       USAGE:
       pick one of the two starting configs below
       comment out the other one
    **/
    
    //init config to lead settle into stable oscillation of blinkers
    setCell(board,10,10,'X');
    setCell(board,10,9,'X');
    setCell(board,10,11,'X');
    setCell(board,9,10,'X');
    setCell(board,11,10,'X');

    //place glider at upper left
    /*
    setCell(board,0,1,'X');
    setCell(board,1,2,'X');
    setCell(board,2,0,'X');
    setCell(board,2,1,'X');
    setCell(board,2,2,'X');
    */

    //run for 100 "frames" 
    for( int i=0; i<100; i++ ) {
      board = generateNextBoard(board);
      animateBoard(board);
    }
  }//end main()

}//end Life
