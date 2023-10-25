/* name - jakob krabbe
 * course - cse174
 * instructor - Bishop-Clark
 *  lab 7 
 * purpose - integers for seasons   
 */
import java.util.Scanner;

public class ifTemps {
  public static void main (String args[]) {
    //getting needed inputs
    
    Scanner in = new Scanner(System.in);
    
    //inputs 
    System.out.println("In numberical form, what temperature is it?");
    int temp = in.nextInt();
    // if else for all of the seasons 
    
    if ((temp>= 90) && (temp<=110))
    {
      System.out.println("It is probably summer");
    }
    else if ((temp>=70) && (temp<90))
    {
      System.out.println("It is probably spring");
    }
    else if ((temp>=50) && (temp<70))
    {
      System.out.println("It is probably fall");
    }
    else if ((temp<50)&&(temp>=5))
    {
      System.out.println("it is probably winter");
    }
    else if ((temp>110) || (temp<5))
    {
      System.out.println("The temperature is outside of vallid range");
    }
    else
    {
      System.out.println("Plesae only use whole numbers");
    }
  }
}
    