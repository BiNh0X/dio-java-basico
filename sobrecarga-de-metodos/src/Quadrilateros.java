public class Quadrilateros {

    // Área do quadrado.
    public double calcularArea(double lado) {

        return Math.pow(lado, 2);
    }
    
    // Área do retângulo.
    public double calcularArea(double base, double altura) {

        return base * altura;

    }

    // Área do trapézio.
    public double calcularArea(double baseMaior, double baseMenor, double altura) {

        return (baseMaior + baseMenor) * altura / 2;
    }
}