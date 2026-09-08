import java.util.*;

public class Aula05 {
    public static void main(String[] args) {
      //ler variavel
      Scanner sc = new Scanner(System.in);

      System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

    //condicional
        if (idade < 15) {
            System.out.println("Categoria Infantil");
        } 

        else if (idade >= 15 && idade < 18) {
                System.out.println("Categoria Juvenil");
            }

        else {
            System.out.println("Categoria Adulto");
        }


    }
}