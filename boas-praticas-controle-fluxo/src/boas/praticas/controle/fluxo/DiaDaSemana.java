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
public class DiaDaSemana {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escreva um dia da semana: ");
        String diaSemana = scanner.next();
        
        switch(diaSemana) {
            
            case "domingo":
                            System.out.println(1);
                            break;
            case "segunda":
                            System.out.println(2);
                            break;
            case "terça":
                            System.out.println(3);
                            break;
            case "quarta":
                            System.out.println(4);
                            break;
            case "quinta":
                            System.out.println(5);
                            break;
            case "sexta":
                            System.out.println(6);
                            break;
            case "sábado":
                            System.out.println(7);
                            break;
            default:        
                            System.err.println("Erro: opção inválida.");
                            System.exit(1);                     
                     
        }
                
    }
    
}
