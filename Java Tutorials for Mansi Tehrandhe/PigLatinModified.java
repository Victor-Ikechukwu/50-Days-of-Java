import java.util.*;
public class PigLatinModified
{
	public static void main(String args[])
	{
		String playon = "";
		Scanner in = new Scanner (System.in);
		do
		{
		System.out.println("Enter a word:");
		String w = in.nextLine(); //accepts the word
		
		int i; //locate the position of first vowel
		for(i=0; i<w.length(); i++)
		{
			char ch = w.charAt(i);
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			break; //that's the vowel is found at i
		}
		String ay = w.substring(i) + w.substring(0,i) + "ay";
		System.out.println(ay); 
		System.out.println("Would you like to play again? Enter any key to play or 'quit' to end.");
		playon = in.nextLine();
		}
		//while(playon.equalsIgnoreCase("Y"));
		while(!playon.equalsIgnoreCase("quit"));
		System.out.println("Thanks for playing!");
	}
}