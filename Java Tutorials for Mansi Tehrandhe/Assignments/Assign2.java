import java.util.*;
//2.Get a new value of str from the keyboard.  Convert //the String to all lower case, then print a new version //of the String with the last two letters capitalized.

public class Assign2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word?:");
		String s = sc.nextLine(); //accepts the word
		System.out.println("The word entered is "+s);
		System.out.print("The String with the last two letters capitalized is ");
		String cs = s.toLowerCase(); //Lowercase
		String cs1 = s.substring(cs.length() -1);
		String cs2 = cs1.toUpperCase();
		//System.out.print(s);
		System.out.print(cs.substring(0,-1)+cs2);
	}
}
