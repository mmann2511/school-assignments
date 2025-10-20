import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 * EllipsoidListApp.java.
 * Program to read ellipsoid data from a file,
 * create Ellipsoid objects
 * store them in an ArrayList, and create
 * EllipsoidList
 * Prints all ellipsoids and summary
 *
 *Project 5
 * @author Michael Mann - CPSC - 1210
 * @version 09/21/2025
 */
 

public class EllipsoidListApp {

   /**
    * Reads a file name from user.
    * Creates ellipsoid objects, stores them 
    * in ArrayList, and prints list and summary
    *
    * @param args Command line arguments (not used)
    * @throws FileNotFoundException if file cannot be found
    */

   public static void main(String[] args) throws FileNotFoundException {
      ArrayList<Ellipsoid> myList = new ArrayList<Ellipsoid>();
      String ellipsoidListName = "";
      String label = "";
      double a = 0;
      double b = 0;
      double c = 0;
   
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
   
      Scanner scanFile = new Scanner(new File(fileName));
   
      // First line is the name of the list
      ellipsoidListName = scanFile.nextLine();
   
      // Read 4 lines per ellipsoid
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         a = Double.parseDouble(scanFile.nextLine());
         b = Double.parseDouble(scanFile.nextLine());
         c = Double.parseDouble(scanFile.nextLine());
      
         Ellipsoid e = new Ellipsoid(label, a, b, c);
         myList.add(e);
      }
   
      scanFile.close();
   
      // Create EllipsoidList
      EllipsoidList myEllipsoidList = new EllipsoidList(
         ellipsoidListName, myList);
   
      // Print all ellipsoids
      System.out.println("\n" + myEllipsoidList.toString());
   
      // Print summary information
      System.out.println("\n" + myEllipsoidList.summaryInfo());
   }
}