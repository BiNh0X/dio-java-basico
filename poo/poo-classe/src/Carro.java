public class Carro {
    
    String cor;
    String modelo;
    int capacidadeTanque;

    Carro() {

    }
    
    Carro(String cor, String modelo, int capacidadeTanque) {

        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    // Métodos para pegar e inserir valores aos atributos da 
    // classe "Carro".

    void setCor(String cor) {

        this.cor = cor;
    }

    String getCor() {

        return cor;
    }

    void setModelo(String modelo) {

        this.modelo = modelo;
    }

    String getModelo() {

        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque) {

        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {

        return capacidadeTanque;
    }

    // Método para calcular o total gasto para encher o tanque.
    
    public double totalValorTanque(double valorCombustivel) {

        return capacidadeTanque * valorCombustivel;
    }
}