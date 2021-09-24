package exercicios.aula13;

import java.util.Scanner;

public class Exerc13 {

    public void calculaPesoIdealHM() {
        Scanner scan = new Scanner(System.in);

        double altura, pesoIdealH, pesoIdealM;

        System.out.println("Informe sua altura");
        altura = scan.nextDouble();

        pesoIdealH = (72.7 * altura) - 58;
        pesoIdealM = (62.1 * altura) - 44.7;

        System.out.println("Caso seja do sexo masculino, o peso ideal é: " + pesoIdealH);
        System.out.println("Caso seja do sexo feminino, o peso ideal é: " + pesoIdealM);
    }
}
