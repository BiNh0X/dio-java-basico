import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class ArcoIris {
    public static void main(String[] args) throws Exception {
        
        // Crie um conjunto contendo as cores do arco-íris:
        Set<String> coresArcoIris = new HashSet<>(Arrays.asList("vermelho", "laranja", "amarelo",
         "verde", "azul", "indigo", "violeta"));

        // Para esse exercício, o 'foreach' é melhor.
        System.out.println("A. Exiba todas as cores uma abaixo da outra: ");
        Iterator<String> iterator = coresArcoIris.iterator();

        int somaCores = 0;
        while (iterator.hasNext()) {

            System.out.println(iterator.next());
            somaCores++;
        }
        
        // Também poderia utilizar o 'coresArcoIris.size()'
        System.out.println("\nB. A quantidade de cores que o arco-íris tem: " + somaCores);

        System.out.println("\nC. Exiba as cores em ordem alfabética: ");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);

        System.out.println("\nD. Exiba as cores na ordem inversa da que foi informada: ");
        ArrayList<String> coresArcoIris3 = new ArrayList<>();
        coresArcoIris3.addAll(coresArcoIris2);
        Collections.reverse(coresArcoIris3);

        System.out.println(coresArcoIris3);

        System.out.println("\nE. Exiba todas as cores que começam com a letra \"" + "v" + "\": ");
        for (String cor : coresArcoIris3) if (cor.startsWith("v")) System.out.println(cor);

        System.out.println("\nF. Remova todas as cores que não começam com a letra \"" + "v" + "\": ");
        Iterator<String> iterator2 = coresArcoIris2.iterator();

        while (iterator2.hasNext()) {

            String next = iterator2.next();
            if (!next.startsWith("v")) iterator2.remove();
        }

        System.out.println(coresArcoIris2);

        System.out.print("\nG. Limpe o conjunto: ");
        coresArcoIris.clear();
        System.out.println(coresArcoIris);

        System.out.println("\nH. Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());
    }
}