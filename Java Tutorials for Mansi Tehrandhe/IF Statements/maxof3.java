/* WAP to Find the Largest of Three Numbers */	
import java.util.Scanner;

public class maxof3
{
    public static void main(String args[])
    {
        int num1, num2, num3, largest;
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the First Number?: ");
        num1 = sc.nextInt();
		System.out.print("Enter the Second Number?: ");
        num2 = sc.nextInt();
		System.out.print("Enter the Third Number?: ");
        num3 = sc.nextInt();
		
        if((num1>num2)&(num1>num3))
        {
            largest = num1;
        }
		else if((num2>num1)&(num2>num3))
        {
            largest = num2;
        }
		else
        {
            largest = num3;
        }
		
        System.out.println("The Largest of the three number is: " +largest);
		//System.out.println("The Largest of "+num1+" and "+num2+" is: "+largest);
    }
}