public class Quadrilateros {

    // Área do quadrado.
    public double calcularArea(double lados) {

        return Math.pow(lados, 2);
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