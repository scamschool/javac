/**
 * The Dog class models a dog,
 * which is a subclass of Animal.
 */
public class Dog extends Animal {
   // Constructors
   /** Constructs a Dog instance */
   public Dog(String name) {
      super(name);
   }

   @Override
   public void greets() {
      System.out.println("Woof");
   }
   public void greets(Dog another) {
      System.out.println("Woooof");
   }
}