/**
 * The Animal class models an animal with name.
 */
public class Animal {
   // Private instance variables
   private String name;

   // Constructors
   /** Constructs an Animal instance at the given name */
   public Animal(String name) {
      this.name = name;
   }

   /** Returns a self-descriptive string in the form of "Animal[name="?"]" */
   @Override
   public String toString() {
      return "Animal[name=\"" + name + "\"]";
   }
}