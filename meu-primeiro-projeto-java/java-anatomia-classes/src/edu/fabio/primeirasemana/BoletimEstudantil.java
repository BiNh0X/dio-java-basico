package edu.fabio.primeirasemana;

public class BoletimEstudantil {        // Essa é uma classe
    
    public static void main(String[] args) {    // Dentro da classe eu tenho um método
        
        int mediaFinal = 6;
		if (mediaFinal < 6)
			System.out.println("REPROVADO");
		else if (mediaFinal == 6)
			System.out.println("PROVA MINERVA");
		else
			System.out.println("APROVADO");

    }

}
