package edu.fabio.loops;
import java.util.Scanner;

/*
 * Par e Ímpar: Faça um programa que peça N números inteiros.
 * Calcule e mostre a quantidade de números pares e a quantidade
 * de números impares.
 */
public class ParEImpar {
    
    public static void main(String[] args) {
        
        int quantidadeNumeros, numero;
        int contador = 0;
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        try (Scanner leia = new Scanner(System.in);) {

            System.out.println("Quantidade de números inteiros: ");
            quantidadeNumeros = leia.nextInt();            

            do {
                System.out.println("Digite um número: ");
                numero = leia.nextInt();

                if (numero % 2 == 0) quantidadePares++;
                else quantidadeImpares++;

                contador++;
            } while (contador < quantidadeNumeros);

        }

        System.out.println("Quantidade de PARES = " + quantidadePares);
        System.out.println("Quantidade de ÍMPARES = " + quantidadeImpares);

    }
}
