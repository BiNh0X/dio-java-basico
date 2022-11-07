package edu.fabio.loops;
import java.util.Scanner;

/*
 * Fatorial: Faça um programa que calcule o fatorial de um
 * número inteiro fornecido pelo usuário.
 *  Ex.: 5!=5.4.3.2.1=120 
 */
public class Fatorial {
    
    public static void main(String[] args) {
        
        int numero;
        int fatorial = 1;

        try (Scanner leia = new Scanner(System.in);) {

            System.out.println("Digite um número: ");
            numero = leia.nextInt();

            for (int i = numero; i >= 1; i--) {

                fatorial *= i;

            }

        }

        System.out.println("O fatorial de " + numero + " é " + fatorial);

    }

}
