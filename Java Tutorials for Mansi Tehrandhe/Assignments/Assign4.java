//4.	Get a new value of str from the keyboard.  Write the code to //print the number of times "hi" occurs in the String.

import java.util.*;

public class Assign4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word?:");
		String s = sc.nextLine(); //accepts the word
		System.out.println("The word entered is "+s);
		System.out.print("The number of times 'hi' appeared is: ");
		String result = " "; //Empty String
		for(int i = 0; i < s.length(); i++)
		{
			//if(s.substring(i, i+1).equalsIgnoreCase("hi") == true)
			if(s.substring(i).equalsIgnoreCase("hi"))
			{
				result+=s.substring(i, i+1);
			}
		}
		System.out.print(result.length());

	}
}
