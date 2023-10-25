/* name - jakob krabbe
 * course - cse174
 * instructor - Bishop-Clark
 *  LAB 4 
 * purpose - finding out interest rate for x amount of years 
 */
import java.util.Scanner;
import java.util.Formatter;

public class InvestmentCalculator {
  public static void main (String args[]) {
    //inputs 
    Scanner in = new Scanner(System.in);
    
    System.out.println("How much money are you investing?");
    double investment = in.nextDouble();
    
    System.out.println("What is the interest rate? Enter as a decimal");
    double intRate = in.nextDouble();
    
    //math for lab 
    //need to change the h years to a variable not the number 5, 10, 20
    double math1 = 5;
    double math2 = 10;
    double math3 = 20;
    
    double futureValue5 = investment * (1 + Math.pow(intRate,math1));
    double futureValue10 = investment * (1 + Math.pow(intRate,math2));
    double futureValue20 = investment * (1 + Math.pow(intRate,math3));
    
    
//print
    
    System.out.println("At an interest rate of " + intRate + " compunded annually:");
    System.out.print("          The future value in 5 years is ");
    System.out.printf( "$%,.2f", futureValue5);
    System.out.println();
    System.out.print("          The future value in 10 years is ");
    System.out.printf( "$%,.2f", futureValue10);
    System.out.println();
    System.out.print("          The future value in 20 years is ");
    System.out.printf( "$%,.2f", futureValue20);
  }
}