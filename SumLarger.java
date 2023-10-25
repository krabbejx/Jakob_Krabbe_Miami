/* name - jakob krabbe
 * course - cse174
 * instructor - Bishop-Clark
 * lab 8 program 1 
 * purpose - squaring all of the integers 
 */
import java.util.Scanner;

public class SumLarger {
  public static void main (String args[]) {
    //getting needed inputs
    
    Scanner in = new Scanner(System.in);
    
    int count = 0;
    int limit = -1;
    int enterValue;
    int sum2 = 0;
    
    System.out.println("Enter a value");
    enterValue = in.nextInt();
    
    while(enterValue!=limit);
    {
      sum2 = (enterValue);
      sum2 = (sum2 + enterValue);
      count = (count + 1);
      System.out.println("Enter a value");
      enterValue = in.nextInt();
    }
    double avg = (sum2/count);
    System.out.println("The average of entred values are " + avg);
}
}
