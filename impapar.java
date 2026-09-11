import java.util.*;

public class impapar {
    public static void main(String[] args) {
        // Treino basico de java
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();

        if (valor % 2 == 0) {
            System.out.println("O valor " + valor + " E um numero par.");
        } else {
            System.out.println("O valor " + valor + " E um numero impar");
        }
    }
}
