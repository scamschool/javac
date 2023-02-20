/**
 * The Ball class models a bouncing ball instance, with radius, x and y position. Each move step advances the x and y by delta-x and delta-y, respectively.
 */
public class Ball {  // Save as "Ball.java"
   // private instance variable, not accessible from outside this class
   private float x;
   private float y;
   private int radius;
   private float xDelta;
   private float yDelta;
   
   // Constructors (overloaded)
   /** Constructs a Ball instance with the given radius, x and y position, delta-x and delta-y  */
   public Ball(float xPos, float yPos, int rad, float xDel, float yDel) {  // 1st constructor
      x = xPos;
      y = yPos;
      radius = rad;
      xDelta = xDel;
      yDelta = yDel;
   }
   
   /** Returns the x position */
   public float getX() {
     return x; 
   }

   /** Sets the x position to the given value */
   public void setX(float x) {
     this.x = x;   // "this.x" refers to the instance variable
                   // "x" refers to the method's argument
   }

   /** Returns the y position */
   public float getY() {
     return y; 
   }

   /** Sets the y position to the given value */
   public void setY(float y) {
     this.y = y;   // "this.y" refers to the instance variable
                   // "y" refers to the method's argument
   }

   /** Returns the radius */
   public int getRadius() {
     return radius; 
   }

   /** Sets the radius to the given value */
   public void setRadius(int radius) {
     this.radius = radius;   // "this.radius" refers to the instance variable
                             // "radius" refers to the method's argument
   }

   /** Returns the delta-x */
   public float getXDelta() {
     return xDelta; 
   }

   /** Sets the delta-x to the given value */
   public void setXDelta(float xDelta) {
     this.xDelta = xDelta;   // "this.xDelta" refers to the instance variable
                             // "xDelta" refers to the method's argument
   }

   /** Returns the delta-y */
   public float getYDelta() {
     return yDelta; 
   }

   /** Sets the delta-x to the given value */
   public void setYDelta(float yDelta) {
     this.yDelta = yDelta;   // "this.yDelta" refers to the instance variable
                             // "yDelta" refers to the method's argument
   }

   /** Move one step */
   public void move() {
     x += xDelta;
     y += yDelta;
   }

   /** Reflect delta-x */
   public void reflectHorizontal() {
     xDelta = -xDelta;
   }

   /** Reflect delta-y */
   public void reflectVertical() {
     yDelta = -yDelta;
   }

   /** Return a self-descriptive string of this instance in the form of Ball[(x,y),speed=(delta-x,delta-y)] */
   public String toString() {
      return "Ball[(" + x + "," + y + "),speed=(" + xDelta + "," + yDelta + ")]";
   }
}