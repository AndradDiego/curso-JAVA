package Ex005;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        String vendedor = Leitor.nextLine();
        double fixo = Leitor.nextDouble();
        double vendas = Leitor.nextDouble();
        double Salario = fixo+(vendas*0.15);
        System.out.printf("Salario do vendedor %s = %.2f",vendedor,Salario);
        Leitor.close();


        
    }
}
