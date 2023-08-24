/* Practical P02A- Question 7
Eryk Gloginski
06/10/2020
Program to calculate room area and give price for each flooring*/

import java.util.Scanner;

public class CalculateRoomArea
{

   public static void main(String [] args)
   
      {
   
      // set scanner
      Scanner input = new Scanner(System.in);
      
      // set vars
      double length, width, areaOfRoom;
      final double laminateFlooring = 9.50;
      final double semiSolidFlooring = 21;
      final double hardwoodFlooring = 42;
      double laminatePrice, semiSolidPrice, hardwoodPrice;
      
      // take input to variables
      System.out.println("Enter the length of your room in metres: ");
      length = input.nextDouble();
      System.out.println("Enter the width of your room in metres:  ");
      width = input.nextDouble();
      
      // calculate input and display
      areaOfRoom = length * width;
      System.out.println("The area of your room is " + areaOfRoom + " square metres");
      
      laminatePrice = laminateFlooring * areaOfRoom;
      System.out.println("Laminate flooring: " + laminatePrice);
      
      semiSolidPrice = semiSolidFlooring * areaOfRoom;
      System.out.println("Semi-solid flooring: " + semiSolidPrice);
      
      hardwoodPrice = hardwoodFlooring * areaOfRoom;
      System.out.println("Hardwood flooring: " + hardwoodPrice);
      
      }
   
}
