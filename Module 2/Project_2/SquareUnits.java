import java.util.Scanner;
/**
 *Program that converts square inches to.
 *Combination of acres, square yards, square feet, and square inches.
 * 
 *Project 2 - B
 *@author Michael Mann - CPSC - 1210
 *@version 08/26/2025
 */

public class SquareUnits {
    /**
       * Recieves user input in square inches.
       * Converts square inches to
       * Maximize acres, square yards, square feet, and square inches
       * @param args Command line arguments - not used.
       */

   public static void main(String [] args) {
   
     
   
      Scanner userInput = new Scanner(System.in);
      int squareInches;
      int remainingInches;
      int acres;
      int squareYards;
      int squareFeet;
   
   
   //Prompt User for square inches + Calculations
      System.out.print("Enter the area in square inches: ");
      squareInches = userInput.nextInt();
      
   //Calculate Acres   
      acres = (squareInches / 6272640);
      remainingInches = squareInches % 6272640;
      
   // Calculate Square Yards   
      squareYards = remainingInches / 1296;
      remainingInches = remainingInches % 1296;
      
   // Calculate Square Feet   
      squareFeet = remainingInches / 144;
      remainingInches = remainingInches % 144;
      
   //Print Unit Conversions
      if (squareInches >= 1000000000) {
         System.out.println("Limit of 1,000,000,000 square inches exceeded!");
      
      }
      else {
         System.out.println("Number of Units:");
         System.out.println("\tAcres: " + acres);  
         System.out.println("\tSquare Yards: " + squareYards);  
         System.out.println("\tSquare Feet: " + squareFeet);  
         System.out.println("\tSquare Inches: " + remainingInches);  
      }
   
   
   }



}
 
 
 
