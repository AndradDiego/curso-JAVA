package Ex003;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner notas = new Scanner(System.in);
        System.out.println("Insira a nota da primeira prova");
        double n1= notas.nextDouble();
        System.out.println("Insira a nota da segunda prova ");
        double n2= notas.nextDouble();
        System.out.println("Insira a nota da terceira prova");
        double n3 = notas.nextDouble();
        double media = (n1*0.2)+(n2*0.3)+(n3*0.5);
        System.out.printf("Media = %.1f", media);
        notas.close();



        
    }
}
