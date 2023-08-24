import java.util.Scanner;

public class MiniCalculator
{
   public static void main(String [] args)
   {
   Scanner input = new Scanner(System.in);
   int number = 0;

   while(number != 0)
   {
      System.out.print("Enter a number ");
      number = input.nextInt();
   }
   
   }
}