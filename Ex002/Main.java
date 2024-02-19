package Ex002;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException {
        Scanner inteiros = new Scanner(System.in);
        int n1 = inteiros.nextInt();
        int n2 = inteiros.nextInt();
        int PROD = n1 * n2;
        System.out.format("PROD = %d",PROD);
        inteiros.close();
        
    }
}
 