/**
 * The Book class models a book written by ONE author and composes an instance of Author as its instance variable.
 */
public class Book {  // Save as "Book.java"
  // private instance variable, not accessible from outside this class
  private String isbn;
  private String name;
  private Author author;
     // The variable "author" is an instance of "Author" class
  private double price;
  private int qty;

  // Constructors (overloaded)
  /** Constructs a Book instance with default value for qty */
  public Book() {  // 1st (default) constructor
    this.qty = 0;
  }
   
  /** Constructs a Book instance with the given ISBN, name, author and price */
  public Book(String isbn, String name, Author author, double price) {  // 2nd constructor
    this.isbn = isbn;
    this.name = name;
    this.author = author;
    this.price = price;
  }

  /** Constructs a Book instance with the given ISBN, name, author, price and qty */
  public Book(String isbn, String name, Author author, double price, int qty) {  // 3rd constructor
    this.isbn = isbn;
    this.name = name;
    this.author = author;
    this.price = price;
    this.qty = qty;
  }
   
  /** Returns the ISBN */
  public String getISBN() {    // Getter for ISBN
    return isbn;
  }

  /** Returns the name */
  public String getName() {    // Getter for name
    return name;
  }

  /** Returns the author */
  public Author getAuthor() {  // Getter for author
    return author;
  }

  /** Returns the price */
  public double getPrice() {   // Getter for price
    return price;
  }

  /** Sets the price to the given value */
  public void setPrice(double price) {
    this.price = price;   // "this.price" refers to the instance variable
                          // "price" refers to the method's argument
  }

  /** Returns the qty */
  public int getQty() {
    return qty;
  }

  /** Sets the qty to the given value */
  public void setQty(int qty) {
    this.qty = qty;   // "this.qty" refers to the instance variable
                      // "qty" refers to the method's argument
  }

  /** Returns the author's name */
  public String getAuthorName() {
    return author.getName();
  }

  /** Return a self-descriptive string of this instance in the form of Book[isbn=?,name=?,Author[name=?,email=?],price=?,qty=?] */
  // Book's toString() uses Author's toString()
  public String toString() {   // Describe itself
    return "Book[isbn=" + isbn + ",name=" + name + "," + author    // invoke author.toString()
          + ",price=" + price + ",qty=" + qty + "]";
  }
}