/**
 * The Cat class models a cat,
 * which is a subclass of Animal.
 */
public class Cat extends Animal {
   // Constructors
   /** Constructs an Animal instance */
   public Cat(String name) {
      super(name);
   }

   @Override
   public void greets() {
      System.out.println("Meow");
   }
}