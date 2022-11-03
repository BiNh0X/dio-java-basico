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
	    a = 5;
	    b = 6;

        if(a==b)
   	        resultado = "verdadeiro";
	    else
   	        resultado = "falso";
        
        System.out.println(resultado);

        resultado = a == b ? "verdadeiro": "falso";

        System.out.println(resultado);
    }
}
