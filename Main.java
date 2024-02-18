import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();
        double area = 3.14159 * (raio * raio);
        System.out.format("A =%.4f ", area);

    }
 
}