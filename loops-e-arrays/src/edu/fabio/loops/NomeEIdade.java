package edu.fabio.loops;
import java.util.Scanner;
/*
 * Nome e Idade: Faça um programa que leia conjuntos de
 * dois valores, o primeiro representando o nome do aluno
 * e o segundo representando a sua idade. (Pare o programa
 * inserindo o valor 0 no campo nome).
 */
public class NomeEIdade {
    
    public static void main(String[] args) {
        
        String nome;
        int idade;
        
        try (Scanner leia = new Scanner(System.in);) {

            while (true) {

                System.out.println("Nome do aluno: ");
                nome = leia.next();
                if (nome.equals("0")) break;

                System.out.println("Idade do aluno: ");
                idade = leia.nextInt();

            }

        }

        System.out.println("Fim da execução.");

    }
}
