import java.util.Scanner;

public class Practice {
     public static void main(String[] args) {
          //Scanner s = new Scanner(System.in);
          //int a = s.nextInt();
          //int b = s.nextInt();
		  
		  double a, b, x;
		  x=0;
		  Scanner s = new Scanner(System.in);
		  System.out.println("Enter the first number");
		  a= s.nextDouble();
		  
		  System.out.println("Enter the Second number");
		  b= s.nextDouble();
		  
		  x = a + b;
		  
		  //System.out.println("The sum of " +a " and" +b "is " + x);
		  //x= s.nextDouble();
		  
		  

          /*** TODO: Write a statement that calculates the sum of "a" and "b" and stores the result in "x" ***/
		  //int x = s.nextInt();
		  //x = a + b;

          System.out.println("The answer is " + x);
     }
}