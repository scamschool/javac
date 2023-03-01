/**
 * The MyComplex class models a complex number with real and imaginary parts.
 */
public class MyComplex {  // Save as "MyComplex.java"
  // private instance variable, not accessible from outside this class
  private double real;
  private double imag;
  
  // The constructors (overloaded)
  /** Construct a MyComplex instance with the default values */
  public MyComplex() {  // The default constructor
    this.real = 0.0;
    this.imag = 0.0;
  }
  /** Construct a MyComplex instance with the given real and imag values */
  public MyComplex(double real, double imag) {
    this.real = real;
    this.imag = imag;
  }
  
  // Getters and Setters
  /** Returns the real value */
  public double getReal() {
    return real; 
  }
  /** Sets the real value to the given value */
  public void setReal(double real) {
    this.real = real;   // "this.real" refers to the instance variable
                        // "real" refers to the method's argument
  }
  /** Returns the imag value */
  public double getImag() {
    return imag; 
  }
  /** Sets the imag value to the given value */
  public void setImag(double imag) {
    this.imag = imag;   // "this.imag" refers to the instance variable
                        // "imag" refers to the method's argument
  }
  /** Sets the real and imag values to the given values */
  public void setValue(double real, double imag) {
    this.real = real;  // An instance constructed by caller; assign directly
    this.imag = imag;
  }

  /** Returns a self-descriptive String */
  public String toString() {
    return real + "+" + imag + "i";
  }


  // Take note that these functions returns a boolean value
  public boolean isReal() {
    return imag == 0.0;
  }
  public boolean isImaginary() {
    return real == 0.0;
  }

  // E.g., c1.equals(3, 4);
  public boolean equals(double real, double imag) {
    return (this.real == real) && (this.imag == imag);
  }
  // E.g., c1.equals(c2);
  public boolean equals(MyComplex another) {
    return (this.real == another.real) && (this.imag == another.imag);
  }

  public double magnitude() {
    return Math.sqrt(real*real + imag*imag);
  }

  // E.g., c1.addInto(c2);   // c1 + c2 -> c1
  public MyComplex addInto(MyComplex right) {
    this.real += right.real;
    this.imag += right.imag;
    return this;
  }
  // E.g., c1.addNew(c2);  // c1 + c2 -> new-instance
  public MyComplex addNew(MyComplex right) {
    return new MyComplex(this.real + right.real, this.imag + right.imag);
  }
}