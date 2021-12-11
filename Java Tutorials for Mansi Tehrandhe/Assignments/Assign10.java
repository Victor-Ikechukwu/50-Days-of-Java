//10.	Get a new value for str, and print out a what str would look like //with all the * characters "removed".  For example, if the user entered //**abc**, your code would print abc.
import java.util.Scanner;
public class Assign10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a new word like **abc**?");
		String s = sc.nextLine(); //accepts the word
		String result = ""; //Empty String
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.substring(i, i+1).equalsIgnoreCase("*") == false)
			{
				result+=s.substring(i, i+1);
			}
		}
		System.out.print("The new word is :"+result);
	}
}
