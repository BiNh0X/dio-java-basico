package edu.fabio.loops;
import java.util.Scanner;

/*
 * Nota: Faça um programa que peça uma nota, entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido e continue
 * pedindo até que o usuário informe um valor válido.
 */
public class Nota {
    
    public static void main(String[] args) {
        
        int nota;

        try (Scanner leia = new Scanner(System.in);) {

            System.out.println("Digite uma nota de 0 à 10: ");
            nota = leia.nextInt();

            while ((nota < 0) || (nota > 10)) {

                System.out.println("Nota inválida! Digite novamente: ");
                nota = leia.nextInt();

            }

        }
    }
}
