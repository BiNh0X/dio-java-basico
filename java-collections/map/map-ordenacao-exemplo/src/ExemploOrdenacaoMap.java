import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);

Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

public class ExemploOrdenacaoMap {
    public static void main(String[] args) throws Exception {
        
        System.out.println("\n--\tORdem Aleatória\t--");
        Map<String, Livro> meusLivros = new HashMap<>(){{

            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
      
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("\n--\tORdem de Inserção\t--");
        Map<String, Livro> meusLivros2 = new LinkedHashMap<>(){{

            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("\n--\tORdem Alfabética de Autores\t--");
        Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros2);

        for(Map.Entry<String, Livro> livro : meusLivros3.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("\n--\tORdem Alfabética dos Nomes dos Livros\t--");
        Set<Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNomeDosLivros());
        meusLivros4.addAll(meusLivros.entrySet());

        for (Entry<String,Livro> livro : meusLivros4)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("\n--\tORdem por Número de Páginas\t--");
        Set<Entry<String, Livro>> meusLivros5 = new TreeSet<>(new ComparatorPaginas());
        meusLivros5.addAll(meusLivros.entrySet());

        for (Entry<String,Livro> livro : meusLivros5) System.out.println(livro);         
    }
}

class ComparatorNomeDosLivros implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        
        return Integer.compare(l1.getValue().getPaginas(), l2.getValue().getPaginas());
    }
}