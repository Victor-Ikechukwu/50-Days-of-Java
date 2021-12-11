import java.util.*;
//3.	Get a new value of str from the keyboard.  Using the //substring() method(s), write the code to print the number of //times the letter "e" occurs in the String.

public class Assign3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word?:");
		String s = sc.nextLine(); //accepts the word
		System.out.println("The word entered is "+s);
		System.out.print("The number of times letter 'e' appeared is: ");
		String result = ""; //Empty String
		for(int i = 0; i < s.length(); i++)
		{
			if(s.substring(i, i+1).equalsIgnoreCase("e") == true)
			{
				result+=s.substring(i, i+1);
			}
		}
		System.out.print(result.length());

	}
}
