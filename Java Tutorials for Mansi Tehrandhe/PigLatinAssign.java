import java.util.Scanner;
public class PigLatinAssign
{
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a word:");
		String w = in.nextLine(); //accepts the word
		System.out.println("Enter 'quit' to end the program");
		
		while w != "quit":
		{
			int i; //locate the position of first vowel
			for(i=0; i<w.length(); i++)
			{
				char ch = w.charAt(i);
				if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				break; //that's the vowel is found at i
			}
		String ay = w.substring(i) + w.substring(0,i) + "ay";
		System.out.println(ay);
		} 
		System.out.println("Do you want to continue?");
	}
}