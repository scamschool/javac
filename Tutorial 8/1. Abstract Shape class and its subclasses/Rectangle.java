/**
 * The Rectangle class models a rectangle of width and length,
 * which is a subclass of Shape.
 */
public class Rectangle extends Shape {
   // Private instance variables
   private double width;
   private double length;

   // Constructors
   /** Constructs a Rectangle instance of width 1.0 and length 1.0 */
   public Rectangle() {  // default constructor
      super();
      this.width = 1.0;
      this.length = 1.0;
   }
   /** Constructs a Rectangle instance */
   public Rectangle(double width, double length) {
      this.width = width;
      this.length = length;
   }
   /** Constructs a Rectangle instance */
   public Rectangle(double width, double length, String color, boolean filled) {
      super(color, filled);
      this.width = width;
      this.length = length;
   }

   // Getters and Setters
   public double getWidth() {
      return this.width;
   }
   public void setWidth(double width) {
      this.width = width;
   }
   public double getLength() {
      return this.length;
   }
   public void setLength(double length) {
      this.length = length;
   }
   public double getArea() {
      return this.width * this.length;
   }
   public double getPerimeter() {
      return 2.0 * this.width + 2.0 * this.length;
   }
   // override to provide actual implementation
   /** Returns a self-descriptive string in the form of "Rectangle[Shape[color=?,filled=?],width=?,length=?]" */
   @Override
   public String toString() {
      return "Rectangle[" + super.toString() + ",width=" + width + ",length=" + length + "]";
   }
}