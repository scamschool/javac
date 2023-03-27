public class TestMain {
   public static void main(String[] args) {
      MovablePoint p1 = new MovablePoint(1, 2, 3, 4);
      System.out.println(p1);  // toString()
      p1.moveUp();
      System.out.println(p1);
      p1.moveLeft();
      System.out.println(p1);
      p1.moveDown();
      System.out.println(p1);
      p1.moveRight();
      System.out.println(p1);

      // Test Polymorphism
      Movable m1 = new MovablePoint(11, 12, 13, 14);  // upcast
      m1.moveUp();
      MovablePoint p2 = (MovablePoint)m1;   // downcast
      System.out.println(p2);
   }
}