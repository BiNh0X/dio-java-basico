package com.empresa.administrativo;

public class Funcionario {

    String nome;
    String cargo;
    String setor;
    int matricula;

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getNome() {

        return nome;
    }

    public void setCargo(String cargo) {

        this.cargo = cargo;
    }

    public String getCargo() {

        return cargo;
    }

    public void setSetor(String setor) {

        this.setor = setor;
    }

    public String getSetor() {

        return setor;
    }

    public void setMatricula(int matricula) {

        this.matricula = matricula;
    }

    public int getMatricula() {

        return matricula;
    }
}