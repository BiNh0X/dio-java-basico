import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class ExerciciosStreamAPI {
    public static void main(String[] args) throws Exception {

        // O tipo 'List' foi proposital.
        // Será feita a transformação logo mais.
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1",
         "2", "3", "9", "9", "6", "5");

        // O 'forEach' é uma operação final. Ele vai utilizar o método 'accept' para
        // percorrer toda a lista e imprimir cada elemento.
        System.out.println("Imprima todos os elementos dessa lista de String: ");
        /*numerosAleatorios.stream().forEach(new Consumer<String>() {

            @Override
            public void accept(String s) {
                
                System.out.println(s);                
            }
            
        });*/
        // Convertemos em uma "Lambda Expression":
        // A List já tem o forEach embutido sem precisar utilizar
        // stream, então podemos apagá-lo também.
        //numerosAleatorios.forEach(s -> System.out.println(s));  
        
        // Simplificamos ainda mais a expressão utilizando "Reference Method":
        numerosAleatorios.forEach(System.out::println);

        System.out.println("\nPegue os 5 primeiros números e coloque dentro de um Set: ");
        numerosAleatorios.stream()
        //Set<String> collectSet = numerosAleatorios.stream()   // Se quisesse apenas adicionar esses elementos
        // ao invés de imprimí-los.
        .limit(5)   // Pega os 5 primeiros elementos da lista...
        .collect(Collectors.toSet())    // ...coleta eles e joga para um Set.
        .forEach(System.out::println);

        System.out.println("\nTransforme esta lista de String em uma lista de números inteiros: ");
        // Aqui, vamos transformar e não coletar.
        /*numerosAleatorios.stream()
        .map(new Function<String, Integer>() {  // A 'Function' vai receber um String e retornar um Integer.

            @Override
            public Integer apply(String t) {
                
                return Integer.parseInt(t);
            }           
        });*/
        // Simplificamos a expressão em um Lambda: .map(t -> Integer.parseInt(t));

        // Então em Reference Method:
        /*numerosAleatorios.stream()
        .map(Integer::parseInt)     // Pega os elementos em String da lista, transforma em inteiros,
        .collect(Collectors.toList())  // depois coleta esses elementos e joga numa 'List'
        .forEach(System.out::println); // e depois imprime a lista já em inteiros.*/

        // Aqui, se caso quisermos apenas transformar a lista em inteiros:
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
        .map(Integer::parseInt)
        .collect(Collectors.toList());

        System.out.println("\nPegue os números pares e maiores que 2 e coloque em uma lista: ");
        /*List<Integer> ListParesMaioresQueDois = numerosAleatorios.stream()
        .map(Integer::parseInt).filter(new Predicate<Integer>() {   // Faz a filtragem apenas com os resultados
        // da(s) condição(ões) que definirmos e retorna um valor booleano:

            @Override
            public boolean test(Integer t) {    // 'Predicate' faz um teste com cada elemento da 
            // nossa lista e retorna um valor booleano:
                if (t % 2 == 0 && t > 2) return true;
                return false;
            }            
        }).collect(Collectors.toList());*/

        // Simplificamos a expressão em um Lambada:
        List<Integer> ListParesMaioresQueDois = numerosAleatorios.stream()
        .map(Integer::parseInt).filter(t -> (t % 2 == 0 && t > 2))
        .collect(Collectors.toList());

        System.out.println(ListParesMaioresQueDois);

        System.out.println("\nMostre a média dos números: ");
        /*numerosAleatorios.stream()
        .mapToInt(new ToIntFunction<String>() {

            @Override
            public int applyAsInt(String s) {
                
                return Integer.parseInt(s);
            }            
        });*/

        // Simplificando...
        numerosAleatorios.stream()
        .mapToInt(Integer::parseInt)
        .average()  // Operação que retorna a média de uma lista.
        .ifPresent(System.out::println);    // Ao invés de retornar um Double, o método
        // retorna um 'Optional Double', então precisamos usar uma função dele que evita
        // o retorno de números "null".

        System.out.println("\nRemova os valores ímpares: ");
        // Aqui, não vamos trabalhar com Stream, pois ele não modifica a 'fonte' (variável original)
        // e vamos precisar remover esses valores direto dela (da List):
        numerosAleatoriosInteger.removeIf(t -> (t % 2 != 0)); // 'removeIf' NÃO é uma Stream.

        System.out.println(numerosAleatoriosInteger);

        // Para você:

        System.out.println("\nIgnore os 3 primeiros elementos da lista e imprima o restante: ");
        numerosAleatorios.stream()
        .skip(3)
        .forEach(System.out::println);

        System.out.print("\nRetirando os números repetidos da lista, quantos ficam? ");
        /*long countNumerosUnicos = numerosAleatoriosInteger.stream()
        .distinct()
        .count();
        System.out.println("Retirando os números repetidos da lista," +
         " quantos números ficam? " + countNumerosUnicos);*/        
        Set<Integer> quantosFicam = numerosAleatorios.stream()
        .map(Integer::parseInt)
        .collect(Collectors.toSet());
        System.out.println(quantosFicam.size());        

        System.out.print("\nMostre o menor valor da lista: ");
        /*Optional<Integer> menorValor = numerosAleatorios.stream()
        .map(Integer::parseInt)
        .min(Comparator.comparing(Integer::intValue));
        System.out.println(menorValor.get());*/
        numerosAleatorios.stream()
        .mapToInt(Integer::parseInt)   
        .min()
        .ifPresent(System.out::println);

        System.out.print("\nMostre o maior valor da lista: ");
        numerosAleatorios.stream()
        .mapToInt(Integer::parseInt)
        .max()
        .ifPresent(System.out::println);

        System.out.print("\nPegue apenas os números ímpares e some: ");
        /*int somaDosNumerosPares = numerosAleatoriosInteger.stream()
        .filter(i -> (i % 2 == 0))
        .mapToInt(Integer::intValue)
        .sum();
        System.out.println("Pegue apenas os números pares e some: " + somaDosNumerosPares);*/       
        /*Iterator<Integer> iterator = numerosAleatorios.stream()
        .map(Integer::parseInt)
        .filter(t -> (t % 2 != 0)).iterator();

        int somaImpar = 0;
        while (iterator.hasNext()) somaImpar += iterator.next();
        System.out.println(somaImpar);*/
        int somaDosNumerosImpares = numerosAleatorios.stream()
        .mapToInt(Integer::parseInt)
        .filter(i -> (i % 2 != 0))
        .sum();
        System.out.println(somaDosNumerosImpares);

        System.out.println("\nMostre a lista na ordem numérica: ");
        /*List<Integer> numerosOrdemNatural = numerosAleatoriosInteger.stream()
        .sorted(Comparator.naturalOrder())
        .collect(Collectors.toList());
        System.out.println(numerosOrdemNatural);*/        
        numerosAleatorios.stream()
        .map(Integer::parseInt)
        .sorted(Comparator.comparing(Integer::intValue))
        .forEach(System.out::println);

        System.out.println("\nAgrupe os valores ímpares múltiplos de 3 e de 5: ");
        // Dica: collect(Collectors.groupingBy(new Function))
        Map<Boolean, List<Integer>> imparesMultiplosDe3E5 = numerosAleatorios.stream()
        .map(Integer::parseInt)
        .collect(Collectors.groupingBy(t -> ((t % 2 != 0) && (t % 3 == 0 || t % 5 == 0))));
        imparesMultiplosDe3E5.remove(false);
        System.out.println(imparesMultiplosDe3E5);
    }
}