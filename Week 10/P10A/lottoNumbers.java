/* Practical P10A- Question 2
Eryk Gloginski
08/12/2020
Program to store lotto numbers*/

public class lottoNumbers
{
   public static void main(String [] args)
   {
   // declare array and variable
   int[] lottoNumbers = {8, 12, 18, 22, 29, 34};
   
   // for loop to display marks
   for (int count = 0; count <= lottoNumbers.length; count++)
   {
      System.out.print(lottoNumbers[count] + ", ");
      if (count == 5)
      {
         break;
      }
   }

   }
}