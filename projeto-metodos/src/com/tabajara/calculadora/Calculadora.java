package com.tabajara.calculadora;

import java.io.Console;


public class Calculadora {
    
    Console esperar = System.console();

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

        System.out.print("\n\n Pressione <ENTER> para continuar...");
        esperar.readLine();

    }

    public void subtrair(double operando1, double operando2) {        

        System.out.print("RESULTADO: ");
        doubleParaInteiro(operando1);
        System.out.print(" - ");
        doubleParaInteiro(operando2);
        System.out.print(" = ");
        doubleParaInteiro(operando1 - operando2);

        System.out.print("\n\n Pressione <ENTER> para continuar...");
        esperar.readLine();

    }

    public void multiplicar(double operando1, double operando2) {        

        System.out.print("RESULTADO: ");
        doubleParaInteiro(operando1);
        System.out.print(" x ");
        doubleParaInteiro(operando2);
        System.out.print(" = ");
        doubleParaInteiro(operando1 * operando2);

        System.out.print("\n\n Pressione <ENTER> para continuar...");
        esperar.readLine();

    }

    public void dividir(double operando1, double operando2) {        
        
        System.out.print("RESULTADO: ");
        doubleParaInteiro(operando1);
        System.out.print(" ÷ ");
        doubleParaInteiro(operando2);
        System.out.print(" = ");
        doubleParaInteiro(operando1 / operando2);

        System.out.print("\n\n Pressione <ENTER> para continuar...");
        esperar.readLine();

    }    
}