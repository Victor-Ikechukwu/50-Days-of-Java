import java.util.Scanner;

class evenOdd
{
  public static void main(String args[])
  {
    int num;
    System.out.println("Enter an Integer number:");

    //The input provided by user is stored in num
    Scanner inp = new Scanner(System.in);
    num = inp.nextInt();

    // If number is divisible by 2 then it's an even number, else odd number
    if (num % 2 == 0 )
        System.out.println("The number is even");
     else
        System.out.println("The number is odd");
  }
}