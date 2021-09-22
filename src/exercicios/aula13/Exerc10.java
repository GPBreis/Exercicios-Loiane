package exercicios.aula13;

import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grauC, grauF;

        System.out.print("Informe a temperatura em Fahrenheit ");
        grauF = scan.nextDouble();

        grauC = (grauF * 1.8) + 32;

        System.out.printf("%sºF é equivalente a %sºC\n", grauF, grauC);
    }


}
