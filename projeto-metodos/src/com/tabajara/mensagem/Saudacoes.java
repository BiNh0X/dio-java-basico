package com.tabajara.mensagem;

import java.io.Console;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class Saudacoes {   
    
    public String mostrarSaudacao() {           
        
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        DateTimeFormatter formatarHora = DateTimeFormatter.ofPattern("HH");
        String hora = formatarHora.format(dataHoraAtual);
        
        int horaInteiro = Integer.parseInt(hora);
        return mostrarMensagem(horaInteiro);        
    }

    public String mostrarMensagem(int hora) {

        // Entre 5 e 11 da manhã.
        if (hora >= 5 && hora < 12) return "Bom dia!";            
            
        // Entre meio dia (12h) e 17 (5h) da tarde.
        else if (hora >= 12 && hora < 18) return "Boa tarde!";

        // Entre 18 (6h) e 4 (4h) da noite.
        else if (hora >= 18 || hora < 5) return "Boa noite!";     

        return null;
    }

    public void continuarMenu() {

        Console espera = System.console();
        
        System.out.print("\n\n Pressione <ENTER> para continuar...");
        espera.readLine();
    }

    public String mostrarHoraAtual() {

        LocalDateTime dataHoraAtual = LocalDateTime.now();
        DateTimeFormatter formatarHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String hora = formatarHora.format(dataHoraAtual);
        
        return hora;
    }

    public String mostrarDataAtual() {

        LocalDateTime dataHoraAtual = LocalDateTime.now();
        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        String data = formatarData.format(dataHoraAtual);
        
        return data;
    }    
}