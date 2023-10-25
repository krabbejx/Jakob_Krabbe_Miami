/* name - jakob krabbe
 * course - cse174
 * instructor - Bishop-Clark
 * LAB 6 PART 1 
 * purpose - organizing strings in alphabetical order 
 */
import java.util.Scanner;
  
public class SenctenceInfo {
  public static void main (String args[]) {
    //getting needed inputs
    
    Scanner in = new Scanner(System.in);
    
    //inputs 
    
    System.out.println("Enter a sentence");
    String sentence1 = in.nextLine();
    
    //total characters 
    
    int sentenceLength = sentence1.length();
    
    //first word 
    int spaces = sentence1.indexOf(' ');
    String firstWord = sentence1.substring(0, spaces);
    //first word length
    
    int firstCharacter = firstWord.length();
    
    //outputs 
    System.out.println("The first word of the sentence is "+firstWord); 
    System.out.println("There are " +sentenceLength+" characters in the sentence.");
    System.out.println("There are " +firstCharacter+" characters in the first word");
   
    
   
       
  }
}