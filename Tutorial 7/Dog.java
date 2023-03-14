/**
 * The Dog class models a dog,
 * which is a subclass of Mammal.
 */
public class Dog extends Mammal {
   // Constructors
   /** Constructs a Dog instance */
   public Dog(String name) {
      super(name);
   }

   public void greets() {
      System.out.println("Woof");
   }
   public void greets(Dog another) {
      System.out.println("Woooof");
   }

   /** Returns a self-descriptive string in the form of "Dog[Mammal[Animal[name="?"]]]" */
   @Override
   public String toString() {
      return "Dog[" + super.toString() + "]";
   }
}