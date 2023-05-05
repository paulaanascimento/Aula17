import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = entrada.nextLine();

        System.out.println("Digite a idade:");
        int idade = entrada.nextInt();

        System.out.println("Digite o peso:");
        double peso = entrada.nextDouble();

        System.out.println("Digite a altura:");
        double altura = entrada.nextDouble();

        System.out.println(dizerInformacao(nome));
        System.out.println(dizerInformacao(idade));
        System.out.println(dizerInformacao(peso,altura));

    }

    public static String dizerInformacao(String nome){
        return "Meu nome é " + nome;
    }

    public static String dizerInformacao(int idade){
        return "Minha idade é " + idade;
    }

    public static String dizerInformacao(double peso, double altura){
        return "Meu peso é " + peso + " e minha altura é " + altura;
    }
}
