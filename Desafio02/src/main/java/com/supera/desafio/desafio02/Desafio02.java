package com.supera.desafio.desafio02;

import java.util.Scanner;

public class Desafio02 {

    public static void main(String[] args) {
        Double quantidadeDinhero;
        double notas_100, notas_50, notas_20, notas_10, notas_5, notas_2;
        double moedas_1, moedas_050, moedas_025, moedas_010, moedas_001;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor da quantidade em reais(R$)");
        quantidadeDinhero = Double.parseDouble(sc.nextLine().replace(",", "."));

        moedas_001 = quantidadeDinhero;

        notas_100 = ((moedas_001 - moedas_001 % 100) / 100);
        moedas_001 = moedas_001 % 100;

        notas_50 = ((moedas_001 - moedas_001 % 50) / 50);
        moedas_001 = moedas_001 % 50;

        notas_20 = ((moedas_001 - moedas_001 % 20) / 20);
        moedas_001 = moedas_001 % 20;

        notas_10 = ((moedas_001 - moedas_001 % 10) / 10);
        moedas_001 = moedas_001 % 10;

        notas_5 = ((moedas_001 - moedas_001 % 5) / 5);
        moedas_001 = moedas_001 % 5;

        notas_2 = ((moedas_001 - moedas_001 % 2) / 2);
        moedas_001 = moedas_001 % 2;

        moedas_1 = (moedas_001 - moedas_001 % 1) / 1;
        moedas_001 = moedas_001 % 1;

        moedas_050 = (moedas_001 - moedas_001 % 0.50) / 0.50;
        moedas_001 = moedas_001 % 0.50;

        moedas_025 = (moedas_001 - moedas_001 % 0.25) / 0.25;
        moedas_001 = moedas_001 % 0.25;

        moedas_010 = (moedas_001 - moedas_001 % 0.1) / 0.1;
        moedas_001 = moedas_001 % 0.1;

        moedas_001 = (moedas_001 - moedas_001 % 0.01) / 0.01;
        
        System.out.println("NOTAS:");
        System.out.format("%.0f nota(s) de R$   100.00\n", notas_100);
        System.out.format("%.0f nota(s) de R$   50.00\n", notas_50);
        System.out.format("%.0f nota(s) de R$   20.00\n", notas_20);
        System.out.format("%.0f nota(s) de R$   10.00\n", notas_10);
        System.out.format("%.0f nota(s) de R$   5.00\n", notas_5);
        System.out.format("%.0f nota(s) de R$   2.00\n", notas_2);
        
        System.out.println("MOEDAS:");
        System.out.format("%.0f moeda(s) de R$   1.00\n", moedas_1);
        System.out.format("%.0f moeda(s) de R$   0.50\n", moedas_050);
        System.out.format("%.0f moeda(s) de R$   0.25\n", moedas_025);
        System.out.format("%.0f moeda(s) de R$   0.10\n", moedas_010);
        System.out.format("%.0f moeda(s) de R$   0.01\n", moedas_001);

    }
}
