package Ex007;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float n1 = leitor.nextFloat();
        float n2 = leitor.nextFloat();
        float n3 = leitor.nextFloat();
        float n4 = leitor.nextFloat();
        double nota = Math.floor(((n1*0.2)+(n2*0.3)+(n3*0.4)+(n4*0.1))*10)/10;

        if(nota>=5.0 && nota<=6.9){
            System.out.printf("media:%.1f\n",nota);
            System.out.printf("Aluno em exame.\n");
            float rec = leitor.nextFloat();
            System.out.printf("Nota do Exame: %.1f",rec);
            double rectotal = (rec+nota)/2;
                if(rectotal>=5){
                    System.out.printf("Aluno Aprovado.\n");
                    System.out.printf("Media final: %.1f\n",rectotal);
                }else{
                    System.out.printf("Aluno Reprovado.\n");
                    System.out.printf("Media final:%.1f\n",rectotal);
                }
        }else if(nota >=7 ){
            System.out.printf("Aluno Aprovado.\n");
            System.out.printf("Media: %.1f\n",nota);
        }else{
            System.out.printf("Aluno Reprovado.\n");
            System.out.printf("Media: %.1f\n",nota);
        }leitor.close();
    }
}
