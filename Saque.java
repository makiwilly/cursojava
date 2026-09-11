import java.util.*;

public class Saque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
      System.out.println("=============");
      System.out.println("BANCO CENTRAL");
      System.out.println("=============");
      
      System.out.println("Quanto deseja sacar? ");
        int saque = sc.nextInt();
        
    //variaveis
    int valorsaque = saque;
    int nota100;
    int nota50;
    int nota20;
    int nota10;
    int nota5;
    int nota2;
    
    //nota de 100
    nota100 = (saque / 100);
    saque = (saque % 100);
    
    //nota de 50
    nota50 = (saque / 50);
    saque = (saque % 50);
    
    //nota 20 
    nota20 = (saque / 20);
    saque = (saque % 20);
    
    //nota 10 
    nota10 = (saque / 10);
    saque = (saque % 10);
    
    //nota 5
    nota5 = (saque / 5);
    saque = (saque % 5);
    
    //nota 2 
    nota2 = (saque / 2);
    saque = (saque % 2);
    
    System.out.println("O saque de " + valorsaque + " Precisa de: ");
    System.out.println(nota100 + " notas de 100.");
    System.out.println(nota50 + " notas de 50");
    System.out.println(nota20 + " notas de 20");
    System.out.println(nota10 + " notas de 10");
    System.out.println(nota5 + " notas de 5");
    System.out.println(nota2 + " notas de 2");
    }
    
    
    
}