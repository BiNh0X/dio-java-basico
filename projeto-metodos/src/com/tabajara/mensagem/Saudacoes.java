package com.tabajara.mensagem;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;



public class Saudacoes {
    
    public String saudacao() {    
        
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatarHora = DateTimeFormatter.ofPattern("HH");
        String hora = formatarHora.format(agora);
        
        int horaInt = Integer.parseInt(hora);

        if (horaInt >= 5 && horaInt < 12) { // Entre 5 e 11 da manhã.
            
            return "Bom dia!";

        } 
        else if (horaInt >= 12 && horaInt < 18) { // Entre meio dia (12h) e 17 (5h) da tarde.
            
            return "Boa tarde!";

        } 
        else if (horaInt >= 18 && horaInt < 5) { // Entre 18 (6h) e 4 (4h) da noite.
            
            return "Boa noite!";

        }

        return hora;
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