import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      double valorcarro = 500000;
      int i;
      for (i = 1; i <= 500000; i++) {
          double valorparcela = (valorcarro / i);
          if (valorparcela >= 1000) {
              System.out.println("A " + i + " parcela de " + valorparcela);
          } else {
              break;
          }
      }
      }
    }
