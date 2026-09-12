import java.util.*;

public class MenorNumero {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int quantidade;
      
      
      
      System.out.println("Quantos numeros deseja digitar? ");
        quantidade = sc.nextInt();
        int valor[] = new int [quantidade];
        
      for (int i = 0; i < quantidade; i++) {
          System.out.println("Digite o " + (i+1) + "o. valor");
            valor[i] = sc.nextInt();
            
      }
      int menor = valor[0];
      for (int i = 0; i < quantidade; i++) {
          
          if (valor[i] < menor) {
              menor = menor + valor[i];
          }
      }
      System.out.println("O menor valor e " + menor);
    
    }
} 