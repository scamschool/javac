// The Animal superclass is an abstract class
abstract public class Animal {
   // Private instance variables
   private String name;

   // Constructors
   /** Constructs an Animal instance at the given name */
   public Animal(String name) {
      this.name = name;
   }

   public abstract void greets();
}