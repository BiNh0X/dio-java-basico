public class Main {
    public static void main(String[] args) throws Exception {
                
         Calculadora calculadora = new Calculadora();   // Instanciando o Objeto.

         OperacaoMatematica calculo = calculadora;  // Upcast para OperacaoMatematica

         calculo.soma(23, 21);
         calculo.subtracao(34, 6);
         calculo.multiplicacao(3, 4);
         calculo.divisao(52, 4);
    }          
}