package exercicios.aula13;

import java.util.Scanner;

public class Exerc09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grauF, grauC;

        System.out.println("Informe a temperatura em Fahrenheit");
        grauF = scan.nextDouble();

        grauC = 5 * ((grauF - 32) / 9);

        System.out.printf("%sºF é equivalente a %sºC", grauF, grauC);
    }
}
