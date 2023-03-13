/**
 * The Student class, subclass of Person.
 */
public class Student extends Person {
   // private instance variables
   private String program;
   private int year;
   private double fee;
   
   /** Constructs a Student instance with the given name and address */
   public Student(String name, String address, String program, int year, double fee) {
      super(name, address);  // call superclass' constructor with String
      this.program = program;
      this.year = year;
      this.fee = fee;
   }
   
   // Getters and Setters
   /** Returns the program */
   public String getProgram() {
      return this.program;
   }
   /** Sets the program */
   public void setProgram(String program) {
      this.program = program;
   }
   /** Returns the year */
   public int getYear() {
      return this.year;
   }
   /** Sets the year */
   public void setYear(int year) {
      this.year = year;
   }
   /** Returns the fee */
   public double getFee() {
      return this.fee;
   }
   /** Sets the fee */
   public void setFee(double fee) {
      this.fee = fee;
   }

   /** Returns a self-descriptive string */
   @Override
   public String toString() {
      return "Student[" + super.toString() + ",program=" + program + ",year=" + year + ",fee=" + fee + "]";
   }
}