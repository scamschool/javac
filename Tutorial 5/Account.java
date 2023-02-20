/**
 * The Account class models a bank account of a customer, with ID, name and balance.
 */
public class Account {  // Save as "Account.java"
   // private instance variable, not accessible from outside this class
   private String id;
   private String name;
   private int balance;
   
   // Constructors (overloaded)
   /** Constructs an Account instance with default value for balance */
   public Account() {  // 1st (default) constructor
      balance = 0;
   }
   
   /** Constructs an Account instance with the given ID and name */
   public Account(String i, String n) {  // 2nd constructor
      id = i;
      name = n;
   }

   /** Constructs an Account instance with the given ID, name and balance */
   public Account(String i, String n, int b) {  // 3rd constructor
      id = i;
      name = n;
      balance = b;
   }
   
   /** Returns the ID */
   public String getID() {
     return id; 
   }

   /** Returns the name */
   public String getName() {
     return name; 
   }

   /** Returns the balance */
   public int getBalance() {
     return balance; 
   }

   /** Add amount to balance, return balance */
   public int credit(int amount) {
     return balance += amount;
   }

   /** Subtract amount from balance, return balance */
   public int debit(int amount) {
     if (amount <= balance) {
        balance -= amount;
     } else {
        System.out.println("Amount exceeded balance");
     }
     return balance;
   }

   /** Transfer amount to the given Account, return balance */
   public int transferTo(Account another, int amount) {
     if (amount <= balance) {
        another.balance += amount;
        balance -= amount;
     } else {
        System.out.println("Amount exceeded balance");
     }
     return balance;
   }

   /** Return a self-descriptive string of this instance in the form of Account[id=?,name=?,balance=?] */
   public String toString() {
      return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
   }
}