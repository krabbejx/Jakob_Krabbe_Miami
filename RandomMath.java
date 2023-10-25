/* name - jakob krabbe
 * course - cse174
 * instructor - Bishop-Clark
 * lab 14
 * purpose - methods with strings 
 */
import java.util.Scanner;

public class RandomMath {
  
  public static void main (String args[]) {
    //getting needed inputs
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("How many random numbers do you want to generate?");
    int repeatAmount = in.nextInt();
    
    System.out.println("What is the number of values for each random draw?");
    int randomNum = in.nextInt();
    
    //making the array here 
    
    
    int[] randomMath = new int[randomNum];
    
    for (int i =0;i<repeatAmount;i++)
    {
      
      
      int randomResult = (int) (Math.random()*randomNum);
      randomMath[randomResult]++;
            
      
         
      
    }
    for (int j =0; j<randomNum;j++)
    {
      System.out.println(j + ":" + randomMath[j]);
      
    }
    
    
  }
}