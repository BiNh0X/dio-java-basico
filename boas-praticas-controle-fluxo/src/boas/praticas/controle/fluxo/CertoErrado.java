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
public class CertoErrado {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite um número de 1 à 5: ");
        int numero = in.nextInt();
        
        switch(numero) {
            
            case 1:
            case 2:
            case 3:
                    System.out.println("Certo.");
                    break;
            case 4:
                    System.out.println("Errado.");
                    break;
            case 5: 
                    System.out.println("Talvez.");
                    break;
            default:
                    System.out.println("Valor indefinido.");
                    break;
        
        }
        
    }
    
}
