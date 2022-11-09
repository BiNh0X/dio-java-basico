package com.tabajara.mensagem;

import java.io.Console;

public class MensagemEspera {

    Console esperar = System.console();
    
    public void continuarMenu() {

        System.out.print("\n\n Pressione <ENTER> para continuar...");
        esperar.readLine();

    }    
}