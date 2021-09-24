package exercicios.aula13;

import java.util.Scanner;

public class Exerc14 {

    public void verificaExcesso() {

        Scanner scan = new Scanner(System.in);

        double quilo, excesso, multa;

        System.out.println("Informe a quantidade de quilos pescados");
        quilo = scan.nextDouble();

        if (quilo > 50.0) {
            excesso = quilo - 50;
            multa = excesso * 4.0;
            System.out.printf("Excedido %s quilos, tendo multa de R$ %s\n", excesso, multa);
        } else {
            System.out.printf("Foram pescados %s quilos, não houve excesso\n", quilo);
        }
    }
}
