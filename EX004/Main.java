package EX004;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);
        int valor1 = valores.nextInt();
        int valor2 = valores.nextInt();
        int valor3 = valores.nextInt();
        int valor4 = valores.nextInt();
        int diferenca = (valor1*valor2)-(valor3-valor4);
        System.out.printf("DIFERENCA = %d",diferenca);
        valores.close();

        
    }
}
