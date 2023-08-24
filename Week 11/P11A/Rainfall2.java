/* Practical P11A- Question 6
Eryk Gloginski
15/12/2020
Program to read rainfall 2*/

public class Rainfall2
{
   public static void main(String [] args)
   {
   
   // declare array + vars
   int[] monthsMm = {30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85};
   String[] monthsNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
   int underSixty = 0;
   int overSeventy = 0;
   
   for (int count = 0; count < monthsMm.length; count++)
   {
      if (monthsMm[count] >= 70)
      {
         overSeventy++;
      }
      else if (monthsMm[count] <= 60)
      {
         underSixty++;
      }
   }

   System.out.println("Over 70 mm amount: " + overSeventy + " " + monthsNames);
   System.out.println("Under 60 mm amount: " + underSixty + " " + monthsNames);
   }
}