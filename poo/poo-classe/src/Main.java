public class Main {
    public static void main(String[] args) throws Exception {
        
         // Aqui usamos o Construtor padrão, vazio, sem parâmetros.
        Carro carro1 = new Carro();

        carro1.setModelo("Gol");
        carro1.setCor("Azul");
        carro1.setCapacidadeTanque(55);

        System.out.println("\nModelo carro: " + carro1.getModelo() +
        "\n" + "Cor: " + carro1.getCor() + "\n" +
        "Capacidade do tanque: " + carro1.getCapacidadeTanque() + "L");

        double valorCombustivel = 4.91;

        System.out.println("\nPara encher o tanque do " + carro1.getModelo() +
        " e gasolina à R$ " + valorCombustivel + ", é preciso de: R$ " +
        carro1.totalValorTanque(valorCombustivel));

        // Aqui usamos o Construtor com parâmetros que definimos na classe Carro.
        Carro carro2 = new Carro("Branco", "HB20", 60);

        System.out.println("\n" + carro2.getModelo());
        System.out.println(carro2.getCor()); 
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(valorCombustivel));
    }
}