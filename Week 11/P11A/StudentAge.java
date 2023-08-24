/* Practical P11A- Question 4
Eryk Gloginski
15/12/2020
Program to print print oldest youngest and 21 years old*/

import java.util.Scanner;

public class StudentAge
{
   public static void main(String [] args)
   {
   // construct scanner
   Scanner input = new Scanner(System.in);
   
   // declare array + vars
   int[] studentAges = {18, 19, 20, 21, 22, 23, 24};
   int largest = studentAges[0];
   int smallest = studentAges[0];
   int twentyOne = studentAges[0];
   
   // for loop
   for (int count = 0; count < studentAges.length; count++)
   {
      if (studentAges[count] == 21)
      {
         twentyOne++;
      }
   }
   for (int count2 = 0; count2 < studentAges.length; count2++)
   {
      if (studentAges[count2] > largest)
      {
         largest = studentAges[count2];
      }
   }
   for (int count3 = 0; count3 < studentAges.length; count3++)
   {
      if (studentAges[count3] < smallest)
      {
         smallest = studentAges[count3];
      }
   }
   
   System.out.println("Oldest: " + largest);
   System.out.println("Youngest: " + smallest);
   System.out.println("Age 21: " + twentyOne);
   
   }
}