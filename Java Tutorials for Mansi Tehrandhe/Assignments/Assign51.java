//5. Get a new value of str and a new String target from the keyboard.  //Write the code to print "Found it!" if target appears anywhere in str, //or print "Nope!" if it doesn't.

import java.util.*;

public class Assign51
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a new word?");
		String s1 = sc.nextLine(); //accepts the word
		System.out.println("Enter the word to be found ie target word?");
		String s2 = sc.nextLine();
		String rs1 = ""; //Empty String
		String rs2 = "";
		
		
		if (s1.equals(s2))
		{
			System.out.println("Found it!");
		}
		else
		{
			System.out.println("Nope!");
		} 
	}
}
