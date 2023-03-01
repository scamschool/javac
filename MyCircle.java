/**
 * The Circle class composes a "MyPoint" instance as its center and a radius.
 * We reuse the "MyPoint" class via composition.
 */
public class MyCircle {
   // The private member variables
   private MyPoint center;  // Declare an instance of the "MyPoint" class
   private int radius;
 
   // Constructors
   /** Constructs a Circle instance with the default values */
   public MyCircle() {
      this.center = new MyPoint();     // Construct an instance of MyPoint at (0,0)
      this.radius = 1;
   }
   /** Constructs a MyCircle instance with the center at (x, y) and radius */
   public MyCircle(int x, int y, int radius) {
      // Need to invoke the constructor to construct the MyPoint instances
      center = new MyPoint(x, y); // Construct an instance of MyPoint at (x,y)
      this.radius = radius;
   }
   /** Constructs a MyCircle instance with the given MyPoint instance as center and radius */
   public MyCircle(MyPoint center, int radius) {
      this.center = center;  // An instance constructed by caller; assign directly
      this.radius = radius;
   }
 
   // Getters and Setters
   public int getRadius() {
      return this.radius;
   }
   public void setRadius(int radius) {
      this.radius = radius;
   }
   public MyPoint getCenter() {
      return this.center;  // return a MyPoint instance
   }
   public void setCenter(MyPoint center) {
      this.center = center;
   }
 
   public int getCenterX() {
      return center.getX();  // MyPoint's getX()
   }
   public void setCenterX(int x) {
      center.setX(x);  // MyPoint's setX()
   }
   public int getCenterY() {
      return center.getY();  // MyPoint's getY()
   }
   public void setCenterY(int y) {
      center.setY(y);  // MyPoint's setY()
   }
   public int[] getCenterXY() {
      return center.getXY();  // MyPoint's getXY()
   }
   public void setCenterXY(int x, int y) {
      center.setXY(x, y);  // MyPoint's setXY()
   }
 
   /** Returns a self-descriptive String */
   public String toString() {
      return "MyCircle[radius=" + radius + ",center=" + center + "]";  // invoke center.toString()
   }
 
   /** Returns the area of this circle */
   public double getArea() {
      return Math.PI * radius * radius;
   }
 
   /** Returns the circumference of this circle */
   public double getCircumference() {
      return 2.0 * Math.PI * radius;
   }
 
   /** Returns the distance from the center of this circle to the center of
       the given MyCircle instance called another */
   public double distance(MyCircle another) {
      return center.distance(another.center);  // Use MyPoint's distance method
   }
 }