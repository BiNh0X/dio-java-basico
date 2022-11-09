package com.tabajara.emprestimo;

/*
 * Fórmula: Cálculo Juros Compostos
 * 
 *      FV = PV x (1+i)^n 
 * 
 * FV -> Valor Futuro
 * PV -> Valor Presente
 * i  -> Taxa de Juros (em números decimais)
 * n  -> Prazo em Meses
 */

public class CalculoEmprestimo {

    public double calcularEmprestimo(double valorEmprestimo, int tempo) {

        double valorFuturo;
        double taxa = taxaJuros();

        valorFuturo = valorEmprestimo * Math.pow((1 + taxa / 100), tempo);

        return valorFuturo;

    }

    public double taxaJuros() {

        return 4.5;

    }    
}