/* Practical P11A- Question 5
Eryk Gloginski
15/12/2020
Program to read rainfall*/

public class Rainfall
{
   public static void main(String [] args)
   {
   
   // declare array + vars
   int[] monthsMm = {30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85};
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
   
   System.out.println("Over 70 mm amount: " + overSeventy);
   System.out.println("Under 60 mm amount: " + underSixty);
   
   }
}