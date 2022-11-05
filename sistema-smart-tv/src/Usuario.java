public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();

        // O estado atual da TV.
        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Em qual canal está? " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);

        // Ligar a TV.
        smartTv.ligar();
        System.out.println("Ligar a TV! A TV está ligada? " + smartTv.ligada);

        // Desligar a TV.
        smartTv.desligar();
        System.out.println("Desligue a TV! Agora, a TV está ligada? " + smartTv.ligada);

        // Mudar o canal da TV.
        smartTv.ligar();
        smartTv.mudarCanal(11);

        System.out.println("Ligar a TV! A TV está ligada? " + smartTv.ligada);
        System.out.println("Mudar canal para o SBT! Qual canal atual? " + smartTv.canal);

        smartTv.aumentarCanal();

        System.out.println("Avance um canal! Qual canal está agora? " + smartTv.canal);

        // Aumentar e diminuir volume
        smartTv.baixarVolume();
        smartTv.baixarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
                
    }
}
