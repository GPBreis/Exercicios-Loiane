package exercicios.aula13;

import java.util.Scanner;

public class Exerc10 {
    public void celsiusParaFahrenheit(){
        Scanner scan = new Scanner(System.in);

        double grauC, grauF;

        System.out.print("Informe a temperatura em Celsius ");
        grauF = scan.nextDouble();

        grauC = (grauF * 1.8) + 32;

        System.out.printf("%sºC é equivalente a %sºF\n", grauF, grauC);
    }


}
