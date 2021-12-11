import java.util.Scanner;
class Piglatin
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = in.nextLine();
        
        //s = s.toUpperCase(); //to convert the word in UpperCase
        
        //to find the position of first vowel
        int i;
        for(i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                break; //that's the vowel is found at i
        }
        
        String mansi = s.substring(i) + s.substring(0,i) + "ay";
        
        System.out.println(mansi);
    }
}