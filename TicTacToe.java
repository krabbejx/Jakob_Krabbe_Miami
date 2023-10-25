/* 
 * Jakob Krabbe
 * CSE 174
 * Cathy Bishop-Clark
 * lab 11
 * open a file, wite hello,world into the file, close it and open again and read message into a string and print it
 */
import java.io.*;
import java.util.*;
import java.util.Scanner;



public class TicTacToe {
  
   
  public static void main(String[] args) {
     // opening file
    Scanner in = new Scanner(System.in);
    
    //making the double array 
    char[][] board = 
    {
      {'-','-','-'},
      {'-','-','-',},
      {'-','-','-',},
    };
    //call to print method here
    printBoard(board);
    //make play set up 
    System.out.println("Who is going first?");
    String player = in.next();
    System.out.println("The board goes like this"); 
    System.out.println("1 2 3 ");
    System.out.println("4 5 6 ");
    System.out.println("7 8 9 ");
    
    System.out.println("what position would you like to place your letter?");
    int position = in.nextInt();
    //call to make play 
    
    makePlay(board,player,position);
    printBoard(board);
    
    System.out.println("who is going now");
     player = in.next();
    System.out.println("what position");
     position = in.nextInt();
    
    
    
    
    makePlay(board,player,position);
    
    
    System.out.println("who is going now");
     player = in.next();
    System.out.println("what position");
     position = in.nextInt();
    makePlay(board,player,position);
    
    
    
    
    printBoard(board);
    
    determineWinner(board,player);
    
  }
  
  public static void printBoard(char[][] board) {
    for(int i =0;i<3;i++)
    {
      
      for (int j =0;j<3;j++)
      {
        System.out.print(board[i][j] +"\t");
      }
      System.out.println(" ");
    }
  }
  public static String makePlay(char[][] board, String replace,int position){
    String oppositeX ="x";
    String oppositeY ="y";
    char oppositeX1 = oppositeX.charAt(0);
    char oppositeY1 = oppositeY.charAt(0);
    String tOrF = "";
    char replace1 = replace.charAt(0);
    if(position ==1)
    {
      if((board[0][0]==replace1)||board[0][0]==oppositeX1||(board[0][0]==oppositeY1))
      {
        tOrF="false";
      }
      else
      {
      board[0][0] = replace1;
      tOrF = "true";
      }   
    }
    else if (position ==2) //01
    {
      if((board[0][1]==replace1)||board[0][1]==oppositeX1||(board[0][1]==oppositeY1))
      {
        tOrF="false";
      }
      else
      {
      board[0][1] = replace1;
      tOrF = "true";
      }
    }
    else if (position ==3) //02
    {
      if((board[0][2]==replace1)||board[0][2]==oppositeX1||(board[0][2]==oppositeY1))
      {
        tOrF="false";
      }
      else
      {
      board[0][2] = replace1;
      tOrF = "true";
      }
    }
    else if (position ==4)//10
    {
     if((board[1][0]==replace1)||board[1][0]==oppositeX1||(board[1][0]==oppositeY1))
      {
        tOrF="false";
      }
      else
      {
      board[1][0] = replace1;
      tOrF = "true";
      }
    }
    else if (position ==5)//11
    {
      if((board[1][1]==replace1)||board[1][1]==oppositeX1||(board[1][1]==oppositeY1))
      {
        tOrF="false";
      }
      else
      {
      board[1][1] = replace1;
      tOrF = "true";
      }
    }
    else if (position ==6)//12
    {
      if((board[1][2]==replace1)||board[1][2]==oppositeX1||(board[1][2]==oppositeY1))
      {
        tOrF="false";
      }
      else
      {
      board[1][2] = replace1;
      tOrF = "true";
      }
    }
    else if (position ==7)//20
    {
      if((board[2][0]==replace1)||board[2][0]==oppositeX1||(board[2][0]==oppositeY1))
      {
        tOrF="false";
      }
      else
      {
      board[2][0] = replace1;
      tOrF = "true";
      }
    }
    else if (position==8)//21
    {
      if((board[2][1]==replace1)||board[2][1]==oppositeX1||(board[2][1]==oppositeY1))
      {
        tOrF="false";
      }
      else
      {
      board[2][1] = replace1;
      tOrF = "true";
      }
    }
    else if(position ==9)//22
    {
      if((board[2][2]==replace1)||board[2][2]==oppositeX1||(board[2][2]==oppositeY1))
      {
        tOrF="false";
      }
      else
      {
      board[2][2] = replace1;
      tOrF = "true";
      }
    }
    
    System.out.println(tOrF);
    return tOrF;
    
  }
  public static String determineWinner(char[][] board, String replace){
   char replace1 = replace.charAt(0);
   String winner ="";
    if ((board[0][0] == replace1)&&(board[0][1] ==replace1)&&(board[0][2] ==replace1))
    {
      winner = (replace1 + " is the winner");
    }
    else if ((board[1][0] == replace1)&&(board[1][1] ==replace1)&&(board[1][2] ==replace1))
      {
      winner = (replace1 + " is the winner");
    }
     else if ((board[2][0] == replace1)&&(board[2][1] ==replace1)&&(board[2][2] ==replace1))
      {
      winner = (replace1 + " is the winner");
    }
      else if ((board[0][0] == replace1)&&(board[1][1] ==replace1)&&(board[2][2] ==replace1))
      {
      winner = (replace1 + " is the winner");
    }
       else if ((board[0][2] == replace1)&&(board[1][1] ==replace1)&&(board[2][0] ==replace1))
      {
      winner = (replace1 + " is the winner");
    }
       else 
       {
         winner = "-";
       }
       
       System.out.println(winner);
  return winner;
  }
  
    
    
  
  
  
}