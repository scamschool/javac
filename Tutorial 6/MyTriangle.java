/**
 * The MyTriangle class uses three "MyPoint" instances as the three vertices.
 * We reuse the "MyPoint" class via composition.
 */
public class MyTriangle {
   // The private instance variables
   MyPoint v1, v2, v3;   // instances of the "MyPoint" class
 
   // Constructors
   /** Constructs a MyTriangle instance with points at (x1, y1), (x2, y2) and (x3, y3) */
   public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
      v1 = new MyPoint(x1, y1);  // Construct the instances declared
      v2 = new MyPoint(x2, y2);
      v3 = new MyPoint(x3, y3);
   }
   /** Construct a MyTriangle instance given 3 MyPoint instances */
   public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
      this.v1 = v1;  // The caller had constructed the instances
      this.v2 = v2;
      this.v3 = v3;
   }

   /** Returns a self-descriptive String */
   public String toString() {
      return "MyTriangle[v1=" + v1 + ",v2=" + v2 + ",v3=" + v3 + "]";  // invoke v1.toString(), v2.toString() and v3.toString()
   }

   /** Returns the perimeter of the triangle by adding the distance from a vertice of this triangle to another vertice of
       the same MyTriangle instance */
   public double getPerimeter() {
      double side1 = Math.abs(v1.distance(v2));  // Use MyPoint's distance method
      double side2 = Math.abs(v2.distance(v3));
      double side3 = Math.abs(v3.distance(v1));
      return side1 + side2 + side3;
   }

   public String getType() {
      double side1 = Math.abs(v1.distance(v2));  // Use MyPoint's distance method
      double side2 = Math.abs(v2.distance(v3));
      double side3 = Math.abs(v3.distance(v1));
      if ((side1 == side2) && (side2 == side3) && (side3 == side1)) {
         return "Equilateral";
      } else if ((side1 != side2) && (side2 != side3) && (side3 != side1)) {
         return "Scalene";
      } else {
         return "Isosceles";
      }
   }
 }