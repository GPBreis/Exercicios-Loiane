package exercicios.aula13;

import java.util.Scanner;

public class Exerc18 {
    public void calculaTempoDownload() {

        double tamanhoArquivo, velocidadeInternet, tempoDownload;

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho do arquivo (MB)");
        tamanhoArquivo = scan.nextDouble();

        System.out.println("Informe a velocidade da internet (Mb)");
        velocidadeInternet = scan.nextDouble();

        tempoDownload = (tamanhoArquivo / (velocidadeInternet / 8)) / 60;

        System.out.printf("Um arquivo de %s MB baixando com uma velocidade de %s Mb leva %s minutos para finalizar", tamanhoArquivo, velocidadeInternet, tempoDownload);


    }
}
