package Ex008;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float pontoX = leitor.nextFloat();
        float pontoY = leitor.nextFloat();  
        
        if(pontoX==0 && pontoY==0){
            System.out.printf("Origem\n");
        }
        if(pontoX>0){
            if(pontoY>0){
                System.out.printf("Q1\n");
            }
            else if(pontoY<0){
                System.out.printf("Q4\n");
            }else{
                System.out.printf("Eixo X\n");
            }
        }if(pontoX<=0){
            if(pontoY>0){
                System.out.printf("Q2\n");
            }
            if(pontoY<0){
                System.out.printf("Q3\n");
            }
            else if(pontoX==0 && pontoY>0){
                System.out.printf("Eixo Y\n");
            }
            else{
                System.out.printf("Eixo X\n");
            }
        }
        leitor.close();
    }}
