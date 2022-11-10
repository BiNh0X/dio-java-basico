package com.tabajara.calculadora;

import java.util.Locale;
import java.util.Scanner;


public class ModuloCalculadora {
    
    public static void calcular() {
        
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        do {
            System.out.println("\n====================================");
            System.out.println("***       UM APP TUDO-EM-UM      ***");
            System.out.println("====================================");
            System.out.println("         + - Calculadora x ÷        ");
            System.out.println("------------------------------------");
            System.out.println("\n    1 - Adição\n    2 - Subtração\n    3 - Multiplicação\n    4 - Divisão\n    0 - Menu inicial\n");
            System.out.println("------------------------------------");
               
            double valor1 = 0, valor2 = 0;
            
            System.out.print("Escolha uma opção: ");
            int opcao = ler.nextInt();

            if ((opcao >= 1) && (opcao <= 4)) {

                System.out.print("1º Valor: ");
                valor1 = ler.nextDouble();

                System.out.print("2º Valor: ");
                valor2 = ler.nextDouble();
            }
            
            Calculadora calculadora = new Calculadora();

            switch (opcao) {

                case 1:
                    calculadora.somar(valor1, valor2);
                    break;

                case 2:
                    calculadora.subtrair(valor1, valor2);
                    break;

                case 3:
                    calculadora.multiplicar(valor1, valor2);
                    break;

                case 4:
                    calculadora.dividir(valor1, valor2);
                    break;
                    
                case 0:    
                    break;        

                default:
                    System.out.println("\nErro: opção inválida!");
                    break;
            }

            if (opcao == 0) break;
        } while (true);        
    }
}