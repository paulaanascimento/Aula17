import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        int volume = 50;
        int canal = 1;

        consultarCanal(canal);
        consultarVolume(volume);

        volume = aumentarVolume(volume);
        volume = aumentarVolume(volume);
        volume = aumentarVolume(volume);
        consultarVolume(volume);

        volume = diminuirVolume(volume);
        consultarVolume(volume);

        canal = aumentarCanal(canal);
        consultarCanal(canal);
        canal = diminuirCanal(canal);
        consultarCanal(canal);

        canal = trocarCanal();
        consultarCanal(canal);

    }

    public static int aumentarVolume(int volume){
        System.out.println("Aumentando o volume");
        volume++;
        return volume;
    }

    public static int diminuirVolume(int volume){
        System.out.println("Diminuindo o volume");
        volume--;
        return volume;
    }

    public static void consultarVolume(int volume){
        System.out.println("Volume atual: " + volume);
    }

    public static int aumentarCanal(int canal){
        System.out.println("Mudando para o próximo canal");
        canal++;
        return canal;
    }

    public static int diminuirCanal(int canal){
        System.out.println("Mudando para o canal anterior");
        canal--;
        return canal;
    }

    public static int trocarCanal(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Para qual canal deseja trocar?");
        int canalDesejado = entrada.nextInt();

        System.out.println("Trocando para o canal " + canalDesejado);
        return canalDesejado;
    }

    public static void consultarCanal(int canal){
        System.out.println("Canal atual: " + canal);
    }
}
