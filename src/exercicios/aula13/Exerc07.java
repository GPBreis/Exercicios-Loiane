package exercicios.aula13;

import java.util.Scanner;

public class Exerc07 {

    public void calculaAreaQuadrado() {
        Scanner scan = new Scanner(System.in);

        double area, lado, dobro;

        System.out.print("Informe o tamanho de um dos lados do quadrado: ");
        lado = scan.nextDouble();

        area = lado * lado;

        dobro = area * 2;

        System.out.printf("A área do quadrado é %s e o dobro da área é %s\n", area, dobro);
    }
}
