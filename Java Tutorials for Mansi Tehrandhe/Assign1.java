import java.util.*;
//1. 1.	Get the value of a String variable str from the //keyboard.  Print a new version of the String with the //first letter capitalized.

public class Assign1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word?:");
		String s = sc.nextLine(); //accepts the word
		System.out.println(s[0].toLowerCase());

	}
}
