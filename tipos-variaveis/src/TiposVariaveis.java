public class TiposVariaveis {
    
    public static void main(String[] args) {
        
        double salarioMinimo = 2500.33;

        short numeroCurto = 1;
	    int numeroNormal = numeroCurto;
	    short numeroCurto2 = (short) numeroNormal;

        int numero = 1;
        System.out.print(numero);
        
        numero = 2;
        System.out.print(numero);


        // E se o valor nunca poderá mudar?

        double pi = 3.15;
        pi = 5.34;
        System.out.print(pi);

        final double VALOR_DE_PI = 3.14;
        System.out.print(VALOR_DE_PI);
    }

}
