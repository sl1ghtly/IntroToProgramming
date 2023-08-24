/* Practical P08A- Question 6
Eryk Gloginski
24/11/2020
Program to add up the first 100 integers.*/

public class Total100
{
   public static void main(String [] args)
   {
   // declare variables
   int total = 0;
   
   // for loop
   for (int count = 1; count <= 100; count++)
   {
      total = total + count;
   }
   System.out.println("Total of 100 first integers: " + total);
   }
}