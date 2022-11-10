package com.tabajara.mensagem;

import java.io.Console;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class Saudacoes {   
    
    public String saudacao() {           
        
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatarHora = DateTimeFormatter.ofPattern("HH");
        String hora = formatarHora.format(agora);
        
        int horaInteiro = Integer.parseInt(hora);
        return mensagem(horaInteiro);        
    }

    public String mensagem(int hora) {

        // Entre 5 e 11 da manhã.
        if (hora >= 5 && hora < 12) return "Bom dia!";            
            
        // Entre meio dia (12h) e 17 (5h) da tarde.
        else if (hora >= 12 && hora < 18) return "Boa tarde!";

        // Entre 18 (6h) e 4 (4h) da noite.
        else if (hora >= 18 || hora < 5) return "Boa noite!";     

        return null;
    }

    public void continuarMenu() {

        Console esperar = System.console();
        
        System.out.print("\n\n Pressione <ENTER> para continuar...");
        esperar.readLine();
    }

    public String horaAtual() {

        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatarHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = formatarHora.format(agora);
        
        return horaFormatada;
    }

    public String dataAtual() {

        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        String dataFormatada = formatarData.format(agora);
        
        return dataFormatada;
    }    
}