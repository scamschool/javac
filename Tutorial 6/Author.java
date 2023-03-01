/**
 * The Author class models an author of a book, with name and email.
 */
public class Author {  // Save as "Author.java"
  // private instance variable, not accessible from outside this class
  private String name;
  private String email;
   
  // Constructors (overloaded)
  /** Constructs an Author instance with the given name and email  */
  public Author(String name, String email) {  // 1st constructor
    this.name = name;
    this.email = email;
  }
   
  /** Returns the name */
  public String getName() {   // Getter for name
    return name; 
  }

  /** Returns the email */
  public String getEmail() {  // Getter for email
    return email; 
  }

  /** Sets the email to the given email */
  public void setEmail(String email) {  // Setter for email
    this.email = email;   // "this.email" refers to the instance variable
                          // "email" refers to the method's argument
  }

  /** Return a self-descriptive string of this instance in the form of Author[name=?,email=?] */
  public String toString() {
    return "Author[name=" + name + ",email=" + email + "]";
  }
}