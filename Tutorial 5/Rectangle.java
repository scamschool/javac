/**
 * The Rectangle class models a rectangle with a length and width.
 */
public class Rectangle {  // Save as "Rectangle.java"
   // private instance variable, not accessible from outside this class
   private float length;
   private float width;
   
   // Constructors (overloaded)
   /** Constructs a Rectangle instance with default value for length and width */
   public Rectangle() {  // 1st (default) constructor
      length = 1.0f;
      width = 1.0f;
   }
   
   /** Constructs a Rectangle instance with the given length and width */
   public Rectangle(float l, float w) {  // 2nd constructor
      length = l;
      width = w;
   }
   
   /** Returns the length */
   public float getLength() {
     return length; 
   }

   /** Sets the length to the given value */
   public void setLength(float length) {
      this.length = length;   // "this.length" refers to the instance variable
                              // "length" refers to the method's argument
   }

   /** Returns the width */
   public float getWidth() {
     return width; 
   }

   /** Sets the width to the given value */
   public void setWidth(float width) {
      this.width = width;   // "this.width" refers to the instance variable
                            // "width" refers to the method's argument
   }
   
   /** Returns the area of this Rectangle instance */
   public double getArea() {
      return length*width;
   }

   /** Returns the perimeter of this Rectangle instance */
   public double getPerimeter() {
      return 2*length + 2*width;
   }

   /** Return a self-descriptive string of this instance in the form of Rectangle[length=?,width=?] */
   public String toString() {
      return "Rectangle[length=" + length + ",width=" + width + "]";
   }
}