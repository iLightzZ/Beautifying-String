import java.util.Scanner;
public class Beautifying_Strings
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    String user_sentence;
    
    System.out.printf("Enter a string and the program will beautify it!%n%n");
    System.out.print("Enter your string: ");
    user_sentence = input.nextLine();
    
    beautifyString(user_sentence);
    
  }//end main
  
  public static void beautifyString(String sentence)
  {
    System.out.printf("%nYour original string:%n%s%n%n", sentence);
    sentence = capitalLetter(sentence);
    sentence = fullStop(sentence);
    System.out.printf("%nYour beautified string:%n%s%n%n", sentence);
  }//end method
  
  public static String fullStop(String sentence)
  {
    char last = sentence.charAt(sentence.length() - 1);
    if(last == '.')
    {
      ;
    }
    else
    {
      sentence = sentence + ".";
    }
    return sentence;
  }//end method
  
  public static String capitalLetter(String sentence)
  {
    //ASCII range for upper case letters: 65 - 90
    
    char first = sentence.charAt(0);
    String new_sentence = "";
    if(first >= 'a' && first <= 'z')
    {
      first -= 32; //decreasing the ascii value to become an upper case letter
      for(int i = 0; i < sentence.length(); ++i) //printing the first letter capitalzed then printing the sentence starting from [1]
      {
        if(i == 0)
        {
          new_sentence += first;
          continue;
        }
        new_sentence += sentence.charAt(i); //printing the sentence character by character
      }
    }
   return new_sentence;
  }//end method
}//end class