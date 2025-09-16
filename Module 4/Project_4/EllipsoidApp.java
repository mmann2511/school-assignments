import java.util.Scanner;
/**
 * Driver Class for Ellipsoid.
 *
 * Project 4
 * @author Michael Mann - CPSC - 1210
 * @version 09/13/25
 */


public class EllipsoidApp {

/**
 * Prompts user for label and three axes.
 * to create an instance of Ellipsoid
 * Prints out calculations from Ellipsoid class
 * (volume and surface area)
 * @param args Command line arguments - not used.
 */


   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      
      
      System.out.println("Enter label and axes a, b, c for an ellipsoid.");
      
      
      System.out.print("\tlabel: ");
      String label = userInput.nextLine();
      
      System.out.print("\ta: ");
      double a = userInput.nextDouble();
      if (a <= 0) {
         System.out.println("Error: axis value must be positive.");
         return;
      }
      
      System.out.print("\tb: ");
      double b = userInput.nextDouble();
      if (b <= 0) {
         System.out.println("Error: axis value must be positive.");
         return;
      }
      
      System.out.print("\tc: ");
      double c = userInput.nextDouble();
      if (c <= 0) {
         System.out.println("Error: axis value must be positive.");
         return;
      }
      
      
      Ellipsoid ellipsoid = new Ellipsoid(label, a, b, c);
      
      
      System.out.println("\n" + ellipsoid);   
   
   
   
   
   
   }




}