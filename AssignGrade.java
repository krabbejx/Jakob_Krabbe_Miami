/* name - jakob krabbe
 * course - cse174
 * instructor - Bishop-Clark
 * LAB 6 
 * purpose -assignming grades to numbers 
 */
import java.util.Scanner;
import java.util.Formatter;

public class AssignGrade { 
  public static void main(String args[]) {
    //inputs 
    Scanner in = new Scanner(System.in); 
    
    System.out.println("Enter a grade as a whole number not as a decimal");
    int enteredGrade = in.nextInt();
    
    if (enteredGrade >= 90)
    {
      System.out.print("A");
    }
    else if(enteredGrade >= 80 )
    {
      System.out.print("B");
    }
    else if (enteredGrade >= 70 )
    {
      System.out.print("C");
    }
    else if (enteredGrade >=60 )
    { 
     System.out.print("D");
    }
    else
    {
      System.out.print("F");
    }
  }
}
    