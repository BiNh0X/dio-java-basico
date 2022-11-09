package com.tabajara.emprestimo;

import java.util.Scanner;

import java.io.Console;

import java.text.DecimalFormat;

import java.text.NumberFormat;

import java.util.Locale;


public class ModuloEmprestimo {
    
    public static void emprestimo() {

        double valorEmprestimo = 0.0;
        int quantidadeMeses = 0;

        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        Console esperar = System.console();

        NumberFormat formatarDouble = new DecimalFormat("#0.00");

        CalculoEmprestimo valor = new CalculoEmprestimo();

        do {
            System.out.println("\n====================================");
            System.out.println("***       UM APP TUDO-EM-UM      ***");
            System.out.println("====================================");
            System.out.println("         % $ Empréstimos ¢ £        ");
            System.out.println("------------------------------------");
            System.out.println("\n    1 - Calcular Empréstimo\n    2 - Taxa de juros\n    0 - Menu inicial\n");
            System.out.println("------------------------------------");
                
            System.out.print("Escolha uma opção: ");
            int opcao = ler.nextInt();

            if (opcao == 1) {

                System.out.print("Valor do empréstimo: R$ ");
                valorEmprestimo = ler.nextDouble();

                System.out.print("Quantidade de parcelas: ");
                quantidadeMeses = ler.nextInt();

            }

            switch (opcao) {
                
                case 1:
                    double valorTotal = valor.calcularEmprestimo(valorEmprestimo, quantidadeMeses);
                    System.out.println("Valor total = R$ " + formatarDouble.format(valorTotal));
                    
                    System.out.print("\n Pressione <ENTER> para continuar...");
                    esperar.readLine();

                    break;
                case 2:
                    double juros = valor.taxaJuros();
                    System.out.println("Taxa de juros atual = " + juros + "%");

                    System.out.print("\n Pressione <ENTER> para continuar...");
                    esperar.readLine();

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