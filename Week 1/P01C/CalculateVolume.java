/* Practical P01C- Question 3
Eryk Gloginski
30/09/2020
Program to calculate the volume of a box*/

public class CalculateVolume
{

   public static void main(String [] args)
   
      {
      //declare the width, lenght and depth
      int width = 2;
      int lenght = 4;
      int depth = 12;
      
      //calculate volume
      double volume = width * lenght * depth;
      
      System.out.println("Volume of the box is: " + volume);

      }
   
}