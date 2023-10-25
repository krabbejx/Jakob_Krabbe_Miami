/* name - jakob krabbe
 * course - cse174
 * instructor - Bishop-Clark
 *  lab 7 
 * purpose - switch statement for taxes 
 */
import java.util.Scanner;

public class CalcTip {
  public static void main (String args[]) {
    //getting needed inputs
    
    Scanner in = new Scanner(System.in);
    
    //inputs 
    System.out.println("What was the cost of tonights dinner?");
    double totalBill = in.nextDouble();
    System.out.println("What would you rate the dinners satisfaction at on a scale of 1-5?");
    int rating = in.nextInt();
    
    //switch statement 
    switch(rating){
      case 1:
        double tipPercent = (totalBill * 0.1);
        double endBill = (tipPercent + totalBill);
        System.out.print("you entered a rating on 1, and so your total bill is " + endBill);
        break;
      case 2: 
        double tipPercent2 = (totalBill * 0.125);
        double endBill2 = (tipPercent2 + totalBill);
        System.out.print("You entered a rating of 2, and so your total bill is " + endBill2);
      break;
      case 3: 
        double tipPercent3 = (totalBill * 0.15);
        double endBill3 = (tipPercent3 + totalBill);
        System.out.print("You entered a rating of 3, and so your total bill is " + endBill3);
        break;
      case 4: 
        double tipPercent4 = (totalBill * 0.2);
        double endBill4 = (tipPercent4 + totalBill);
        System.out.print("You entered a rating of 4, and so your total bill is " + endBill4);
        break;
      case 5: 
        double tipPercent5 = (totalBill * 0.25);
        double endBill5 = (tipPercent5 + totalBill);
        System.out.print("You entered a rating of 5, and so your total bill is " + endBill5);
        break;
    }
  }
}
      
      
        
    
    