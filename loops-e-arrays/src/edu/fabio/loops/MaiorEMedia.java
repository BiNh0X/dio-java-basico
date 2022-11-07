package edu.fabio.loops;
import java.util.Scanner;

/*
 * Maior e Média: Faça um programa que leia 5 números
 * e informe o maior número e a média desses números.
 */
public class MaiorEMedia {
    
    public static void main(String[] args) {
        
        int numero;
        int maior = 0;
        int soma = 0;
        int contador = 1;

        try (Scanner leia = new Scanner(System.in);) {

            do {
                System.out.println("Digite um número: ");
                numero = leia.nextInt();

                soma += numero;

                if (numero > maior) maior = numero;
               
                contador++;
            } while (contador <= 5);

        }

        System.out.println("O MAIOR número: " + maior);
        System.out.println("A média: " + (soma / 5));
        
    }
}
