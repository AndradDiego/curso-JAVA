package Ex006;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        double Raio = Leitor.nextDouble();
        double volume = (4/3.0)*3.14159*(Raio*Raio*Raio);
        System.out.printf("Volume = %.3f",volume);
        Leitor.close();

    }
}
