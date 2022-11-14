import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CulpadoCrime {
    public static void main(String[] args) throws Exception {
        
        Scanner leia = new Scanner(System.in);
        List<String> perguntasSobreUmCrime = new ArrayList<>();

        perguntasSobreUmCrime.add("Telefonou para a vítima? ");
        perguntasSobreUmCrime.add("Esteve no local do crime? ");
        perguntasSobreUmCrime.add("Mora perto da vítima? ");
        perguntasSobreUmCrime.add("Devia para a vítima? ");
        perguntasSobreUmCrime.add("Já trabalhou com a vítima? ");

        Iterator<String> iterator = perguntasSobreUmCrime.iterator();
        int quantidadeSim = 0;
        System.out.println(" ");
        
        while (iterator.hasNext()) {

            String next = iterator.next();
            System.out.print(next); 
            char resposta = leia.next().charAt(0);
            if (resposta == 's') quantidadeSim += 1;
        }

        System.out.println(" ");
        System.out.print("Classificação: ");
        if (quantidadeSim == 2) System.out.println("Suspeita");
        else if (quantidadeSim == 3 || quantidadeSim == 4) System.out.println("Cúmplice");
        else if (quantidadeSim == 5) System.out.println("Assassina");
        else System.out.println("Inocente");
        leia.close();
    }
}