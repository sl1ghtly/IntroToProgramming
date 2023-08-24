/* Practical P01C- Question 6
Eryk Gloginski
30/09/2020
Program to calculate and display weight in stone and pounds*/

public class CalculateWeight
{

   public static void main(String [] args)
   
      {
      //delcare weight
      int weightPounds = 174;
      int weightOneStone = 14;
      
      //returns stone weight and pound remainder
      int weightStone = weightPounds / weightOneStone;
      int leftOverPounds = 174 % weightOneStone;
      
      System.out.println("Weight in stone is " + weightStone + " and " + leftOverPounds + " pounds left over.");

      }
   
}