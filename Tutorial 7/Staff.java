/**
 * The Staff class, subclass of Person.
 */
public class Staff extends Person {
   // private instance variables
   private String school;
   private double pay;
   
   /** Constructs a Staff instance with the given name and address */
   public Staff(String name, String address, String school, double pay) {
      super(name, address);  // call superclass' constructor with String
      this.school = school;
      this.pay = pay;
   }
   
   // Getters and Setters
   /** Returns the school */
   public String getSchool() {
      return this.school;
   }
   /** Sets the school */
   public void setSchool(String school) {
      this.school = school;
   }
   /** Returns the pay */
   public double getPay() {
      return this.pay;
   }
   /** Sets the year */
   public void setPay(double pay) {
      this.pay = pay;
   }

   /** Returns a self-descriptive string */
   @Override
   public String toString() {
      return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
   }
}