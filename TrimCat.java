/* name = jakob krabbe
 * course = cse174
 * instructor = Bishop-Clark
 * lab 5 strings
 * trimming after two strings
 */

import java.util.Scanner;

public class TrimCat {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    //getting strings 
    
    System.out.print("Enter a word");
    String stringOne = in.next();
    System.out.println();
    System.out.print("Enter another word");
    String stringTwo = in.next();
    
    //trimming the words
    
    String shortOne = stringOne.trim();
    String shortTwo = stringTwo.trim();
    
    //output 
    System.out.print("the strings that you printed are ");
    System.out.print(shortOne.toUpperCase());
    System.out.print(" & ");
    System.out.print(shortTwo.toUpperCase());
  }
}
    
    
    
   