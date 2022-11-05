public class SmartTv {
    
    // Esses são os atributos da classe SmartTV.
    boolean ligada = false;
    int canal = 1;
    int volume = 30;

    // Esses são os métodos (ações) da classe SmartTV.
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void baixarVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume );
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

}
