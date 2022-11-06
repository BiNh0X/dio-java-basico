/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boas.praticas.controle.fluxo;
import java.util.Scanner;

/**
 *
 * @author binho-castro
 */
public class BoasPraticasControleFluxo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float horarioDespertar = 9.00f;
        float cafeMatinal = 9.00f;
        boolean aguardarHorario = false;
        
        if (horarioDespertar < cafeMatinal) {
            
            aguardarHorario = true;            
        }
        else if (horarioDespertar == cafeMatinal) {
            
            aguardarHorario = false;
        }
        else {
            
            System.out.println("Está muito tarde para o café da manhã.");
            System.exit(0);
        }
        
        Scanner in = new Scanner(System.in);
        if (!aguardarHorario) {
            
            System.out.println("Qual opção deseja escolher?");
            System.out.println("1 - Café completo, 2 - Só café, 3 - Achocolatado ");
            int opcao = in.nextInt();
            
            switch(opcao) {
                    
                    case 1: 
                            System.out.println("Uau! A mesa está cheia!!!");
                            break;
                            
                    case 2: 
                            System.out.println("Prefiro minha velha caneca de café <3");
                            break;
                    case 3: 
                            System.out.println("Um achocolatado gelado não me fará mal.");
                            break;
                    default:
                            System.out.println("Erro: opção inválida!");
                            System.exit(1);                            
            }                      
         }
        else {
            
            System.out.println("É melhor arrumar a cama e tomar um banho para esperar...");
        }
    }
}
