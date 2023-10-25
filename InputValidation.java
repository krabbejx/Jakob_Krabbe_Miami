/* name - jakob krabbe
 * course - cse174
 * instructor - Bishop-Clark
 * lab 10
 * purpose - entering age as an integer using do while loop 
 */
import java.util.Scanner;

public class InputValidation {
  public static void main (String args[]) {
    //getting needed inputs
    
    Scanner in = new Scanner(System.in);
    
    int age;
    int oldLimit = 122;
    int youngLimit = 0;
    do
    {
      System.out.println("Please enter your age");
      age = in.nextInt();
      if (age <=youngLimit) //enter an age under 0
      {
        System.out.println("You've entered an age too young");
      }
       
      else if (age>=oldLimit) //enter an age above 122
      {
        System.out.println("You've entered an age too old");
      }
      
    }
    while ((age <=youngLimit) || (age >=oldLimit)); 
    {
      System.out.println("Congrats! you've escaped the loop");
    }
    
  }
}
    
  
