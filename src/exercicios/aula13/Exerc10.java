package exercicios.aula13;

import java.util.Scanner;

public class Exerc10 {
    public void celsiusParaFahrenheit(){
        Scanner scan = new Scanner(System.in);

        double grauC, grauF;

        System.out.print("Informe a temperatura em Celsius ");
        grauC = scan.nextDouble();

        grauF = (grauC * 1.8) + 32;

        System.out.printf("%sºC é equivalente a %sºF\n", grauC, grauF);
    }


}
