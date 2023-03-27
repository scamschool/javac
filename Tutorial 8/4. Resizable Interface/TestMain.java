public class TestMain {
   public static void main(String[] args) {
      // Test Circle class
      Circle c1 = new Circle(1.5);
      System.out.println(c1);  // toString()
      System.out.printf("Area is: %.2f%n", c1.getArea());
      System.out.printf("Perimeter is: %.2f%n", c1.getPerimeter());

      // Test ResizableCircle class
      ResizableCircle rc1 = new ResizableCircle(1.2);
      System.out.println(rc1);  // toString()
      System.out.printf("Area is: %.2f%n", rc1.getArea());
      System.out.printf("Perimeter is: %.2f%n", rc1.getPerimeter());
      rc1.resize(150);
      System.out.println(rc1);  // toString()
   }
}