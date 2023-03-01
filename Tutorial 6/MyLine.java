/**
 * A Line composes of two Points - a begin "Point" and an end "Point".
 * We reuse the MyPoint class via composition.
 */
public class MyLine {
   // The private instance variables
   MyPoint begin, end;   // instances of the "MyPoint" class
 
   /** Constructs a MyLine instance with a begin point at (x1, y1) and an end point at (x2, y2) */
   public MyLine(int x1, int y1, int x2, int y2) {
      begin = new MyPoint(x1, y1);  // Construct the instances declared
      end   = new MyPoint(x2, y2);
   }
   /** Construct a MyLine instance given 2 MyPoint instances */
   public MyLine(MyPoint begin, MyPoint end) {
      this.begin = begin;  // The caller had constructed the instances
      this.end   = end;
   }
 
   // The public getter and setter for the private instance variables
   public MyPoint getBegin() {
      return begin;
   }
   public void setBegin(MyPoint begin) {
      this.begin = begin;
   }
   public MyPoint getEnd() {
      return end;
   }
   public void setEnd(MyPoint end) {
      this.end = end;
   }
 
   public int getBeginX() {
      return begin.getX();  // MyPoint's getX()
   }
   public void setBeginX(int x) {
      begin.setX(x);  // MyPoint's setX()
   }
   public int getBeginY() {
      return begin.getY();  // MyPoint's getY()
   }
   public void setBeginY(int y) {
      begin.setY(y);  // MyPoint's setY()
   }
   public int getEndX() {
      return end.getX();  // MyPoint's getX()
   }
   public void setEndX(int x) {
      end.setX(x);  // MyPoint's setX()
   }
   public int getEndY() {
      return end.getY();  // MyPoint's getY()
   }
   public void setEndY(int y) {
      end.setY(y);  // MyPoint's setY()
   }
   public int[] getBeginXY() {
      return begin.getXY();  // MyPoint's getXY()
   }
   public void setBeginXY(int x, int y) {
      begin.setXY(x, y);  // MyPoint's setXY()
   }
   public int[] getEndXY() {
      return end.getXY();  // MyPoint's getXY()
   }
   public void setEndXY(int x, int y) {
      end.setXY(x, y);  // MyPoint's setXY()
   }

   /** Returns the length of this line */
   public double getLength() {
      return begin.distance(end);  // use MyPoint's distance() method
   }

   /** Returns the gradient of this line */
   public double getGradient() {
      int xDiff = getEndX() - getBeginX();
      int yDiff = getEndY() - getBeginY();
      return Math.atan2(yDiff, xDiff);
   }
 
   /** Returns a self-descriptive String */
   public String toString() {
      return "MyLine[begin=" + begin + ",end=" + end + "]";
            // Invoke begin.toString() and end.toString()
   }
}