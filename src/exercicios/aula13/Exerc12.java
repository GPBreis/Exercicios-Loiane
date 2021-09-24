package exercicios.aula13;

import java.util.Scanner;

public class Exerc12 {

    public void calculaPesoIdeal() {
        Scanner scan = new Scanner(System.in);

        double altura, pesoIdeal;

        System.out.println("Informe sua altura");
        altura = scan.nextDouble();

        pesoIdeal = (72.7 * altura) - 58;

        System.out.println("Seu peso ideal é: " + pesoIdeal);
    }
}
