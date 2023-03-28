/**
 * The BigDog class models a big dog,
 * which is a subclass of Dog.
 */
public class BigDog extends Dog {
   // Constructors
   /** Constructs a Dog instance */
   public BigDog(String name) {
      super(name);
   }

   @Override
   public void greets() {
      System.out.println("Wooow");
   }
   @Override
   public void greets(Dog another) {
      System.out.println("Woooooow");
   }
   public void greets(BigDog another) {
      System.out.println("Wooooooooow");
   }
}