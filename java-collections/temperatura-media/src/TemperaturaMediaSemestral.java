import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class TemperaturaMediaSemestral {
    public static void main(String[] args) throws Exception {
        
        TemperaturaMediaSemestral temperatura = new TemperaturaMediaSemestral();

        List<TemperaturaMediaMensal> temperaturaMedia = new ArrayList<>(){{

            add(new TemperaturaMediaMensal(1, "Janeiro", temperatura.temperaturaBigDecimal()));
            add(new TemperaturaMediaMensal(2, "Fevereiro", temperatura.temperaturaBigDecimal()));
            add(new TemperaturaMediaMensal(3, "Março", temperatura.temperaturaBigDecimal()));
            add(new TemperaturaMediaMensal(4, "Abril", temperatura.temperaturaBigDecimal()));
            add(new TemperaturaMediaMensal(5, "Maio", temperatura.temperaturaBigDecimal()));
            add(new TemperaturaMediaMensal(6, "Junho", temperatura.temperaturaBigDecimal()));
        }};

        System.out.println("\n--\tTemperatura Média 6 Primeiros\t---");
        System.out.println(temperaturaMedia);

        Iterator<TemperaturaMediaMensal> iterator = temperaturaMedia.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {

            Double next = iterator.next().getTemperatura();
            soma += next;
        }

        System.out.printf("A temperatura média semestral é %.1f\n", (soma / temperaturaMedia.size()));

        double mediaSemestral = soma / temperaturaMedia.size();
        System.out.println("\n--\tAcima da Média Semestral\t---");
        for (TemperaturaMediaMensal mes : temperaturaMedia) {

            double temperaturaMes = mes.getTemperatura();
            if (temperaturaMes > mediaSemestral) System.out.println(mes);
        }
    }

    public double temperaturaBigDecimal() {

        Random random = new Random();
        double temperatura = random.nextDouble(20, 40);     

        BigDecimal temperaturaBigDecimal = new BigDecimal(temperatura).setScale(1, RoundingMode.HALF_UP);
        double novaTemperatura = temperaturaBigDecimal.doubleValue();

        return novaTemperatura;
    }
}

class TemperaturaMediaMensal {

    private Integer id;
    private String mes;
    private Double temperatura;

    TemperaturaMediaMensal(Integer id, String mes, Double temperatura) {

        this.id = id;
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public Integer getId() {

        return id;
    }

    public String getMes() {

        return mes;
    }

    public Double getTemperatura() {

        return temperatura;
    }

    @Override
    public String toString() {
        
        return "{" +
                "id=" + id +
                ", mes='" + mes + '\'' +
                ", temperatura=" + temperatura +
                '}';        
    }
}