/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {

        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            Locale.setDefault(Locale.US);

            System.out.print("Quantas pessoas serão digitadas?");
            int n = sc.nextInt();

            String[] nome = new String[n];
            int[] idade = new int[n];
            double[] altura = new double[n];

            for ( int i=0; i<n; i++){
                System.out.println("Dados da " + (i+1) + "a pessoa");
                System.out.print("Nome: ");
                nome[i] = sc.next();
                System.out.print("Idade: ");
                idade[i] = sc.nextInt();
                System.out.print("Altura: ");
                altura[i] = sc.nextDouble();
            }

            double soma = 0.0;
            for( int i=0; i<n; i++){
                soma = soma + altura[i];
            }

            double mediaAlturas = soma / n;
            System.out.printf("A altura média é: %.2f%n" , mediaAlturas);

            int cont = 0;
            for (int i=0; i<n; i++){
                if (idade[i] < 16){
                    cont = cont + 1;
                }
            }

            double percent = cont * 100 / n;
            System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n" , percent);
            sc.close();
        }
}
