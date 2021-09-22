package exercicios.aula13;

import java.util.Scanner;

public class Exerc05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quantos quantos metros(m) deseja converter para centimetros(cm)");
        double metros, centimetros;

        metros = scan.nextDouble();
        centimetros = metros * 100;

        System.out.printf("%s(m) é equivalente a %s(cm)", metros, centimetros);

    }
}
