/* name - jakob krabbe
 * course - cse174
 * instructor - Bishop-Clark
 * lab 13 
 * purpose - three methods for coins  
 */
import java.util.Scanner;

public class MoneyBreak {
  public static void main (String args[]) {
    //getting needed inputs
    
    Scanner in = new Scanner(System.in);
    boolean finish;
    int LIMIT = -999;
    double enteredValue;
    System.out.println("Enter an amount, enter -999 to stop");
    enteredValue = in.nextDouble();
    int quarters = (int)determineQuarters(enteredValue);
    int dimes = (int)determineDimes(enteredValue);
    int nickels = (int)determineNickels(enteredValue);
       
    do
    {
      System.out.println(enteredValue + " has " + quarters + " quarters, or " + dimes + " dimes, or " + " nickels.");
      System.out.println("Enter another amount");
      enteredValue = in.nextDouble();
      if (enteredValue ==LIMIT);
      {
        finish = false;
      }
      
    }
    
    while(enteredValue!=LIMIT);
    {
      System.out.println("We're all done");
    }
  }
    /** finding out how many quarters are in the amount entered
    * @param amount that is entered
    * 
    */ 
    public static double determineQuarters(double quartersAmount){
      double moneyQuarters = quartersAmount / 0.25;
      return moneyQuarters;
    }
    /** finding out how many dimes are in the amount entered
    * @param amount that is entered
    * 
    */ 
    public static double determineDimes(double moneyDimes){
      double dimesAmount = moneyDimes/0.10;
      return dimesAmount;
      
    }
    /** finding out how many nickels are in the amount entered
    * @param amount that is entered
    * 
    */ 
    public static double determineNickels(double moneyNickels){
      double nickelAmount = moneyNickels/0.05;
      return nickelAmount;
    }
  
}