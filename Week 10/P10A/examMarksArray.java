/* Practical P10A- Question 1
Eryk Gloginski
08/12/2020
Program to print exam marks.*/

public class examMarksArray
{
   public static void main(String [] args)
   {
   // declare array and variable
   int[] examMarks = {75, 28, 56, 100, 4, 65};
   
   // for loop to display marks
   for (int count = 0; count < examMarks.length; count++)
   {
      System.out.println(examMarks[count]);
   }

   }
}