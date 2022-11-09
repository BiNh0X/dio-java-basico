package com.tabajara.emprestimo;

import java.util.Scanner;
import java.util.Locale;


public class ModuloEmprestimo {
    
    public static void emprestimo() {        

        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        do {
            System.out.println("\n====================================");
            System.out.println("***       UM APP TUDO-EM-UM      ***");
            System.out.println("====================================");
            System.out.println("         % $ Empréstimos ¢ £        ");
            System.out.println("------------------------------------");
            System.out.println("\n    1 - Calcular Empréstimo\n    2 - Taxa de juros\n    0 - Menu inicial\n");
            System.out.println("------------------------------------");
                
            double valorEmprestimo = 0;
            int parcelas = 0;
            
            System.out.print("Escolha uma opção: ");
            int opcao = ler.nextInt();

            if (opcao == 1) {

                System.out.print("Valor do empréstimo: R$ ");
                valorEmprestimo = ler.nextDouble();

                System.out.print("Quantidade de parcelas: ");
                parcelas = ler.nextInt();
            }
            
            CalculoEmprestimo emprestimo = new CalculoEmprestimo();

            switch (opcao) {
                
                case 1:
                    emprestimo.mostrarValorTotal(valorEmprestimo, parcelas);
                    break;

                case 2:
                    emprestimo.mostrarTaxaJuros();
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