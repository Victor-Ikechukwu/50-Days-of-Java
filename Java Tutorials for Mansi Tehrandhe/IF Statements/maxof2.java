/* WAP to Find the Largest of Two Numbers */	
import java.util.Scanner;

public class maxof2
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
        }
		else
        {
            largest = num2;
        }
        System.out.println("The Largest of Two Number is " +largest);
		//System.out.println("The Largest of "+num1+" and "+num2+" is: "+largest);
    }
}