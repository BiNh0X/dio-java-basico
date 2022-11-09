package com.tabajara.emprestimo;

import java.text.DecimalFormat;

import java.text.NumberFormat;

import java.io.Console;

/*
 * Fórmula: Cálculo de Juros Compostos
 * 
 *      FV = PV x (1+i)^n 
 * 
 * FV -> Valor Futuro
 * PV -> Valor Presente
 * i  -> Taxa de Juros (em números decimais)
 * n  -> Prazo em Meses
 */

public class CalculoEmprestimo {

    Console esperar = System.console();

    public static final double TAXA = 4.5;

    public double calcularEmprestimo(double valorEmprestimo, int tempo) {
        
        double valorFuturo = valorEmprestimo * Math.pow((1 + TAXA / 100), tempo);
        return valorFuturo;        

    }

    public void mostrarValorTotal(double valorTotal) {

        NumberFormat formatarDouble = new DecimalFormat("#0.00");

        System.out.println("Valor total = R$ " + formatarDouble.format(valorTotal));                    
        System.out.print("\n Pressione <ENTER> para continuar...");
        esperar.readLine();

    }
    
    public void mostrarTaxaJuros() {

        System.out.println("Taxa de juros atual = " + TAXA + "%");
        System.out.print("\n Pressione <ENTER> para continuar...");
        esperar.readLine();

    }    
}