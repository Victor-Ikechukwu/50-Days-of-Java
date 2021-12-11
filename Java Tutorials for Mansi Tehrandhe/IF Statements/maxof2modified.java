/* WAP to Find the Largest of Two Numbers */	
import java.util.Scanner;

public class maxof2modified
{
    public static void main(String args[])
    {
        int num1, num2, largest;
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the First Number?: ");
        num1 = sc.nextInt();
		System.out.print("Enter the Second Number?: ");
        num2 = sc.nextInt();
		
        if(num1>num2)
        {
            largest = num1;
			System.out.print("Largest of Two Number is " +largest);
        }
        else if(num1 == num2)
        {
			System.out.println ("Both are equal");
        }
		else
        {
            largest = num2;
			System.out.println("The largest is "+largest);
        }
        //System.out.println("The Largest of Two Number is " +largest);
		//System.out.println("The Largest of "+num1+" and "+num2+" is: "+largest);
    }
}