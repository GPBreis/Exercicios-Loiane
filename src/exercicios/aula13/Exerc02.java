package exercicios.aula13;

import java.util.Scanner;

public class Exerc02 {

    public void retornaNumero(){
        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.print("Informe um número: ");

        numero = scan.nextInt();

        System.out.println("O número informado foi: " + numero);
    }
}
