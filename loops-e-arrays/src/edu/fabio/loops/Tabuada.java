package edu.fabio.loops;
import java.util.Scanner;

/*
 * Tabuada: Desenvolva um gerador de tabuada, capaz de gerar
 * a tabuada de qualquer número inteiro entre 1 a 10. O usuário
 * deve informar de qual numero ele deseja ver a tabuada. A saída
 * deve ser conforme o exemplo abaixo:
 *
 * Tabuada de 5:
 * 5 X 1 = 5
 * 5 X 2 = 10
 * ...
 * 5 X 10 = 50
 */
public class Tabuada {

    public static void main(String[] args) {
        
        int tipoTabuada, numero;
        int resultado = 0; 

        try (Scanner leia = new Scanner(System.in);) {
            
            do {
                System.out.println("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
                System.out.println("Escolha uma opção: ");
                tipoTabuada = leia.nextInt();

                if ((tipoTabuada < 1) || (tipoTabuada > 4)) {

                    System.out.println("Erro: Opção inválida!\n");

                } 
            } while ((tipoTabuada < 1) || (tipoTabuada > 4));
            
            System.out.println("De qual número?");
            numero = leia.nextInt();

            for (int i = 1; i <= 10; i++) {

                if (tipoTabuada == 1) {

                    System.out.println(numero + " + " + i + " = " + (numero + i));

                }
                else if (tipoTabuada == 2) {

                    if (i == 1) System.out.println((resultado = numero + 1) + " - " + numero + " = " + i);
                    else System.out.println((++resultado) + " - " + numero + " = " + i);

                }
                else if (tipoTabuada == 3) {

                    System.out.println(numero + " x " + i + " = " + (numero * i));

                }
                else {

                    System.out.println((resultado += numero) + " ÷ " + numero + " = " + i);

                }
            }
        }
    }    
}
