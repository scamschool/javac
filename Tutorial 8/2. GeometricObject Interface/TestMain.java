public class TestMain {
   public static void main(String[] args) {
      // Test Circle class
      Circle c1 = new Circle(1.2);
      System.out.println(c1);  // toString()
      System.out.printf("Area is: %.2f%n", c1.getArea());
      System.out.printf("Perimeter is: %.2f%n", c1.getPerimeter());

      // Test Polymorphism
      GeometricObject g1 = new Circle(3.4);
      System.out.printf("Area is: %.2f%n", g1.getArea());
      System.out.printf("Perimeter is: %.2f%n", g1.getPerimeter());
   }
}