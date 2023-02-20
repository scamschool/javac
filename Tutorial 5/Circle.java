/**
 * The Circle class models a circle with a radius.
 */
public class Circle {  // Save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius;
   
   // Constructors (overloaded)
   /** Constructs a Circle instance with default value for radius */
   public Circle() {  // 1st (default) constructor
      radius = 1.0;
   }
   
   /** Constructs a Circle instance with the given radius */
   public Circle(double r) {  // 2nd constructor
      radius = r;
   }
   
   /** Returns the radius */
   public double getRadius() {
     return radius; 
   }


   /** Sets the radius to the given value */
   public void setRadius(double radius) {
      this.radius = radius;   // "this.radius" refers to the instance variable
                              // "radius" refers to the method's argument
   }
   
   /** Returns the area of this Circle instance */
   public double getArea() {
      return radius*radius*Math.PI;
   }

   /** Returns the circumference of this Circle instance */
   public double getCircumference() {
      return 2*Math.PI*radius;
   }

   /** Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?] */
   public String toString() {
      return "Circle[radius=" + radius + "]";
   }
}