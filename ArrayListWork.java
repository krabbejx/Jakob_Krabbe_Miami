/* name - jakob krabbe
 * course - cse174
 * instructor - Bishop-Clark
 * lab 20
 * purpose - ArrayList stuff 
 */
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListWork {
  
  public static void main (String args[]) {

    
    Scanner in = new Scanner(System.in);
    
    //create the arraylist 
    
    ArrayList<Integer> array1 = new ArrayList<Integer>();
    

    
    System.out.println("Enter integers, q to quit:");
    while (in.hasNextInt())
    {
      int input = in.nextInt();
      array1.add(input);
    }
    String quiter = in.next();
    
    System.out.println("\nContents of the array list are:");
    for (Integer element : array1)
    {
      System.out.println(element);
    }
    System.out.println("What number would you like to add into this array?");
    int addedNum = in.nextInt();
    
    
    
    
    
    int position = findInsertPosition(array1,addedNum);
    System.out.println("");
    System.out.println("The position the number would go into the array is " + position);
    array1.add(position,addedNum);
    System.out.println("\nContents of the array list are:");
    for (Integer element : array1)
    {
      System.out.println(element);
    }
  
  }

  public static int findInsertPosition(ArrayList<Integer> list, int newValue) { 
    int position=0;
    for (int i=0;i<list.size(); i++)
    {
      if(newValue>list.get(i))
      {
        position = list.get(i);
        
      }
    
    }
    
    
    return position;
           
    
    
  }
  





}