import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {
    public static void main(String[] args) throws Exception {
        
/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */

//      Map carrosPopulares2020 = new HashMap(); //antes do java 5
//      Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
//      HashMap<String, Double> carrosPopulares = new HashMap<>();
//      Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos valores: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{

            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares.toString());

        System.out.println("\nSubstitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("\nConfira se o modelo tucson está no dicionário: " +
         carrosPopulares.containsKey("tucson"));

        System.out.println("\nExiba o consumo do uno: " + carrosPopulares.get("uno"));

        // Assim como na interface 'Set', no HashMap não temos como fazer essa operação.
        // System.out.println("Exiba o terceiro modelo adicionado: ");

        System.out.println("\nExiba os modelos: \n" + carrosPopulares.keySet());

        System.out.println("\nExiba os consumos: \n" + carrosPopulares.values());

        System.out.println("\nExiba o(s) modelo(s) mais econômico(s) e o seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Entry<String, Double>> entries = carrosPopulares.entrySet();

        for (Entry<String,Double> entrada : entries)            
            if(entrada.getValue().equals(consumoMaisEficiente)) System.out.println(entrada);

        System.out.println("\nExiba o(s) modelo(s) menos econômico(s) e o seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());

        for (Entry<String,Double> entrada : entries)
            if (entrada.getValue().equals(consumoMenosEficiente)) System.out.println(entrada);

        Double soma = 0d;
        for (Double consumo : carrosPopulares.values()) soma += consumo;
        System.out.println("\nExiba a soma dos consumos: " + soma);
        
        System.out.println("\nExiba a média dos consumos deste dicionário de carros: " +
         (soma / carrosPopulares.size()));

        System.out.println("\nRemova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();

        while (iterator.hasNext()) {

            if (iterator.next() == 15.6) iterator.remove();
        }

        System.out.println(carrosPopulares);

        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{

            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println("\nExiba todos os carros na ordem em que foram informados: \n" +
         carrosPopulares2);

        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
         
        System.out.println("\nExiba o dicionário ordenado pelo modelo: \n" +
         carrosPopulares3);

        System.out.println("\nApague o conjunto de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se o dicionário de carros está vazio: " + carrosPopulares.isEmpty());
    }
}