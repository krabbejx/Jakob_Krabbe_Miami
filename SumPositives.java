/* name - jakob krabbe
 * course - cse174
 * instructor - Bishop-Clark
 *  lab 7 
 * purpose - adding positive numbers only  
 */
import java.util.Scanner;

public class SumPositives {
  public static void main (String args[]) {
    //getting needed inputs
    
    Scanner in = new Scanner(System.in);
    //inputs for the integers
    System.out.println("Enter an integer");
    int num1 = in.nextInt();
    System.out.println("Enter another integer");
    int num2 = in.nextInt();
    System.out.println("Enter one more integer");
    int num3 = in.nextInt();
    
    //math for program 
    
    if ((num1>0) && (num2>0) && (num3>0))
    {
      int allInt = (num1 + num2 + num3);
      System.out.println("The total is " + allInt);
    }
    else if ((num1>0) && (num2>0) && (num3<0))
    {
      int thirdint = (num1 + num2);
      System.out.println("number 3 was negative so the answer is " + thirdint);
    }
    else if ((num1>0) && (num2<0) && (num3>0))
    {
      int secondInt = (num1 + num3);
      System.out.println("number 2 was negative so the answer is " + secondInt);
    }
    else if ((num1<0) && (num2>0) && (num3>0))
    {
      int firstInt = (num2 + num3);
      System.out.println("Number 1 was negative so the answer is " + firstInt);
    }
    else if ((num1>0) && (num2<0) && (num3<0))
    {
      int twoThirdInt = (num1);
      System.out.println("Numbers two and three are negative so the answer is " + twoThirdInt);
    }
    else if ((num1<0) && (num2<0) && (num3>0))
    {
      int firstTwoInt = (num3);
      System.out.println("Numbers one and two are negative so the ansewr is " + firstTwoInt);
    }
    else 
    {
      int secondInt = (num2);
      System.out.println("numbers one and three are negative so the answer is " + secondInt);
    }
  }
}
    
                    
       
                         