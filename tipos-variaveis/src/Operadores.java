import javax.lang.model.util.ElementScanner6;

public class Operadores {

    public static void main(String[] args) {
        
        // Operadores Aritméticos (e concatenação).
        String nomeCompleto = "LINGUAGEM" + " " + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao ="?"; 

	    concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

	    concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

	    concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

	    concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);
        
	    concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

        
        // Operadores Unários.
        int numero = 5;

        System.out.println(- numero);

        System.out.println(numero);

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        numero = 10;

        numero++;

        System.out.println(numero);

        boolean casamento = true;

        System.out.println(! casamento);

        // Operador Ternário.
        int a, b;
        String resultado = "";
	    a = 9;
	    b = 6;

        if(a==b)
   	        resultado = "verdadeiro";
	    else
   	        resultado = "falso";
        
        System.out.println(resultado);

        resultado = a == b ? "verdadeiro": "falso";

        System.out.println(resultado);

        // Operadores Relacionais.
        int numero1 = 2;
	    int numero2 = 8;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + simNao);
        
        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        if (numero1 > numero2) {

            System.out.println("Número 1 é MAIOR.");

        }        
        else { 

            System.out.println("Número 1 é MENOR.");

        }

        String nomeUm = "FABIO";
        String nomeDois = new String("FABIO");  // Criando um novo Objeto.

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));

    }
}
