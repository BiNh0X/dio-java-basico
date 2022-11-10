package com.tabajara.emprestimo;

import com.tabajara.mensagem.Saudacoes;

import java.text.DecimalFormat;
import java.text.NumberFormat;

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

    public static final double TAXA = 4.5;
    Saudacoes continua = new Saudacoes();    

    public void mostrarValorTotal(double valorEmprestimo, int tempo) {

        NumberFormat formatarDouble = new DecimalFormat("#0.00");

        double valorTotal = calcularEmprestimo(valorEmprestimo, tempo);
        System.out.print("Valor total = R$ " + formatarDouble.format(valorTotal));                    
        continua.continuarMenu();
    }
    
    public double calcularEmprestimo(double valorPresente, int prazo) {
        
        double valorFuturo = valorPresente * Math.pow((1 + TAXA / 100), prazo);
        return valorFuturo;
    }    
    
    public void mostrarTaxaJuros() {

        System.out.print("Taxa de juros atual = " + TAXA + "%");
        continua.continuarMenu();
    }    
}