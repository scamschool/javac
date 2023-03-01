/**
 * The Customer class models a customer in a transaction, with ID, name and discount.
 */
public class Customer {  // Save as "Customer.java"
  // private instance variable, not accessible from outside this class
  private int id;
  private String name;
  private int discount;
   
  // Constructors (overloaded)
  /** Constructs a Customer instance with the given ID, name and discount  */
  public Customer(int id, String name, int discount) {  // 1st constructor
    this.id = id;
    this.name = name;
    this.discount = discount;
  }

  /** Returns the ID */
  public int getID() {        // Getter for ID
    return id; 
  }
   
  /** Returns the name */
  public String getName() {   // Getter for name
    return name; 
  }

  /** Returns the discount */
  public int getDiscount() {  // Getter for discount
    return discount; 
  }

  /** Sets the discount to the given value */
  public void setDiscount(int discount) {  // Setter for discount
    this.discount = discount;   // "this.discount" refers to the instance variable
                                // "discount" refers to the method's argument
  }

  /** Return a self-descriptive string of this instance in the form of name(id)(discount%) */
  public String toString() {
    return name + "(" + id + ")(" + discount + "%)";
  }
}