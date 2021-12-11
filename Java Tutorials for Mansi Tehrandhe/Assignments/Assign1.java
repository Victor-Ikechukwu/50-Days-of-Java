import java.util.*;
//1.	Get the value of a String variable str from the //keyboard.  Print a new version of the String with the first //letter capitalized.

public class Assign1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word?:");
		String s = sc.nextLine(); //accepts the word
		System.out.println("The word entered is "+s);
		System.out.print("The String with the first letter capitalized is ");
		String cs = s.substring(0,1).toUpperCase();
		//System.out.print(s);
		System.out.print(cs+s.substring(1).toLowerCase());

	}
}
