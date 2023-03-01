/**
 * The Invoice class models an invoice for a particular customer and composes an instance of Customer as its instance variable.
 */
public class Invoice {  // Save as "Invoice.java"
  // private instance variable, not accessible from outside this class
  private int id;
  private Customer customer;
     // The variable "customer" is an instance of "Customer" class
  private double amount;

  // Constructors (overloaded)
  /** Constructs an Invoice instance with the given ID, customer and amount  */
  public Invoice(int id, Customer customer, double amount) {  // 1st (default) constructor
    super();
    this.id = id;
    this.customer = customer;
    this.amount = amount;
  }
   
  /** Returns the ID */
  public int getID() {             // Getter for ID
    return id;
  }

  /** Returns the customer */
  public Customer getCustomer() {  // Getter for customer
    return customer;
  }

  /** Sets the customer to the given customer */
  public void setCustomer(Customer customer) {  // Setter for customer
    this.customer = customer;   // "this.customer" refers to the instance variable
                                // "customer" refers to the method's argument
  }

  /** Returns the amount */
  public double getAmount() {     // Getter for amount
    return amount;
  }

  /** Sets the amount to the given value */
  public void setAmount(double amount) {  // Setter for amount
    this.amount = amount;   // "this.amount" refers to the instance variable
                            // "amount" refers to the method's argument
  }

  /** Returns the customer's ID */
  public int getCustomerID() {
    return customer.getID();
  }

  /** Returns the customer's name */
  public String getCustomerName() {
    return customer.getName();
  }

  /** Returns the customer's discount */
  public int getCustomerDiscount() {
    return customer.getDiscount();
  }

  /** Returns the author */
  public double getAmountAfterDiscount() {
    return ((100 - getCustomerDiscount())*amount / 100);
  }

  /** Return a self-descriptive string of this instance in the form of Invoice[id=?,customer=name(id)(discount%),amount=?] */
  // Book's toString() uses Author's toString()
  public String toString() {   // Describe itself
    return "Invoice[id=" + id + ",customer=" + customer    // invoke customer.toString()
          + ",amount=" + amount + "]";
  }
}