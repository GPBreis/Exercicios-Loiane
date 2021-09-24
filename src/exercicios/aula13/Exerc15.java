package exercicios.aula13;

import java.util.Scanner;

public class Exerc15 {

    public void calculaSalario() {

        Scanner scan = new Scanner(System.in);
        double qtHoras, vlHoras, slBruto, slLiquido, ir, inss, sindicato, totalDescontos;

        System.out.println("Informe quantas horas trabalha por dia");
        qtHoras = scan.nextDouble();

        System.out.println("Informe o valor da hora trabalhada");
        vlHoras = scan.nextDouble();

        slBruto = qtHoras * vlHoras;

        ir = slBruto * 0.11;
        inss = slBruto * 0.8;
        sindicato = slBruto * 0.05;
        totalDescontos = ir + inss + sindicato;
        slLiquido = slBruto - totalDescontos;

        System.out.println("Salário Bruto : R$ " + slBruto + "\nIR (11%) : R$ " + ir + "\nINSS (8%) : R$ " + inss + "\nSindicato (5%) : R$ " + sindicato + "\nSalário Liquido : R$ " + slLiquido);
    }
}
