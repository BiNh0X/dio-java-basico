import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

/*
Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi conseguido.
 */

public class DesafioDosDados {
    public static void main(String[] args) throws Exception {
        
        Map<String, Integer> jogoDeDados = new TreeMap<>(){{

            put("Lado[1]", 0);
            put("Lado[2]", 0);
            put("Lado[3]", 0);
            put("Lado[4]", 0);
            put("Lado[5]", 0);
            put("Lado[6]", 0);
        }};

        Random aleatorio = new Random();

        for (int i = 1; i <= 100; i++) {

            Integer dado = aleatorio.nextInt(6) + 1;

            switch(dado) {

                case 1:
                    jogoDeDados.put("Lado[1]", jogoDeDados.get("Lado[1]") + 1); break;
                case 2:
                    jogoDeDados.put("Lado[2]", jogoDeDados.get("Lado[2]") + 1); break;
                case 3:
                    jogoDeDados.put("Lado[3]", jogoDeDados.get("Lado[3]") + 1); break;
                case 4:
                    jogoDeDados.put("Lado[4]", jogoDeDados.get("Lado[4]") + 1); break;
                case 5:
                    jogoDeDados.put("Lado[5]", jogoDeDados.get("Lado[5]") + 1); break;
                case 6:
                    jogoDeDados.put("Lado[6]", jogoDeDados.get("Lado[6]") + 1); break;
            }
        }
       
        Set<Entry<String, Integer>> entries = jogoDeDados.entrySet();
        System.out.println("\n--\tQuantidade de vezes\t--");
        for (Entry<String,Integer> lado : entries) System.out.println(lado.getKey() +
         "= " + lado.getValue());
    }
}