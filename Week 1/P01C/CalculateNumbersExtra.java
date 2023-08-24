/* Practical P01C- Question 7
Eryk Gloginski
30/09/2020
Program to calculate stuff few times*/

public class CalculateNumbersExtra
{

   public static void main(String [] args)
   
      {
      //declare two variables
      int num1 = 6;
      int num2 = 2;
      
      //calculate stuff
      int result1 = num1 + num2;
      int result2 = num1 - num2;
      int result3 = num1 * num2;
      int result4 = num1 / num2;
      int result5 = num1 % num2;
      
      //display results of calculation
      System.out.println("The result when adding the two numbers: " + result1);
      System.out.println("The result when taking num2 away from num1: " + result2);
      System.out.println("The product of the two numbers (multiplied): " + result3);
      System.out.println("The result when dividing num1 by num2: " + result4);
      System.out.println("The remainder when dividing num1 by num2: " + result5);

      }
   
}