import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 * EllipsoidList.java.
 * Class that builds instances of Ellipsoid lists
 * Contains methods to get list name, number of ellipsoids
 * total volume, total surface area, average volume
 * average surface area, and summary info
 *
 * Project 5
 * @author Michael Mann - CPSC - 1210
 * @ version 09/21/2025
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
    
}