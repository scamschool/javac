/**
 * The Point2D class models a 2D point at (x, y).
 */
public class Point2D {
   // Private instance variables
   private float x, y;

   // Constructors
   /** Constructs a Point2D instance at the given (x,y) */
   public Point2D(float x, float y) {
      this.x = x;
      this.y = y;
   }
   /** Construct a Point2D instance at (0.0,0.0) */
   public Point2D() {  // default constructor
      this.x = 0.0f;
      this.y = 0.0f;
   }

   // Getters and Setters
   public float getX() {
      return this.x;
   }
   public void setX(float x) {
      this.x = x;
   }
   public float getY() {
      return this.y;
   }
   public void setY(float y) {
      this.y = y;
   }
   public void setXY(float x, float y) {
      this.x = x;
      this.y = y;
   }
   public float[] getXY() {
      float[] result = new float[2];  // construct an array of 2 elements
      result[0] = this.x;
      result[1] = this.y;
      return result;
   }

   /** Returns a self-descriptive string in the form of "(x,y)" */
   @Override
   public String toString() {
      return "(" + this.x + "," + this.y + ")";
   }
}