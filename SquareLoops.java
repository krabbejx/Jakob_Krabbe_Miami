/* name - jakob krabbe
 * course - cse174
 * instructor - Bishop-Clark
 * lab 8 program 1 
 * purpose - squaring all of the integers 
 */
import java.util.Scanner;

public class SquareLoops {
  public static void main (String args[]) {
    //getting needed inputs
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter a number");
    int goal = in.nextInt();
    
    //writing the loop 
   
    int i = 0;
    int sum = 0;
    while (sum< goal)
    {
      System.out.println(sum);
      i ++;
      sum = (sum + i);
      sum = (i*i);
      
     
      
    }
  }
}