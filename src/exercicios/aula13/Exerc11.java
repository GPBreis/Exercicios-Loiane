package exercicios.aula13;

import java.util.Scanner;

public class Exerc11 {

    public void calculos(){

        Scanner scan = new Scanner(System.in);
        int num1, num2;
        double num3;

        System.out.println("Informe dois números inteiros e um número real");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextDouble();

        System.out.println("Dobro do primeiro com a metade do segundo: " + ((num1 * 2) + (num2 / 2)));
        System.out.println("Triplo do primeiro com o terceiro: " + ((num1 * 3) + num3));
        System.out.println("Terceiro ao cubo: " + Math.pow(num3, 3));

    }
}
