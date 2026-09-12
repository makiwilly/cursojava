import java.util.*;

public class Imparpar {
    public static void main(String[] args) {
      
      int i;
      
      for (i = 0; i < 1000; i++) {
          if (i % 2 == 0) {
              System.out.println(i + " e par");
          }
          else {
              System.out.println(i + " e impar");
          }
      }
      
    }
}