/* name - jakob krabbe
 * course - cse174
 * instructor - Bishop-Clark
 * lab 14
 * purpose - methods with strings 
 */
import java.util.Scanner;

public class StringMethods {
  
  public static void main (String args[]) {
    //getting needed inputs
    
    Scanner in = new Scanner(System.in);
    
    //part 1 gettings the last character
    
    System.out.println("Enter a word");
    String wordOne = in.next();
    String lastResult = last(wordOne);
    
    System.out.println("The last character of the word is " + lastResult);
    
    //part2 getting the middle characters of an either even or odd string 
    
    System.out.println("Enter another word");
    String wordTwo = in.next();
    int wordTwoLength = wordTwo.length();
    String middleResult = middle(wordTwo,wordTwoLength);
    System.out.println(middleResult);
    
    //part 3 counting all vowesl in a given string 
    
    System.out.println("Enter one more word");
    String wordThree = in.next();
    String wordLower = wordThree.toLowerCase();
    int wordThreeLength = wordThree.length();
    int vowelResult = vowelCount(wordThreeLength,wordThree);
    System.out.println("The amount a vowels in this word is " + vowelResult);
    
    
    
    
  }
    
    /** 
     finding out the last character of a given string
     @param string that is entered
     @return the last character of the string
    */ 
    public static String last (String lastchar)
    {
      String lastchar1 = lastchar.substring(lastchar.length()-1);
      return lastchar1;
    }
    
     /** 
     finding out the middle character or characters of a given string
     @param string that is entered
     @return the middle character of the string or the middle two if string is even
    */ 
    
    public static String middle (String middleLength,int evenOdd)
    {
      if (evenOdd %2 == 0)
      {
        int evenMiddle = evenOdd/2;
        int evenMiddlePlus = evenOdd/2 -1;
        
        char middleLast = middleLength.charAt(evenMiddle);
        char middleFirst = middleLength.charAt(evenMiddlePlus);
        String middleResult = Character.toString(middleFirst) + Character.toString(middleLast);
        
        
        return middleResult;
                                                
      }
      else 
      {
        int oddMiddle = evenOdd/2;
        char oddResult = middleLength.charAt(oddMiddle);
        String middleResult = Character.toString(oddResult);
        return middleResult;
      }
      
      
    }
    
    public static int vowelCount (int theWord, String stringVow) 
    {
      int vowelResult;
      int count = 0;
      for (int i = 0; i<theWord;i++)
      {
        if (stringVow.charAt(i) =='a' || stringVow.charAt(i) =='e' || stringVow.charAt(i) == 'i' || stringVow.charAt(i) == 'o'  || stringVow.charAt(i) == 'u')
        {
          count ++;
          
      }
      else 
      {
        vowelResult = 0;
      }
      }
      vowelResult = count;
      return vowelResult;
    }
       
   
    }
                                                                                                         
                                                               
                                         
  

    
    