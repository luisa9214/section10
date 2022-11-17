/* Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i=0; i<n; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Numeros negativos: ");
        for (int i=0; i<n; i++){
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        }
        sc.close();
    }
}
