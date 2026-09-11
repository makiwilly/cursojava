import java.util.*;

public class Mediaaluno {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      
      
      System.out.println("Digite a primeira nota: ");
        int n1 = sc.nextInt();
      System.out.println("Digite a segunda nota: ");
        int n2 = sc.nextInt();
        
    //VARIAVEIS
      int media = (n1 + n2) / 2;
     
      //Media
      System.out.println("A media do aluno foi de "+media);
        if (media >= 7) {
            System.out.println("O aluno esta aprovado!");
        }
        else if (media >= 5 && media < 7) {
            System.out.println("O aluno esta de recuperacao");
        } 
        else {
            System.out.println("Infelizmente o aluno reprovou.");
        }
            
    }
}