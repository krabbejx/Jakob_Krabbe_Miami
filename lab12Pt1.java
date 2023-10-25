/* 
 * Jakob Krabbe
 * CSE 174
 * Cathy Bishop-Clark
 * lab 11
 * open a file, read and put in line numbers in new file 
 */
import java.util.Scanner;

public class lab12Pt1 {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a string");
    String enteredString = in.next();
    System.out.println("Enter a number greater than zero");
    int numberEntered = in.nextInt();
    printString(enteredString,numberEntered);
    
  }
  
  /** finding out how many times the string entered is printed
    * @param string that is entered
    * @param integer of how many times it's printed
    */ 
  
  public static void printString(String stringName,int timesPrinted){
    int i=0;
    while (i<timesPrinted)
    {
      System.out.println(stringName);
      i++;
  }
  }
}
 