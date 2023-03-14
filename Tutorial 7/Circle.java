/**
 * The Circle class models a circle,
 * which is a subclass of Shape.
 */
public class Circle extends Shape {
   // Private instance variables
   private double radius;

   // Constructors
   /** Constructs a Circle instance of radius 1.0 */
   public Circle() {  // default constructor
      super();
      this.radius = 1.0;
   }
   /** Constructs a Circle instance */
   public Circle(double radius) {
      this.radius = radius;
   }
   /** Constructs a Circle instance */
   public Circle(double radius, String color, boolean filled) {
      super(color, filled);
      this.radius = radius;
   }

   // Getters and Setters
   public double getRadius() {
      return radius;
   }
   public void setRadius(double radius) {
      this.radius = radius;
   }
   public double getArea() {
      return Math.PI * radius * radius;
   }
   public double getPerimeter() {
      return 2.0 * Math.PI * radius;
   }

   /** Returns a self-descriptive string in the form of "Circle[Shape[color=?,filled=?],radius=?]" */
   @Override
   public String toString() {
      return "Circle[" + super.toString() + ",radius=" + radius + "]";
   }
}