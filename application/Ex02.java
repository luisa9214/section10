/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        - Imprimir todos os elementos do vetor
        - Mostrar na tela a soma e a média dos elementos do vetor*/

package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar?");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i=0; i<n; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i=0; i<n; i++){
            soma = soma + vect[i];
        }

        double media = soma / 2;

        System.out.print("Valores: ");

        for (int i=0; i<n; i++){
            System.out.printf("%.1f", vect[i]);
        }

        System.out.printf("SOMA = %.2f%n", soma);
        System.out.printf("MEDIA = %.2f%n", media);

    }
}
