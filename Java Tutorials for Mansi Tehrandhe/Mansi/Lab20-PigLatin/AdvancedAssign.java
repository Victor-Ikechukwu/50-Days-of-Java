
/**
 * Write a description of class AdvancedAssign here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//Convert an entire sentence (one word at a time) to Pig Latin.  This can be done with some advanced concepts (like arrays and the split() method).  You can also use Scanner class methods to parse a String*. 
import java.util.Scanner;
public class AdvancedAssign
{
   public static void main(String [] args)
   {
       String str = "This is a sentence.";
       Scanner chopper = new Scanner(str); //scanning str instead of System.in
       while (chopper.hasNext()) //loops while there's another token (another thing to scan)
       {
           //splits the String when it finds whitespace (a space character)
           System.out.println(chopper.next()); 
       }

   }
}
