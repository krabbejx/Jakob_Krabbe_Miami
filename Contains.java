/* name = jakob krabbe
 * course = cse174
 * instructor = Bishop-Clark
 * lab 5 strings
 * finding when strings are contained in the first  
 */

import java.util.Scanner;

public class Contains {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("RULES:");
    System.out.println("This program tests to see if the words you enter match");
    System.out.println("If they do match, you will see a 0 at the end of the program");
    System.out.println("If they do not match, you will see a -1 at the end of the program");
    
    //entering the strings 
    System.out.print("Enter a word");
    String stringOne = in.next();
    System.out.println();
    System.out.print("Enter another word");
    String stringTwo = in.next();
    
    //using the indexOf method 
    int matchingStrings = stringTwo.indexOf(stringOne);
    
    //outputs 
    
        
    System.out.print("These strings matched in these characters " + matchingStrings);
    
  }
}
    
    