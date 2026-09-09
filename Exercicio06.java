import java.util.*;

public class Exercicio06 {
    public static void main(String[] args) {

      //declaracao de variaveis
      double impostos;
      double valorfinal;

      //calcular impostos
      Scanner sc = new Scanner(System.in);

      System.out.println("Digite o seu salario: R$");
        double salario = sc.nextDouble();

    //calculo dos impostos
    if (salario < 34712) {
        impostos = (salario * 9.70) / 100;
        valorfinal = (salario - impostos);
        System.out.println("Com os impostos de 9.70%, seu salario final sera: " + valorfinal );
    }
    else if (salario >= 34712 && salario <= 68507) {
        impostos = (salario * 37.35) / 100;
        valorfinal = (salario - impostos);
        System.out.println("Com os impostos de 37.35%, seu salario e de: " + valorfinal);
    }
    else {
        impostos = (salario * 49.50) / 100;
        valorfinal = (salario - impostos);
        System.out.println("Com os impostos de 49.50%, seu salario sera de: " + valorfinal);
    }
    }
}