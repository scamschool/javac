/**
 * The MovablePoint class models a movable point at (x,y),
 * which is a subclass of Point.
 */
public class MovablePoint extends Point {
   // Private instance variables
   private float xSpeed;
   private float ySpeed;

   // Constructors
   /** Constructs a MovablePoint instance at (x,y) moving at (xSpeed,ySpeed) */
   public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
      super(x, y);
      this.xSpeed = xSpeed;
      this.ySpeed = ySpeed;
   }
   /** Constructs a MovablePoint instance moving at (xSpeed,ySpeed) */
   public MovablePoint(float xSpeed, float ySpeed) {
      this.xSpeed = xSpeed;
      this.ySpeed = ySpeed;
   }
   /** Constructs a MovablePoint instance at (0.0,0.0) */
   public MovablePoint() {  // default constructor
      super();     // x = y = 0.0
      this.xSpeed = 0.0f;
      this.ySpeed = 0.0f;
   }

   // Getters and Setters
   public float getXSpeed() {
      return xSpeed;
   }
   public void setXSpeed(float xSpeed) {
      this.xSpeed = xSpeed;
   }
   public float getYSpeed() {
      return ySpeed;
   }
   public void setYSpeed(float ySpeed) {
      this.ySpeed = ySpeed;
   }
   public void setSpeed(float xSpeed, float ySpeed) {
      this.xSpeed = xSpeed;
      this.ySpeed = ySpeed;
   }
   public float[] getSpeed() {
      float[] result = new float[2];
      result[0] = this.xSpeed;
      result[1] = this.ySpeed;
      return result;
   }

   /** Returns a self-descriptive string in the form of "(x,y),speed=(xs,ys)" */
   @Override
   public String toString() {
      return super.toString() + ",speed=(" + this.xSpeed + "," + this.ySpeed + ")";
   }

   public MovablePoint move() {
      setX(getX() + xSpeed);
      setY(getY() + ySpeed);
      return this;
   }
}