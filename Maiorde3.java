import java.util.*;

public class Maiorde3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      
      System.out.println("=======");
      System.out.println("MENU");
      System.out.println("=======");
      
      System.out.println("Digite o primeiro valor: ");
        int n1 = sc.nextInt();
      System.out.println("Digite o segundo valor: ");
        int n2 = sc.nextInt();
      System.out.println("Digite o terceiro valor: ");
        int n3 = sc.nextInt();
        
     if (n1 > n3 && n1 > n3) {
         System.out.println("O maior valor e " +n1);
     }
     else if (n2 > n1 && n2 > n3) {
         System.out.println("O maio valor e " +n2);
     } 
     else {
         System.out.println("O maior valor e " +n3);
     }
        
      
    }
}