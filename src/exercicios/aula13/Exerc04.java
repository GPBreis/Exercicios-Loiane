package exercicios.aula13;

import java.util.Scanner;

public class Exerc04 {

    public void calcularMedia(){
        Scanner scan = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media;

        System.out.println("Informa as notas dos quatro bimestres");

        nota1 = scan.nextDouble();
        nota2 = scan.nextDouble();
        nota3 = scan.nextDouble();
        nota4 = scan.nextDouble();
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média final foi: " + media);
    }
}
