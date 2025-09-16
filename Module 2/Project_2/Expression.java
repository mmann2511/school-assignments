import java.util.Scanner;

/**
 *Program that recieves user input and executes calculation.
 *
 *Project 2 - A
 *@author Michael Mann - CPSC - 1210
 *@version 08/25/2025
 */

public class Expression {

   /**
   * Shows user calculation.
   * Asks user for x and y input
   * Executes calculation and prints result to user
   *@param args Command line arguments - not used.

   */

   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      double x;
      double y;
     
      
    
      //Print Calculation to User
      System.out.println("result = "
         + "(10x + 32.6) (5y - 1.567) / xy ");
         
      //Prompt user for x
      System.out.print("\tx = ");
      x = userInput.nextDouble();
      
      //Prompt user for y
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      
      //Combine X & Y variables into new variable
      double xy = x * y;
      
       
      //Execute Calculation and Print Result
      if (xy == 0) {
         System.out.println("result is \"undefined\"");
      
      }   
      
      else {
         System.out.println("result = "
            + (10 * x + 32.6) * (5 * y - 1.567) / (xy));
         
         
      }   
         
       
   }

}