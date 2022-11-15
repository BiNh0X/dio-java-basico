import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*Dadas as seguintes informações sobre minhas séries favoritas,
 crie um conjunto e ordene este conjunto, exibindo:
 (nome - genero - tempo de episodio):
  
 Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
 Série 2 = Nome: dark, genero: drama, tempoEpisodio: 60
 Série 3 = Nome: that '70s show, genero: comédia, tempoEpisodio: 25
 */

public class ExemploOrdenacaoSet {
    public static void main(String[] args) throws Exception {

        System.out.println("\n--\tOrdem Aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{

            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        
        for (Serie serie : minhasSeries) System.out.println(serie.getNome() + " - " +
        serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("\n--\tOrdem Inserção\t--");
        Set<Serie> minhasSeries2 = new LinkedHashSet<>(){{

            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};

        for (Serie serie : minhasSeries2) System.out.println(serie.getNome() + " - " +
        serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("\n--\tOrdem natural (TempoEpisodio)\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries2);

        for (Serie serie : minhasSeries3) System.out.println(serie.getNome() + " - " +
        serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("\n--\tOrdem Nome/Gênero/TempoEpisódio\t--");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparetorNomeGeneroTempoEpisodio());

        minhasSeries4.addAll(minhasSeries);

        for (Serie serie : minhasSeries4) System.out.println(serie.getNome() + " - " +
        serie.getGenero() + " - " + serie.getTempoEpisodio());

        // For you:

        System.out.println("\n--\tOrdem gênero\t--");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparetorGenero());

        minhasSeries5.addAll(minhasSeries2);

        for (Serie serie : minhasSeries5) System.out.println(serie.getNome() + " - " +
        serie.getGenero() + " - " + serie.getTempoEpisodio());

        // Já foi feita acima, usando 'TreeSet'.
        // System.out.println("\n--\tOrdem Tempo Episódio\t--");
    }
}

class ComparetorNomeGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;
        
        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());        
    }
}

class ComparetorGenero implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        
        return s1.getGenero().compareTo(s2.getGenero());
    }    
}