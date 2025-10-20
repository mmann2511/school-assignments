import java.text.DecimalFormat;

/**
 * Ellipsoid.java.
 * Class that builds instances of Ellipsoids
 * Contains methods setter and getter methods for
 * Three axes (a, b, c)
 * Contains two methods that perform calculations with axes
 * Volume and Surface Area
 *
 * Project 6
 * @author Michael Mann - CPSC - 1210
 * @version 09/26/2025
 */


public class Ellipsoid {
   // Fields Instance variables
   private String label = "";
   private double a = 0;
   private double b = 0;
   private double c = 0;
   
   
  /**
   * Create Ellipsoid object.
   * @param labelIn Ellipsoid's label
   * @param aIn Ellipsoid's a axis
   * @param bIn Ellipsoid's b axis
   * @param cIn Ellipsoid's c axis
   */
   public Ellipsoid(String labelIn, double aIn, double bIn, double cIn) {
      setLabel(labelIn);
      setA(aIn);
      setB(bIn);
      setC(cIn);
   
   }
   
   /**
    * Returns label of Ellipsoid.
    * @return the label of Ellipsoid
    */
   public String getLabel() {
      return label;
      
   }
   
   /**
    * Sets label of Ellipsoid.
    * @param labelIn sets label
    * @return true if label is not null, false otherwise
    */ 
   public boolean setLabel(String labelIn) {
      if (labelIn == null) {
         return false;
      }
      else {
         label = labelIn.trim();
         return true;
      }   
   }
   
   
   /**
    * Returns A axis of Ellipsoid.
    * @return A axis of Ellipsoid.
    */
   public double getA() {
      return a;
   }
   
   
   /**
    * Sets A axis of Ellipsoid.
    * @param aIn set for A axis
    * @return true if value is positive and set, false otherwise.
    */ 
   public boolean setA(double aIn) {
      if (aIn > 0) {
         a = aIn;
         return true;
      }
      return false;
   }
   
   
   
  /**
    * Returns B axis of Ellipsoid.
    * @return B axis of Ellipsoid.
    */
   public double getB() {
      return b;
   }
   
   /**
    * Sets B axis of Ellipsoid.
    * @param bIn set for A axis
    * @return true if value is positive and set, false otherwise.
    */ 
   public boolean setB(double bIn) {
      if (bIn > 0) {
         b = bIn;
         return true;
      }
      return false;
   }
   
   
   /**
    * Returns C axis of Ellipsoid.
    * @return C axis of Ellipsoid.
    */
   public double getC() {
      return c;
   }
   
   /**
    * Sets C axis of Ellipsoid.
    * @param cIn set for A axis
    * @return true if value is positive and set, false otherwise.
    */ 
   public boolean setC(double cIn) {
      if (cIn > 0) {
         c = cIn;
         return true;
      }
      return false;   
   }
   
   /**
    * Calculates and returns volume of Ellipsoid.
    * @return the volume of the ellipsoid
    */
   
   public double volume() {
      return ((4.0 * Math.PI * a * b * c) / 3.0);
   }
   
   /**
    * Calculates and returns surface area of Ellipsoid.
    * @return the surface area of the ellipsoid
    */
   
   public double surfaceArea() {
      double abResult = Math.pow(a * b, 1.6);
      double acResult = Math.pow(a * c, 1.6);
      double bcResult = Math.pow(b * c, 1.6);
      double insideParenth = (abResult + acResult + bcResult) / 3;
      double outsideParenth = Math.pow(insideParenth, 1.0 / 1.6);
      double surfaceArea = (4 * Math.PI) * (outsideParenth);
      return surfaceArea;
   }
  
  /**
   * Returns a string representing Ellipsoid's information.
   * and Ellipsoid's calcualtions
   * @return a string with Ellipsoid's details
   *
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0###");
      String output = "Ellipsoid \"" + label + "\" with axes "
         + "a = " + df.format(a) + ", "
         + "b = " + df.format(b) + ", "
         + "c = " + df.format(c) + " units has:\n";
      output += "\tvolume = " + df.format(volume()) + " cubic units" + "\n";
      output += "\tsurface area = " + df.format(surfaceArea()) 
         + " square units";
      return output;   
   }     
      
   
   
}