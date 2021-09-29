package exercicios.aula13;

import java.util.Scanner;

public class Exerc16 {
    public void calculaQtLatas() {
        Scanner scan = new Scanner(System.in);

        double mQuadrado, vlLata = 80, vlTotal = 0, mTotal = 0;
        int qtLata = 1;
        int mLata = 54;

        System.out.println("Informe quantos metros quadrados deseja pintar");
        mQuadrado = scan.nextDouble();

        if(mQuadrado > mLata){
            while (mQuadrado > mTotal){
                qtLata++;
                mTotal = mLata * qtLata;
            }
            vlTotal = vlLata * qtLata;
            System.out.printf("Serão necessárias %s latas para pintar %s metros quadrados, totalizando R$ %s", qtLata, mTotal, vlTotal);
        } else {
            System.out.printf("Uma lata de tinta pinta %s metros, sendo suficiente para %s metros quadrados", mLata, mQuadrado);
        }
    }
}
