import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota do aluno:");
        double nota = entrada.nextDouble();

        System.out.println(classficarNota(nota));
    }

    public static char classficarNota(double nota){
        char conceito = ' ';

        if(nota >= 9.0){
            conceito = 'A';
        } else if(nota >= 8.0 && nota < 9.0){
            conceito = 'B';
        } else if(nota >= 7.0 && nota < 8.0) {
            conceito = 'C';
        } else if(nota >= 6.0 && nota < 7.0) {
            conceito = 'D';
        } else if(nota < 6) {
            conceito = 'E';
        }

        return conceito;
    }
}
