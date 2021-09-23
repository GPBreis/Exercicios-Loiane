package exercicios.aula13;

import java.util.Scanner;

public class Exerc03 {

    public void somar() {
        Scanner scan = new Scanner(System.in);

        int num1, num2, res;

        System.out.print("Informe o primeiro número: ");
        num1 = scan.nextInt();

        System.out.print("Informe o segundo número: ");
        num2 = scan.nextInt();

        res = num1 + num2;

        System.out.printf("A soma de %s e %s é %s\n", num1, num2, res);
    }
}
