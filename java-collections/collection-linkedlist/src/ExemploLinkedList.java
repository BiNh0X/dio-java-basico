import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ExemploLinkedList {
    public static void main(String[] args) throws Exception {
       
        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        LinkedList<Double> notas2 = new LinkedList<>();

        System.out.println("\nCrie uma lista chamada notas2 " +
         "e coloque todos os elementos da List ArrayList nessa nova lista: ");
         
        notas2.addAll(notas);

        System.out.println("Notas (1): " + notas + "\nNotas (2): " + notas2);

  	    System.out.println("Mostre a primeira nota da nova lista sem removê-la: " + notas2.get(0));
          System.out.println(notas2);

  	    System.out.println("Mostre a primeira nota da nova lista removendo-a: " + notas2.remove(0));
        System.out.println(notas2);
    }
}