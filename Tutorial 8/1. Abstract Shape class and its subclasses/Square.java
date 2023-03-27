/**
 * The Square class models a square of side,
 * which is a subclass of Rectangle.
 */
public class Square extends Rectangle {
   // Constructors
   /** Constructs a Square instance */
   public Square() {  // default constructor
      super();
   }
   /** Constructs a Square instance */
   public Square(double side) {
      super(side, side);
   }
   /** Constructs a Square instance */
   public Square(double side, String color, boolean filled) {
      super(side, side, color, filled);
   }

   // Getters and Setters
   public double getSide() {
      return getLength();
   }
   public void setSide(double side) {
      super.setWidth(side);
      super.setLength(side);
   }
   @Override
   public void setWidth(double side) {
      super.setWidth(side);
      super.setLength(side);
   }
   // override to provide actual implementation
   @Override
   public void setLength(double side) {
      super.setWidth(side);
      super.setLength(side);
   }

   /** Returns a self-descriptive string in the form of "Square[Rectangle[Shape[color=?,filled=?],width=?,length=?]]" */
   @Override
   public String toString() {
      return "Square[" + super.toString() + "]";
   }
}