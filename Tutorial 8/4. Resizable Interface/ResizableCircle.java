/**
 * The ResizableCircle class models a circle of radius,
 * which is a subclass of Circle.
 */
 public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    /** Returns a self-descriptive string in the form of "ResizableCircle[Circle[radius=?]]" */
    @Override
    public String toString() {
        return "ResizableCircle[" + super.toString() + "]";
    }

    @Override
    public void resize(int percent) {   // provide implementation
        radius = radius*percent/100;  // System.out.println(1.2*1.5);      // 1.7999999999999998
                                // System.out.println(1.2*150/100);  // 1.8
    }
}