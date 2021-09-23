package exercicios.aula13;

import java.util.Scanner;

public class Exerc06 {

    public void calculaAreaCirculo() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o raio do círculo");

        double raio, area, pi;

        raio = scan.nextDouble();

        pi = 3.14159265359;

        area = pi * (raio * raio);

        System.out.println("A área do círculo é: " + area);
    }
}
