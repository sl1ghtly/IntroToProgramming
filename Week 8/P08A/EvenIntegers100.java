/* Practical P08A- Question 7
Eryk Gloginski
24/11/2020
Program to add up the first 100 even integers.*/

public class EvenIntegers100
{
   public static void main(String [] args)
   {
   // declare variables
   int total = 0;
   
   // for loop
   for (int count = 1; count <= 100; count++)
   {
      if (count % 2 == 0)
      {
         total = total + count;
      }
   }
   System.out.println("Total of 100 first even integers: " + total);
   }
}