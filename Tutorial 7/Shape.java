/**
 * The Shape class models a shape with color and fill.
 */
public class Shape {
   // Private instance variables
   private String color;
   private boolean filled;

   // Constructors
   /** Construct a Shape instance that is (red,"true") */
   public Shape() {  // default constructor
      this.color = "red";
      this.filled = true;
   }
   /** Constructs a Shape instance at the given color and filled */
   public Shape(String color, boolean filled) {
      this.color = color;
      this.filled = filled;
   }

   // Getters and Setters
   public String getColor() {
      return color;
   }
   public void setColor(String color) {
      this.color = color;
   }
   public boolean isFilled() {
      return filled;
   }
   public void setFilled(boolean filled) {
      this.filled = filled;
   }

   /** Returns a self-descriptive string in the form of "Shape[color=?,filled=?]" */
   @Override
   public String toString() {
      return "Shape[color=" + color + ",filled=" + filled + "]";
   }
}