import java.util.*;

public class Contador {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("=========");
      System.out.println("CONTADOR");
      System.out.println("========");
      
      System.out.println("Digite o primeiro valor: ");
        int n1 = sc.nextInt();
      System.out.println("Digite o segundo valor: ");
        int n2 = sc.nextInt();
        
     if (n1 >= n2) {
         
        for ( ; n1 >= n2; n1--) {
        System.out.println(n1);
        }
    } 
    else {
        for ( ; n1 <= n2; n1++) {
            System.out.println(n1);
        }
    }
    
    
    }
}