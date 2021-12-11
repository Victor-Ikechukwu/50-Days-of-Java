import java.util.Scanner;
public class PigLatinAssign1
{
	public static void main(String args[])
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a word:");
		String w = in.nextLine(); //accepts the word
		
		int i; //locate the position of first vowel
		String choice = "";
		int flag=0;
		
		for(i=0; i<w.length(); i++)
		{
		char ch = w.charAt(i);
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
			choice = w.substring(i) + w.substring(0,i) + "ay";
			flag=1;
			break;//that's the vowel is found at i
			}
		}
		if(flag==0)
		{
			choice=w+"ay";
		}
		System.out.println(w+" in Piglatin form is "+choice);
	}
}