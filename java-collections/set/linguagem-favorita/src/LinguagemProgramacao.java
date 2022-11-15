import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

public class LinguagemProgramacao {
    public static void main(String[] args) throws Exception {
        
        Set<LinguagemFavorita> minhasLinguagens = new LinkedHashSet<>(){{

            add(new LinguagemFavorita("Python", 1991, "PyCharm"));
            add(new LinguagemFavorita("C", 1970, "Visual Studio Code"));
            add(new LinguagemFavorita("Java", 1991, "IntelliJ"));
        }};

        System.out.println("A. --\tOrdem de Inserção\t--");
        for (LinguagemFavorita linguagem : minhasLinguagens) System.out.println(linguagem);

        System.out.println("\nB. --\tOrdem Natural\t--");
        Set<LinguagemFavorita> minhasLinguagens2 = new TreeSet<>(minhasLinguagens);
        for (LinguagemFavorita linguagem : minhasLinguagens2) System.out.println(linguagem);

        System.out.println("\nC. --\tOrdem IDE\t--");
        Set<LinguagemFavorita> minhasLinguagens3 = new TreeSet<>(new ComparatorIde());
        minhasLinguagens3.addAll(minhasLinguagens);
        for (LinguagemFavorita linguagem : minhasLinguagens3) System.out.println(linguagem);

        System.out.println("\nD. --\tOrdem AnoCriação e Nome\t--");
        Set<LinguagemFavorita> minhasLinguagens4 = new TreeSet<>(new ComparatorAnoCriacaoNome());
        minhasLinguagens4.addAll(minhasLinguagens);
        for (LinguagemFavorita linguagem : minhasLinguagens4) System.out.println(linguagem);
   
        System.out.println("\nD. --\tOrdem Nome/AnoCriação/IDE\t--");
        Set<LinguagemFavorita> minhasLinguagens5 = new TreeSet<>(new ComparatorNomeAnoDeCriacaoIde());
        minhasLinguagens5.addAll(minhasLinguagens);
        for (LinguagemFavorita linguagem : minhasLinguagens5) System.out.println(linguagem);

        System.out.println("\nAo final, exiba as linguagens no console, uma abaixo da outra: ");
        for (LinguagemFavorita linguagem : minhasLinguagens2) System.out.println(linguagem.getNome());
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        
        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }    
}

class ComparatorAnoCriacaoNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        
        int anoDeCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if (anoDeCriacao != 0) return anoDeCriacao;

        return l1.getNome().compareToIgnoreCase(l2.getNome());
    }
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        if (nome !=0) return nome;

        int anoDeCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if (anoDeCriacao != 0) return anoDeCriacao;

        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}