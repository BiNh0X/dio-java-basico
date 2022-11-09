package com.tabajara.calculadora;

import java.io.Console;


public class Calculadora {
    
    Console esperar = System.console();

    public void somar(double operando1, double operando2) {        

        System.out.print("RESULTADO: ");
        converterDouble(operando1);
        System.out.print(" + ");
        converterDouble(operando2);
        System.out.print(" = ");

        double resultado = operando1 + operando2;
        converterDouble(resultado);

        System.out.print("\n\n Pressione <ENTER> para continuar...");
        esperar.readLine();

    }

    public void subtrair(double operando1, double operando2) {        

        System.out.print("RESULTADO: ");
        converterDouble(operando1);
        System.out.print(" - ");
        converterDouble(operando2);
        System.out.print(" = ");

        double resultado = operando1 - operando2;
        converterDouble(resultado);

        System.out.print("\n\n Pressione <ENTER> para continuar...");
        esperar.readLine();

    }

    public void multiplicar(double operando1, double operando2) {        

        System.out.print("RESULTADO: ");
        converterDouble(operando1);
        System.out.print(" x ");
        converterDouble(operando2);
        System.out.print(" = ");

        double resultado = operando1 * operando2;
        converterDouble(resultado);

        System.out.print("\n\n Pressione <ENTER> para continuar...");
        esperar.readLine();

    }

    public void dividir(double operando1, double operando2) {        
        
        System.out.print("RESULTADO: ");
        converterDouble(operando1);
        System.out.print(" ÷ ");
        converterDouble(operando2);
        System.out.print(" = ");

        double resultado = operando1 / operando2;
        converterDouble(resultado);

        System.out.print("\n\n Pressione <ENTER> para continuar...");
        esperar.readLine();

    }

    public void converterDouble(double valorDecimal) {

        int valorInteiro = (int) valorDecimal;

        if (valorDecimal == valorInteiro) System.out.print(valorInteiro);
        else System.out.print(valorDecimal);

    }
}