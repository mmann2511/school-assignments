import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * EllipsoidListMenuApp.java.
 *
 * Menu to interact with EllipsoidList objects
 * Can read in a file, print the list, add to the lsit
 * delete, find, or edit ellipsoids
 * and can request summary
 *
 * Project 6
 * @author Michael Mann
 * @version 09/26/2025
 */

public class EllipsoidListMenuApp {
   
   /**
    * Main method to run the menu application.
    *
    * @param args Command line arguments (not used)
    * @throws FileNotFoundException if the file enetered in 
    * the "R" option cannot be found
    */
   public static void main(String [] args) throws FileNotFoundException {
      String listName = "*** no list name assigned ***";
      ArrayList<Ellipsoid> myList = new ArrayList<Ellipsoid>();
      EllipsoidList myEllipsoidList = new EllipsoidList(listName, myList);
      
      Scanner userInput = new Scanner(System.in);
      String code = "";
     
     // Print Menu
      System.out.println("Ellipsoid List System Menu\n" 
            + "R - Read File and Create Ellipsoid List\n"
            + "P - Print Ellipsoid List\n"
            + "S - Print Summary\n"
            + "A - Add Ellipsoid\n"
            + "D - Delete Ellipsoid\n"
            + "F - Find Ellipsoid\n"
            + "E - Edit Ellipsoid\n"
            + "Q - Quit");
       
      // Menu Do-While      
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = userInput.nextLine().toUpperCase();
         char choice = code.charAt(0);
         
         switch (choice) {
            case 'R':
               System.out.print("\tFile Name: ");
               String fileName = userInput.nextLine();
               
               myEllipsoidList = myEllipsoidList.readFile(fileName);
               System.out.println("\tFile read in and Ellipsoid List " 
                                 + "created\n");
               break;
            
            case 'P':
               System.out.println(myEllipsoidList);
               break;
               
            case 'S':
               System.out.println("\n" + myEllipsoidList.summaryInfo() + "\n");
               break;
               
            case 'A': // Add Ellipsoid
               System.out.print("\tlabel: ");
               String label = userInput.nextLine();
               System.out.print("\ta: ");
               double a = Double.parseDouble(userInput.nextLine());
               System.out.print("\tb: ");
               double b = Double.parseDouble(userInput.nextLine());
               System.out.print("\tc: ");
               double c = Double.parseDouble(userInput.nextLine());
               myEllipsoidList.addEllipsoid(label, a, b, c);
               System.out.println("\t*** Ellipsoid added ***\n");
               break;
            
            case 'D': // Delete Ellipsoid 
               System.out.print("\tlabel: ");
               label = userInput.nextLine();
               Ellipsoid removed = myEllipsoidList.deleteEllipsoid(label);
               if (removed != null) {
                  System.out.println("\t\"" + removed.getLabel() 
                     + "\" deleted\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;  
               
            case 'F': // Find Ellipsoid
               System.out.print("\tlabel: ");
               label = userInput.nextLine();
               Ellipsoid found = myEllipsoidList.findEllipsoid(label);
               if (found != null) {
                  System.out.println(found + "\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");   
               }
               break;
                  
            case 'E': // Edit Ellipsoid
               System.out.print("\tlabel: ");
               label = userInput.nextLine();
               System.out.print("\ta: ");
               a = Double.parseDouble(userInput.nextLine());
               System.out.print("\tb: ");
               b = Double.parseDouble(userInput.nextLine());
               System.out.print("\tc: ");
               c = Double.parseDouble(userInput.nextLine());
               Ellipsoid edited = myEllipsoidList.editEllipsoid(label, a, b, c);
               if (edited != null) {
                  System.out.println("\t\"" 
                     + myEllipsoidList.findEllipsoid(label).getLabel()
                     + "\" successfully edited\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
            case 'Q': // Quit
               break;
               
            default: // Invalid Input
               System.out.println("\t*** invalid code ***\n");          
                       
         }
      } while (!code.equalsIgnoreCase("Q"));  
         
       
   }



}