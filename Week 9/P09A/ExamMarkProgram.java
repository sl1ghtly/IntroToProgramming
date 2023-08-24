/* Practical P09A- Question 1
Eryk Gloginski
01/12/2020
PSEUDOCODE PROGRAM.*/

import java.util.Scanner;

public class ExamMarkProgram
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare variable
   int examMark = 0;
   int passes = 0;
   int fails = 0;
   
   // for loop
   for (int count = 1; count <= 4; count++)
   {
      System.out.println("Person " + count + ", enter your examination mark. ");
      examMark = input.nextInt();
      
      if (examMark > 40 && examMark <= 100)
      {
         passes++;
      }
      else if (examMark > 0 && examMark < 40)
      {
         fails++;
      }
      else
      {
         System.out.println("Invalid Mark! ");
      }
   }
   System.out.println("Amount of passes: " + passes);
   System.out.println("Amount of fails: " + fails);
   }
}