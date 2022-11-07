package edu.fabio.arrays;
import java.util.Scanner;

/*
 * Ordem Inversa: Faça um Programa que leia um vetor 
 * de 5 números inteiros e mostre-os na ordem inversa.
 */
public class OrdemInversa {
    
    public static void main(String[] args) {
        
        int[] vetor = new int[5];

        try (Scanner leia = new Scanner(System.in);) {

            // Preencher o vetor.
            for (int i = 0; i < 5; i++) {

                System.out.println("Digite o " + (i + 1) + "º" + " número:" );
                vetor[i] = leia.nextInt();

            }

            // É possível utilizar o comando vetor.length:
            // Exemplo: while (contador < (vetor.length))        
            for (int j = 0; j < 5; j++) {

                if (j == 0) System.out.print("Vetor original = { " + vetor[j] + ", ");
                else if (j == 4) System.out.print(vetor[j] + " }\n");
                else System.out.print(vetor[j] + ", ");
                
            }
    
            for (int k = 4; k >= 0; k--) {

                if (k == 4) System.out.print("Ordem inversa = { " + vetor[k] + ", ");
                else if (k == 0) System.out.print(vetor[k] + " }\n");
                else System.out.print(vetor[k] + ", ");
                
            }

        }

    }

}