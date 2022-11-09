package com.tabajara.calculadora;

import com.tabajara.mensagem.Saudacoes;


public class Calculadora {
    
    Saudacoes parar = new Saudacoes();

    public void doubleParaInteiro(double valorDecimal) {

        int valorInteiro = (int) valorDecimal;

        if (valorDecimal == valorInteiro) System.out.print(valorInteiro);
        else System.out.print(valorDecimal);

    }

    public void somar(double operando1, double operando2) {        

        System.out.print("RESULTADO: ");
        doubleParaInteiro(operando1);
        System.out.print(" + ");
        doubleParaInteiro(operando2);
        System.out.print(" = ");
        doubleParaInteiro(operando1 + operando2);
        parar.continuarMenu();

    }

    public void subtrair(double operando1, double operando2) {        

        System.out.print("RESULTADO: ");
        doubleParaInteiro(operando1);
        System.out.print(" - ");
        doubleParaInteiro(operando2);
        System.out.print(" = ");
        doubleParaInteiro(operando1 - operando2);
        parar.continuarMenu();

    }

    public void multiplicar(double operando1, double operando2) {        

        System.out.print("RESULTADO: ");
        doubleParaInteiro(operando1);
        System.out.print(" x ");
        doubleParaInteiro(operando2);
        System.out.print(" = ");
        doubleParaInteiro(operando1 * operando2);
        parar.continuarMenu();

    }

    public void dividir(double operando1, double operando2) {        
        
        System.out.print("RESULTADO: ");
        doubleParaInteiro(operando1);
        System.out.print(" ÷ ");
        doubleParaInteiro(operando2);
        System.out.print(" = ");
        doubleParaInteiro(operando1 / operando2);
        parar.continuarMenu();

    }    
}