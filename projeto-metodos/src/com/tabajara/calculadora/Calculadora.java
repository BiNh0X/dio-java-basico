package com.tabajara.calculadora;

import com.tabajara.mensagem.Saudacoes;

public class Calculadora {
    
    Saudacoes continua = new Saudacoes();

    public void removerDecimalZero(double valorDecimal) {

        int valorInteiro = (int) valorDecimal;

        if (valorDecimal == valorInteiro) System.out.print(valorInteiro);
        else System.out.print(valorDecimal);
    }

    public void somar(double operando1, double operando2) {        

        System.out.print("RESULTADO: ");
        removerDecimalZero(operando1);
        System.out.print(" + ");
        removerDecimalZero(operando2);
        System.out.print(" = ");
        removerDecimalZero(operando1 + operando2);
        continua.continuarMenu();
    }

    public void subtrair(double operando1, double operando2) {        

        System.out.print("RESULTADO: ");
        removerDecimalZero(operando1);
        System.out.print(" - ");
        removerDecimalZero(operando2);
        System.out.print(" = ");
        removerDecimalZero(operando1 - operando2);
        continua.continuarMenu();
    }

    public void multiplicar(double operando1, double operando2) {        

        System.out.print("RESULTADO: ");
        removerDecimalZero(operando1);
        System.out.print(" x ");
        removerDecimalZero(operando2);
        System.out.print(" = ");
        removerDecimalZero(operando1 * operando2);
        continua.continuarMenu();
    }

    public void dividir(double operando1, double operando2) {        
        
        System.out.print("RESULTADO: ");
        removerDecimalZero(operando1);
        System.out.print(" ÷ ");
        removerDecimalZero(operando2);
        System.out.print(" = ");
        removerDecimalZero(operando1 / operando2);
        continua.continuarMenu();
    }    
}