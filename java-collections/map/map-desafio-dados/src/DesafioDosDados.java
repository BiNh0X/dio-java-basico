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
        
        Map<Integer, Integer> jogoDeDados = new TreeMap<>(){{

            put(1, 0);
            put(2, 0);
            put(3, 0);
            put(4, 0);
            put(5, 0);
            put(6, 0);
        }};

        Random aleatorio = new Random();

        for (int i = 1; i <= 100; i++) {

            Integer dado = aleatorio.nextInt(6) + 1;

            switch(dado) {

                case 1:
                    jogoDeDados.put(1, jogoDeDados.get(1) + 1); break;
                case 2:
                    jogoDeDados.put(2, jogoDeDados.get(2) + 1); break;
                case 3:
                    jogoDeDados.put(3, jogoDeDados.get(3) + 1); break;
                case 4:
                    jogoDeDados.put(4, jogoDeDados.get(4) + 1); break;
                case 5:
                    jogoDeDados.put(5, jogoDeDados.get(5) + 1); break;
                case 6:
                    jogoDeDados.put(6, jogoDeDados.get(6) + 1); break;
            }
        }

        System.out.print("\nJogando");
        // try/catch pego do arquivo ExercicioProposto02.java
        // do exercício feito pela inst. Camila Cavalcante.
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(2000);
                System.out.print(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
       
        Set<Entry<Integer, Integer>> entries = jogoDeDados.entrySet();
        System.out.println("\nValor " + " Quant. de vezes");
        for (Entry<Integer,Integer> lado : entries)
            System.out.printf("%3d %11d\n", lado.getKey(), lado.getValue());
    }
}