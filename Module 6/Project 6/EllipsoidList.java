import java.util.ArrayList;
import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * EllipsoidList.java.
 * Class that builds instances of Ellipsoid lists
 * Contains methods to get list name, number of ellipsoids
 * total volume, total surface area, average volume
 * average surface area, and summary info
 *
 * Project 6
 * @author Michael Mann - CPSC - 1210
 * @version 09/26/2025
 */

public class EllipsoidList {
   // Fields
   private ArrayList<Ellipsoid> eList;
   private String listName = "";
   
   
   
   
   /**
    * Creates EllipsoidList object.
    * @param listNameIn the name of list
    * @param eListIn ArrayList of Ellipsoid objects
    */
   public EllipsoidList(String listNameIn, ArrayList<Ellipsoid> eListIn) {
      listName = listNameIn;
      eList = eListIn;
   
   }
   
   //Methods
   
   /**
    * Returns the name of the Ellipsoid List.
    * @return the list name
    */
   public String getName() {
      return listName;
   }
   
   /**
    * Return the number of Ellipsoid objects in the list.
    * @return number of ellipsoids
    */
   public int numberOfEllipsoids() {
      return eList.size();
   }
      
  /**
   * Calculate and returns the total volume of all Ellipsoids.
   * @return total volume
   */
   public double totalVolume() {
      if (eList.size() == 0) {
         return 0;
      }
      double total = 0;
      int index = 0;
      while (index < eList.size()) {
         total += eList.get(index).volume();
         index++;
      }
      return total;
   }
  
  /**
   * Calculates and returns the total surface area of Ellipsoid objects.
   * @return total surface area
   */
   public double totalSurfaceArea() {
      if (eList.size() == 0) {
         return 0;
      }
      double total = 0;
      int index = 0;
      while (index < eList.size()) {
         total += eList.get(index).surfaceArea();
         index++;
      }
      return total;
   }
  
  /**
   * Calculates and returns the average volume of Ellipsoid object.
   * @return average volume
   */
   public double averageVolume() {
      if (eList.size() == 0) {
         return 0;
      }
      return totalVolume() / eList.size();
   }
   
   /**
    * Calculates and returns the average surface are of Ellipsoid objects.
    * @return average surface area
    */
   public double averageSurfaceArea() {
      if (eList.size() == 0) {
         return 0;
      }
      return totalSurfaceArea() / eList.size();
   }      
  
  /**
   * Returns a string representing all Ellipsoids in the list.
   * Uses a while loop to build the string
   * @return string with all ellipsoids
   */
   public String toString() {
      String result = listName + "\n";
      int index = 0;
      while (index < eList.size()) {
         result += "\n" + eList.get(index).toString() + "\n";
         index++;
      }
      return result;
   }
  
  /**
   * Returns a summary of the list including.
   * number of ellipsoids, total volume, total surface area,
   * average volume, and average surface area
   * @return formatted summary string
   */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "----- Summary for " + listName + " -----\n"
         + "Number of Ellipsoid Objects: " + numberOfEllipsoids() + "\n"
         + "Total Volume: " + df.format(totalVolume()) + " cubic units \n"
         + "Total Surface Area: " + df.format(totalSurfaceArea())
          + " square units \n"
         + "Average Volume: " + df.format(averageVolume()) + " cubic units \n"
         + "Average Surface Area: " + df.format(averageSurfaceArea()) 
          + " square units";
      return result;
   }   
   
   // New methods for Project 6.
   
   /**
    * Returns the internal ArrayList of Ellipsoid objects.
    * This allows access to the underlying list if needed
    *
    * @return the ArrayList of Ellipsoid objects
    */
   public ArrayList<Ellipsoid> getList() {
      return eList;
   }   
    
    /**
     * Reads in data from a file and creates a new EllipsoidList.
     * Each Ellipsoid in the file should have a label and 
     * three double values (a,b,c)
     * on a seprate lines. The first line of the file should be the list name
     *
     * @param fileNameIn the name of the file to be read
     * @return a new EllipsoidList containing the Ellipsoids from the file
     * @throws FileNotFoundException if the file does not exist
     */  
   public EllipsoidList readFile(String fileNameIn)
                           throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileNameIn));  
      String listNameFromFile = scanFile.nextLine();
      ArrayList<Ellipsoid> newList = new ArrayList<>(); 
      
      while (scanFile.hasNext()) {
         String label = scanFile.nextLine();
         double a = Double.parseDouble(scanFile.nextLine());
         double b = Double.parseDouble(scanFile.nextLine());
         double c = Double.parseDouble(scanFile.nextLine());
         Ellipsoid e = new Ellipsoid(label, a, b, c);
         newList.add(e);
      }
      
      scanFile.close();
      return new EllipsoidList(
                  listNameFromFile, newList);                        
   }
   
   /**
    * Adds a new Ellipsoid to the list with the given label and dimensions.
    * 
    * @param labelIn the label of the new Ellipsoid
    * @param a the first axis
    * @param b the second axis
    * @param c the third axis
    */
   public void addEllipsoid(String labelIn, double a, double b, double c) {
      Ellipsoid e = new Ellipsoid(labelIn, a, b, c);
      eList.add(e);
      
   }
   
   /**
    * Searches for an Ellipsoid in the lsit by label.
    * 
    * @param labelIn the label to search for
    * @return Ellipsoid object if found, otherwise null
    */
   public Ellipsoid findEllipsoid(String labelIn) {
      for (Ellipsoid e : eList) {
         if (e.getLabel().equalsIgnoreCase(labelIn)) {
            return e;
         } 
      }
      return null;
   }
   
   /**
    * Deletes an Ellipsoid from the list by label.
    * If found, Ellipsoid is removed and returned.
    *
    * @param labelIn the label of the Ellipsoid to delete
    * @return the removed Ellipsoid if found, otherwise null
    */
   public Ellipsoid deleteEllipsoid(String labelIn) {
      for (int i = 0; i < eList.size(); i++) {
         if (eList.get(i).getLabel().equalsIgnoreCase(labelIn)) {
            return eList.remove(i);
         }
      }
      return null;
   }
   
   /**
    * Edits an existing Ellipsoid in the list by label.
    * If found, its dimensions are edited
    *
    * @param labelIn the label of the ellipsoid to edit
    * @param a the new first axis
    * @param b the new second axis
    * @param c the new third axis
    * @return the edited Ellipsoid object, or null if not found
    */
   public Ellipsoid editEllipsoid(String labelIn, 
                    double a, double b, double c) {
      Ellipsoid e = findEllipsoid(labelIn);
      if (e != null) {
         e.setA(a);
         e.setB(b);
         e.setC(c);
         return e;
      }
      return null;
   }
   
                     
     
       
         
                                     
    
}