/* name = jakob krabbe
 * course = cse174
 * instructor = Bishop-Clark
 * lab 5 strings
 * taking off the first and last character of an entered string 
 */
import java.util.Scanner;

public class FirstLast {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    //input your name 
    System.out.println("Are you ready to recieve your new name?");
    System.out.print("Enter your first name to get your new one!");
    
    String oldName = in.nextLine();
    
    //cutting the characters off
    
    String newName = oldName.substring(1, oldName.length() - 1);
    
    //output 
    System.out.println("Your new name is " + newName);
    System.out.println("Hope you like it!");
  }
}
    
    
    