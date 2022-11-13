package com.empresa.vendas;

public class Cliente implements CadastroCliente {
    
    @Override
    public String getNome() {

        return "Fábio Castro";
    }

    @Override
    public String getEndereco() {

        return "Rua das Andradas, nº 15";
    }

    @Override
    public String getCpf() {

        return "210110782-12";
    }

    @Override
    public int getIdade() {

        return 40;
    }
}