/* name - jakob krabbe
 * course - cse174
 * instructor - Bishop-Clark
 * LAB 6 PART 2
 * purpose - organizing strings in alphabetical order 
 */
import java.util.Scanner;
  
public class StringOrder {
  public static void main (String args[]) {
    //getting needed inputs
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Hello! this will take any word you enter and put them alphabetical order for you");
    
    System.out.println("Enter a word");
    String string1 = in.next();
    
    System.out.println("Enter another word");
    String string2 = in.next();
    
    System.out.println("Enter one more word");
    String string3 = in.next();
    
    
    if ((string1.compareTo(string2) < 0 && (string2.compareTo (string3) <0))) //1,2,2,3
    {
      System.out.println (string1 + " " + string2 + " " + string3);
    }
    else if ((string2.compareTo(string1) < 0 && (string1.compareTo (string3) <0))) //2,1,1,3
          {
      System.out.println (string2 + " " + string1+ " " + string3);
    }
    else if ((string3.compareTo(string2) < 0 && (string2.compareTo (string1) <0))) //3,2,2,1
               {
      System.out.println(string3 + " " + string2+ " " + string1);
    }
    else if ((string3.compareTo(string1) < 0 && (string1.compareTo (string2) <0)))    //3,1,1,2 
               {
      System.out.println(string3 + " " + string1 + " "+ string2);
    }
    else if ((string2.compareTo(string3) < 0 && (string3.compareTo (string1) <0))) //2,3,3,1
               {
      System.out.println(string2 + " " + string3 + " " + string1);
    }
    else if ((string1.compareTo(string3) < 0 && (string3.compareTo (string2) <0))) // 1,3,3,2
               {
      System.out.println(string1 + " " + string3 + " " + string2);
    }
             }
}