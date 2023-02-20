/**
 * The Employee class models an employee with ID, first name, last name and salary.
 */
public class Employee {  // Save as "Employee.java"
   // private instance variable, not accessible from outside this class
   private int id;
   private String firstName;
   private String lastName;
   private int salary;
   
   // Constructors (overloaded)
   /** Constructs an Employee instance with the given ID, first name, last name and salary */
   public Employee(int i, String first, String last, int sal) {  // 2nd constructor
      id = i;
      firstName = first;
      lastName = last;
      salary = sal;
   }
   
   /** Returns the ID */
   public int getID() {
     return id; 
   }

   /** Returns the first name */
   public String getFirstName() {
     return firstName; 
   }

   /** Returns the last name */
   public String getLastName() {
     return lastName; 
   }

   /** Returns the name */
   public String getName() {
     return firstName + " " + lastName; 
   }

   /** Returns the salary */
   public int getSalary() {
     return salary; 
   }

   /** Sets the salary to the given value */
   public void setSalary(int salary) {
      this.salary = salary;   // "this.salary" refers to the instance variable
                              // "salary" refers to the method's argument
   }

   /** Returns the annual salary */
   public int getAnnualSalary() {
     return salary * 12; 
   }

   /** Returns the raised salary */
   public int raiseSalary(int percent) {
     return this.salary = salary * (100 + percent) / 100; 
   }

   /** Return a self-descriptive string of this instance in the form of Employee[id=?,name=firstName lastName,salary=?] */
   public String toString() {
      return "Employee[id=" + id + ",name=" + firstName + " " + lastName + ",salary=" + salary + "]";
   }
}