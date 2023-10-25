/* 
 * Jakob Krabbe
 * CSE 174
 * Cathy Bishop-Clark
 * lab 19
 * bubble sort with int and strings 
 */

import java.util.*;
import java.util.Scanner;



public class bubbleSort {
  
   
  public static void main(String[] args) {
     // opening file
    Scanner in = new Scanner(System.in);
    //int bubble sort first 
    System.out.println("The integers are first");
    int [] bubbleInt = {2,6,12,87,3,2,14,54,3,12,31};
    bubbleIntSort(bubbleInt);
    for (int i=0;i<bubbleInt.length;i++)
    {
      System.out.println(bubbleInt[i]);
    }
    System.out.println("");
    System.out.println("Here are the ordered Strings now");
    
 // string bubble sort now 
    String [] bubbleString = {"Cat","care","Dog","don","hello","World","123"};
    String tempPos;
    for (int y = 0; y<bubbleString.length; y++)
    {
      for (int x= y+1; x< bubbleString.length; x++)
      {
        if (bubbleString[x].compareTo(bubbleString[y])<0)
        {
          tempPos = bubbleString[y];
          bubbleString[y] = bubbleString[x];
          bubbleString[x] = tempPos;
        }
      }
      System.out.println(bubbleString[y]);
    }
  
    
  
  
  
  }

  
  public static void bubbleIntSort(int [] bubbleInt){
    int length = bubbleInt.length;
    
    for(int i=0; i<length-1;i++)
    {
      for (int j =0; j<length-i-1;j++)
      {
        if (bubbleInt[j]>bubbleInt[j+1])
        {
          int switchPos = bubbleInt[j];
          bubbleInt[j] = bubbleInt[j+1];
          bubbleInt[j+1] = switchPos;
        }
      }
    }
  
  
  
  
  
  }
}