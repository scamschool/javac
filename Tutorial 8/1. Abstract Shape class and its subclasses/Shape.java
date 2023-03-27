// The Shape superclass is an abstract class
abstract public class Shape {
	// Private instance variables
	private String color;
	private Boolean filled;
	
	// Constructors
	/** Constructs a Shape instance with the given color and filled */
	public Shape() {  // default constructor
		this.color = "red";
		this.filled = true;
	}
	/** Constructs a Shape instance at the given color and filled */
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	// Getters and Setters
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
	    this.color = color;
	}
	public boolean isFilled() {
	    return this.filled;
	}
	public void setFilled(boolean filled) {
	    this.filled = filled;
	}

	abstract public double getArea();  // no implementation
	abstract public double getPerimeter();  // no implementation
	
	/** Returns a self-descriptive string in the form of "Shape[color=?,filled=?]" */
	@Override
	public String toString() {
		return "Shape[color=" + color + ",filled=" + filled + "]";
	}
}
