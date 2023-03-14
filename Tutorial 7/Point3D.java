/**
 * The Point3D class models a 3D point at (x, y, z),
 * which is a subclass of Point2D.
 */
public class Point3D extends Point2D {
   // Private instance variables
   private float z;

   // Constructors
   /** Constructs a Point3D instance at (x,y,z) */
   public Point3D(float x, float y, float z) {
      super(x, y);
      this.z = z;
   }
   /** Constructs a Point3D instance at (0.0,0.0,0.0) */
   public Point3D() {  // default constructor
      super();     // x = y = 0.0
      this.z = 0.0f;
   }

   // Getters and Setters
   public float getZ() {
      return this.z;
   }
   public void setZ(float z) {
      this.z = z;
   }
   public void setXYZ(float x, float y, float z) {
      setX(x);     // or super.setX(x), use setter in superclass
      setY(y);
      this.z = z;
   }
   public float[] getXYZ() {
      float[] result = new float[3];
      result[0] = getX();
      result[1] = getY();
      result[2] = this.z;
      return result;
   }

   /** Returns a self-descriptive string in the form of "(x,y,z)" */
   @Override
   public String toString() {
      return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
   }
}