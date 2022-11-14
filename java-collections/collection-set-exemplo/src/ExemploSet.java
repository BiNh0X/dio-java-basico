import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) throws Exception {
        
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        System.out.println("Crie um conjunto e adicione as notas: ");
        System.out.println(notas);
        
        // Não podemos fazer pesquisas no HashSet usando métodos como indexOf e get,
        // pois o HashSet não possui índices.
        // System.out.println("Exiba a posição da nota 5: ");
        
        // Como dito anteriormente, não é possível trabalhar com índices no HashSet.
        // System.out.println("Adicione na lista a nota 8.0 na posição 4: ");

        // Não há meios para fazer essa operação no HashSet.
        // System.out.println("Substitua a nota 5.0 pela nota 6.0: ");

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        // Também não é possível no HashSet, pois não tem um método get.
        // System.out.println("Exiba a terceira nota adicionada: ");

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.print("Exiba a soma dos valores: ");

        Iterator<Double> iterator = notas.iterator();

        Double soma = 0d;
        while (iterator.hasNext()) {

            Double next = iterator.next();
            soma += next;
        }

        System.out.println(soma);

        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);   // Não tem o 'remove' por índice, então não aceita inteiros.
        System.out.println(notas);

        // Também não é possível fazer utilizando o HashSet.
        // System.out.println("Remova a nota na posição 0: ");

        System.out.println("Remova as notas menores que 7.0 e exiba na lista: ");
        Iterator<Double> iterator2 = notas.iterator();

        while (iterator2.hasNext()) {

            Double next = iterator2.next();
            if (next < 7d) iterator2.remove(); 
        }

        System.out.println(notas);      
        
        // Na HashSet isso não é possível, então usaremos a LinkedHashSet.
        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(0d, 3.6, 9.3, 5d, 7d, 7d, 8.5));

        System.out.println(notas2);

        // Aqui temos que implementar a TreeSet.
        System.out.println("Exiba todas as notas na ordem crescente: ");
        
        Set<Double> notas3 = new TreeSet<>(notas2);
        
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto: ");
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio: " + notas2.isEmpty());        
    }
}
