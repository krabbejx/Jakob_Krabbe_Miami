/* name - jakob krabbe
 * course - cse174
 * instructor - Bishop-Clark
 * lab 9 part 1
 * purpose - for loop add all even numbers up to 100 together 
 */
public class TwoToHundred {
  public static void main (String args[]) {
    
    //inputs 
    double start = 0;
 double sum = 0;
 double square = 0;
    int even = 0;
    for(even = 0; even<=100; even = even + 2)
    {
      
      square = Math.sqrt(start+even);
      sum = (sum + square);
      
    }
    System.out.println(sum);
  }
}