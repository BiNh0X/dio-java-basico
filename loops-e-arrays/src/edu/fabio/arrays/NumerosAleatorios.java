package edu.fabio.arrays;
import java.util.Random;

/*
 * Números Aleatórios: Faça um Programa que leia 20 números
 * inteiros aleatórios (entre 0 e 100) armazene-os num vetor. 
 * Ao final, mostre os números e seus sucessores.
 */
public class NumerosAleatorios {
    
    public static void main(String[] args) {
        
        int[] numerosAleatorios = new int[20];
        Random random = new Random();
        
        for (int i = 0; i < numerosAleatorios.length; i++) {

            numerosAleatorios[i] = random.nextInt(100); 

        }        

        System.out.print("\nNúmeros aleatórios = ");

        for (int aleatorio : numerosAleatorios)
            System.out.print(aleatorio + " ");

        System.out.print("\nSucessores = ");

        for (int sucessor : numerosAleatorios)
            System.out.print((sucessor + 1) + " ");
        
        System.out.println("\n\nFim da execução.");

    }
}