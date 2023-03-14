/**
 * The Cat class models a cat,
 * which is a subclass of Mammal.
 */
public class Cat extends Mammal {
   // Constructors
   /** Constructs a Mammal instance */
   public Cat(String name) {
      super(name);
   }

   public void greets() {
      System.out.println("Meow");
   }

   /** Returns a self-descriptive string in the form of "Cat[Mammal[Animal[name="?"]]]" */
   @Override
   public String toString() {
      return "Cat[" + super.toString() + "]";
   }
}