import java.util.*;

public class MaiorNumero {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      //variaveis
      int quantidade;
      
      
      System.out.println("Quantos numeros deseja digitar? ");
        quantidade = sc.nextInt();
        int valor[] = new int[quantidade];
        int maior = valor[0];
        
        //estrutura de repeticao for 
      for (int i = 0; i < quantidade; i++) {
          System.out.println("Digite o valor: ");
            valor[i] = sc.nextInt();
      }
      for (int i = 0; i < quantidade; i++) {
          if (valor[i] > maior) {
              maior = valor[i];
          }
          
      }
     
     System.out.println("O maior numero e " + maior);
      
      
      
    }
}