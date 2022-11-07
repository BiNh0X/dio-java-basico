package edu.fabio.arrays;

/*
 * Consoantes: Faça um Programa que leia um vetor
 * de 6 caracteres, e diga quantas consoantes foram lidas. 
 * Imprima as consoantes.
 */
public class Consoantes {
    
    public static void main(String[] args) {
        
        char consoantes[] = { 'o', 'r', 'i', 'a', 'm', 'n', 'e', 'w', 'i', 'u' };
        int quantidadeConsoantes = 0;


        System.out.print("Consoantes: ");

        int contador = 0;
        while (contador < (consoantes.length)) {

            if ((consoantes[contador] != 'a') &
                (consoantes[contador] != 'e') &
                (consoantes[contador] != 'i') &
                (consoantes[contador] != 'o') &
                (consoantes[contador] != 'u')) {
                
                quantidadeConsoantes++;
                System.out.print(consoantes[contador] + " ");

            }

            contador++;
        }

        System.out.println("\nQuantidade de consoantes = " + quantidadeConsoantes);

    }
}