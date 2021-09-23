package exercicios.aula13;

import java.util.Scanner;

public class Exerc08 {
    public void calculaSalario() {
        Scanner scan = new Scanner(System.in);

        double valorHora, qtHora, valorMes;

        System.out.println("Informe o valor da hora trabalhada:");
        valorHora = scan.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas:");
        qtHora = scan.nextDouble();

        valorMes = valorHora * qtHora;

        System.out.println("Seu salário mensal é de R$ " + valorMes);
    }
}
