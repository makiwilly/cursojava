import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
            int v1 = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
            int v2 = sc.nextInt();
            
        if (v1 > v2) {
            System.out.println("O valor " +v1+ " E maior que o valor" +v2);
        }
        else {
            System.out.println("O valor " +v2+ " E maior que o valor " +v1);
        }
    }
}