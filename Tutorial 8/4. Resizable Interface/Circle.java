public class Circle implements GeometricObject {
	protected double radius;
	public Circle(double radius) {
		this.radius = radius;
	}

	/** Returns a self-descriptive string in the form of "Circle[radius=r]" */
	@Override
	public String toString() {
		return "Circle[radius=" + this.radius + "]";
	}
	
	@Override
	public double getPerimeter() {   // provide implementation
		return 2.0*Math.PI*radius;
	}

	@Override
	public double getArea() {   // provide implementation
		return Math.PI*radius*radius;
	}
}