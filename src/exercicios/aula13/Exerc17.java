package exercicios.aula13;

import java.util.Scanner;

public class Exerc17 {
    double mQuadrado, area, vlLata = 80, vlGalao = 25, mGalao = 21.6,
            vlTotalLata = 0, vlTotalGalao, mTotalLata = 0, mTotalGalao = 0, dif = 0,
            difGalao = 0, mTotal10, mGalaoLata = 0;
    int qtLata = 1;
    int qtGalao = 1;
    int mLata = 108;

    public void calculaQtLatas() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quantos metros quadrados deseja pintar");
        mQuadrado = scan.nextDouble();
        area = mQuadrado * mQuadrado;

        if(area > mLata){
            while (area > mTotalLata){
                qtLata++;
                mTotalLata = mLata * qtLata;
            }
            vlTotalLata = vlLata * qtLata;
            System.out.printf("Serão necessárias %s latas para pintar %s metros quadrados, totalizando R$ %s\n", qtLata, mQuadrado, vlTotalLata);
        } else {
            vlTotalLata = vlLata * qtLata;
            System.out.printf("Uma lata de tinta pinta %s metros, sendo suficiente para %s metros quadrados e totalizando R$ %s\n", mLata, mQuadrado, vlTotalLata);
        }
    }

    public void calculaQtGaloes() {

        if(area > mGalao){
            while (area > mTotalGalao){
                qtGalao++;
                mTotalGalao = mGalao * qtGalao;
            }
            vlTotalGalao = vlGalao * qtGalao;
            System.out.printf("Serão necessários %s galões para pintar %s metros quadrados, totalizando R$ %s\n", qtGalao, mQuadrado, vlTotalGalao);
        } else {
            vlTotalGalao = vlGalao * qtGalao;
            System.out.printf("Um galão de tinta pinta %s metros, sendo suficiente para %s metros quadrados e totalizando R$ %s\n", mGalao, mQuadrado, vlTotalGalao);
        }
    }

    public void calculaMenorDisperdicio() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quantos metros quadrados deseja pintar");
        mQuadrado = scan.nextDouble();
        area = mQuadrado * mQuadrado;
        mTotal10 = area + (area * 0.1);
        dif = mTotal10;
        while ( mGalaoLata <= dif ) {
            if (dif - mLata > dif - mGalao) {
                mTotal10 = mTotal10 - mLata;
                qtLata++;
                mGalaoLata = mGalaoLata + mLata;
            } else if (mTotal10 > mTotal10 - mGalao) {
                mTotal10 = mTotal10 - mGalao;
                qtGalao++;
                mGalaoLata = mGalaoLata + mGalao;
            }
        }

        System.out.printf("Latas: %s Galões: %s", qtLata, qtGalao);

    }
}
