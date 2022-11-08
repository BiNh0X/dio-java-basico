package edu.fabio.arrays;
import java.util.Random;

/*
 * Array Multidimensional: Gere e imprima uma matriz M 4x4 
 * com valores aleatórios entre 0-9. Após isso determine o 
 * menor número da matriz e a sua posição(linha, coluna).
 */
public class MenorMatriz {

    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4];
        Random aleatorio = new Random();

        int menor = 0;
        int posicaoX = 0;
        int posicaoY = 0;

        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = aleatorio.nextInt(9);

                if ((i == 0) & (j == 0)) menor = matriz[i][j];
                else if (matriz[i][j] < menor) {

                    menor = matriz[i][j];
                    posicaoX = i;
                    posicaoY = j; 
                    
                }
            }

        System.out.println("\nMatriz 4 x 4:");
    
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++) {

                if (j == 0) System.out.print("   " + matriz[i][j] + " ");
                else if (j == 3) System.out.print(matriz[i][j] + "\n");
                else System.out.print(matriz[i][j] + " ");  

            }

        System.out.println("\nMenor número da matriz = " + menor);
        System.out.println("Posição: [" + posicaoX + "][" + posicaoY + "]");

    }
    
}