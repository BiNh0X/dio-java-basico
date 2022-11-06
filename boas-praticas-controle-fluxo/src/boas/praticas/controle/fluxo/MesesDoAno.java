/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boas.praticas.controle.fluxo;
import java.util.Scanner;

/**
 *
 * @author binho-castro
 */
public class MesesDoAno {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite um número de 1 à 12: ");
        int mes = in.nextInt();
        
        if (mes == 1) {
            System.out.println("Janeiro");
        }
        else if (mes == 2) {
            System.out.println("Fevereiro");
        }
        else if (mes == 3) {
            System.out.println("Março");
        }
        else if (mes == 4) {
            System.out.println("Abril");
        }
        else if (mes == 5) {
            System.out.println("Maio");
        }
        else if (mes == 6) {
            System.out.println("Junho");
        }
        else if (mes == 7) {
            System.out.println("Julho");
        }
        else if (mes == 8) {
            System.out.println("Agosto");
        }
        else if (mes == 9) {
            System.out.println("Setembro");
        }
        else if (mes == 10) {
            System.out.println("Outubro");
        }
        else if (mes == 11) {
            System.out.println("Novembro");
        }
        else if (mes == 12) {
            System.out.println("Dezembro");
        }
        else {
            System.out.println("Erro: mês inválido.");
            System.exit(1);
        }
        
        if ((mes == 1) || (mes == 7) || (mes == 12)) {
            System.out.println("Férias.");
        }
        
    }
    
}
