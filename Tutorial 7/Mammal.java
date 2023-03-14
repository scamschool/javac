/**
 * The Mammal class models a mammal with name,
 * which is a subclass of Animal.
 */
public class Mammal extends Animal {
   // Constructors
   /** Constructs a Mammal instance */
   public Mammal(String name) {
      super(name);
   }

   /** Returns a self-descriptive string in the form of "Mammal[Animal[name="?"]]" */
   @Override
   public String toString() {
      return "Mammal[" + super.toString() + "]";
   }
}