import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class PopulacaoEstadosNe {
    public static void main(String[] args) throws Exception {
        
        Map<String, Integer> populacaoNordeste = new HashMap<>(){{

            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        System.out.println(populacaoNordeste.toString());
        Set<Entry<String, Integer>> entries = populacaoNordeste.entrySet();
        for (Entry<String,Integer> estado : entries)
            System.out.println("Estado = " + estado.getKey() + ", População = " +
             estado.getValue());

        System.out.println("\nSubstitua a população do estado do RN por 3.534.165: ");
        populacaoNordeste.put("RN", 3534165);
        for (Entry<String,Integer> estado : entries)
            System.out.println("Estado = " + estado.getKey() + ", População = " +
             estado.getValue());

        System.out.println("\nConfira se o estado PB está no dicionário," +
         " caso não adicione: PB - 4.039.277: " + populacaoNordeste.containsKey("PB"));  
        
        if (!populacaoNordeste.containsKey("PB")) populacaoNordeste.put("PB", 4039277);
        for (Entry<String,Integer> estado : entries)
            System.out.println("Estado = " + estado.getKey() + ", População = " +
             estado.getValue());

        System.out.println("\nExiba a população PE: " + populacaoNordeste.get("PE"));

        System.out.println("\nExiba todos os estados e suas populações na ordem que foi informado: ");
        Map<String, Integer> populacaoNordeste2 = new LinkedHashMap<>(){{

            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        Set<Entry<String, Integer>> entries2 = populacaoNordeste2.entrySet();
        
        for (Entry<String,Integer> estado : entries2)
            System.out.println("Estado = " + estado.getKey() + ", População = " +
             estado.getValue());

        System.out.println("\nExiba os estados e suas populações em ordem alfabética: ");
        Map<String, Integer> populacaoNordeste3 = new TreeMap<>(populacaoNordeste2);
        Set<Entry<String, Integer>> entries3 = populacaoNordeste3.entrySet();
        
        for (Entry<String,Integer> estado : entries3)
            System.out.println("Estado = " + estado.getKey() + ", População = " +
             estado.getValue());
            
        System.out.println("\nExiba o estado com o menor população e sua quantidade: ");
        Integer estadoComMenorPopulacao = Collections.min(populacaoNordeste3.values());
        
        for (Entry<String,Integer> estado : entries3)
            if (estado.getValue().equals(estadoComMenorPopulacao))
                System.out.println("Estado = " + estado.getKey() + ", População = " +
                 estado.getValue());

        System.out.println("\nExiba o estado com a maior população e sua quantidade: ");
        Integer estadoComMaiorPopulacao = Collections.max(populacaoNordeste3.values());

        for (Entry<String,Integer> estado : entries3)
            if (estado.getValue().equals(estadoComMaiorPopulacao))
                System.out.println("Estado = " + estado.getKey() + ", População = " +
                estado.getValue());
                
        Integer somaPopulacao = 0;
        for (Entry<String,Integer> estado : entries3) somaPopulacao += estado.getValue();     
        
        System.out.println("\nExiba a soma da população desses estados: " + somaPopulacao);

        System.out.println("\nExiba a média da população deste dicionário de estados: " +
         (somaPopulacao / populacaoNordeste3.size()));

        System.out.println("\nRemova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator = populacaoNordeste3.values().iterator();

        while (iterator.hasNext()) {

            if (iterator.next() < 4000000) iterator.remove();
        }

        for (Entry<String,Integer> estado : entries3)
            System.out.println("Estado = " + estado.getKey() + ", População = " +
             estado.getValue());

        System.out.print("\nApague o dicionário de estados: ");
        populacaoNordeste.clear();
        System.out.println(populacaoNordeste);

        System.out.println("\nConfira se o dicionário está vazio: " + populacaoNordeste.isEmpty());
    }
}