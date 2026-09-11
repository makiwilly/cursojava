import java.util.*;

public class Calculadora {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("===============");
      System.out.println("CALCULADORA");
      System.out.println("===============");
      
      System.out.println("Escolha uma operacao");
      System.out.println("(1) +");
      System.out.println("(2) -");
      System.out.println("(3) x");
      System.out.println("(4) /");
        int escolha = sc.nextInt();
        if (escolha < 1 || escolha > 4) {
            System.out.println("ESCOLHA INVALIDA");
            return;
        }
        
      //VALORES
      System.out.println("Digite o primeiro valor: ");
        double n1 = sc.nextDouble();
      System.out.println("Digite o segundo valor: ");
        double n2 = sc.nextDouble();

        
      //variaveis
      double soma = (n1 + n2);
      double subtracao = (n1 - n2);
      double multiplicacao = (n1 * n2);
      double divisao = (n1 / n2);
      
      
        switch (escolha) {
            case 1: 
                System.out.println(soma);
                break;
            case 2:
                System.out.println(subtracao);
                break;
            case 3:
                System.out.println(multiplicacao);
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Nao e possivel dividir por zero");
                } else {
                    System.out.println(divisao);
                }
                break;
            default: 
                System.out.println("Opcao invalida");
                break;
        }
    }
}