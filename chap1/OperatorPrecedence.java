package chap1;

public class OperatorPrecedence {
   static final int start = 2;
   int end = 5;
   public Airplane(int x) {
      x = 4;
      end = x;
   }
   public void fly(int distance) {
      //start = 6;
      System.out.print(end-start+" ");
      System.out.print(distance);
   }
   public static void main(String... start) {
      //new Airplane(10).fly(5);

       int x = 3;
       int y = ++x * 5 / x-- + --x;
       System.out.println("x is " + x);
       System.out.println("y is " + y);
   }
}